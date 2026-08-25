package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
class ResourceCacheGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback<java.lang.Object> {
    private java.io.File cacheFile;
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private com.bumptech.glide.load.engine.ResourceCacheKey currentKey;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> modelLoaders;
    private int resourceClassIndex;
    private int sourceIdIndex;
    private com.bumptech.glide.load.Key sourceKey;

    public ResourceCacheGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r2, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.resourceClassIndex = r0
            r1.helper = r2
            r1.cb = r3
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
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            com.bumptech.glide.load.engine.ResourceCacheKey r5 = r6.currentKey
            r2 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@androidx.annotation.NonNull java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r4.cb
            com.bumptech.glide.load.engine.ResourceCacheKey r1 = r4.currentKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r4.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r2 = r2.fetcher
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r0.onDataFetcherFailed(r1, r5, r2, r3)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r14 = this;
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r14.helper
            java.util.List r0 = r0.getCacheKeys()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper
            java.util.List r1 = r1.getRegisteredResourceClasses()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L50
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper
            java.lang.Class r1 = r1.getTranscodeClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            return r2
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to find any load path from "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            com.bumptech.glide.load.engine.DecodeHelper<?> r2 = r14.helper
            java.lang.Class r2 = r2.getModelClass()
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            com.bumptech.glide.load.engine.DecodeHelper<?> r2 = r14.helper
            java.lang.Class r2 = r2.getTranscodeClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L50:
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r3 = r14.modelLoaders
            if (r3 == 0) goto Lb2
            boolean r3 = r14.hasNextModelLoader()
            if (r3 != 0) goto L5b
            goto Lb2
        L5b:
            r0 = 0
            r14.loadData = r0
        L5e:
            if (r2 != 0) goto Lb1
            boolean r0 = r14.hasNextModelLoader()
            if (r0 == 0) goto Lb1
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r14.modelLoaders
            int r1 = r14.modelLoaderIndex
            int r3 = r1 + 1
            r14.modelLoaderIndex = r3
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.load.model.ModelLoader r0 = (com.bumptech.glide.load.model.ModelLoader) r0
            java.io.File r1 = r14.cacheFile
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r14.helper
            int r3 = r3.getWidth()
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            int r4 = r4.getHeight()
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r14.helper
            com.bumptech.glide.load.Options r5 = r5.getOptions()
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r1, r3, r4, r5)
            r14.loadData = r0
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r14.loadData
            if (r0 == 0) goto L5e
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r14.helper
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r1 = r14.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r1 = r1.fetcher
            java.lang.Class r1 = r1.getDataClass()
            boolean r0 = r0.hasLoadPath(r1)
            if (r0 == 0) goto L5e
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r14.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper
            com.bumptech.glide.Priority r1 = r1.getPriority()
            r0.loadData(r1, r14)
            r2 = 1
            goto L5e
        Lb1:
            return r2
        Lb2:
            int r3 = r14.resourceClassIndex
            int r3 = r3 + 1
            r14.resourceClassIndex = r3
            int r4 = r1.size()
            if (r3 < r4) goto Lcd
            int r3 = r14.sourceIdIndex
            int r3 = r3 + 1
            r14.sourceIdIndex = r3
            int r4 = r0.size()
            if (r3 < r4) goto Lcb
            return r2
        Lcb:
            r14.resourceClassIndex = r2
        Lcd:
            int r3 = r14.sourceIdIndex
            java.lang.Object r3 = r0.get(r3)
            com.bumptech.glide.load.Key r3 = (com.bumptech.glide.load.Key) r3
            int r4 = r14.resourceClassIndex
            java.lang.Object r4 = r1.get(r4)
            r11 = r4
            java.lang.Class r11 = (java.lang.Class) r11
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            com.bumptech.glide.load.Transformation r10 = r4.getTransformation(r11)
            com.bumptech.glide.load.engine.ResourceCacheKey r13 = new com.bumptech.glide.load.engine.ResourceCacheKey
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r4.getArrayPool()
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            com.bumptech.glide.load.Key r7 = r4.getSignature()
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            int r8 = r4.getWidth()
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            int r9 = r4.getHeight()
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            com.bumptech.glide.load.Options r12 = r4.getOptions()
            r4 = r13
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.currentKey = r13
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper
            com.bumptech.glide.load.engine.cache.DiskCache r4 = r4.getDiskCache()
            com.bumptech.glide.load.engine.ResourceCacheKey r5 = r14.currentKey
            java.io.File r4 = r4.get(r5)
            r14.cacheFile = r4
            if (r4 == 0) goto L50
            r14.sourceKey = r3
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r14.helper
            java.util.List r3 = r3.getModelLoaders(r4)
            r14.modelLoaders = r3
            r14.modelLoaderIndex = r2
            goto L50
    }
}
