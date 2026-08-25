package okhttp3.internal.http;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u001a\f\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0005\u001a\n\u0010\u000e\u001a\u00020\u0005*\u00020\r\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"BROWSER_COMPATIBLE_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "", "[Ljava/lang/String;", "MAX_DATE", "", "STANDARD_DATE_FORMAT", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "toHttpDateOrNull", "Ljava/util/Date;", "toHttpDateString", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class DatesKt {
    private static final java.text.DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = null;
    private static final java.lang.String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = null;
    public static final long MAX_DATE = 253402300799999L;
    private static final okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = null;

    static {
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = new okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
            r0.<init>()
            okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT = r0
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r2 = "EEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r3 = "EEE MMM d HH:mm:ss yyyy"
            java.lang.String r4 = "EEE, dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r5 = "EEE, dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r6 = "EEE, dd MMM yy HH:mm:ss z"
            java.lang.String r7 = "EEE dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r8 = "EEE dd MMM yyyy HH:mm:ss z"
            java.lang.String r9 = "EEE dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r10 = "EEE dd-MMM-yy HH:mm:ss z"
            java.lang.String r11 = "EEE dd MMM yy HH:mm:ss z"
            java.lang.String r12 = "EEE,dd-MMM-yy HH:mm:ss z"
            java.lang.String r13 = "EEE,dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r14 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String r15 = "EEE MMM d yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.util.Date toHttpDateOrNull(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "$this$toHttpDateOrNull"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r2 = 0
            if (r0 == 0) goto L13
            return r2
        L13:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r0.<init>(r1)
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r3 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r3 = r3.get()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r3 = r3.parse(r10, r0)
            int r4 = r0.getIndex()
            int r5 = r10.length()
            if (r4 != r5) goto L2f
            return r3
        L2f:
            java.lang.String[] r3 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS
            monitor-enter(r3)
            int r4 = r3.length     // Catch: java.lang.Throwable -> L64
            r5 = 0
        L34:
            if (r5 >= r4) goto L60
            java.text.DateFormat[] r6 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS     // Catch: java.lang.Throwable -> L64
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L64
            if (r7 != 0) goto L4e
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L64
            java.lang.String[] r8 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS     // Catch: java.lang.Throwable -> L64
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L64
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L64
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L64
            java.util.TimeZone r8 = okhttp3.internal.Util.UTC     // Catch: java.lang.Throwable -> L64
            r7.setTimeZone(r8)     // Catch: java.lang.Throwable -> L64
            r6[r5] = r7     // Catch: java.lang.Throwable -> L64
        L4e:
            r0.setIndex(r1)     // Catch: java.lang.Throwable -> L64
            java.util.Date r6 = r7.parse(r10, r0)     // Catch: java.lang.Throwable -> L64
            int r7 = r0.getIndex()     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto L5d
            monitor-exit(r3)
            return r6
        L5d:
            int r5 = r5 + 1
            goto L34
        L60:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)
            return r2
        L64:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHttpDateString(@org.jetbrains.annotations.NotNull java.util.Date r1) {
            java.lang.String r0 = "$this$toHttpDateString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r1 = r0.format(r1)
            java.lang.String r0 = "STANDARD_DATE_FORMAT.get().format(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
