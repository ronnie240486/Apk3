package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public class PreJava9DateFormatProvider {
    public PreJava9DateFormatProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getDateFormatPattern(int r2) {
            if (r2 == 0) goto L20
            r0 = 1
            if (r2 == r0) goto L1d
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto Le
            java.lang.String r2 = "M/d/yy"
            return r2
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown DateFormat style: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
        L1a:
            java.lang.String r2 = "MMM d, y"
            return r2
        L1d:
            java.lang.String r2 = "MMMM d, y"
            return r2
        L20:
            java.lang.String r2 = "EEEE, MMMM d, y"
            return r2
    }

    private static java.lang.String getDatePartOfDateTimePattern(int r2) {
            if (r2 == 0) goto L20
            r0 = 1
            if (r2 == r0) goto L1d
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto Le
            java.lang.String r2 = "M/d/yy"
            return r2
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown DateFormat style: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
        L1a:
            java.lang.String r2 = "MMM d, yyyy"
            return r2
        L1d:
            java.lang.String r2 = "MMMM d, yyyy"
            return r2
        L20:
            java.lang.String r2 = "EEEE, MMMM d, yyyy"
            return r2
    }

    private static java.lang.String getTimePartOfDateTimePattern(int r2) {
            if (r2 == 0) goto L1d
            r0 = 1
            if (r2 == r0) goto L1d
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto Le
            java.lang.String r2 = "h:mm a"
            return r2
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown DateFormat style: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
        L1a:
            java.lang.String r2 = "h:mm:ss a"
            return r2
        L1d:
            java.lang.String r2 = "h:mm:ss a z"
            return r2
    }

    public static java.text.DateFormat getUSDateFormat(int r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = getDateFormatPattern(r2)
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r2, r1)
            return r0
    }

    public static java.text.DateFormat getUSDateTimeFormat(int r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = getDatePartOfDateTimePattern(r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = getTimePartOfDateTimePattern(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r0 = java.util.Locale.US
            r2.<init>(r1, r0)
            return r2
    }
}
