package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class TraceUtil {
    private TraceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginSection(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto L9
            beginSectionV18(r2)
        L9:
            return
    }

    @androidx.annotation.RequiresApi(18)
    private static void beginSectionV18(java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endSection() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto L9
            endSectionV18()
        L9:
            return
    }

    @androidx.annotation.RequiresApi(18)
    private static void endSectionV18() {
            android.os.Trace.endSection()
            return
    }
}
