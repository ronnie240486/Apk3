package okhttp3.internal;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017\u001a'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a-\u0010'\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u0002H)0!\"\u0002H)H\u0007¢\u0006\u0002\u0010+\u001a1\u0010,\u001a\u0004\u0018\u0001H)\"\u0004\b\u0000\u0010)2\u0006\u0010-\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H)0/2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0002\u00101\u001a\u0016\u00102\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000f\u001a\"\u00105\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a%\u00106\u001a\u00020\u001b\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H7082\u0006\u00109\u001a\u0002H7H\u0000¢\u0006\u0002\u0010:\u001a\u0015\u0010;\u001a\u00020\u0014*\u00020<2\u0006\u0010=\u001a\u00020\u0014H\u0086\u0004\u001a\u0015\u0010;\u001a\u00020\u0017*\u00020\u00142\u0006\u0010=\u001a\u00020\u0017H\u0086\u0004\u001a\u0015\u0010;\u001a\u00020\u0014*\u00020>2\u0006\u0010=\u001a\u00020\u0014H\u0086\u0004\u001a\n\u0010?\u001a\u00020@*\u00020A\u001a\r\u0010B\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\r\u0010C\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\n\u0010D\u001a\u00020\u000f*\u00020\u0011\u001a\u0012\u0010E\u001a\u00020\u000f*\u00020F2\u0006\u0010G\u001a\u00020F\u001a\n\u0010H\u001a\u00020\u001b*\u00020I\u001a\n\u0010H\u001a\u00020\u001b*\u00020J\u001a\n\u0010H\u001a\u00020\u001b*\u00020K\u001a#\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010M\u001a\u00020\u0011¢\u0006\u0002\u0010N\u001a&\u0010O\u001a\u00020\u0014*\u00020\u00112\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u00142\b\b\u0002\u0010S\u001a\u00020\u0014\u001a&\u0010O\u001a\u00020\u0014*\u00020\u00112\u0006\u0010T\u001a\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u00142\b\b\u0002\u0010S\u001a\u00020\u0014\u001a\u001a\u0010U\u001a\u00020\u000f*\u00020V2\u0006\u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u0019\u001a;\u0010Y\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0Z2\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020\u000f0\\¢\u0006\u0002\b]H\u0086\bø\u0001\u0000\u001a5\u0010^\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!2\u000e\u0010_\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110`¢\u0006\u0002\u0010a\u001a\n\u0010b\u001a\u00020\u0017*\u00020c\u001a+\u0010d\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010M\u001a\u00020\u00112\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110`¢\u0006\u0002\u0010e\u001a\n\u0010f\u001a\u00020\u0014*\u00020\u0011\u001a\u001e\u0010g\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u00142\b\b\u0002\u0010S\u001a\u00020\u0014\u001a\u001e\u0010h\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u00142\b\b\u0002\u0010S\u001a\u00020\u0014\u001a\u0014\u0010i\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u0014\u001a9\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010_\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110`¢\u0006\u0002\u0010k\u001a\u0012\u0010l\u001a\u00020\u000f*\u00020m2\u0006\u0010n\u001a\u00020o\u001a\u0012\u0010p\u001a\u00020\u000f*\u00020K2\u0006\u0010q\u001a\u00020r\u001a\r\u0010s\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\r\u0010t\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\n\u0010u\u001a\u00020\u0014*\u00020Q\u001a\n\u0010v\u001a\u00020\u0011*\u00020K\u001a\u0012\u0010w\u001a\u00020x*\u00020r2\u0006\u0010y\u001a\u00020x\u001a\n\u0010z\u001a\u00020\u0014*\u00020r\u001a\u0012\u0010{\u001a\u00020\u0014*\u00020|2\u0006\u0010}\u001a\u00020<\u001a\u001a\u0010{\u001a\u00020\u000f*\u00020V2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u0019\u001a\u0010\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0(*\u00020\u0003\u001a\u0011\u0010\u0080\u0001\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u007f0(\u001a\u000b\u0010\u0081\u0001\u001a\u00020\u0011*\u00020\u0014\u001a\u000b\u0010\u0081\u0001\u001a\u00020\u0011*\u00020\u0017\u001a\u0016\u0010\u0082\u0001\u001a\u00020\u0011*\u00020F2\t\b\u0002\u0010\u0083\u0001\u001a\u00020\u000f\u001a\u001d\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0(\u001a7\u0010\u0085\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u0087\u0001\u0012\u0005\u0012\u0003H\u0088\u00010\u0086\u0001\"\u0005\b\u0000\u0010\u0087\u0001\"\u0005\b\u0001\u0010\u0088\u0001*\u0011\u0012\u0005\u0012\u0003H\u0087\u0001\u0012\u0005\u0012\u0003H\u0088\u00010\u0086\u0001\u001a\u0014\u0010\u0089\u0001\u001a\u00020\u0017*\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u00020\u0017\u001a\u0016\u0010\u008b\u0001\u001a\u00020\u0014*\u0004\u0018\u00010\u00112\u0007\u0010\u008a\u0001\u001a\u00020\u0014\u001a\u001f\u0010\u008c\u0001\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u00142\b\b\u0002\u0010S\u001a\u00020\u0014\u001a\u000e\u0010\u008d\u0001\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a'\u0010\u008e\u0001\u001a\u00030\u008f\u0001*\b0\u0090\u0001j\u0003`\u0091\u00012\u0013\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b0\u0090\u0001j\u0003`\u0091\u00010(\u001a\u0015\u0010\u0093\u0001\u001a\u00020\u001b*\u00030\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u0014\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0096\u0001"}, d2 = {"EMPTY_BYTE_ARRAY", "", "EMPTY_HEADERS", "Lokhttp3/Headers;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "UNICODE_BOMS", "Lokio/Options;", "UTC", "Ljava/util/TimeZone;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "", "okHttpName", "", "userAgent", "checkDuration", "", "name", "duration", "", "unit", "Ljava/util/concurrent/TimeUnit;", "checkOffsetAndCount", "", "arrayLength", "offset", "count", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "ignoreIoExceptions", "block", "Lkotlin/Function0;", "immutableListOf", "", "T", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "readFieldOrNull", "instance", "fieldType", "Ljava/lang/Class;", "fieldName", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "daemon", "threadName", "addIfAbsent", "E", "", "element", "(Ljava/util/List;Ljava/lang/Object;)V", "and", "", "mask", "", "asFactory", "Lokhttp3/EventListener$Factory;", "Lokhttp3/EventListener;", "assertThreadDoesntHoldLock", "assertThreadHoldsLock", "canParseAsIpAddress", "canReuseConnectionFor", "Lokhttp3/HttpUrl;", "other", "closeQuietly", "Ljava/io/Closeable;", "Ljava/net/ServerSocket;", "Ljava/net/Socket;", "concat", "value", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "delimiterOffset", "delimiter", "", "startIndex", "endIndex", "delimiters", "discard", "Lokio/Source;", "timeout", "timeUnit", "filterList", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "hasIntersection", "comparator", "Ljava/util/Comparator;", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "headersContentLength", "Lokhttp3/Response;", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "isCivilized", "Lokhttp3/internal/io/FileSystem;", "file", "Ljava/io/File;", "isHealthy", "source", "Lokio/BufferedSource;", "notify", "notifyAll", "parseHexDigit", "peerName", "readBomAsCharset", "Ljava/nio/charset/Charset;", "default", "readMedium", "skipAll", "Lokio/Buffer;", "b", "toHeaderList", "Lokhttp3/internal/http2/Header;", "toHeaders", "toHexString", "toHostHeader", "includeDefaultPort", "toImmutableList", "toImmutableMap", "", "K", "V", "toLongOrDefault", "defaultValue", "toNonNegativeInt", "trimSubstring", "wait", "withSuppressed", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "writeMedium", "Lokio/BufferedSink;", "medium", "okhttp"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "Util")
public final class Util {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final byte[] EMPTY_BYTE_ARRAY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers EMPTY_HEADERS = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody EMPTY_REQUEST = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody EMPTY_RESPONSE = null;
    private static final okio.Options UNICODE_BOMS = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.TimeZone UTC = null;
    private static final kotlin.text.Regex VERIFY_AS_IP_ADDRESS = null;

