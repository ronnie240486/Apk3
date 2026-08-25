package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "()V", "close", "", "flush", "publish", "record", "Ljava/util/logging/LogRecord;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class AndroidLogHandler extends java.util.logging.Handler {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidLogHandler INSTANCE = null;

    static {
            okhttp3.internal.platform.android.AndroidLogHandler r0 = new okhttp3.internal.platform.android.AndroidLogHandler
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE = r0
            return
    }

    private AndroidLogHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.logging.Handler
    public void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void publish(@org.jetbrains.annotations.NotNull java.util.logging.LogRecord r6) {
            r5 = this;
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
            java.lang.String r1 = r6.getLoggerName()
            java.lang.String r2 = "record.loggerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r2 = okhttp3.internal.platform.android.AndroidLogKt.access$getAndroidLevel$p(r6)
            java.lang.String r3 = r6.getMessage()
            java.lang.String r4 = "record.message"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Throwable r6 = r6.getThrown()
            r0.androidLog$okhttp(r1, r2, r3, r6)
            return
    }
}
