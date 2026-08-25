package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class HurlStack extends com.android.volley.toolbox.BaseHttpStack {
    private static final int HTTP_CONTINUE = 100;
    private final javax.net.ssl.SSLSocketFactory mSslSocketFactory;
    private final com.android.volley.toolbox.HurlStack.UrlRewriter mUrlRewriter;

    /* JADX INFO: loaded from: classes2.dex */
    public static class UrlConnectionInputStream extends java.io.FilterInputStream {
        private final java.net.HttpURLConnection mConnection;

        public UrlConnectionInputStream(java.net.HttpURLConnection r2) {
                r1 = this;
                java.io.InputStream r0 = com.android.volley.toolbox.HurlStack.access$000(r2)
                r1.<init>(r0)
                r1.mConnection = r2
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                super.close()
                java.net.HttpURLConnection r0 = r1.mConnection
                r0.disconnect()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    public HurlStack() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public HurlStack(com.android.volley.toolbox.HurlStack.UrlRewriter r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public HurlStack(com.android.volley.toolbox.HurlStack.UrlRewriter r1, javax.net.ssl.SSLSocketFactory r2) {
            r0 = this;
            r0.<init>()
            r0.mUrlRewriter = r1
            r0.mSslSocketFactory = r2
            return
    }

    public static /* synthetic */ java.io.InputStream access$000(java.net.HttpURLConnection r0) {
            java.io.InputStream r0 = inputStreamFromConnection(r0)
            return r0
    }

    private void addBody(java.net.HttpURLConnection r3, com.android.volley.Request<?> r4, byte[] r5) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r3.setDoOutput(r0)
            java.util.Map r0 = r3.getRequestProperties()
            java.lang.String r1 = "Content-Type"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L17
            java.lang.String r4 = r4.getBodyContentType()
            r3.setRequestProperty(r1, r4)
        L17:
            java.io.DataOutputStream r4 = new java.io.DataOutputStream
            int r0 = r5.length
            java.io.OutputStream r3 = r3.getOutputStream()
            r4.<init>(r3)
            r4.write(r5)
            r4.close()
            return
    }

    private void addBodyIfExists(java.net.HttpURLConnection r2, com.android.volley.Request<?> r3) throws java.io.IOException, com.android.volley.AuthFailureError {
            r1 = this;
            byte[] r0 = r3.getBody()
            if (r0 == 0) goto L9
            r1.addBody(r2, r3, r0)
        L9:
            return
    }

    @androidx.annotation.VisibleForTesting
    public static java.util.List<com.android.volley.Header> convertHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L11:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.android.volley.Header r4 = new com.android.volley.Header
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L2d
        L48:
            return r0
    }

    private static boolean hasResponseBody(int r1, int r2) {
            r0 = 4
            if (r1 == r0) goto L15
            r1 = 100
            if (r1 > r2) goto Lb
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 < r1) goto L15
        Lb:
            r1 = 204(0xcc, float:2.86E-43)
            if (r2 == r1) goto L15
            r1 = 304(0x130, float:4.26E-43)
            if (r2 == r1) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private static java.io.InputStream inputStreamFromConnection(java.net.HttpURLConnection r0) {
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.InputStream r0 = r0.getErrorStream()
        L9:
            return r0
    }

    private java.net.HttpURLConnection openConnection(java.net.URL r3, com.android.volley.Request<?> r4) throws java.io.IOException {
            r2 = this;
            java.net.URLConnection r0 = r3.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r1 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r1)
            int r4 = r4.getTimeoutMs()
            r0.setConnectTimeout(r4)
            r0.setReadTimeout(r4)
            r4 = 0
            r0.setUseCaches(r4)
            r4 = 1
            r0.setDoInput(r4)
            java.lang.String r3 = r3.getProtocol()
            java.lang.String r4 = "https"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L35
            javax.net.ssl.SSLSocketFactory r3 = r2.mSslSocketFactory
            if (r3 == 0) goto L35
            r4 = r0
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            r4.setSSLSocketFactory(r3)
        L35:
            return r0
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException, com.android.volley.AuthFailureError {
            r5 = this;
            java.lang.String r0 = r6.getUrl()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r7)
            java.util.Map r7 = r6.getHeaders()
            r1.putAll(r7)
            com.android.volley.toolbox.HurlStack$UrlRewriter r7 = r5.mUrlRewriter
            if (r7 == 0) goto L2b
            java.lang.String r7 = r7.rewriteUrl(r0)
            if (r7 == 0) goto L1f
            r0 = r7
            goto L2b
        L1f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "URL blocked by rewriter: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r0)
            r6.<init>(r7)
            throw r6
        L2b:
            java.net.URL r7 = new java.net.URL
            r7.<init>(r0)
            java.net.HttpURLConnection r7 = r5.openConnection(r7, r6)
            r0 = 0
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L98
            r7.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L98
            goto L3d
        L53:
            r5.setConnectionParametersForRequest(r7, r6)     // Catch: java.lang.Throwable -> L98
            int r1 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L98
            r2 = -1
            if (r1 == r2) goto L90
            int r6 = r6.getMethod()     // Catch: java.lang.Throwable -> L98
            boolean r6 = hasResponseBody(r6, r1)     // Catch: java.lang.Throwable -> L98
            if (r6 != 0) goto L78
            com.android.volley.toolbox.HttpResponse r6 = new com.android.volley.toolbox.HttpResponse     // Catch: java.lang.Throwable -> L98
            java.util.Map r2 = r7.getHeaderFields()     // Catch: java.lang.Throwable -> L98
            java.util.List r2 = convertHeaders(r2)     // Catch: java.lang.Throwable -> L98
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L98
            r7.disconnect()
            return r6
        L78:
            r0 = 1
            com.android.volley.toolbox.HttpResponse r6 = new com.android.volley.toolbox.HttpResponse     // Catch: java.lang.Throwable -> L98
            java.util.Map r2 = r7.getHeaderFields()     // Catch: java.lang.Throwable -> L98
            java.util.List r2 = convertHeaders(r2)     // Catch: java.lang.Throwable -> L98
            int r3 = r7.getContentLength()     // Catch: java.lang.Throwable -> L98
            com.android.volley.toolbox.HurlStack$UrlConnectionInputStream r4 = new com.android.volley.toolbox.HurlStack$UrlConnectionInputStream     // Catch: java.lang.Throwable -> L98
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L98
            r6.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L98
            return r6
        L90:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "Could not retrieve response code from HttpUrlConnection."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L98
            throw r6     // Catch: java.lang.Throwable -> L98
        L98:
            r6 = move-exception
            if (r0 != 0) goto L9e
            r7.disconnect()
        L9e:
            throw r6
    }

    public final void setConnectionParametersForRequest(java.net.HttpURLConnection r3, com.android.volley.Request<?> r4) throws java.io.IOException, com.android.volley.AuthFailureError {
            r2 = this;
            int r0 = r4.getMethod()
            java.lang.String r1 = "POST"
            switch(r0) {
                case -1: goto L48;
                case 0: goto L42;
                case 1: goto L3b;
                case 2: goto L32;
                case 3: goto L2c;
                case 4: goto L26;
                case 5: goto L20;
                case 6: goto L1a;
                case 7: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown method type."
            r3.<init>(r4)
            throw r3
        L11:
            java.lang.String r0 = "PATCH"
            r3.setRequestMethod(r0)
            r2.addBodyIfExists(r3, r4)
            goto L54
        L1a:
            java.lang.String r4 = "TRACE"
            r3.setRequestMethod(r4)
            goto L54
        L20:
            java.lang.String r4 = "OPTIONS"
            r3.setRequestMethod(r4)
            goto L54
        L26:
            java.lang.String r4 = "HEAD"
            r3.setRequestMethod(r4)
            goto L54
        L2c:
            java.lang.String r4 = "DELETE"
            r3.setRequestMethod(r4)
            goto L54
        L32:
            java.lang.String r0 = "PUT"
            r3.setRequestMethod(r0)
            r2.addBodyIfExists(r3, r4)
            goto L54
        L3b:
            r3.setRequestMethod(r1)
            r2.addBodyIfExists(r3, r4)
            goto L54
        L42:
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            goto L54
        L48:
            byte[] r0 = r4.getPostBody()
            if (r0 == 0) goto L54
            r3.setRequestMethod(r1)
            r2.addBody(r3, r4, r0)
        L54:
            return
    }
}
