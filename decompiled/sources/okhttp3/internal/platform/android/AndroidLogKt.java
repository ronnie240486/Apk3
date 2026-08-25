package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidLevel", "", "Ljava/util/logging/LogRecord;", "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class AndroidLogKt {
    public static final /* synthetic */ int access$getAndroidLevel$p(java.util.logging.LogRecord r0) {
            int r0 = getAndroidLevel(r0)
            return r0
    }

    private static final int getAndroidLevel(java.util.logging.LogRecord r2) {
            java.util.logging.Level r0 = r2.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r1 = r1.intValue()
            if (r0 <= r1) goto L12
            r2 = 5
            goto L25
        L12:
            java.util.logging.Level r2 = r2.getLevel()
            int r2 = r2.intValue()
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            int r0 = r0.intValue()
            if (r2 != r0) goto L24
            r2 = 4
            goto L25
        L24:
            r2 = 3
        L25:
            return r2
    }
}
