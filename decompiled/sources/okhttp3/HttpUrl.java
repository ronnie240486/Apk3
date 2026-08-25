package okhttp3;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class HttpUrl {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.HttpUrl.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @org.jetbrains.annotations.Nullable
    private final java.lang.String fragment;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String host;
    private final boolean isHttps;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String password;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String scheme;
    private final java.lang.String url;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String username;

    /* JADX INFO: compiled from: HttpUrl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", "password", "pop", "", "push", "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "index", "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "username", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.HttpUrl.Builder.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String INVALID_HOST = "Invalid URL host";

        @org.jetbrains.annotations.Nullable
        private java.lang.String encodedFragment;

        @org.jetbrains.annotations.NotNull
        private java.lang.String encodedPassword;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> encodedPathSegments;

        @org.jetbrains.annotations.Nullable
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;

        @org.jetbrains.annotations.NotNull
        private java.lang.String encodedUsername;

        @org.jetbrains.annotations.Nullable
        private java.lang.String host;
        private int port;

        @org.jetbrains.annotations.Nullable
        private java.lang.String scheme;

        /* JADX INFO: compiled from: HttpUrl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 4, 1})
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

            public static final /* synthetic */ int access$parsePort(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.parsePort(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$portColonOffset(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.portColonOffset(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$schemeDelimiterOffset(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.schemeDelimiterOffset(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$slashCount(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.slashCount(r1, r2, r3)
                    return r0
            }

            private final int parsePort(java.lang.String r14, int r15, int r16) {
                    r13 = this;
                    r0 = -1
                    okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion     // Catch: java.lang.NumberFormatException -> L23
                    java.lang.String r5 = ""
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 248(0xf8, float:3.48E-43)
                    r12 = 0
                    r2 = r14
                    r3 = r15
                    r4 = r16
                    java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.NumberFormatException -> L23
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L23
                    r2 = 65535(0xffff, float:9.1834E-41)
                    r3 = 1
                    if (r3 <= r1) goto L20
                    goto L23
                L20:
                    if (r2 < r1) goto L23
                    r0 = r1
                L23:
                    return r0
            }

            private final int portColonOffset(java.lang.String r3, int r4, int r5) {
                    r2 = this;
                L0:
                    if (r4 >= r5) goto L1f
                    char r0 = r3.charAt(r4)
                    r1 = 58
                    if (r0 == r1) goto L1e
                    r1 = 91
                    if (r0 == r1) goto Lf
                    goto L1b
                Lf:
                    int r4 = r4 + 1
                    if (r4 >= r5) goto L1b
                    char r0 = r3.charAt(r4)
                    r1 = 93
                    if (r0 != r1) goto Lf
                L1b:
                    int r4 = r4 + 1
                    goto L0
                L1e:
                    return r4
                L1f:
                    return r5
            }

            private final int schemeDelimiterOffset(java.lang.String r9, int r10, int r11) {
                    r8 = this;
                    int r0 = r11 - r10
                    r1 = -1
                    r2 = 2
                    if (r0 >= r2) goto L7
                    return r1
                L7:
                    char r0 = r9.charAt(r10)
                    r2 = 97
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
                    r4 = 90
                    r5 = 122(0x7a, float:1.71E-43)
                    r6 = 65
                    if (r3 < 0) goto L1f
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r5)
                    if (r3 <= 0) goto L2c
                L1f:
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r6)
                    if (r3 < 0) goto L5e
                    int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r4)
                    if (r0 <= 0) goto L2c
                    goto L5e
                L2c:
                    int r10 = r10 + 1
                    if (r10 >= r11) goto L5e
                    char r0 = r9.charAt(r10)
                    if (r2 <= r0) goto L37
                    goto L3a
                L37:
                    if (r5 < r0) goto L3a
                    goto L58
                L3a:
                    if (r6 <= r0) goto L3d
                    goto L40
                L3d:
                    if (r4 < r0) goto L40
                    goto L58
                L40:
                    r3 = 57
                    r7 = 48
                    if (r7 <= r0) goto L47
                    goto L4a
                L47:
                    if (r3 < r0) goto L4a
                    goto L58
                L4a:
                    r3 = 43
                    if (r0 != r3) goto L4f
                    goto L58
                L4f:
                    r3 = 45
                    if (r0 != r3) goto L54
                    goto L58
                L54:
                    r3 = 46
                    if (r0 != r3) goto L59
                L58:
                    goto L2c
                L59:
                    r9 = 58
                    if (r0 != r9) goto L5e
                    r1 = r10
                L5e:
                    return r1
            }

            private final int slashCount(java.lang.String r4, int r5, int r6) {
                    r3 = this;
                    r0 = 0
                L1:
                    if (r5 >= r6) goto L14
                    char r1 = r4.charAt(r5)
                    r2 = 92
                    if (r1 == r2) goto Lf
                    r2 = 47
                    if (r1 != r2) goto L14
                Lf:
                    int r0 = r0 + 1
                    int r5 = r5 + 1
                    goto L1
                L14:
                    return r0
            }
        }

        static {
                okhttp3.HttpUrl$Builder$Companion r0 = new okhttp3.HttpUrl$Builder$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.HttpUrl.Builder.Companion = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.encodedUsername = r0
                r2.encodedPassword = r0
                r1 = -1
                r2.port = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.encodedPathSegments = r1
                r1.add(r0)
                return
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r9, boolean r10) {
                r8 = this;
                r0 = 0
                r3 = 0
            L2:
                int r1 = r9.length()
                java.lang.String r2 = "/\\"
                int r7 = okhttp3.internal.Util.delimiterOffset(r9, r2, r3, r1)
                int r1 = r9.length()
                if (r7 >= r1) goto L15
                r1 = 1
                r5 = 1
                goto L16
            L15:
                r5 = 0
            L16:
                r1 = r8
                r2 = r9
                r4 = r7
                r6 = r10
                r1.push(r2, r3, r4, r5, r6)
                int r3 = r7 + 1
                int r1 = r9.length()
                if (r3 <= r1) goto L2
                return r8
        }

        private final int effectivePort() {
                r2 = this;
                int r0 = r2.port
                r1 = -1
                if (r0 == r1) goto L6
                goto L11
            L6:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r1 = r2.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r0 = r0.defaultPort(r1)
            L11:
                return r0
        }

        private final boolean isDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "."
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "%2e"
                boolean r2 = kotlin.text.StringsKt.equals(r2, r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                return r2
        }

        private final boolean isDotDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = ".."
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e."
                boolean r0 = kotlin.text.StringsKt.equals(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = ".%2e"
                boolean r0 = kotlin.text.StringsKt.equals(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e%2e"
                boolean r2 = kotlin.text.StringsKt.equals(r2, r0)
                if (r2 == 0) goto L21
                goto L23
            L21:
                r2 = 0
                goto L24
            L23:
                r2 = 1
            L24:
                return r2
        }

        private final void pop() {
                r4 = this;
                java.util.List<java.lang.String> r0 = r4.encodedPathSegments
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.remove(r1)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = r0.length()
                if (r0 != 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                java.lang.String r1 = ""
                if (r0 == 0) goto L2f
                java.util.List<java.lang.String> r0 = r4.encodedPathSegments
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L2f
                java.util.List<java.lang.String> r0 = r4.encodedPathSegments
                int r3 = r0.size()
                int r3 = r3 - r2
                r0.set(r3, r1)
                goto L34
            L2f:
                java.util.List<java.lang.String> r0 = r4.encodedPathSegments
                r0.add(r1)
            L34:
                return
        }

        private final void push(java.lang.String r14, int r15, int r16, boolean r17, boolean r18) {
                r13 = this;
                r0 = r13
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                r2 = r14
                r3 = r15
                r4 = r16
                r6 = r18
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r2 = r13.isDot(r1)
                if (r2 == 0) goto L1d
                return
            L1d:
                boolean r2 = r13.isDotDot(r1)
                if (r2 == 0) goto L27
                r13.pop()
                return
            L27:
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                int r3 = r2.size()
                r4 = 1
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 != 0) goto L3d
                r2 = 1
                goto L3e
            L3d:
                r2 = 0
            L3e:
                if (r2 == 0) goto L4b
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                int r3 = r2.size()
                int r3 = r3 - r4
                r2.set(r3, r1)
                goto L50
            L4b:
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.add(r1)
            L50:
                if (r17 == 0) goto L59
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.lang.String r2 = ""
                r1.add(r2)
            L59:
                return
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String r6) {
                r5 = this;
                java.util.List<java.lang.String> r0 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.downTo(r0, r2)
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 < 0) goto L25
                if (r1 > r2) goto L5d
                goto L27
            L25:
                if (r1 < r2) goto L5d
            L27:
                java.util.List<java.lang.String> r3 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
                if (r3 == 0) goto L59
                java.util.List<java.lang.String> r3 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r4 = r1 + 1
                r3.remove(r4)
                java.util.List<java.lang.String> r3 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                r3.remove(r1)
                java.util.List<java.lang.String> r3 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L59
                r6 = 0
                r5.encodedQueryNamesAndValues = r6
                return
            L59:
                if (r1 == r2) goto L5d
                int r1 = r1 + r0
                goto L27
            L5d:
                return
        }

        private final void resolvePath(java.lang.String r11, int r12, int r13) {
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r4 = r8.length()
                r3 = 0
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r1.push(r2, r3, r4, r5, r6)
                return r7
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "encodedPathSegments"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17) {
                r15 = this;
                r0 = r15
                java.lang.String r1 = "encodedName"
                r3 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L13
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.encodedQueryNamesAndValues = r1
            L13:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                okhttp3.HttpUrl$Companion r14 = okhttp3.HttpUrl.Companion
                r4 = 0
                r5 = 0
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 211(0xd3, float:2.96E-43)
                r13 = 0
                java.lang.String r6 = " \"'<>#&="
                r2 = r14
                r3 = r16
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r1.add(r2)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                if (r17 == 0) goto L4b
                r4 = 0
                r5 = 0
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 211(0xd3, float:2.96E-43)
                r13 = 0
                java.lang.String r6 = " \"'<>#&="
                r2 = r14
                r3 = r17
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L4c
            L4b:
                r2 = 0
            L4c:
                r1.add(r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addPathSegment(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r4 = r8.length()
                r3 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.push(r2, r3, r4, r5, r6)
                return r7
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addPathSegments(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "pathSegments"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17) {
                r15 = this;
                r0 = r15
                java.lang.String r1 = "name"
                r3 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L13
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.encodedQueryNamesAndValues = r1
            L13:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                okhttp3.HttpUrl$Companion r14 = okhttp3.HttpUrl.Companion
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 219(0xdb, float:3.07E-43)
                r13 = 0
                java.lang.String r6 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r2 = r14
                r3 = r16
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r1.add(r2)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                if (r17 == 0) goto L4b
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 219(0xdb, float:3.07E-43)
                r13 = 0
                java.lang.String r6 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r2 = r14
                r3 = r17
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L4c
            L4b:
                r2 = 0
            L4c:
                r1.add(r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl build() {
                r23 = this;
                r0 = r23
                java.lang.String r2 = r0.scheme
                if (r2 == 0) goto Lbd
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.lang.String r4 = r0.encodedUsername
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 7
                r14 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 7
                r9 = 0
                r3 = r1
                java.lang.String r15 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r3, r4, r5, r6, r7, r8, r9)
                java.lang.String r4 = r0.encodedPassword
                r5 = r10
                r6 = r11
                r7 = r12
                r8 = r13
                r9 = r14
                java.lang.String r4 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r3, r4, r5, r6, r7, r8, r9)
                java.lang.String r5 = r0.host
                if (r5 == 0) goto Lb5
                int r6 = r23.effectivePort()
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.util.ArrayList r7 = new java.util.ArrayList
                int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1)
                r7.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L3b:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L57
                java.lang.Object r3 = r1.next()
                r9 = r3
                java.lang.String r9 = (java.lang.String) r9
                okhttp3.HttpUrl$Companion r8 = okhttp3.HttpUrl.Companion
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 7
                r14 = 0
                java.lang.String r3 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r8, r9, r10, r11, r12, r13, r14)
                r7.add(r3)
                goto L3b
            L57:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                r3 = 0
                if (r1 == 0) goto L8f
                java.util.ArrayList r8 = new java.util.ArrayList
                int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1)
                r8.<init>(r9)
                java.util.Iterator r1 = r1.iterator()
            L69:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L90
                java.lang.Object r9 = r1.next()
                r17 = r9
                java.lang.String r17 = (java.lang.String) r17
                if (r17 == 0) goto L8a
                okhttp3.HttpUrl$Companion r16 = okhttp3.HttpUrl.Companion
                r18 = 0
                r19 = 0
                r20 = 1
                r21 = 3
                r22 = 0
                java.lang.String r9 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r16, r17, r18, r19, r20, r21, r22)
                goto L8b
            L8a:
                r9 = r3
            L8b:
                r8.add(r9)
                goto L69
            L8f:
                r8 = r3
            L90:
                java.lang.String r1 = r0.encodedFragment
                if (r1 == 0) goto La8
                okhttp3.HttpUrl$Companion r16 = okhttp3.HttpUrl.Companion
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 7
                r22 = 0
                r17 = r1
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r16, r17, r18, r19, r20, r21, r22)
                r9 = r1
                goto La9
            La8:
                r9 = r3
            La9:
                java.lang.String r10 = r23.toString()
                okhttp3.HttpUrl r11 = new okhttp3.HttpUrl
                r1 = r11
                r3 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
            Lb5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "host == null"
                r1.<init>(r2)
                throw r1
            Lbd:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "scheme == null"
                r1.<init>(r2)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedFragment(@org.jetbrains.annotations.Nullable java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L16
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 179(0xb3, float:2.51E-43)
                r11 = 0
                java.lang.String r4 = ""
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L17
            L16:
                r13 = 0
            L17:
                r12.encodedFragment = r13
                return r12
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedPassword(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "encodedPassword"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 243(0xf3, float:3.4E-43)
                r12 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.encodedPassword = r14
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedPath(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "encodedPath"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "/"
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r3, r0)
                if (r0 == 0) goto L16
                int r0 = r3.length()
                r1 = 0
                r2.resolvePath(r3, r1, r0)
                return r2
            L16:
                java.lang.String r0 = "unexpected encodedPath: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedQuery(@org.jetbrains.annotations.Nullable java.lang.String r14) {
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedUsername(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "encodedUsername"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 243(0xf3, float:3.4E-43)
                r12 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.encodedUsername = r14
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder fragment(@org.jetbrains.annotations.Nullable java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L16
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 187(0xbb, float:2.62E-43)
                r11 = 0
                java.lang.String r4 = ""
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L17
            L16:
                r13 = 0
            L17:
                r12.encodedFragment = r13
                return r12
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getEncodedFragment$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedFragment
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEncodedPassword$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedPassword
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedQueryNamesAndValues
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEncodedUsername$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedUsername
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getHost$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.host
                return r0
        }

        public final int getPort$okhttp() {
                r1 = this;
                int r0 = r1.port
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getScheme$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.scheme
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder host(@org.jetbrains.annotations.NotNull java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "host"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 7
                r7 = 0
                r2 = r9
                java.lang.String r0 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r0)
                if (r0 == 0) goto L1a
                r8.host = r0
                return r8
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "unexpected host: "
                java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r9)
                r0.<init>(r9)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder parse$okhttp(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r26, @org.jetbrains.annotations.NotNull java.lang.String r27) {
                r25 = this;
                r0 = r25
                r13 = r27
                java.lang.String r1 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                r1 = 0
                r2 = 3
                r3 = 0
                int r2 = okhttp3.internal.Util.indexOfFirstNonAsciiWhitespace$default(r13, r1, r1, r2, r3)
                r4 = 2
                int r14 = okhttp3.internal.Util.indexOfLastNonAsciiWhitespace$default(r13, r2, r1, r4, r3)
                okhttp3.HttpUrl$Builder$Companion r3 = okhttp3.HttpUrl.Builder.Companion
                int r5 = okhttp3.HttpUrl.Builder.Companion.access$schemeDelimiterOffset(r3, r13, r2, r14)
                r6 = -1
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r5 == r6) goto L5d
                java.lang.String r7 = "https:"
                boolean r7 = kotlin.text.StringsKt.startsWith(r13, r7, r2)
                if (r7 == 0) goto L2f
                java.lang.String r1 = "https"
                r0.scheme = r1
                int r2 = r2 + 6
                goto L65
            L2f:
                java.lang.String r7 = "http:"
                boolean r7 = kotlin.text.StringsKt.startsWith(r13, r7, r2)
                if (r7 == 0) goto L3e
                java.lang.String r1 = "http"
                r0.scheme = r1
                int r2 = r2 + 5
                goto L65
            L3e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                java.lang.String r1 = r13.substring(r1, r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r15)
                r3.append(r1)
                java.lang.String r1 = "'"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L5d:
                if (r26 == 0) goto L29a
                java.lang.String r1 = r26.scheme()
                r0.scheme = r1
            L65:
                int r1 = okhttp3.HttpUrl.Builder.Companion.access$slashCount(r3, r13, r2, r14)
                r3 = 63
                r5 = 35
                if (r1 >= r4) goto Lb9
                if (r26 == 0) goto Lb9
                java.lang.String r4 = r26.scheme()
                java.lang.String r7 = r0.scheme
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r7)
                r4 = r4 ^ 1
                if (r4 == 0) goto L80
                goto Lb9
            L80:
                java.lang.String r1 = r26.encodedUsername()
                r0.encodedUsername = r1
                java.lang.String r1 = r26.encodedPassword()
                r0.encodedPassword = r1
                java.lang.String r1 = r26.host()
                r0.host = r1
                int r1 = r26.port()
                r0.port = r1
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                r1.clear()
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.util.List r3 = r26.encodedPathSegments()
                r1.addAll(r3)
                if (r2 == r14) goto Lae
                char r1 = r13.charAt(r2)
                if (r1 != r5) goto Lb5
            Lae:
                java.lang.String r1 = r26.encodedQuery()
                r0.encodedQuery(r1)
            Lb5:
                r19 = r14
                goto L217
            Lb9:
                int r2 = r2 + r1
                r1 = 0
                r4 = 0
                r8 = r2
                r16 = 0
                r17 = 0
            Lc1:
                java.lang.String r1 = "@/\\?#"
                int r12 = okhttp3.internal.Util.delimiterOffset(r13, r1, r8, r14)
                if (r12 == r14) goto Lce
                char r1 = r13.charAt(r12)
                goto Lcf
            Lce:
                r1 = -1
            Lcf:
                if (r1 == r6) goto L194
                if (r1 == r5) goto L194
                r2 = 47
                if (r1 == r2) goto L194
                r2 = 92
                if (r1 == r2) goto L194
                if (r1 == r3) goto L194
                r2 = 64
                if (r1 == r2) goto Le7
                r19 = r14
                r18 = r15
                goto L189
            Le7:
                java.lang.String r11 = "%40"
                if (r16 != 0) goto L14e
                r1 = 58
                int r10 = okhttp3.internal.Util.delimiterOffset(r13, r1, r8, r12)
                okhttp3.HttpUrl$Companion r18 = okhttp3.HttpUrl.Companion
                r6 = 1
                r7 = 0
                r9 = 0
                r19 = 0
                r20 = 0
                r21 = 240(0xf0, float:3.36E-43)
                r22 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r3 = r8
                r4 = r10
                r8 = r9
                r9 = r19
                r23 = r10
                r10 = r20
                r24 = r11
                r11 = r21
                r19 = r14
                r14 = r12
                r12 = r22
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r17 == 0) goto L129
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.encodedUsername
                r4 = r24
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3, r4, r1)
            L129:
                r0.encodedUsername = r1
                r1 = r23
                if (r1 == r14) goto L149
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r4 = r14
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedPassword = r1
                r1 = 1
                r16 = 1
            L149:
                r17 = 1
                r18 = r15
                goto L187
            L14e:
                r4 = r11
                r19 = r14
                r14 = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = r0.encodedPassword
                r12.append(r1)
                r12.append(r4)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r6 = 1
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r18 = 240(0xf0, float:3.36E-43)
                r20 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r27
                r3 = r8
                r4 = r14
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r18
                r18 = r15
                r15 = r12
                r12 = r20
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r15.append(r1)
                java.lang.String r1 = r15.toString()
                r0.encodedPassword = r1
            L187:
                int r8 = r14 + 1
            L189:
                r5 = 35
                r3 = 63
                r6 = -1
                r15 = r18
                r14 = r19
                goto Lc1
            L194:
                r19 = r14
                r18 = r15
                r14 = r12
                okhttp3.HttpUrl$Builder$Companion r9 = okhttp3.HttpUrl.Builder.Companion
                int r10 = okhttp3.HttpUrl.Builder.Companion.access$portColonOffset(r9, r13, r8, r14)
                int r11 = r10 + 1
                r12 = 34
                if (r11 >= r14) goto L1ec
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r27
                r3 = r8
                r4 = r10
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
                r0.host = r1
                int r1 = okhttp3.HttpUrl.Builder.Companion.access$parsePort(r9, r13, r11, r14)
                r0.port = r1
                r2 = -1
                if (r1 == r2) goto L1c3
                r1 = 1
                goto L1c4
            L1c3:
                r1 = 0
            L1c4:
                if (r1 == 0) goto L1c9
                r9 = r18
                goto L20d
            L1c9:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r2 = r13.substring(r11, r14)
                r9 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
                r1.append(r2)
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L1ec:
                r9 = r18
                okhttp3.HttpUrl$Companion r11 = okhttp3.HttpUrl.Companion
                r5 = 0
                r6 = 4
                r7 = 0
                r1 = r11
                r2 = r27
                r3 = r8
                r4 = r10
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
                r0.host = r1
                java.lang.String r1 = r0.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r1 = r11.defaultPort(r1)
                r0.port = r1
            L20d:
                java.lang.String r1 = r0.host
                if (r1 == 0) goto L213
                r1 = 1
                goto L214
            L213:
                r1 = 0
            L214:
                if (r1 == 0) goto L279
                r2 = r14
            L217:
                java.lang.String r1 = "?#"
                r14 = r19
                int r1 = okhttp3.internal.Util.delimiterOffset(r13, r1, r2, r14)
                r0.resolvePath(r13, r2, r1)
                if (r1 >= r14) goto L256
                char r2 = r13.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L256
                r2 = 35
                int r15 = okhttp3.internal.Util.delimiterOffset(r13, r2, r1, r14)
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 208(0xd0, float:2.91E-43)
                r16 = 0
                java.lang.String r5 = " \"'<>#"
                r1 = r12
                r2 = r27
                r4 = r15
                r26 = r15
                r15 = r12
                r12 = r16
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.List r1 = r15.toQueryNamesAndValues$okhttp(r1)
                r0.encodedQueryNamesAndValues = r1
                r1 = r26
            L256:
                if (r1 >= r14) goto L278
                char r2 = r13.charAt(r1)
                r3 = 35
                if (r2 != r3) goto L278
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                r12 = 0
                java.lang.String r5 = ""
                r1 = r2
                r2 = r27
                r4 = r14
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedFragment = r1
            L278:
                return r0
            L279:
                java.lang.String r1 = "Invalid URL host: \""
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r2 = r13.substring(r8, r10)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
                r1.append(r2)
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L29a:
                int r1 = r27.length()
                r2 = 6
                if (r1 <= r2) goto L2b7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = kotlin.text.StringsKt.take(r13, r2)
                r1.append(r2)
                java.lang.String r2 = "..."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r13 = r1
            L2b7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r13)
                r1.<init>(r2)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder password(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "password"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 251(0xfb, float:3.52E-43)
                r12 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.encodedPassword = r14
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder port(int r3) {
                r2 = this;
                r0 = 1
                if (r0 <= r3) goto L4
                goto La
            L4:
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r1 < r3) goto La
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L10
                r2.port = r3
                return r2
            L10:
                java.lang.String r0 = "unexpected port: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder query(@org.jetbrains.annotations.Nullable java.lang.String r14) {
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
                r18 = this;
                r0 = r18
                java.lang.String r1 = r0.host
                r2 = 0
                if (r1 == 0) goto L15
                kotlin.text.Regex r3 = new kotlin.text.Regex
                java.lang.String r4 = "[\"<>^`{|}]"
                r3.<init>(r4)
                java.lang.String r4 = ""
                java.lang.String r1 = r3.replace(r1, r4)
                goto L16
            L15:
                r1 = r2
            L16:
                r0.host = r1
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                int r1 = r1.size()
                r3 = 0
                r4 = 0
            L20:
                if (r4 >= r1) goto L43
                java.util.List<java.lang.String> r5 = r0.encodedPathSegments
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                java.lang.Object r7 = r5.get(r4)
                java.lang.String r7 = (java.lang.String) r7
                r8 = 0
                r9 = 0
                r11 = 1
                r12 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 227(0xe3, float:3.18E-43)
                r17 = 0
                java.lang.String r10 = "[]"
                java.lang.String r6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r5.set(r4, r6)
                int r4 = r4 + 1
                goto L20
            L43:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 == 0) goto L71
                int r4 = r1.size()
            L4b:
                if (r3 >= r4) goto L71
                java.lang.Object r5 = r1.get(r3)
                r7 = r5
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L6a
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                r8 = 0
                r9 = 0
                r11 = 1
                r12 = 1
                r13 = 1
                r14 = 0
                r15 = 0
                r16 = 195(0xc3, float:2.73E-43)
                r17 = 0
                java.lang.String r10 = "\\^`{|}"
                java.lang.String r5 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L6b
            L6a:
                r5 = r2
            L6b:
                r1.set(r3, r5)
                int r3 = r3 + 1
                goto L4b
            L71:
                java.lang.String r6 = r0.encodedFragment
                if (r6 == 0) goto L88
                okhttp3.HttpUrl$Companion r5 = okhttp3.HttpUrl.Companion
                r7 = 0
                r8 = 0
                r10 = 1
                r11 = 1
                r12 = 0
                r13 = 1
                r14 = 0
                r15 = 163(0xa3, float:2.28E-43)
                r16 = 0
                java.lang.String r9 = " \"#<>\\^`{|}"
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            L88:
                r0.encodedFragment = r2
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto La
                return r13
            La:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                java.lang.String r5 = " \"'<>#&="
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.removeAllCanonicalQueryParameters(r14)
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto La
                return r13
            La:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.removeAllCanonicalQueryParameters(r14)
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removePathSegment(int r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                r0.remove(r2)
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L14
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                java.lang.String r0 = ""
                r2.add(r0)
            L14:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder scheme(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "http"
                boolean r1 = kotlin.text.StringsKt.equals(r3, r0)
                if (r1 == 0) goto L11
                r2.scheme = r0
                goto L1b
            L11:
                java.lang.String r0 = "https"
                boolean r1 = kotlin.text.StringsKt.equals(r3, r0)
                if (r1 == 0) goto L1c
                r2.scheme = r0
            L1b:
                return r2
            L1c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "unexpected scheme: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }

        public final void setEncodedFragment$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.encodedFragment = r1
                return
        }

        public final void setEncodedPassword$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.encodedPassword = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
                r13 = this;
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 243(0xf3, float:3.4E-43)
                r12 = 0
                r2 = r15
                java.lang.String r0 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.List<java.lang.String> r1 = r13.encodedPathSegments
                r1.set(r14, r0)
                boolean r14 = r13.isDot(r0)
                if (r14 != 0) goto L2b
                boolean r14 = r13.isDotDot(r0)
                if (r14 != 0) goto L2b
                r14 = 1
                goto L2c
            L2b:
                r14 = 0
            L2c:
                if (r14 == 0) goto L2f
                return r13
            L2f:
                java.lang.String r14 = "unexpected path segment: "
                java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r15)
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r15.<init>(r14)
                throw r15
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.encodedQueryNamesAndValues = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.removeAllEncodedQueryParameters(r2)
                r1.addEncodedQueryParameter(r2, r3)
                return r1
        }

        public final void setEncodedUsername$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.encodedUsername = r2
                return
        }

        public final void setHost$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.host = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setPathSegment(int r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
                r13 = this;
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 251(0xfb, float:3.52E-43)
                r12 = 0
                r2 = r15
                java.lang.String r0 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = r13.isDot(r0)
                if (r1 != 0) goto L26
                boolean r1 = r13.isDotDot(r0)
                if (r1 != 0) goto L26
                r1 = 1
                goto L27
            L26:
                r1 = 0
            L27:
                if (r1 == 0) goto L2f
                java.util.List<java.lang.String> r15 = r13.encodedPathSegments
                r15.set(r14, r0)
                return r13
            L2f:
                java.lang.String r14 = "unexpected path segment: "
                java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r15)
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r15.<init>(r14)
                throw r15
        }

        public final void setPort$okhttp(int r1) {
                r0 = this;
                r0.port = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.removeAllQueryParameters(r2)
                r1.addQueryParameter(r2, r3)
                return r1
        }

        public final void setScheme$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.scheme = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r5.encodedUsername
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L52
            L35:
                java.lang.String r1 = r5.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                r2 = 1
            L43:
                if (r2 == 0) goto L4d
                r0.append(r4)
                java.lang.String r1 = r5.encodedPassword
                r0.append(r1)
            L4d:
                r1 = 64
                r0.append(r1)
            L52:
                java.lang.String r1 = r5.host
                if (r1 == 0) goto L74
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r4)
                if (r1 == 0) goto L6f
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L74
            L6f:
                java.lang.String r1 = r5.host
                r0.append(r1)
            L74:
                int r1 = r5.port
                r2 = -1
                if (r1 != r2) goto L7d
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L96
            L7d:
                int r1 = r5.effectivePort()
                java.lang.String r2 = r5.scheme
                if (r2 == 0) goto L90
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L96
            L90:
                r0.append(r4)
                r0.append(r1)
            L96:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                if (r2 == 0) goto Lae
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lae:
                java.lang.String r1 = r5.encodedFragment
                if (r1 == 0) goto Lbc
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.encodedFragment
                r0.append(r1)
            Lbc:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder username(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "username"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 251(0xfb, float:3.52E-43)
                r12 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.encodedUsername = r14
                return r13
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static /* synthetic */ java.lang.String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion r13, java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22, int r23, java.lang.Object r24) {
                r0 = r23
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L9
                r5 = 0
                goto La
            L9:
                r5 = r15
            La:
                r1 = r0 & 2
                if (r1 == 0) goto L14
                int r1 = r14.length()
                r6 = r1
                goto L16
            L14:
                r6 = r16
            L16:
                r1 = r0 & 8
                if (r1 == 0) goto L1c
                r8 = 0
                goto L1e
            L1c:
                r8 = r18
            L1e:
                r1 = r0 & 16
                if (r1 == 0) goto L24
                r9 = 0
                goto L26
            L24:
                r9 = r19
            L26:
                r1 = r0 & 32
                if (r1 == 0) goto L2c
                r10 = 0
                goto L2e
            L2c:
                r10 = r20
            L2e:
                r1 = r0 & 64
                if (r1 == 0) goto L34
                r11 = 0
                goto L36
            L34:
                r11 = r21
            L36:
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L3d
                r0 = 0
                r12 = r0
                goto L3f
            L3d:
                r12 = r22
            L3f:
                r3 = r13
                r4 = r14
                r7 = r17
                java.lang.String r0 = r3.canonicalize$okhttp(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
        }

        private final boolean isPercentEncoded(java.lang.String r4, int r5, int r6) {
                r3 = this;
                int r0 = r5 + 2
                r1 = 1
                if (r0 >= r6) goto L24
                char r6 = r4.charAt(r5)
                r2 = 37
                if (r6 != r2) goto L24
                int r5 = r5 + r1
                char r5 = r4.charAt(r5)
                int r5 = okhttp3.internal.Util.parseHexDigit(r5)
                r6 = -1
                if (r5 == r6) goto L24
                char r4 = r4.charAt(r0)
                int r4 = okhttp3.internal.Util.parseHexDigit(r4)
                if (r4 == r6) goto L24
                goto L25
            L24:
                r1 = 0
            L25:
                return r1
        }

        public static /* synthetic */ java.lang.String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion r1, java.lang.String r2, int r3, int r4, boolean r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                r0 = 0
                if (r7 == 0) goto L6
                r3 = 0
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Le
                int r4 = r2.length()
            Le:
                r6 = r6 & 4
                if (r6 == 0) goto L13
                r5 = 0
            L13:
                java.lang.String r1 = r1.percentDecode$okhttp(r2, r3, r4, r5)
                return r1
        }

        private final void writeCanonicalized(okio.Buffer r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r18
                r4 = r23
                r5 = 0
                r6 = r5
                r5 = r16
            Lc:
                if (r5 >= r2) goto Lbe
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r15, r7)
                int r7 = r15.codePointAt(r5)
                if (r19 == 0) goto L29
                r8 = 9
                if (r7 == r8) goto L45
                r8 = 10
                if (r7 == r8) goto L45
                r8 = 12
                if (r7 == r8) goto L45
                r8 = 13
                if (r7 == r8) goto L45
            L29:
                java.lang.String r8 = "+"
                r9 = 32
                if (r7 != r9) goto L37
                java.lang.String r10 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
                if (r3 != r10) goto L37
                r14.writeUtf8(r8)
                goto L45
            L37:
                r10 = 43
                if (r7 != r10) goto L48
                if (r21 == 0) goto L48
                if (r19 == 0) goto L40
                goto L42
            L40:
                java.lang.String r8 = "%2B"
            L42:
                r14.writeUtf8(r8)
            L45:
                r9 = r13
                goto Lb7
            L48:
                r8 = 37
                if (r7 < r9) goto L70
                r9 = 127(0x7f, float:1.78E-43)
                if (r7 == r9) goto L70
                r9 = 128(0x80, float:1.8E-43)
                if (r7 < r9) goto L56
                if (r22 == 0) goto L70
            L56:
                char r9 = (char) r7
                boolean r9 = kotlin.text.StringsKt.contains$default(r3, r9)
                if (r9 != 0) goto L70
                if (r7 != r8) goto L6b
                if (r19 == 0) goto L70
                if (r20 == 0) goto L6b
                r9 = r13
                boolean r10 = r13.isPercentEncoded(r15, r5, r2)
                if (r10 != 0) goto L6c
                goto L71
            L6b:
                r9 = r13
            L6c:
                r14.writeUtf8CodePoint(r7)
                goto Lb7
            L70:
                r9 = r13
            L71:
                if (r6 != 0) goto L78
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L78:
                if (r4 == 0) goto L8c
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r10)
                if (r10 == 0) goto L83
                goto L8c
            L83:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.writeString(r15, r5, r10, r4)
                goto L8f
            L8c:
                r6.writeUtf8CodePoint(r7)
            L8f:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb7
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r14.writeByte(r8)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r12 = r10 >> 4
                r12 = r12 & 15
                char r11 = r11[r12]
                r14.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.writeByte(r10)
                goto L8f
            Lb7:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lc
            Lbe:
                r9 = r13
                return
        }

        private final void writePercentDecoded(okio.Buffer r6, java.lang.String r7, int r8, int r9, boolean r10) {
                r5 = this;
            L0:
                if (r8 >= r9) goto L4d
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r7, r0)
                int r0 = r7.codePointAt(r8)
                r1 = 37
                if (r0 != r1) goto L36
                int r1 = r8 + 2
                if (r1 >= r9) goto L36
                int r2 = r8 + 1
                char r2 = r7.charAt(r2)
                int r2 = okhttp3.internal.Util.parseHexDigit(r2)
                char r3 = r7.charAt(r1)
                int r3 = okhttp3.internal.Util.parseHexDigit(r3)
                r4 = -1
                if (r2 == r4) goto L44
                if (r3 == r4) goto L44
                int r8 = r2 << 4
                int r8 = r8 + r3
                r6.writeByte(r8)
                int r8 = java.lang.Character.charCount(r0)
                int r8 = r8 + r1
                goto L0
            L36:
                r1 = 43
                if (r0 != r1) goto L44
                if (r10 == 0) goto L44
                r0 = 32
                r6.writeByte(r0)
                int r8 = r8 + 1
                goto L0
            L44:
                r6.writeUtf8CodePoint(r0)
                int r0 = java.lang.Character.charCount(r0)
                int r8 = r8 + r0
                goto L0
            L4d:
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m1949deprecated_get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m1950deprecated_get(@org.jetbrains.annotations.NotNull java.net.URI r2) {
                r1 = this;
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m1951deprecated_get(@org.jetbrains.annotations.NotNull java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_parse")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m1952deprecated_parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String canonicalize$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r14, int r15, int r16, @org.jetbrains.annotations.NotNull java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, @org.jetbrains.annotations.Nullable java.nio.charset.Charset r22) {
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6c
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L49
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L49
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L49
            L24:
                char r1 = (char) r0
                boolean r1 = kotlin.text.StringsKt.contains$default(r5, r1)
                if (r1 != 0) goto L49
                r1 = 37
                if (r0 != r1) goto L3b
                if (r18 == 0) goto L49
                if (r19 == 0) goto L3b
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4a
                goto L3c
            L3b:
                r11 = r13
            L3c:
                r1 = 43
                if (r0 != r1) goto L43
                if (r20 == 0) goto L43
                goto L4a
            L43:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L49:
                r11 = r13
            L4a:
                okio.Buffer r12 = new okio.Buffer
                r12.<init>()
                r0 = r15
                r12.writeUtf8(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.readUtf8()
                return r0
            L6c:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r0 = r3.hashCode()
                r1 = 3213448(0x310888, float:4.503E-39)
                if (r0 == r1) goto L20
                r1 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r0 == r1) goto L15
                goto L2b
            L15:
                java.lang.String r0 = "https"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L2b
                r3 = 443(0x1bb, float:6.21E-43)
                goto L2c
            L20:
                java.lang.String r0 = "http"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L2b
                r3 = 80
                goto L2c
            L2b:
                r3 = -1
            L2c:
                return r3
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "$this$toHttpUrl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
                r0.<init>()
                r1 = 0
                okhttp3.HttpUrl$Builder r3 = r0.parse$okhttp(r1, r3)
                okhttp3.HttpUrl r3 = r3.build()
                return r3
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URI r2) {
                r1 = this;
                java.lang.String r0 = "$this$toHttpUrlOrNull"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "$this$toHttpUrlOrNull"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "parse")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "$this$toHttpUrlOrNull"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String percentDecode$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r8, int r9, int r10, boolean r11) {
                r7 = this;
                java.lang.String r0 = "$this$percentDecode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r4 = r9
            L6:
                if (r4 >= r10) goto L2f
                char r0 = r8.charAt(r4)
                r1 = 37
                if (r0 == r1) goto L1a
                r1 = 43
                if (r0 != r1) goto L17
                if (r11 == 0) goto L17
                goto L1a
            L17:
                int r4 = r4 + 1
                goto L6
            L1a:
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r0.writeUtf8(r8, r9, r4)
                r1 = r7
                r2 = r0
                r3 = r8
                r5 = r10
                r6 = r11
                r1.writePercentDecoded(r2, r3, r4, r5, r6)
                java.lang.String r8 = r0.readUtf8()
                return r8
            L2f:
                java.lang.String r8 = r8.substring(r9, r10)
                java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
                return r8
        }

        public final void toPathString$okhttp(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r4, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r5) {
                r3 = this;
                java.lang.String r0 = "$this$toPathString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = r4.size()
                r1 = 0
            Lf:
                if (r1 >= r0) goto L22
                r2 = 47
                r5.append(r2)
                java.lang.Object r2 = r4.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                r5.append(r2)
                int r1 = r1 + 1
                goto Lf
            L22:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> toQueryNamesAndValues$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "$this$toQueryNamesAndValues"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
            Lb:
                int r2 = r7.length()
                if (r1 > r2) goto L54
                r2 = 38
                r3 = 4
                int r2 = kotlin.text.StringsKt.indexOf$default(r7, r2, r1, r3)
                r4 = -1
                if (r2 != r4) goto L1f
                int r2 = r7.length()
            L1f:
                r5 = 61
                int r3 = kotlin.text.StringsKt.indexOf$default(r7, r5, r1, r3)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r3 == r4) goto L43
                if (r3 <= r2) goto L2c
                goto L43
            L2c:
                java.lang.String r1 = r7.substring(r1, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                r0.add(r1)
                int r3 = r3 + 1
                java.lang.String r1 = r7.substring(r3, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                r0.add(r1)
                goto L51
            L43:
                java.lang.String r1 = r7.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                r0.add(r1)
                r1 = 0
                r0.add(r1)
            L51:
                int r1 = r2 + 1
                goto Lb
            L54:
                return r0
        }

        public final void toQueryString$okhttp(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r8) {
                r6 = this;
                java.lang.String r0 = "$this$toQueryString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r7.size()
                r1 = 0
                kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r1, r0)
                r1 = 2
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 < 0) goto L29
                if (r1 > r2) goto L51
                goto L2b
            L29:
                if (r1 < r2) goto L51
            L2b:
                java.lang.Object r3 = r7.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                int r4 = r1 + 1
                java.lang.Object r4 = r7.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r1 <= 0) goto L40
                r5 = 38
                r8.append(r5)
            L40:
                r8.append(r3)
                if (r4 == 0) goto L4d
                r3 = 61
                r8.append(r3)
                r8.append(r4)
            L4d:
                if (r1 == r2) goto L51
                int r1 = r1 + r0
                goto L2b
            L51:
                return
        }
    }

    static {
            okhttp3.HttpUrl$Companion r0 = new okhttp3.HttpUrl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.HttpUrl.Companion = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            okhttp3.HttpUrl.HEX_DIGITS = r0
            return
    }

    public HttpUrl(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "username"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "pathSegments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r1.<init>()
            r1.scheme = r2
            r1.username = r3
            r1.password = r4
            r1.host = r5
            r1.port = r6
            r1.pathSegments = r7
            r1.queryNamesAndValues = r8
            r1.fragment = r9
            r1.url = r10
            java.lang.String r3 = "https"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r1.isHttps = r2
            return
    }

    public static final /* synthetic */ char[] access$getHEX_DIGITS$cp() {
            char[] r0 = okhttp3.HttpUrl.HEX_DIGITS
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            int r1 = r0.defaultPort(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URI r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URL r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "parse")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl parse(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedFragment")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m1930deprecated_encodedFragment() {
            r1 = this;
            java.lang.String r0 = r1.encodedFragment()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPassword")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m1931deprecated_encodedPassword() {
            r1 = this;
            java.lang.String r0 = r1.encodedPassword()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPath")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m1932deprecated_encodedPath() {
            r1 = this;
            java.lang.String r0 = r1.encodedPath()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPathSegments")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m1933deprecated_encodedPathSegments() {
            r1 = this;
            java.util.List r0 = r1.encodedPathSegments()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedQuery")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m1934deprecated_encodedQuery() {
            r1 = this;
            java.lang.String r0 = r1.encodedQuery()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedUsername")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m1935deprecated_encodedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encodedUsername()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_fragment")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final java.lang.String m1936deprecated_fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "host", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_host")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final java.lang.String m1937deprecated_host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_password")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final java.lang.String m1938deprecated_password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_pathSegments")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m1939deprecated_pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_pathSize")
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m1940deprecated_pathSize() {
            r1 = this;
            int r0 = r1.pathSize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "port", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_port")
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m1941deprecated_port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "query", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_query")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m1942deprecated_query() {
            r1 = this;
            java.lang.String r0 = r1.query()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_queryParameterNames")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m1943deprecated_queryParameterNames() {
            r1 = this;
            java.util.Set r0 = r1.queryParameterNames()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_querySize")
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m1944deprecated_querySize() {
            r1 = this;
            int r0 = r1.querySize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_scheme")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m1945deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_uri")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m1946deprecated_uri() {
            r1 = this;
            java.net.URI r0 = r1.uri()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_url")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m1947deprecated_url() {
            r1 = this;
            java.net.URL r0 = r1.url()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "username", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_username")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final java.lang.String m1948deprecated_username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedFragment")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String encodedFragment() {
            r4 = this;
            java.lang.String r0 = r4.fragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.url
            r1 = 35
            r2 = 0
            r3 = 6
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3)
            int r0 = r0 + 1
            java.lang.String r1 = r4.url
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPassword")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedPassword() {
            r6 = this;
            java.lang.String r0 = r6.password
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            java.lang.String r0 = r6.url
            r3 = 58
            java.lang.String r4 = r6.scheme
            int r4 = r4.length()
            int r4 = r4 + 3
            r5 = 4
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r3, r4, r5)
            int r0 = r0 + r2
            java.lang.String r2 = r6.url
            r3 = 64
            r4 = 6
            int r1 = kotlin.text.StringsKt.indexOf$default(r2, r3, r1, r4)
            java.lang.String r2 = r6.url
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPath")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedPath() {
            r4 = this;
            java.lang.String r0 = r4.url
            java.lang.String r1 = r4.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            r3 = 4
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r2, r1, r3)
            java.lang.String r1 = r4.url
            int r2 = r1.length()
            java.lang.String r3 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.lang.String r2 = r4.url
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPathSegments")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> encodedPathSegments() {
            r7 = this;
            java.lang.String r0 = r7.url
            java.lang.String r1 = r7.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            r3 = 4
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r2, r1, r3)
            java.lang.String r1 = r7.url
            int r3 = r1.length()
            java.lang.String r4 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r4, r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L22:
            if (r0 >= r1) goto L41
            int r0 = r0 + 1
            java.lang.String r4 = r7.url
            int r4 = okhttp3.internal.Util.delimiterOffset(r4, r2, r0, r1)
            java.lang.String r5 = r7.url
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String r0 = r5.substring(r0, r4)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r3.add(r0)
            r0 = r4
            goto L22
        L41:
            return r3
    }

    @kotlin.jvm.JvmName(name = "encodedQuery")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String encodedQuery() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.url
            r1 = 63
            r2 = 0
            r3 = 6
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3)
            int r0 = r0 + 1
            java.lang.String r1 = r4.url
            r2 = 35
            int r3 = r1.length()
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r4.url
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedUsername")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedUsername() {
            r4 = this;
            java.lang.String r0 = r4.username
            int r0 = r0.length()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L10
            java.lang.String r0 = ""
            return r0
        L10:
            java.lang.String r0 = r4.scheme
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.url
            int r2 = r1.length()
            java.lang.String r3 = ":@"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.lang.String r2 = r4.url
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.HttpUrl
            if (r0 == 0) goto L12
            okhttp3.HttpUrl r2 = (okhttp3.HttpUrl) r2
            java.lang.String r2 = r2.url
            java.lang.String r0 = r1.url
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @kotlin.jvm.JvmName(name = "fragment")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.url
            int r0 = r0.hashCode()
            return r0
    }

    @kotlin.jvm.JvmName(name = "host")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            boolean r0 = r1.isHttps
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl.Builder newBuilder() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            java.lang.String r1 = r4.scheme
            r0.setScheme$okhttp(r1)
            java.lang.String r1 = r4.encodedUsername()
            r0.setEncodedUsername$okhttp(r1)
            java.lang.String r1 = r4.encodedPassword()
            r0.setEncodedPassword$okhttp(r1)
            java.lang.String r1 = r4.host
            r0.setHost$okhttp(r1)
            int r1 = r4.port
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
            java.lang.String r3 = r4.scheme
            int r2 = r2.defaultPort(r3)
            if (r1 == r2) goto L2c
            int r1 = r4.port
            goto L2d
        L2c:
            r1 = -1
        L2d:
            r0.setPort$okhttp(r1)
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            r1.clear()
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            java.util.List r2 = r4.encodedPathSegments()
            r1.addAll(r2)
            java.lang.String r1 = r4.encodedQuery()
            r0.encodedQuery(r1)
            java.lang.String r1 = r4.encodedFragment()
            r0.setEncodedFragment$okhttp(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.HttpUrl.Builder newBuilder(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> Lf
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> Lf
            okhttp3.HttpUrl$Builder r2 = r0.parse$okhttp(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    @kotlin.jvm.JvmName(name = "password")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @kotlin.jvm.JvmName(name = "pathSegments")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @kotlin.jvm.JvmName(name = "pathSize")
    public final int pathSize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            int r0 = r0.size()
            return r0
    }

    @kotlin.jvm.JvmName(name = "port")
    public final int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @kotlin.jvm.JvmName(name = "query")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String query() {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.util.List<java.lang.String> r2 = r3.queryNamesAndValues
            r1.toQueryString$okhttp(r2, r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String queryParameter(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r2 = 0
            int r0 = r0.size()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r2, r0)
            r2 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r2)
            int r2 = r0.getFirst()
            int r3 = r0.getLast()
            int r0 = r0.getStep()
            if (r0 < 0) goto L2a
            if (r2 > r3) goto L49
            goto L2c
        L2a:
            if (r2 < r3) goto L49
        L2c:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L45
            java.util.List<java.lang.String> r6 = r5.queryNamesAndValues
            int r2 = r2 + 1
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L45:
            if (r2 == r3) goto L49
            int r2 = r2 + r0
            goto L2c
        L49:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String queryParameterName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto L10
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L10:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @kotlin.jvm.JvmName(name = "queryParameterNames")
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> queryParameterNames() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            if (r0 != 0) goto L9
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
            java.util.List<java.lang.String> r2 = r5.queryNamesAndValues
            int r2 = r2.size()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r1, r2)
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 < 0) goto L2f
            if (r2 > r3) goto L41
            goto L31
        L2f:
            if (r2 < r3) goto L41
        L31:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0.add(r4)
            if (r2 == r3) goto L41
            int r2 = r2 + r1
            goto L31
        L41:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r1 = "Collections.unmodifiableSet(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String queryParameterValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lf
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> queryParameterValues(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List<java.lang.String> r0 = r6.queryNamesAndValues
            if (r0 != 0) goto Le
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            return r7
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List<java.lang.String> r2 = r6.queryNamesAndValues
            int r2 = r2.size()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r1, r2)
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 < 0) goto L34
            if (r2 > r3) goto L53
            goto L36
        L34:
            if (r2 < r3) goto L53
        L36:
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)
            if (r4 == 0) goto L4f
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            r0.add(r4)
        L4f:
            if (r2 == r3) goto L53
            int r2 = r2 + r1
            goto L36
        L53:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r0 = "Collections.unmodifiableList(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
    }

    @kotlin.jvm.JvmName(name = "querySize")
    public final int querySize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            int r0 = r0 / 2
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String redact() {
            r2 = this;
            java.lang.String r0 = "/..."
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r1 = ""
            okhttp3.HttpUrl$Builder r0 = r0.username(r1)
            okhttp3.HttpUrl$Builder r0 = r0.password(r1)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.HttpUrl resolve(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.HttpUrl$Builder r2 = r1.newBuilder(r2)
            if (r2 == 0) goto L10
            okhttp3.HttpUrl r2 = r2.build()
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @kotlin.jvm.JvmName(name = "scheme")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String topPrivateDomain() {
            r2 = this;
            java.lang.String r0 = r2.host
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto L16
        La:
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = r0.get()
            java.lang.String r1 = r2.host
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r1)
        L16:
            return r0
    }

    @kotlin.jvm.JvmName(name = "uri")
    @org.jetbrains.annotations.NotNull
    public final java.net.URI uri() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = r4.newBuilder()
            okhttp3.HttpUrl$Builder r0 = r0.reencodeForUri$okhttp()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L12
            goto L2a
        L12:
            r1 = move-exception
            kotlin.text.Regex r2 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = ""
            java.lang.String r0 = r2.replace(r0, r3)     // Catch: java.lang.Exception -> L2b
            java.net.URI r1 = java.net.URI.create(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "try {\n        val stripp…e) // Unexpected!\n      }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        L2a:
            return r1
        L2b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "url")
    @org.jetbrains.annotations.NotNull
    public final java.net.URL url() {
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L8
            java.lang.String r1 = r2.url     // Catch: java.net.MalformedURLException -> L8
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L8
            return r0
        L8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @kotlin.jvm.JvmName(name = "username")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
