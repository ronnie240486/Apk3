package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AssetPathFetcher<T> implements com.bumptech.glide.load.data.DataFetcher<T> {
    private static final java.lang.String TAG = "AssetPathFetcher";
    private final android.content.res.AssetManager assetManager;
    private final java.lang.String assetPath;
    private T data;

    public AssetPathFetcher(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.assetManager = r1
            r0.assetPath = r2
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
            if (r0 != 0) goto L5
            return
        L5:
            r1.close(r0)     // Catch: java.io.IOException -> L8
        L8:
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
    public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super T> r4) {
            r2 = this;
            android.content.res.AssetManager r3 = r2.assetManager     // Catch: java.io.IOException -> Le
            java.lang.String r0 = r2.assetPath     // Catch: java.io.IOException -> Le
            java.lang.Object r3 = r2.loadResource(r3, r0)     // Catch: java.io.IOException -> Le
            r2.data = r3     // Catch: java.io.IOException -> Le
            r4.onDataReady(r3)     // Catch: java.io.IOException -> Le
            goto L20
        Le:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "AssetPathFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Failed to load data from asset manager"
            android.util.Log.d(r1, r0, r3)
        L1d:
            r4.onLoadFailed(r3)
        L20:
            return
    }

    public abstract T loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException;
}
