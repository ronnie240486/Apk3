package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
class SourceGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback {
    private static final java.lang.String TAG = "SourceGenerator";
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private java.lang.Object dataToCache;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private int loadDataListIndex;
    private com.bumptech.glide.load.engine.DataCacheKey originalKey;
    private com.bumptech.glide.load.engine.DataCacheGenerator sourceCacheGenerator;


    public SourceGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r1, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r2) {
            r0 = this;
            r0.<init>()
            r0.helper = r1
            r0.cb = r2
            return
    }

    private void cacheData(java.lang.Object r9) {
            r8 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r8.helper     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.Encoder r3 = r3.getSourceEncoder(r9)     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DataCacheWriter r4 = new com.bumptech.glide.load.engine.DataCacheWriter     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r8.helper     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.Options r5 = r5.getOptions()     // Catch: java.lang.Throwable -> L85
            r4.<init>(r3, r9, r5)     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DataCacheKey r5 = new com.bumptech.glide.load.engine.DataCacheKey     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r6 = r8.loadData     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.Key r6 = r6.sourceKey     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DecodeHelper<?> r7 = r8.helper     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.Key r7 = r7.getSignature()     // Catch: java.lang.Throwable -> L85
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L85
            r8.originalKey = r5     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r8.helper     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.cache.DiskCache r5 = r5.getDiskCache()     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DataCacheKey r6 = r8.originalKey     // Catch: java.lang.Throwable -> L85
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L85
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "Finished encoding source to cache, key: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.load.engine.DataCacheKey r5 = r8.originalKey     // Catch: java.lang.Throwable -> L85
            r4.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = ", data: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L85
            r4.append(r9)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = ", encoder: "
            r4.append(r9)     // Catch: java.lang.Throwable -> L85
            r4.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = ", duration: "
            r4.append(r9)     // Catch: java.lang.Throwable -> L85
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r1)     // Catch: java.lang.Throwable -> L85
            r4.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L85
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> L85
        L6c:
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r9 = r8.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r9 = r9.fetcher
            r9.cleanup()
            com.bumptech.glide.load.engine.DataCacheGenerator r9 = new com.bumptech.glide.load.engine.DataCacheGenerator
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r8.loadData
            com.bumptech.glide.load.Key r0 = r0.sourceKey
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r8.helper
            r9.<init>(r0, r1, r8)
            r8.sourceCacheGenerator = r9
            return
        L85:
            r9 = move-exception
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r8.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            r0.cleanup()
            throw r9
    }

    private boolean hasNextModelLoader() {
            r2 = this;
            int r0 = r2.loadDataListIndex
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r2.helper
            java.util.List r1 = r1.getLoadData()
            int r1 = r1.size()
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void startNextLoad(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r4) {
            r3 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r3.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r3.helper
            com.bumptech.glide.Priority r1 = r1.getPriority()
            com.bumptech.glide.load.engine.SourceGenerator$1 r2 = new com.bumptech.glide.load.engine.SourceGenerator$1
            r2.<init>(r3, r4)
            r0.loadData(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            r0.cancel()
        L9:
            return
    }

    public final boolean isCurrentRequest(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r2) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            if (r0 == 0) goto L8
            if (r0 != r2) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(com.bumptech.glide.load.Key r2, java.lang.Exception r3, com.bumptech.glide.load.data.DataFetcher<?> r4, com.bumptech.glide.load.DataSource r5) {
            r1 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r5 = r1.cb
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.DataSource r0 = r0.getDataSource()
            r5.onDataFetcherFailed(r2, r3, r4, r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(com.bumptech.glide.load.Key r7, java.lang.Object r8, com.bumptech.glide.load.data.DataFetcher<?> r9, com.bumptech.glide.load.DataSource r10, com.bumptech.glide.load.Key r11) {
            r6 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r10 = r6.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r10 = r10.fetcher
            com.bumptech.glide.load.DataSource r4 = r10.getDataSource()
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    public final void onDataReadyInternal(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r7, java.lang.Object r8) {
            r6 = this;
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r6.helper
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r0.getDiskCacheStrategy()
            if (r8 == 0) goto L1c
            com.bumptech.glide.load.data.DataFetcher<Data> r1 = r7.fetcher
            com.bumptech.glide.load.DataSource r1 = r1.getDataSource()
            boolean r0 = r0.isDataCacheable(r1)
            if (r0 == 0) goto L1c
            r6.dataToCache = r8
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r7 = r6.cb
            r7.reschedule()
            goto L2c
        L1c:
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.Key r1 = r7.sourceKey
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r7.fetcher
            com.bumptech.glide.load.DataSource r4 = r3.getDataSource()
            com.bumptech.glide.load.engine.DataCacheKey r5 = r6.originalKey
            r2 = r8
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
        L2c:
            return
    }

    public final void onLoadFailedInternal(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r4, @androidx.annotation.NonNull java.lang.Exception r5) {
            r3 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r3.cb
            com.bumptech.glide.load.engine.DataCacheKey r1 = r3.originalKey
            com.bumptech.glide.load.data.DataFetcher<Data> r4 = r4.fetcher
            com.bumptech.glide.load.DataSource r2 = r4.getDataSource()
            r0.onDataFetcherFailed(r1, r5, r4, r2)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r5 = this;
            java.lang.Object r0 = r5.dataToCache
            r1 = 0
            if (r0 == 0) goto La
            r5.dataToCache = r1
            r5.cacheData(r0)
        La:
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = r5.sourceCacheGenerator
            r2 = 1
            if (r0 == 0) goto L16
            boolean r0 = r0.startNext()
            if (r0 == 0) goto L16
            return r2
        L16:
            r5.sourceCacheGenerator = r1
            r5.loadData = r1
            r0 = 0
        L1b:
            if (r0 != 0) goto L66
            boolean r1 = r5.hasNextModelLoader()
            if (r1 == 0) goto L66
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            java.util.List r1 = r1.getLoadData()
            int r3 = r5.loadDataListIndex
            int r4 = r3 + 1
            r5.loadDataListIndex = r4
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = (com.bumptech.glide.load.model.ModelLoader.LoadData) r1
            r5.loadData = r1
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r1 = r5.loadData
            if (r1 == 0) goto L1b
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            com.bumptech.glide.load.engine.DiskCacheStrategy r1 = r1.getDiskCacheStrategy()
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r5.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher
            com.bumptech.glide.load.DataSource r3 = r3.getDataSource()
            boolean r1 = r1.isDataCacheable(r3)
            if (r1 != 0) goto L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r5.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher
            java.lang.Class r3 = r3.getDataClass()
            boolean r1 = r1.hasLoadPath(r3)
            if (r1 == 0) goto L1b
        L5f:
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r5.loadData
            r5.startNextLoad(r0)
            r0 = 1
            goto L1b
        L66:
            return r0
    }
}
