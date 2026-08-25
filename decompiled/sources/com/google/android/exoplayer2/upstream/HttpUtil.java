package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUtil {
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_SIZE = null;
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_START_AND_END = null;
    private static final java.lang.String TAG = "HttpUtil";

    static {
            java.lang.String r0 = "bytes (\\d+)-(\\d+)/(?:\\d+|\\*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.upstream.HttpUtil.CONTENT_RANGE_WITH_START_AND_END = r0
            java.lang.String r0 = "bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.upstream.HttpUtil.CONTENT_RANGE_WITH_SIZE = r0
            return
    }

    private HttpUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String buildRangeRequestHeader(long r5, long r7) {
            r0 = -1
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            r5 = 0
            return r5
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "bytes="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "-"
            r2.append(r3)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 == 0) goto L2b
            long r5 = r5 + r7
            r7 = 1
            long r5 = r5 - r7
            r2.append(r5)
        L2b:
            java.lang.String r5 = r2.toString()
            return r5
    }

    public static long getContentLength(@androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "]"
            java.lang.String r2 = "HttpUtil"
            if (r0 != 0) goto L26
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Lf
            goto L28
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.e(r2, r0)
        L26:
            r3 = -1
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto La4
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.upstream.HttpUtil.CONTENT_RANGE_WITH_START_AND_END
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto La4
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NumberFormatException -> L8d
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L8d
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L8d
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8d
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L64
            r3 = r5
            goto La4
        L64:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto La4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8d
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r10)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8d
            com.google.android.exoplayer2.util.Log.w(r2, r9)     // Catch: java.lang.NumberFormatException -> L8d
            long r9 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L8d
            r3 = r9
            goto La4
        L8d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.util.Log.e(r2, r9)
        La4:
            return r3
    }

    public static long getDocumentSize(@androidx.annotation.Nullable java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.upstream.HttpUtil.CONTENT_RANGE_WITH_SIZE
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L24
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r1 = java.lang.Long.parseLong(r3)
        L24:
            return r1
    }
}