    @kotlin.jvm.JvmField
    public static final boolean assertionsEnabled = false;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String okHttpName = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String userAgent = "okhttp/5.0.0-alpha.2";



    static {
            r0 = 0
            byte[] r2 = new byte[r0]
            okhttp3.internal.Util.EMPTY_BYTE_ARRAY = r2
            okhttp3.Headers$Companion r1 = okhttp3.Headers.Companion
            java.lang.String[] r3 = new java.lang.String[r0]
            okhttp3.Headers r1 = r1.of(r3)
            okhttp3.internal.Util.EMPTY_HEADERS = r1
            okhttp3.ResponseBody$Companion r1 = okhttp3.ResponseBody.Companion
            r3 = 0
            r8 = 1
            okhttp3.ResponseBody r1 = okhttp3.ResponseBody.Companion.create$default(r1, r2, r3, r8, r3)
            okhttp3.internal.Util.EMPTY_RESPONSE = r1
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            okhttp3.RequestBody r1 = okhttp3.RequestBody.Companion.create$default(r1, r2, r3, r4, r5, r6, r7)
            okhttp3.internal.Util.EMPTY_REQUEST = r1
            okio.Options$Companion r1 = okio.Options.Companion
            r2 = 5
            okio.ByteString[] r2 = new okio.ByteString[r2]
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r4 = "efbbbf"
            okio.ByteString r4 = r3.decodeHex(r4)
            r2[r0] = r4
            java.lang.String r4 = "feff"
            okio.ByteString r4 = r3.decodeHex(r4)
            r2[r8] = r4
            java.lang.String r4 = "fffe"
            okio.ByteString r4 = r3.decodeHex(r4)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "0000ffff"
            okio.ByteString r4 = r3.decodeHex(r4)
            r5 = 3
            r2[r5] = r4
            java.lang.String r4 = "ffff0000"
            okio.ByteString r3 = r3.decodeHex(r4)
            r4 = 4
            r2[r4] = r3
            okio.Options r1 = r1.of(r2)
            okhttp3.internal.Util.UNICODE_BOMS = r1
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okhttp3.internal.Util.UTC = r1
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            r1.<init>(r2)
            okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS = r1
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            okhttp3.internal.Util.assertionsEnabled = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "OkHttpClient::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r1)
            java.lang.String r0 = kotlin.text.StringsKt.removeSuffix(r0)
            okhttp3.internal.Util.okHttpName = r0
            return
    }

