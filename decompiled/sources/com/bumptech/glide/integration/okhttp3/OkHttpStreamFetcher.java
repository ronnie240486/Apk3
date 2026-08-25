package com.bumptech.glide.integration.okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpStreamFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream>, okhttp3.Callback {
    private static final java.lang.String TAG = "OkHttpFetcher";
    private volatile okhttp3.Call call;
    private com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> callback;
    private final okhttp3.Call.Factory client;
    private okhttp3.ResponseBody responseBody;
    private java.io.InputStream stream;
    private final com.bumptech.glide.load.model.GlideUrl url;

    public OkHttpStreamFetcher(okhttp3.Call.Factory r1, com.bumptech.glide.load.model.GlideUrl r2) {
            r0 = this;
            r0.<init>()
            r0.client = r1
            r0.url = r2
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
            r1 = this;
            java.io.InputStream r0 = r1.stream     // Catch: java.io.IOException -> L8
            if (r0 == 0) goto L9
            r0.close()     // Catch: java.io.IOException -> L8
            goto L9
        L8:
        L9:
            okhttp3.ResponseBody r0 = r1.responseBody
            if (r0 == 0) goto L10
            r0.close()
        L10:
            r0 = 0
            r1.callback = r0
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
    public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r4, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> r5) {
            r3 = this;
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            com.bumptech.glide.load.model.GlideUrl r0 = r3.url
            java.lang.String r0 = r0.toStringUrl()
            okhttp3.Request$Builder r4 = r4.url(r0)
            com.bumptech.glide.load.model.GlideUrl r0 = r3.url
            java.util.Map r0 = r0.getHeaders()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.addHeader(r2, r1)
            goto L1d
        L39:
            okhttp3.Request r4 = r4.build()
            r3.callback = r5
            okhttp3.Call$Factory r5 = r3.client
            okhttp3.Call r4 = r5.newCall(r4)
            r3.call = r4
            okhttp3.Call r4 = r3.call
            r4.enqueue(r3)
            return
    }

    @Override // okhttp3.Callback
    public void onFailure(@androidx.annotation.NonNull okhttp3.Call r2, @androidx.annotation.NonNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r2 = "OkHttpFetcher"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "OkHttp failed to obtain result"
            android.util.Log.d(r2, r0, r3)
        Le:
            com.bumptech.glide.load.data.DataFetcher$DataCallback<? super java.io.InputStream> r2 = r1.callback
            r2.onLoadFailed(r3)
            return
    }

    @Override // okhttp3.Callback
    public void onResponse(@androidx.annotation.NonNull okhttp3.Call r3, @androidx.annotation.NonNull okhttp3.Response r4) {
            r2 = this;
            okhttp3.ResponseBody r3 = r4.body()
            r2.responseBody = r3
            boolean r3 = r4.isSuccessful()
            if (r3 == 0) goto L2a
            okhttp3.ResponseBody r3 = r2.responseBody
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            okhttp3.ResponseBody r3 = (okhttp3.ResponseBody) r3
            long r3 = r3.contentLength()
            okhttp3.ResponseBody r0 = r2.responseBody
            java.io.InputStream r0 = r0.byteStream()
            java.io.InputStream r3 = com.bumptech.glide.util.ContentLengthInputStream.obtain(r0, r3)
            r2.stream = r3
            com.bumptech.glide.load.data.DataFetcher$DataCallback<? super java.io.InputStream> r4 = r2.callback
            r4.onDataReady(r3)
            goto L3c
        L2a:
            com.bumptech.glide.load.data.DataFetcher$DataCallback<? super java.io.InputStream> r3 = r2.callback
            com.bumptech.glide.load.HttpException r0 = new com.bumptech.glide.load.HttpException
            java.lang.String r1 = r4.message()
            int r4 = r4.code()
            r0.<init>(r1, r4)
            r3.onLoadFailed(r0)
        L3c:
            return
    }
}
