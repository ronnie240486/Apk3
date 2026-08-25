package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LocalUriFetcher<T> implements com.bumptech.glide.load.data.DataFetcher<T> {
    private static final java.lang.String TAG = "LocalUriFetcher";
    private final android.content.ContentResolver contentResolver;
    private T data;
    private final android.net.Uri uri;

    public LocalUriFetcher(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.contentResolver = r1
            r0.uri = r2
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
            r1 = this;
            T r0 = r1.data
            if (r0 == 0) goto L7
            r1.close(r0)     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    public abstract void close(T r1) throws java.io.IOException;

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super T> r4) {
            r2 = this;
            android.net.Uri r3 = r2.uri     // Catch: java.io.FileNotFoundException -> Le
            android.content.ContentResolver r0 = r2.contentResolver     // Catch: java.io.FileNotFoundException -> Le
            java.lang.Object r3 = r2.loadResource(r3, r0)     // Catch: java.io.FileNotFoundException -> Le
            r2.data = r3     // Catch: java.io.FileNotFoundException -> Le
            r4.onDataReady(r3)     // Catch: java.io.FileNotFoundException -> Le
            goto L20
        Le:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "LocalUriFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Failed to open Uri"
            android.util.Log.d(r1, r0, r3)
        L1d:
            r4.onLoadFailed(r3)
        L20:
            return
    }

    public abstract T loadResource(android.net.Uri r1, android.content.ContentResolver r2) throws java.io.FileNotFoundException;
}
