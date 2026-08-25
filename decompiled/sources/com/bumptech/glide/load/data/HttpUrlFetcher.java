package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class HttpUrlFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> {

    @androidx.annotation.VisibleForTesting
    public static final com.bumptech.glide.load.data.HttpUrlFetcher.DefaultHttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = null;
    private static final int MAXIMUM_REDIRECTS = 5;
    private static final java.lang.String TAG = "HttpUrlFetcher";
    private final com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory connectionFactory;
    private final com.bumptech.glide.load.model.GlideUrl glideUrl;
    private volatile boolean isCancelled;
    private java.io.InputStream stream;
    private final int timeout;
    private java.net.HttpURLConnection urlConnection;

    /* JADX INFO: loaded from: classes3.dex */
    public static class DefaultHttpUrlConnectionFactory implements com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory {
        public DefaultHttpUrlConnectionFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory
        public java.net.HttpURLConnection build(java.net.URL r1) throws java.io.IOException {
                r0 = this;
                java.net.URLConnection r1 = r1.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                return r1
        }
    }

    public interface HttpUrlConnectionFactory {
        java.net.HttpURLConnection build(java.net.URL r1) throws java.io.IOException;
    }

    static {
            com.bumptech.glide.load.data.HttpUrlFetcher$DefaultHttpUrlConnectionFactory r0 = new com.bumptech.glide.load.data.HttpUrlFetcher$DefaultHttpUrlConnectionFactory
            r0.<init>()
            com.bumptech.glide.load.data.HttpUrlFetcher.DEFAULT_CONNECTION_FACTORY = r0
            return
    }

    public HttpUrlFetcher(com.bumptech.glide.load.model.GlideUrl r2, int r3) {
            r1 = this;
            com.bumptech.glide.load.data.HttpUrlFetcher$DefaultHttpUrlConnectionFactory r0 = com.bumptech.glide.load.data.HttpUrlFetcher.DEFAULT_CONNECTION_FACTORY
            r1.<init>()
            r1.glideUrl = r2
            r1.timeout = r3
            r1.connectionFactory = r0
            return
    }

    private java.net.HttpURLConnection buildAndConfigureConnection(java.net.URL r4, java.util.Map<java.lang.String, java.lang.String> r5) throws com.bumptech.glide.load.HttpException {
            r3 = this;
            r0 = 0
            com.bumptech.glide.load.data.HttpUrlFetcher$HttpUrlConnectionFactory r1 = r3.connectionFactory     // Catch: java.io.IOException -> L40
            java.net.HttpURLConnection r4 = r1.build(r4)     // Catch: java.io.IOException -> L40
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.addRequestProperty(r2, r1)
            goto Lf
        L2b:
            int r5 = r3.timeout
            r4.setConnectTimeout(r5)
            int r5 = r3.timeout
            r4.setReadTimeout(r5)
            r4.setUseCaches(r0)
            r5 = 1
            r4.setDoInput(r5)
            r4.setInstanceFollowRedirects(r0)
            return r4
        L40:
            r4 = move-exception
            com.bumptech.glide.load.HttpException r5 = new com.bumptech.glide.load.HttpException
            java.lang.String r1 = "URL.openConnection threw"
            r5.<init>(r1, r0, r4)
            throw r5
    }

    private static int getHttpStatusCodeOrInvalid(java.net.HttpURLConnection r2) {
            int r2 = r2.getResponseCode()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            r0 = 3
            java.lang.String r1 = "HttpUrlFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "Failed to get a response code"
            android.util.Log.d(r1, r0, r2)
        L14:
            r2 = -1
            return r2
    }

    private java.io.InputStream getStreamForSuccessfulRequest(java.net.HttpURLConnection r5) throws com.bumptech.glide.load.HttpException {
            r4 = this;
            java.lang.String r0 = "HttpUrlFetcher"
            java.lang.String r1 = r5.getContentEncoding()     // Catch: java.io.IOException -> L44
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.io.IOException -> L44
            if (r1 == 0) goto L1c
            int r0 = r5.getContentLength()     // Catch: java.io.IOException -> L44
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.io.IOException -> L44
            long r2 = (long) r0     // Catch: java.io.IOException -> L44
            java.io.InputStream r0 = com.bumptech.glide.util.ContentLengthInputStream.obtain(r1, r2)     // Catch: java.io.IOException -> L44
            r4.stream = r0     // Catch: java.io.IOException -> L44
            goto L41
        L1c:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.io.IOException -> L44
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L44
            r1.<init>()     // Catch: java.io.IOException -> L44
            java.lang.String r2 = "Got non empty content encoding: "
            r1.append(r2)     // Catch: java.io.IOException -> L44
            java.lang.String r2 = r5.getContentEncoding()     // Catch: java.io.IOException -> L44
            r1.append(r2)     // Catch: java.io.IOException -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L44
            android.util.Log.d(r0, r1)     // Catch: java.io.IOException -> L44
        L3b:
            java.io.InputStream r0 = r5.getInputStream()     // Catch: java.io.IOException -> L44
            r4.stream = r0     // Catch: java.io.IOException -> L44
        L41:
            java.io.InputStream r5 = r4.stream
            return r5
        L44:
            r0 = move-exception
            com.bumptech.glide.load.HttpException r1 = new com.bumptech.glide.load.HttpException
            int r5 = getHttpStatusCodeOrInvalid(r5)
            java.lang.String r2 = "Failed to obtain InputStream"
            r1.<init>(r2, r5, r0)
            throw r1
    }

    private static boolean isHttpOk(int r1) {
            int r1 = r1 / 100
            r0 = 2
            if (r1 != r0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private static boolean isHttpRedirect(int r1) {
            int r1 = r1 / 100
            r0 = 3
            if (r1 != r0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private java.io.InputStream loadDataWithRedirects(java.net.URL r3, int r4, java.net.URL r5, java.util.Map<java.lang.String, java.lang.String> r6) throws com.bumptech.glide.load.HttpException {
            r2 = this;
            r0 = -1
            r1 = 5
            if (r4 >= r1) goto Lab
            if (r5 == 0) goto L1d
            java.net.URI r1 = r3.toURI()     // Catch: java.net.URISyntaxException -> L1d
            java.net.URI r5 = r5.toURI()     // Catch: java.net.URISyntaxException -> L1d
            boolean r5 = r1.equals(r5)     // Catch: java.net.URISyntaxException -> L1d
            if (r5 != 0) goto L15
            goto L1d
        L15:
            com.bumptech.glide.load.HttpException r5 = new com.bumptech.glide.load.HttpException     // Catch: java.net.URISyntaxException -> L1d
            java.lang.String r1 = "In re-direct loop"
            r5.<init>(r1, r0)     // Catch: java.net.URISyntaxException -> L1d
            throw r5     // Catch: java.net.URISyntaxException -> L1d
        L1d:
            java.net.HttpURLConnection r5 = r2.buildAndConfigureConnection(r3, r6)
            r2.urlConnection = r5
            r5.connect()     // Catch: java.io.IOException -> L9c
            java.net.HttpURLConnection r5 = r2.urlConnection     // Catch: java.io.IOException -> L9c
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.io.IOException -> L9c
            r2.stream = r5     // Catch: java.io.IOException -> L9c
            boolean r5 = r2.isCancelled
            if (r5 == 0) goto L34
            r3 = 0
            return r3
        L34:
            java.net.HttpURLConnection r5 = r2.urlConnection
            int r5 = getHttpStatusCodeOrInvalid(r5)
            boolean r1 = isHttpOk(r5)
            if (r1 == 0) goto L47
            java.net.HttpURLConnection r3 = r2.urlConnection
            java.io.InputStream r3 = r2.getStreamForSuccessfulRequest(r3)
            return r3
        L47:
            boolean r1 = isHttpRedirect(r5)
            if (r1 == 0) goto L7f
            java.net.HttpURLConnection r0 = r2.urlConnection
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L77
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6a
            r1.<init>(r3, r0)     // Catch: java.net.MalformedURLException -> L6a
            r2.cleanup()
            int r4 = r4 + 1
            java.io.InputStream r3 = r2.loadDataWithRedirects(r1, r4, r3, r6)
            return r3
        L6a:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.lang.String r6 = "Bad redirect url: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0)
            r4.<init>(r6, r5, r3)
            throw r4
        L77:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            java.lang.String r4 = "Received empty or null redirect url"
            r3.<init>(r4, r5)
            throw r3
        L7f:
            if (r5 != r0) goto L87
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            r3.<init>(r5)
            throw r3
        L87:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException     // Catch: java.io.IOException -> L93
            java.net.HttpURLConnection r4 = r2.urlConnection     // Catch: java.io.IOException -> L93
            java.lang.String r4 = r4.getResponseMessage()     // Catch: java.io.IOException -> L93
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L93
            throw r3     // Catch: java.io.IOException -> L93
        L93:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.lang.String r6 = "Failed to get a response message"
            r4.<init>(r6, r5, r3)
            throw r4
        L9c:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.net.HttpURLConnection r5 = r2.urlConnection
            int r5 = getHttpStatusCodeOrInvalid(r5)
            java.lang.String r6 = "Failed to connect or obtain data"
            r4.<init>(r6, r5, r3)
            throw r4
        Lab:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            java.lang.String r4 = "Too many (> 5) redirects!"
            r3.<init>(r4, r0)
            throw r3
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.isCancelled = r0
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
            r1 = this;
            java.io.InputStream r0 = r1.stream
            if (r0 == 0) goto L9
            r0.close()     // Catch: java.io.IOException -> L8
            goto L9
        L8:
        L9:
            java.net.HttpURLConnection r0 = r1.urlConnection
            if (r0 == 0) goto L10
            r0.disconnect()
        L10:
            r0 = 0
            r1.urlConnection = r0
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public java.lang.Class<java.io.InputStream> getDataClass() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.REMOTE
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r9, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> r10) {
            r8 = this;
            java.lang.String r9 = "Finished http url fetcher fetch in "
            java.lang.String r0 = "HttpUrlFetcher"
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()
            r3 = 2
            com.bumptech.glide.load.model.GlideUrl r4 = r8.glideUrl     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.net.URL r4 = r4.toURL()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r5 = 0
            r6 = 0
            com.bumptech.glide.load.model.GlideUrl r7 = r8.glideUrl     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.util.Map r7 = r7.getHeaders()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.io.InputStream r4 = r8.loadDataWithRedirects(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r10.onDataReady(r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            boolean r10 = android.util.Log.isLoggable(r0, r3)
            if (r10 == 0) goto L58
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L47
        L2a:
            r10 = move-exception
            goto L59
        L2c:
            r4 = move-exception
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L39
            java.lang.String r5 = "Failed to load data for url"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L2a
        L39:
            r10.onLoadFailed(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r10 = android.util.Log.isLoggable(r0, r3)
            if (r10 == 0) goto L58
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L47:
            r10.append(r9)
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r1)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            android.util.Log.v(r0, r9)
        L58:
            return
        L59:
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L71
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r1)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r0, r9)
        L71:
            throw r10
    }
}
