package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
final class NetworkUtility {
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;

    /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkUtility$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RetryInfo {
        private final com.android.volley.VolleyError errorToRetry;
        private final java.lang.String logPrefix;

        private RetryInfo(java.lang.String r1, com.android.volley.VolleyError r2) {
                r0 = this;
                r0.<init>()
                r0.logPrefix = r1
                r0.errorToRetry = r2
                return
        }

        public /* synthetic */ RetryInfo(java.lang.String r1, com.android.volley.VolleyError r2, com.android.volley.toolbox.NetworkUtility.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.android.volley.VolleyError access$000(com.android.volley.toolbox.NetworkUtility.RetryInfo r0) {
                com.android.volley.VolleyError r0 = r0.errorToRetry
                return r0
        }

        public static /* synthetic */ java.lang.String access$100(com.android.volley.toolbox.NetworkUtility.RetryInfo r0) {
                java.lang.String r0 = r0.logPrefix
                return r0
        }
    }

    private NetworkUtility() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void attemptRetryOnException(com.android.volley.Request<?> r6, com.android.volley.toolbox.NetworkUtility.RetryInfo r7) throws com.android.volley.VolleyError {
            com.android.volley.RetryPolicy r0 = r6.getRetryPolicy()
            int r1 = r6.getTimeoutMs()
            r2 = 1
            r3 = 0
            r4 = 2
            com.android.volley.VolleyError r5 = com.android.volley.toolbox.NetworkUtility.RetryInfo.access$000(r7)     // Catch: com.android.volley.VolleyError -> L2a
            r0.retry(r5)     // Catch: com.android.volley.VolleyError -> L2a
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r7 = com.android.volley.toolbox.NetworkUtility.RetryInfo.access$100(r7)
            r0[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r0[r2] = r7
            java.lang.String r7 = "%s-retry [timeout=%s]"
            java.lang.String r7 = java.lang.String.format(r7, r0)
            r6.addMarker(r7)
            return
        L2a:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = com.android.volley.toolbox.NetworkUtility.RetryInfo.access$100(r7)
            r4[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r4[r2] = r7
            java.lang.String r7 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            r6.addMarker(r7)
            throw r0
    }

    public static com.android.volley.NetworkResponse getNotModifiedNetworkResponse(com.android.volley.Request<?> r10, long r11, java.util.List<com.android.volley.Header> r13) {
            com.android.volley.Cache$Entry r10 = r10.getCacheEntry()
            if (r10 != 0) goto L13
            com.android.volley.NetworkResponse r10 = new com.android.volley.NetworkResponse
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            r3 = 1
            r0 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            return r10
        L13:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L38
            java.util.Iterator r1 = r13.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            com.android.volley.Header r2 = (com.android.volley.Header) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L24
        L38:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r13)
            java.util.List<com.android.volley.Header> r13 = r10.allResponseHeaders
            if (r13 == 0) goto L67
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto La4
            java.util.List<com.android.volley.Header> r13 = r10.allResponseHeaders
            java.util.Iterator r13 = r13.iterator()
        L4d:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r13.next()
            com.android.volley.Header r1 = (com.android.volley.Header) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L4d
            r9.add(r1)
            goto L4d
        L67:
            java.util.Map<java.lang.String, java.lang.String> r13 = r10.responseHeaders
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto La4
            java.util.Map<java.lang.String, java.lang.String> r13 = r10.responseHeaders
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L79:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L79
            com.android.volley.Header r2 = new com.android.volley.Header
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            r9.add(r2)
            goto L79
        La4:
            com.android.volley.NetworkResponse r13 = new com.android.volley.NetworkResponse
            r4 = 304(0x130, float:4.26E-43)
            byte[] r5 = r10.data
            r6 = 1
            r3 = r13
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r9)
            return r13
    }

    public static byte[] inputStreamToBytes(java.io.InputStream r5, int r6, com.android.volley.toolbox.ByteArrayPool r7) throws java.io.IOException {
            java.lang.String r0 = "Error occurred when closing InputStream"
            com.android.volley.toolbox.PoolingByteArrayOutputStream r1 = new com.android.volley.toolbox.PoolingByteArrayOutputStream
            r1.<init>(r7, r6)
            r6 = 1024(0x400, float:1.435E-42)
            r2 = 0
            byte[] r6 = r7.getBuf(r6)     // Catch: java.lang.Throwable -> L2f
        Le:
            int r3 = r5.read(r6)     // Catch: java.lang.Throwable -> L2d
            r4 = -1
            if (r3 == r4) goto L19
            r1.write(r6, r2, r3)     // Catch: java.lang.Throwable -> L2d
            goto Le
        L19:
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r5.close()     // Catch: java.io.IOException -> L21
            goto L26
        L21:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.VolleyLog.v(r0, r5)
        L26:
            r7.returnBuf(r6)
            r1.close()
            return r3
        L2d:
            r3 = move-exception
            goto L31
        L2f:
            r3 = move-exception
            r6 = 0
        L31:
            if (r5 == 0) goto L3c
            r5.close()     // Catch: java.io.IOException -> L37
            goto L3c
        L37:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.VolleyLog.v(r0, r5)
        L3c:
            r7.returnBuf(r6)
            r1.close()
            throw r3
    }

    public static void logSlowRequests(long r3, com.android.volley.Request<?> r5, byte[] r6, int r7) {
            boolean r0 = com.android.volley.VolleyLog.DEBUG
            if (r0 != 0) goto La
            r0 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3f
        La:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r1 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r1] = r3
            r3 = 2
            if (r6 == 0) goto L20
            int r4 = r6.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L22
        L20:
            java.lang.String r4 = "null"
        L22:
            r0[r3] = r4
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r0[r3] = r4
            r3 = 4
            com.android.volley.RetryPolicy r4 = r5.getRetryPolicy()
            int r4 = r4.getCurrentRetryCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            com.android.volley.VolleyLog.d(r3, r0)
        L3f:
            return
    }