    public static final <E> void addIfAbsent(@org.jetbrains.annotations.NotNull java.util.List<E> r1, E r2) {
            java.lang.String r0 = "$this$addIfAbsent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto Le
            r1.add(r2)
        Le:
            return
    }

    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final int and(short r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.EventListener.Factory asFactory(@org.jetbrains.annotations.NotNull okhttp3.EventListener r1) {
            java.lang.String r0 = "$this$asFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.Util$asFactory$1 r0 = new okhttp3.internal.Util$asFactory$1
            r0.<init>(r1)
            return r0
    }

    public static final void assertThreadDoesntHoldLock(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            java.lang.String r0 = "$this$assertThreadDoesntHoldLock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 != 0) goto L10
            goto L38
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Thread "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L38:
            return
    }

    public static final void assertThreadHoldsLock(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            java.lang.String r0 = "$this$assertThreadHoldsLock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto L10
            goto L38
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Thread "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L38:
            return
    }

    public static final boolean canParseAsIpAddress(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "$this$canParseAsIpAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.text.Regex r0 = okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS
            boolean r1 = r0.matches(r1)
            return r1
    }

    public static final boolean canReuseConnectionFor(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            java.lang.String r0 = "$this$canReuseConnectionFor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.host()
            java.lang.String r1 = r3.host()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L32
            int r0 = r2.port()
            int r1 = r3.port()
            if (r0 != r1) goto L32
            java.lang.String r2 = r2.scheme()
            java.lang.String r3 = r3.scheme()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L32
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            return r2
    }

    public static final int checkDuration(@org.jetbrains.annotations.NotNull java.lang.String r6, long r7, @org.jetbrains.annotations.Nullable java.util.concurrent.TimeUnit r9) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r2 = 1
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto L62
            if (r9 == 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L55
            long r7 = r9.toMillis(r7)
            r9 = 2147483647(0x7fffffff, float:NaN)
            long r4 = (long) r9
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L26
            r9 = 1
            goto L27
        L26:
            r9 = 0
        L27:
            if (r9 == 0) goto L45
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L31
            if (r3 > 0) goto L30
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L35
            int r6 = (int) r7
            return r6
        L35:
            java.lang.String r7 = " too small."
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L45:
            java.lang.String r7 = " too large."
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L55:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unit == null"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L62:
            java.lang.String r7 = " < 0"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final void checkOffsetAndCount(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L12
            long r5 = r5 - r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 < 0) goto L12
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.io.Closeable r1) {
            java.lang.String r0 = "$this$closeQuietly"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9
        L8:
            return
        L9:
            r1 = move-exception
            throw r1
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.net.ServerSocket r1) {
            java.lang.String r0 = "$this$closeQuietly"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9
        L8:
            return
        L9:
            r1 = move-exception
            throw r1
    }

    public static final void closeQuietly(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            java.lang.String r0 = "$this$closeQuietly"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9 java.lang.AssertionError -> L18
        L8:
            return
        L9:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L17
            return
        L17:
            throw r2
        L18:
            r2 = move-exception
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] concat(@org.jetbrains.annotations.NotNull java.lang.String[] r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "$this$concat"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.length
            int r0 = r0 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = kotlin.collections.ArraysKt.getLastIndex(r1)
            r1[r0] = r2
            return r1
    }

    public static final int delimiterOffset(@org.jetbrains.annotations.NotNull java.lang.String r1, char r2, int r3, int r4) {
            java.lang.String r0 = "$this$delimiterOffset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
        L5:
            if (r3 >= r4) goto L11
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto Le
            return r3
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            return r4
    }

    public static final int delimiterOffset(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$delimiterOffset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
        La:
            if (r3 >= r4) goto L1a
            char r0 = r1.charAt(r3)
            boolean r0 = kotlin.text.StringsKt.contains$default(r2, r0)
            if (r0 == 0) goto L17
            return r3
        L17:
            int r3 = r3 + 1
            goto La
        L1a:
            return r4
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, java.lang.String r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static final boolean discard(@org.jetbrains.annotations.NotNull okio.Source r1, int r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r3) {
            java.lang.String r0 = "$this$discard"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r1 = skipAll(r1, r2, r3)     // Catch: java.io.IOException -> L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> filterList(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "$this$filterList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L12
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L33
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L33:
            java.util.List r2 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r0)
            r2.add(r1)
            goto L12
        L3b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String format(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object... r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            java.lang.String r3 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final boolean hasIntersection(@org.jetbrains.annotations.NotNull java.lang.String[] r8, @org.jetbrains.annotations.Nullable java.lang.String[] r9, @org.jetbrains.annotations.NotNull java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "$this$hasIntersection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r8.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L38
            if (r9 == 0) goto L38
            int r0 = r9.length
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L1f
            goto L38
        L1f:
            int r0 = r8.length
            r3 = 0
        L21:
            if (r3 >= r0) goto L38
            r4 = r8[r3]
            int r5 = r9.length
            r6 = 0
        L27:
            if (r6 >= r5) goto L35
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L32
            return r1
        L32:
            int r6 = r6 + 1
            goto L27
        L35:
            int r3 = r3 + 1
            goto L21
        L38:
            return r2
    }

    public static final long headersContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
            java.lang.String r0 = "$this$headersContentLength"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r2 = r2.headers()
            java.lang.String r0 = "Content-Length"
            java.lang.String r2 = r2.get(r0)
            r0 = -1
            if (r2 == 0) goto L17
            long r0 = toLongOrDefault(r2, r0)
        L17:
            return r0
    }

    public static final void ignoreIoExceptions(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.invoke()     // Catch: java.io.IOException -> L8
        L8:
            return
    }

    @java.lang.SafeVarargs
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> immutableListOf(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "Collections.unmodifiable…istOf(*elements.clone()))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final int indexOf(@org.jetbrains.annotations.NotNull java.lang.String[] r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.Comparator<java.lang.String> r6) {
            java.lang.String r0 = "$this$indexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L13:
            if (r2 >= r0) goto L26
            r3 = r4[r2]
            int r3 = r6.compare(r3, r5)
            if (r3 != 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L13
        L26:
            r2 = -1
        L27:
            return r2
    }

    public static final int indexOfControlOrNonAscii(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "$this$indexOfControlOrNonAscii"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L25
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r2, r3)
            if (r3 <= 0) goto L24
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r2, r3)
            if (r2 < 0) goto L21
            goto L24
        L21:
            int r1 = r1 + 1
            goto La
        L24:
            return r1
        L25:
            r4 = -1
            return r4
    }

    public static final int indexOfFirstNonAsciiWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$indexOfFirstNonAsciiWhitespace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
        L5:
            if (r3 >= r4) goto L23
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L20
            r1 = 10
            if (r0 == r1) goto L20
            r1 = 12
            if (r0 == r1) goto L20
            r1 = 13
            if (r0 == r1) goto L20
            r1 = 32
            if (r0 == r1) goto L20
            return r3
        L20:
            int r3 = r3 + 1
            goto L5
        L23:
            return r4
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfFirstNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfLastNonAsciiWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$indexOfLastNonAsciiWhitespace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r4 = r4 + (-1)
            if (r4 < r3) goto L29
        L9:
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 == r1) goto L24
            r1 = 10
            if (r0 == r1) goto L24
            r1 = 12
            if (r0 == r1) goto L24
            r1 = 13
            if (r0 == r1) goto L24
            r1 = 32
            if (r0 == r1) goto L24
            int r4 = r4 + 1
            return r4
        L24:
            if (r4 == r3) goto L29
            int r4 = r4 + (-1)
            goto L9
        L29:
            return r3
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfLastNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfNonWhitespace(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4) {
            java.lang.String r0 = "$this$indexOfNonWhitespace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length()
        L9:
            if (r4 >= r0) goto L1b
            char r1 = r3.charAt(r4)
            r2 = 32
            if (r1 == r2) goto L18
            r2 = 9
            if (r1 == r2) goto L18
            return r4
        L18:
            int r4 = r4 + 1
            goto L9
        L1b:
            int r3 = r3.length()
            return r3
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = indexOfNonWhitespace(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] intersect(@org.jetbrains.annotations.NotNull java.lang.String[] r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9, @org.jetbrains.annotations.NotNull java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "$this$intersect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r1) goto L31
            r4 = r8[r3]
            int r5 = r9.length
            r6 = 0
        L1d:
            if (r6 >= r5) goto L2e
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L2b
            r0.add(r4)
            goto L2e
        L2b:
            int r6 = r6 + 1
            goto L1d
        L2e:
            int r3 = r3 + 1
            goto L17
        L31:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r9)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static final boolean isCivilized(@org.jetbrains.annotations.NotNull okhttp3.internal.io.FileSystem r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "$this$isCivilized"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.Sink r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r3 = 1
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r3
        L17:
            r3 = move-exception
            goto L23
        L19:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L23:
            throw r3     // Catch: java.lang.Throwable -> L24
        L24:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            throw r4
    }

    public static final boolean isHealthy(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
            java.lang.String r0 = "$this$isHealthy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            int r1 = r2.getSoTimeout()     // Catch: java.io.IOException -> L22 java.net.SocketTimeoutException -> L23
            r2.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.exhausted()     // Catch: java.lang.Throwable -> L1d
            r3 = r3 ^ r0
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L22 java.net.SocketTimeoutException -> L23
            r0 = r3
            goto L23
        L1d:
            r3 = move-exception
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L22 java.net.SocketTimeoutException -> L23
            throw r3     // Catch: java.io.IOException -> L22 java.net.SocketTimeoutException -> L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    public static final void notify(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            java.lang.String r0 = "$this$notify"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.notify()
            return
    }

    public static final void notifyAll(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            java.lang.String r0 = "$this$notifyAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.notifyAll()
            return
    }

    public static final int parseHexDigit(char r2) {
            r0 = 48
            if (r0 <= r2) goto L5
            goto Lb
        L5:
            r1 = 57
            if (r1 < r2) goto Lb
            int r2 = r2 - r0
            goto L23
        Lb:
            r0 = 102(0x66, float:1.43E-43)
            r1 = 97
            if (r1 <= r2) goto L12
            goto L18
        L12:
            if (r0 < r2) goto L18
        L14:
            int r2 = r2 - r1
            int r2 = r2 + 10
            goto L23
        L18:
            r0 = 70
            r1 = 65
            if (r1 <= r2) goto L1f
            goto L22
        L1f:
            if (r0 < r2) goto L22
            goto L14
        L22:
            r2 = -1
        L23:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String peerName(@org.jetbrains.annotations.NotNull java.net.Socket r1) {
            java.lang.String r0 = "$this$peerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.net.SocketAddress r1 = r1.getRemoteSocketAddress()
            boolean r0 = r1 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto L19
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r1 = r1.getHostName()
            java.lang.String r0 = "address.hostName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L1d
        L19:
            java.lang.String r1 = r1.toString()
        L1d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset readBomAsCharset(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) throws java.io.IOException {
            java.lang.String r0 = "$this$readBomAsCharset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Options r0 = okhttp3.internal.Util.UNICODE_BOMS
            int r1 = r1.select(r0)
            r0 = -1
            if (r1 == r0) goto L4c
            if (r1 == 0) goto L45
            r2 = 1
            if (r1 == r2) goto L3d
            r2 = 2
            if (r1 == r2) goto L35
            r2 = 3
            if (r1 == r2) goto L2e
            r2 = 4
            if (r1 != r2) goto L28
            kotlin.text.Charsets r1 = kotlin.text.Charsets.INSTANCE
            java.nio.charset.Charset r2 = r1.UTF32_LE()
            goto L4c
        L28:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L2e:
            kotlin.text.Charsets r1 = kotlin.text.Charsets.INSTANCE
            java.nio.charset.Charset r2 = r1.UTF32_BE()
            goto L4c
        L35:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r1 = "UTF_16LE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L4c
        L3d:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = "UTF_16BE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L4c
        L45:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
        L4c:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T readFieldOrNull(@org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull java.lang.Class<T> r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "fieldType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "fieldName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.Class r1 = r6.getClass()
        L15:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L44
            java.lang.reflect.Field r2 = r1.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.String r5 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.NoSuchFieldException -> L3a
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.NoSuchFieldException -> L3a
            boolean r3 = r7.isInstance(r2)     // Catch: java.lang.NoSuchFieldException -> L3a
            if (r3 != 0) goto L35
            goto L39
        L35:
            java.lang.Object r4 = r7.cast(r2)     // Catch: java.lang.NoSuchFieldException -> L3a
        L39:
            return r4
        L3a:
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.String r2 = "c.superclass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L15
        L44:
            java.lang.String r1 = "delegate"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L58
            java.lang.Object r6 = readFieldOrNull(r6, r0, r1)
            if (r6 == 0) goto L58
            java.lang.Object r6 = readFieldOrNull(r6, r7, r8)
            return r6
        L58:
            return r4
    }

    public static final int readMedium(@org.jetbrains.annotations.NotNull okio.BufferedSource r3) throws java.io.IOException {
            java.lang.String r0 = "$this$readMedium"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte r0 = r3.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = and(r0, r1)
            int r0 = r0 << 16
            byte r2 = r3.readByte()
            int r2 = and(r2, r1)
            int r2 = r2 << 8
            r0 = r0 | r2
            byte r3 = r3.readByte()
            int r3 = and(r3, r1)
            r3 = r3 | r0
            return r3
    }

    public static final int skipAll(@org.jetbrains.annotations.NotNull okio.Buffer r3, byte r4) {
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
        L6:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L1a
            r1 = 0
            byte r1 = r3.getByte(r1)
            if (r1 != r4) goto L1a
            int r0 = r0 + 1
            r3.readByte()
            goto L6
        L1a:
            return r0
    }

    public static final boolean skipAll(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) throws java.io.IOException {
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L28
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L29
        L28:
            r5 = r3
        L29:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L65 java.io.InterruptedIOException -> L7b
            r12.<init>()     // Catch: java.lang.Throwable -> L65 java.io.InterruptedIOException -> L7b
        L3f:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L65 java.io.InterruptedIOException -> L7b
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4f
            r12.clear()     // Catch: java.lang.Throwable -> L65 java.io.InterruptedIOException -> L7b
            goto L3f
        L4f:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5c
        L54:
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L82
        L5c:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L82
        L65:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L72
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L7a
        L72:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L7a:
            throw r12
        L7b:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5c
            goto L54
        L82:
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.ThreadFactory threadFactory(@org.jetbrains.annotations.NotNull java.lang.String r1, boolean r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.Util$threadFactory$1 r0 = new okhttp3.internal.Util$threadFactory$1
            r0.<init>(r1, r2)
            return r0
    }

    public static final void threadName(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = r0.getName()
            r0.setName(r2)
            r2 = 1
            r3.invoke()     // Catch: java.lang.Throwable -> L28
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r0.setName(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L28:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r0.setName(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(@org.jetbrains.annotations.NotNull okhttp3.Headers r5) {
            java.lang.String r0 = "$this$toHeaderList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            r1 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            r2 = r0
            kotlin.collections.IntIterator r2 = (kotlin.collections.IntIterator) r2
            int r2 = r2.nextInt()
            okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
            java.lang.String r4 = r5.name(r2)
            java.lang.String r2 = r5.value(r2)
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L1b
        L39:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers toHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) {
            java.lang.String r0 = "$this$toHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            okhttp3.internal.http2.Header r1 = (okhttp3.internal.http2.Header) r1
            okio.ByteString r2 = r1.component1()
            okio.ByteString r1 = r1.component2()
            java.lang.String r2 = r2.utf8()
            java.lang.String r1 = r1.utf8()
            r0.addLenient$okhttp(r2, r1)
            goto Le
        L2e:
            okhttp3.Headers r3 = r0.build()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(int r1) {
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r0 = "Integer.toHexString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(long r0) {
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            java.lang.String r1 = "java.lang.Long.toHexString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHostHeader(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, boolean r4) {
            java.lang.String r0 = "$this$toHostHeader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.host()
            java.lang.String r1 = ":"
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1)
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r3.host()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L30
        L2c:
            java.lang.String r0 = r3.host()
        L30:
            if (r4 != 0) goto L42
            int r4 = r3.port()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.lang.String r2 = r3.scheme()
            int r1 = r1.defaultPort(r2)
            if (r4 == r1) goto L5a
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r0 = 58
            r4.append(r0)
            int r3 = r3.port()
            r4.append(r3)
            java.lang.String r0 = r4.toString()
        L5a:
            return r0
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r0 = toHostHeader(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toImmutableList(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "$this$toImmutableList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "Collections.unmodifiableList(toMutableList())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> toImmutableMap(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "$this$toImmutableMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
            goto L1e
        L10:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r0 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        L1e:
            return r1
    }

    public static final long toLongOrDefault(@org.jetbrains.annotations.NotNull java.lang.String r1, long r2) {
            java.lang.String r0 = "$this$toLongOrDefault"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            long r2 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L9
        L9:
            return r2
    }

    public static final int toNonNegativeInt(@org.jetbrains.annotations.Nullable java.lang.String r4, int r5) {
            if (r4 == 0) goto L19
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L19
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r1 = (long) r0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lf
            goto L18
        Lf:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L17
            r0 = 0
            goto L18
        L17:
            int r0 = (int) r4
        L18:
            return r0
        L19:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimSubstring(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "$this$trimSubstring"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = indexOfFirstNonAsciiWhitespace(r1, r2, r3)
            int r3 = indexOfLastNonAsciiWhitespace(r1, r2, r3)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            java.lang.String r0 = trimSubstring(r0, r1, r2)
            return r0
    }

    public static final void wait(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            java.lang.String r0 = "$this$wait"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.wait()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Throwable withSuppressed(@org.jetbrains.annotations.NotNull java.lang.Exception r1, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Exception> r2) {
            java.lang.String r0 = "$this$withSuppressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "suppressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
            goto Lf
        L1f:
            return r1
    }

    public static final void writeMedium(@org.jetbrains.annotations.NotNull okio.BufferedSink r1, int r2) throws java.io.IOException {
            java.lang.String r0 = "$this$writeMedium"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
    }
}
