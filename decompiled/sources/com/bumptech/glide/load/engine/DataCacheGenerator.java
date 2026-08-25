package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class DataCacheGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback<java.lang.Object> {
    private java.io.File cacheFile;
    private final java.util.List<com.bumptech.glide.load.Key> cacheKeys;
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> modelLoaders;
    private int sourceIdIndex;
    private com.bumptech.glide.load.Key sourceKey;

    public DataCacheGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r3, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r4) {
            r2 = this;
            java.util.List r0 = r3.getCacheKeys()
            r2.<init>()
            r1 = -1
            r2.sourceIdIndex = r1
            r2.cacheKeys = r0
            r2.helper = r3
            r2.cb = r4
            return
    }

    public DataCacheGenerator(java.util.List<com.bumptech.glide.load.Key> r2, com.bumptech.glide.load.engine.DecodeHelper<?> r3, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.sourceIdIndex = r0
            r1.cacheKeys = r2
            r1.helper = r3
            r1.cb = r4
            return
    }

    private boolean hasNextModelLoader() {
            r2 = this;
            int r0 = r2.modelLoaderIndex
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r1 = r2.modelLoaders
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
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

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(java.lang.Object r7) {
            r6 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.Key r1 = r6.sourceKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r6.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r2.fetcher
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            com.bumptech.glide.load.Key r5 = r6.sourceKey
            r2 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@androidx.annotation.NonNull java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r4.cb
            com.bumptech.glide.load.Key r1 = r4.sourceKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r4.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r2 = r2.fetcher
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            r0.onDataFetcherFailed(r1, r5, r2, r3)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r7 = this;
        L0:
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r7.modelLoaders
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L64
            boolean r0 = r7.hasNextModelLoader()
            if (r0 != 0) goto Ld
            goto L64
        Ld:
            r0 = 0
            r7.loadData = r0
        L10:
            if (r1 != 0) goto L63
            boolean r0 = r7.hasNextModelLoader()
            if (r0 == 0) goto L63
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r7.modelLoaders
            int r3 = r7.modelLoaderIndex
            int r4 = r3 + 1
            r7.modelLoaderIndex = r4
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.model.ModelLoader r0 = (com.bumptech.glide.load.model.ModelLoader) r0
            java.io.File r3 = r7.cacheFile
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r7.helper
            int r4 = r4.getWidth()
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r7.helper
            int r5 = r5.getHeight()
            com.bumptech.glide.load.engine.DecodeHelper<?> r6 = r7.helper
            com.bumptech.glide.load.Options r6 = r6.getOptions()
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r3, r4, r5, r6)
            r7.loadData = r0
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r7.loadData
            if (r0 == 0) goto L10
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r7.helper
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r7.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher
            java.lang.Class r3 = r3.getDataClass()
            boolean r0 = r0.hasLoadPath(r3)
            if (r0 == 0) goto L10
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r7.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r7.helper
            com.bumptech.glide.Priority r1 = r1.getPriority()
            r0.loadData(r1, r7)
            r1 = 1
            goto L10
        L63:
            return r1
        L64:
            int r0 = r7.sourceIdIndex
            int r0 = r0 + r2
            r7.sourceIdIndex = r0
            java.util.List<com.bumptech.glide.load.Key> r2 = r7.cacheKeys
            int r2 = r2.size()
            if (r0 < r2) goto L72
            return r1
        L72:
            java.util.List<com.bumptech.glide.load.Key> r0 = r7.cacheKeys
            int r2 = r7.sourceIdIndex
            java.lang.Object r0 = r0.get(r2)
            com.bumptech.glide.load.Key r0 = (com.bumptech.glide.load.Key) r0
            com.bumptech.glide.load.engine.DataCacheKey r2 = new com.bumptech.glide.load.engine.DataCacheKey
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r7.helper
            com.bumptech.glide.load.Key r3 = r3.getSignature()
            r2.<init>(r0, r3)
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r7.helper
            com.bumptech.glide.load.engine.cache.DiskCache r3 = r3.getDiskCache()
            java.io.File r2 = r3.get(r2)
            r7.cacheFile = r2
            if (r2 == 0) goto L0
            r7.sourceKey = r0
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r7.helper
            java.util.List r0 = r0.getModelLoaders(r2)
            r7.modelLoaders = r0
            r7.modelLoaderIndex = r1
            goto L0
    }
}
