package okhttp3.logging;

/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", "i", "", "redactHeader", "name", "setLevel", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
public final class HttpLoggingInterceptor implements okhttp3.Interceptor {
    private volatile java.util.Set<java.lang.String> headersToRedact;

    @org.jetbrains.annotations.NotNull
    private volatile okhttp3.logging.HttpLoggingInterceptor.Level level;
    private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
    public static final enum Level extends java.lang.Enum<okhttp3.logging.HttpLoggingInterceptor.Level> {
        private static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Level[] $VALUES = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BASIC = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BODY = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level HEADERS = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level NONE = null;

        static {
                r0 = 4
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = new okhttp3.logging.HttpLoggingInterceptor.Level[r0]
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r2 = "NONE"
                r3 = 0
                r1.<init>(r2, r3)
                okhttp3.logging.HttpLoggingInterceptor.Level.NONE = r1
                r0[r3] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r2 = "BASIC"
                r3 = 1
                r1.<init>(r2, r3)
                okhttp3.logging.HttpLoggingInterceptor.Level.BASIC = r1
                r0[r3] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r2 = "HEADERS"
                r3 = 2
                r1.<init>(r2, r3)
                okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS = r1
                r0[r3] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r2 = "BODY"
                r3 = 3
                r1.<init>(r2, r3)
                okhttp3.logging.HttpLoggingInterceptor.Level.BODY = r1
                r0[r3] = r1
                okhttp3.logging.HttpLoggingInterceptor.Level.$VALUES = r0
                return
        }

        private Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level valueOf(java.lang.String r1) {
                java.lang.Class<okhttp3.logging.HttpLoggingInterceptor$Level> r0 = okhttp3.logging.HttpLoggingInterceptor.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = (okhttp3.logging.HttpLoggingInterceptor.Level) r1
                return r1
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level[] values() {
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = okhttp3.logging.HttpLoggingInterceptor.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = (okhttp3.logging.HttpLoggingInterceptor.Level[]) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
    public interface Logger {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger.Companion Companion = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger DEFAULT = null;

        /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
        /* JADX INFO: loaded from: classes3.dex */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
        public static final class Companion {

            /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
            /* JADX INFO: loaded from: classes.dex */
            @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "()V", "log", "", "message", "", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
            public static final class DefaultLogger implements okhttp3.logging.HttpLoggingInterceptor.Logger {
                public DefaultLogger() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                        r7 = this;
                        java.lang.String r0 = "message"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                        okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                        okhttp3.internal.platform.Platform r1 = r0.get()
                        r3 = 0
                        r4 = 0
                        r5 = 6
                        r6 = 0
                        r2 = r8
                        okhttp3.internal.platform.Platform.log$default(r1, r2, r3, r4, r5, r6)
                        return
                }
            }

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
                okhttp3.logging.HttpLoggingInterceptor$Logger$Companion r0 = new okhttp3.logging.HttpLoggingInterceptor$Logger$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.logging.HttpLoggingInterceptor.Logger.Companion = r0
                okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DefaultLogger r0 = new okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DefaultLogger
                r0.<init>()
                okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT = r0
                return
        }

        void log(@org.jetbrains.annotations.NotNull java.lang.String r1);
    }

    @kotlin.jvm.JvmOverloads
    public HttpLoggingInterceptor() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public HttpLoggingInterceptor(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Logger r2) {
            r1 = this;
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.logger = r2
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
            r1.headersToRedact = r2
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            r1.level = r2
            return
    }

    public /* synthetic */ HttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor.Logger r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.logging.HttpLoggingInterceptor$Logger r1 = okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT
        L6:
            r0.<init>(r1)
            return
    }

