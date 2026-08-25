package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes.dex */
@okhttp3.internal.SuppressSignatureCheck
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "()V", "MAX_LOG_LENGTH", "", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "knownLoggers", "", "", "androidLog", "", "loggerName", "logLevel", "message", "t", "", "androidLog$okhttp", "enable", "enableLogging", "logger", "tag", "loggerTag", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class AndroidLog {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidLog INSTANCE = null;
    private static final int MAX_LOG_LENGTH = 4000;
    private static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> configuredLoggers = null;
    private static final java.util.Map<java.lang.String, java.lang.String> knownLoggers = null;

    static {
            okhttp3.internal.platform.android.AndroidLog r0 = new okhttp3.internal.platform.android.AndroidLog
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.INSTANCE = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.configuredLoggers = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            java.lang.Package r1 = r1.getPackage()
            if (r1 == 0) goto L20
            java.lang.String r1 = r1.getName()
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L28
            java.lang.String r2 = "OkHttp"
            r0.put(r1, r2)
        L28:
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OkHttpClient::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.http2.Http2> r1 = okhttp3.internal.http2.Http2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Http2::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r1 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "TaskRunner::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)
            okhttp3.internal.platform.android.AndroidLog.knownLoggers = r0
            return
    }

    private AndroidLog() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void enableLogging(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r0 = okhttp3.internal.platform.android.AndroidLog.configuredLoggers
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L33
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r0 = 0
            r2.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1f
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L2b
        L1f:
            r0 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r0)
            if (r3 == 0) goto L29
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L2b
        L29:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L2b:
            r2.setLevel(r3)
            okhttp3.internal.platform.android.AndroidLogHandler r3 = okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE
            r2.addHandler(r3)
        L33:
            return
    }

    private final java.lang.String loggerTag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            r0 = 23
            java.lang.String r0 = kotlin.text.StringsKt.take(r2, r0)
        L11:
            return r0
    }

    public final void androidLog$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r5, int r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.Throwable r8) {
            r4 = this;
            java.lang.String r0 = "loggerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r5 = r4.loggerTag(r5)
            boolean r0 = android.util.Log.isLoggable(r5, r6)
            if (r0 == 0) goto L53
            if (r8 == 0) goto L27
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r7, r0)
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
        L27:
            r8 = 0
            int r0 = r7.length()
        L2c:
            if (r8 >= r0) goto L53
            r1 = 10
            r2 = 4
            int r1 = kotlin.text.StringsKt.indexOf$default(r7, r1, r8, r2)
            r2 = -1
            if (r1 == r2) goto L39
            goto L3a
        L39:
            r1 = r0
        L3a:
            int r2 = r8 + 4000
            int r2 = java.lang.Math.min(r1, r2)
            java.lang.String r8 = r7.substring(r8, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            android.util.Log.println(r6, r5, r8)
            if (r2 < r1) goto L51
            int r8 = r2 + 1
            goto L2c
        L51:
            r8 = r2
            goto L3a
        L53:
            return
    }

    public final void enable() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r3.enableLogging(r2, r1)
            goto La
        L26:
            return
    }
}