    public static com.android.volley.toolbox.NetworkUtility.RetryInfo shouldRetryException(com.android.volley.Request<?> r9, java.io.IOException r10, long r11, @androidx.annotation.Nullable com.android.volley.toolbox.HttpResponse r13, @androidx.annotation.Nullable byte[] r14) throws com.android.volley.VolleyError {
            boolean r0 = r10 instanceof java.net.SocketTimeoutException
            r1 = 0
            if (r0 == 0) goto L13
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = new com.android.volley.toolbox.NetworkUtility$RetryInfo
            com.android.volley.TimeoutError r10 = new com.android.volley.TimeoutError
            r10.<init>()
            java.lang.String r11 = "socket"
            r9.<init>(r11, r10, r1)
            return r9
        L13:
            boolean r0 = r10 instanceof java.net.MalformedURLException
            if (r0 != 0) goto Lb5
            if (r13 == 0) goto L9c
            int r10 = r13.getStatusCode()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r0[r2] = r3
            r2 = 1
            java.lang.String r3 = r9.getUrl()
            r0[r2] = r3
            java.lang.String r2 = "Unexpected response code %d for %s"
            com.android.volley.VolleyLog.e(r2, r0)
            if (r14 == 0) goto L8f
            java.util.List r8 = r13.getHeaders()
            com.android.volley.NetworkResponse r13 = new com.android.volley.NetworkResponse
            r5 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r2 - r11
            r2 = r13
            r3 = r10
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r8)
            r11 = 401(0x191, float:5.62E-43)
            if (r10 == r11) goto L82
            r11 = 403(0x193, float:5.65E-43)
            if (r10 != r11) goto L51
            goto L82
        L51:
            r11 = 400(0x190, float:5.6E-43)
            if (r10 < r11) goto L60
            r11 = 499(0x1f3, float:6.99E-43)
            if (r10 <= r11) goto L5a
            goto L60
        L5a:
            com.android.volley.ClientError r9 = new com.android.volley.ClientError
            r9.<init>(r13)
            throw r9
        L60:
            r11 = 500(0x1f4, float:7.0E-43)
            if (r10 < r11) goto L7c
            r11 = 599(0x257, float:8.4E-43)
            if (r10 > r11) goto L7c
            boolean r9 = r9.shouldRetryServerErrors()
            if (r9 == 0) goto L7c
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = new com.android.volley.toolbox.NetworkUtility$RetryInfo
            com.android.volley.ServerError r10 = new com.android.volley.ServerError
            r10.<init>(r13)
            java.lang.String r11 = "server"
            r9.<init>(r11, r10, r1)
            return r9
        L7c:
            com.android.volley.ServerError r9 = new com.android.volley.ServerError
            r9.<init>(r13)
            throw r9
        L82:
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = new com.android.volley.toolbox.NetworkUtility$RetryInfo
            com.android.volley.AuthFailureError r10 = new com.android.volley.AuthFailureError
            r10.<init>(r13)
            java.lang.String r11 = "auth"
            r9.<init>(r11, r10, r1)
            return r9
        L8f:
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = new com.android.volley.toolbox.NetworkUtility$RetryInfo
            com.android.volley.NetworkError r10 = new com.android.volley.NetworkError
            r10.<init>()
            java.lang.String r11 = "network"
            r9.<init>(r11, r10, r1)
            return r9
        L9c:
            boolean r9 = r9.shouldRetryConnectionErrors()
            if (r9 == 0) goto Laf
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = new com.android.volley.toolbox.NetworkUtility$RetryInfo
            com.android.volley.NoConnectionError r10 = new com.android.volley.NoConnectionError
            r10.<init>()
            java.lang.String r11 = "connection"
            r9.<init>(r11, r10, r1)
            return r9
        Laf:
            com.android.volley.NoConnectionError r9 = new com.android.volley.NoConnectionError
            r9.<init>(r10)
            throw r9
        Lb5:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Bad URL "
            java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r9 = r9.getUrl()
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r10)
            throw r11
    }
}
