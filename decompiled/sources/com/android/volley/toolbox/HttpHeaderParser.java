package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class HttpHeaderParser {
    private static final java.lang.String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    private static final java.lang.String RFC1123_OUTPUT_FORMAT = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final java.lang.String RFC1123_PARSE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public HttpHeaderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> getCacheHeaders(com.android.volley.Cache.Entry r5) {
            if (r5 != 0) goto L7
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r5.etag
            if (r1 == 0) goto L15
            java.lang.String r2 = "If-None-Match"
            r0.put(r2, r1)
        L15:
            long r1 = r5.lastModified
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L31
            java.lang.String r5 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.text.SimpleDateFormat r5 = newUsGmtFormatter(r5)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r1)
            java.lang.String r5 = r5.format(r3)
            java.lang.String r1 = "If-Modified-Since"
            r0.put(r1, r5)
        L31:
            return r0
    }

    private static java.text.SimpleDateFormat newUsGmtFormatter(java.lang.String r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r2, r1)
            java.lang.String r2 = "GMT"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            r0.setTimeZone(r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.android.volley.Cache.Entry parseCacheHeaders(com.android.volley.NetworkResponse r17) {
            r0 = r17
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.headers
            r4 = 0
            if (r3 != 0) goto Lc
            return r4
        Lc:
            java.lang.String r5 = "Date"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L1b
            long r8 = parseDateAsEpoch(r5)
            goto L1d
        L1b:
            r8 = 0
        L1d:
            java.lang.String r5 = "Cache-Control"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r11 = 0
            if (r5 == 0) goto L8d
            java.lang.String r12 = ","
            java.lang.String[] r5 = r5.split(r12, r11)
            r12 = 0
            r13 = 0
            r15 = 0
        L33:
            int r10 = r5.length
            if (r11 >= r10) goto L8a
            r10 = r5[r11]
            java.lang.String r10 = r10.trim()
            java.lang.String r6 = "no-cache"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L89
            java.lang.String r6 = "no-store"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L4d
            goto L89
        L4d:
            java.lang.String r6 = "max-age="
            boolean r6 = r10.startsWith(r6)
            if (r6 == 0) goto L60
            r6 = 8
            java.lang.String r6 = r10.substring(r6)     // Catch: java.lang.Exception -> L86
            long r13 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L86
            goto L86
        L60:
            java.lang.String r6 = "stale-while-revalidate="
            boolean r6 = r10.startsWith(r6)
            if (r6 == 0) goto L74
            r6 = 23
            java.lang.String r6 = r10.substring(r6)     // Catch: java.lang.Exception -> L86
            long r15 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L86
            goto L86
        L74:
            java.lang.String r6 = "must-revalidate"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L85
            java.lang.String r6 = "proxy-revalidate"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L86
        L85:
            r12 = 1
        L86:
            int r11 = r11 + 1
            goto L33
        L89:
            return r4
        L8a:
            r11 = r12
            r10 = 1
            goto L92
        L8d:
            r10 = 0
            r13 = 0
            r15 = 0
        L92:
            java.lang.String r4 = "Expires"
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto La1
            long r4 = parseDateAsEpoch(r4)
            goto La3
        La1:
            r4 = 0
        La3:
            java.lang.String r6 = "Last-Modified"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lb2
            long r6 = parseDateAsEpoch(r6)
            goto Lb4
        Lb2:
            r6 = 0
        Lb4:
            java.lang.String r12 = "ETag"
            java.lang.Object r12 = r3.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r10 == 0) goto Lcf
            r4 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r4
            long r1 = r1 + r13
            if (r11 == 0) goto Lc7
            r15 = r1
            goto Lcd
        Lc7:
            java.lang.Long.signum(r15)
            long r15 = r15 * r4
            long r15 = r15 + r1
        Lcd:
            r10 = r15
            goto Lde
        Lcf:
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto Ldd
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 < 0) goto Ldd
            long r4 = r4 - r8
            long r1 = r1 + r4
            r10 = r1
            goto Lde
        Ldd:
            r1 = r10
        Lde:
            com.android.volley.Cache$Entry r4 = new com.android.volley.Cache$Entry
            r4.<init>()
            byte[] r5 = r0.data
            r4.data = r5
            r4.etag = r12
            r4.softTtl = r1
            r4.ttl = r10
            r4.serverDate = r8
            r4.lastModified = r6
            r4.responseHeaders = r3
            java.util.List<com.android.volley.Header> r0 = r0.allHeaders
            r4.allResponseHeaders = r0
            return r4
    }

    public static java.lang.String parseCharset(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r1) {
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r1 = parseCharset(r1, r0)
            return r1
    }

    public static java.lang.String parseCharset(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7) {
            if (r6 != 0) goto L3
            return r7
        L3:
            java.lang.String r0 = "Content-Type"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L39
            java.lang.String r0 = ";"
            r1 = 0
            java.lang.String[] r6 = r6.split(r0, r1)
            r0 = 1
            r2 = 1
        L16:
            int r3 = r6.length
            if (r2 >= r3) goto L39
            r3 = r6[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4, r1)
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto L36
            r4 = r3[r1]
            java.lang.String r5 = "charset"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L36
            r6 = r3[r0]
            return r6
        L36:
            int r2 = r2 + 1
            goto L16
        L39:
            return r7
    }

    public static long parseDateAsEpoch(java.lang.String r5) {
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.text.SimpleDateFormat r0 = newUsGmtFormatter(r0)     // Catch: java.text.ParseException -> Lf
            java.util.Date r0 = r0.parse(r5)     // Catch: java.text.ParseException -> Lf
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.String r1 = "Unable to parse dateStr: %s, falling back to 0"
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r5)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2d
            java.lang.String r2 = "-1"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L25
            goto L2d
        L25:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r5
            com.android.volley.VolleyLog.e(r0, r1, r2)
            goto L34
        L2d:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            com.android.volley.VolleyLog.v(r1, r0)
        L34:
            r0 = 0
            return r0
    }
}