    private final boolean bodyHasUnknownEncoding(okhttp3.Headers r2) {
            r1 = this;
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = r2.get(r0)
            if (r2 == 0) goto L1a
            java.lang.String r0 = "identity"
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "gzip"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r0)
            if (r2 != 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    private final void logHeader(okhttp3.Headers r4, int r5) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.headersToRedact
            java.lang.String r1 = r4.name(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "██"
            goto L13
        Lf:
            java.lang.String r0 = r4.value(r5)
        L13:
            okhttp3.logging.HttpLoggingInterceptor$Logger r1 = r3.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.name(r5)
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.log(r4)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to var", replaceWith = @kotlin.ReplaceWith(expression = "level", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_level")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name */
    public final okhttp3.logging.HttpLoggingInterceptor.Level m2013deprecated_level() {
            r1 = this;
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.level
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
            r1 = this;
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.level
            return r0
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r22) throws java.io.IOException {
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.level
            okhttp3.Request r3 = r22.request()
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L18
            okhttp3.Response r0 = r0.proceed(r3)
            return r0
        L18:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            if (r2 != r4) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L28
            okhttp3.logging.HttpLoggingInterceptor$Level r5 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r5) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = 1
        L29:
            okhttp3.RequestBody r5 = r3.body()
            okhttp3.Connection r6 = r22.connection()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            java.lang.String r8 = r3.method()
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            okhttp3.HttpUrl r8 = r3.url()
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L60
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            okhttp3.Protocol r6 = r6.protocol()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L61
        L60:
            r6 = r8
        L61:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r2 != 0) goto L82
            if (r5 == 0) goto L82
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r6, r9)
            long r10 = r5.contentLength()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L82:
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.logger
            r10.log(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            if (r2 == 0) goto L1e5
            okhttp3.Headers r11 = r3.headers()
            if (r5 == 0) goto Ldf
            okhttp3.MediaType r12 = r5.contentType()
            if (r12 == 0) goto Lb7
            java.lang.String r13 = "Content-Type"
            java.lang.String r13 = r11.get(r13)
            if (r13 != 0) goto Lb7
            okhttp3.logging.HttpLoggingInterceptor$Logger r13 = r1.logger
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.log(r12)
        Lb7:
            long r12 = r5.contentLength()
            r14 = -1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto Ldf
            java.lang.String r12 = "Content-Length"
            java.lang.String r12 = r11.get(r12)
            if (r12 != 0) goto Ldf
            okhttp3.logging.HttpLoggingInterceptor$Logger r12 = r1.logger
            java.lang.String r13 = "Content-Length: "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            long r14 = r5.contentLength()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.log(r13)
        Ldf:
            int r12 = r11.size()
            r13 = 0
        Le4:
            if (r13 >= r12) goto Lec
            r1.logHeader(r11, r13)
            int r13 = r13 + 1
            goto Le4
        Lec:
            java.lang.String r11 = "--> END "
            if (r4 == 0) goto L1d1
            if (r5 != 0) goto Lf4
            goto L1d1
        Lf4:
            okhttp3.Headers r12 = r3.headers()
            boolean r12 = r1.bodyHasUnknownEncoding(r12)
            if (r12 == 0) goto L119
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r3.method()
            r11.append(r12)
            java.lang.String r12 = " (encoded body omitted)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.log(r11)
            goto L1e5
        L119:
            boolean r12 = r5.isDuplex()
            if (r12 == 0) goto L13a
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r3.method()
            r11.append(r12)
            java.lang.String r12 = " (duplex request body omitted)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.log(r11)
            goto L1e5
        L13a:
            boolean r12 = r5.isOneShot()
            if (r12 == 0) goto L15b
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r3.method()
            r11.append(r12)
            java.lang.String r12 = " (one-shot body omitted)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.log(r11)
            goto L1e5
        L15b:
            okio.Buffer r12 = new okio.Buffer
            r12.<init>()
            r5.writeTo(r12)
            okhttp3.MediaType r13 = r5.contentType()
            if (r13 == 0) goto L172
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r13 = r13.charset(r14)
            if (r13 == 0) goto L172
            goto L177
        L172:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
        L177:
            okhttp3.logging.HttpLoggingInterceptor$Logger r14 = r1.logger
            r14.log(r8)
            boolean r14 = okhttp3.logging.internal.Utf8Kt.isProbablyUtf8(r12)
            if (r14 == 0) goto L1ad
            okhttp3.logging.HttpLoggingInterceptor$Logger r14 = r1.logger
            java.lang.String r12 = r12.readString(r13)
            r14.log(r12)
            okhttp3.logging.HttpLoggingInterceptor$Logger r12 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r13 = r3.method()
            r11.append(r13)
            r11.append(r9)
            long r13 = r5.contentLength()
            r11.append(r13)
            r11.append(r7)
            java.lang.String r5 = r11.toString()
            r12.log(r5)
            goto L1e5
        L1ad:
            okhttp3.logging.HttpLoggingInterceptor$Logger r12 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r13 = r3.method()
            r11.append(r13)
            java.lang.String r13 = " (binary "
            r11.append(r13)
            long r13 = r5.contentLength()
            r11.append(r13)
            r11.append(r6)
            java.lang.String r5 = r11.toString()
            r12.log(r5)
            goto L1e5
        L1d1:
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r3.method()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.log(r11)
        L1e5:
            long r11 = java.lang.System.nanoTime()
            okhttp3.Response r0 = r0.proceed(r3)     // Catch: java.lang.Exception -> L3a8
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 - r11
            long r11 = r3.toMillis(r13)
            okhttp3.ResponseBody r3 = r0.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            long r13 = r3.contentLength()
            r15 = -1
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L21b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r15 = "-byte"
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            goto L21d
        L21b:
            java.lang.String r5 = "unknown-length"
        L21d:
            okhttp3.logging.HttpLoggingInterceptor$Logger r15 = r1.logger
            java.lang.String r16 = "<-- "
            r17 = r7
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r16)
            r18 = r13
            int r13 = r0.code()
            r7.append(r13)
            java.lang.String r13 = r0.message()
            int r13 = r13.length()
            if (r13 != 0) goto L23c
            r13 = 1
            goto L23d
        L23c:
            r13 = 0
        L23d:
            if (r13 == 0) goto L243
            r20 = r6
            r6 = r8
            goto L25e
        L243:
            java.lang.String r13 = r0.message()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = 32
            r20 = r6
            java.lang.String r6 = java.lang.String.valueOf(r16)
            r14.append(r6)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
        L25e:
            r7.append(r6)
            r6 = 32
            r7.append(r6)
            okhttp3.Request r6 = r0.request()
            okhttp3.HttpUrl r6 = r6.url()
            r7.append(r6)
            r7.append(r9)
            r7.append(r11)
            java.lang.String r6 = "ms"
            r7.append(r6)
            if (r2 != 0) goto L287
            java.lang.String r6 = ", "
            java.lang.String r9 = " body"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5, r9)
            goto L288
        L287:
            r5 = r8
        L288:
            r7.append(r5)
            r5 = 41
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r15.log(r5)
            if (r2 == 0) goto L3a7
            okhttp3.Headers r2 = r0.headers()
            int r5 = r2.size()
            r6 = 0
        L2a2:
            if (r6 >= r5) goto L2aa
            r1.logHeader(r2, r6)
            int r6 = r6 + 1
            goto L2a2
        L2aa:
            if (r4 == 0) goto L3a0
            boolean r4 = okhttp3.internal.http.HttpHeaders.promisesBody(r0)
            if (r4 != 0) goto L2b4
            goto L3a0
        L2b4:
            okhttp3.Headers r4 = r0.headers()
            boolean r4 = r1.bodyHasUnknownEncoding(r4)
            if (r4 == 0) goto L2c7
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            goto L3a7
        L2c7:
            okio.BufferedSource r4 = r3.source()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.request(r5)
            okio.Buffer r4 = r4.getBuffer()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r2 = r2.get(r5)
            java.lang.String r5 = "gzip"
            boolean r2 = kotlin.text.StringsKt.equals(r5, r2)
            r5 = 0
            if (r2 == 0) goto L30d
            long r6 = r4.size()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            okio.GzipSource r6 = new okio.GzipSource
            okio.Buffer r4 = r4.m2017clone()
            r6.<init>(r4)
            okio.Buffer r4 = new okio.Buffer     // Catch: java.lang.Throwable -> L304
            r4.<init>()     // Catch: java.lang.Throwable -> L304
            r4.writeAll(r6)     // Catch: java.lang.Throwable -> L304
            kotlin.io.CloseableKt.closeFinally(r6, r5)
            r5 = r2
            goto L30d
        L304:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L307
        L307:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r6, r2)
            throw r3
        L30d:
            okhttp3.MediaType r2 = r3.contentType()
            if (r2 == 0) goto L31c
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.charset(r3)
            if (r2 == 0) goto L31c
            goto L321
        L31c:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r10)
        L321:
            boolean r3 = okhttp3.logging.internal.Utf8Kt.isProbablyUtf8(r4)
            if (r3 != 0) goto L348
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            r2.log(r8)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP (binary "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            long r4 = r4.size()
            r3.append(r4)
            r4 = r20
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.log(r3)
            return r0
        L348:
            r6 = 0
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 == 0) goto L360
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            r3.log(r8)
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            okio.Buffer r6 = r4.m2017clone()
            java.lang.String r2 = r6.readString(r2)
            r3.log(r2)
        L360:
            java.lang.String r2 = "<-- END HTTP ("
            if (r5 == 0) goto L386
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            long r6 = r4.size()
            r2.append(r6)
            java.lang.String r4 = "-byte, "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = "-gzipped-byte body)"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.log(r2)
            goto L3a7
        L386:
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            long r4 = r4.size()
            r2.append(r4)
            r4 = r17
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.log(r2)
            goto L3a7
        L3a0:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L3a7:
            return r0
        L3a8:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r1.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.log(r3)
            throw r2
    }

    @kotlin.jvm.JvmName(name = "level")
    public final void level(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Level r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.level = r2
            return
    }

    public final void redactHeader(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r1 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r1)
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r2.headersToRedact
            kotlin.collections.CollectionsKt.addAll(r0, r1)
            r0.add(r3)
            r2.headersToRedact = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.logging.HttpLoggingInterceptor setLevel(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Level r2) {
            r1 = this;
            java.lang.String r0 = "level"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.level = r2
            return r1
    }
}
