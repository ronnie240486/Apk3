package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class DecodeHelper<Transcode> {
    private final java.util.List<com.bumptech.glide.load.Key> cacheKeys;
    private com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider diskCacheProvider;
    private com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy;
    private com.bumptech.glide.GlideContext glideContext;
    private int height;
    private boolean isCacheKeysSet;
    private boolean isLoadDataSet;
    private boolean isScaleOnlyOrNoTransform;
    private boolean isTransformationRequired;
    private final java.util.List<com.bumptech.glide.load.model.ModelLoader.LoadData<?>> loadData;
    private java.lang.Object model;
    private com.bumptech.glide.load.Options options;
    private com.bumptech.glide.Priority priority;
    private java.lang.Class<?> resourceClass;
    private com.bumptech.glide.load.Key signature;
    private java.lang.Class<Transcode> transcodeClass;
    private java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> transformations;
    private int width;

    public DecodeHelper() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.loadData = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.cacheKeys = r0
            return
    }

    public final void clear() {
            r2 = this;
            r0 = 0
            r2.glideContext = r0
            r2.model = r0
            r2.signature = r0
            r2.resourceClass = r0
            r2.transcodeClass = r0
            r2.options = r0
            r2.priority = r0
            r2.transformations = r0
            r2.diskCacheStrategy = r0
            java.util.List<com.bumptech.glide.load.model.ModelLoader$LoadData<?>> r0 = r2.loadData
            r0.clear()
            r0 = 0
            r2.isLoadDataSet = r0
            java.util.List<com.bumptech.glide.load.Key> r1 = r2.cacheKeys
            r1.clear()
            r2.isCacheKeysSet = r0
            return
    }

    public final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool getArrayPool() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r0.getArrayPool()
            return r0
    }

    public final java.util.List<com.bumptech.glide.load.Key> getCacheKeys() {
            r8 = this;
            boolean r0 = r8.isCacheKeysSet
            if (r0 != 0) goto L57
            r0 = 1
            r8.isCacheKeysSet = r0
            java.util.List<com.bumptech.glide.load.Key> r0 = r8.cacheKeys
            r0.clear()
            java.util.List r0 = r8.getLoadData()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L57
            java.lang.Object r4 = r0.get(r3)
            com.bumptech.glide.load.model.ModelLoader$LoadData r4 = (com.bumptech.glide.load.model.ModelLoader.LoadData) r4
            java.util.List<com.bumptech.glide.load.Key> r5 = r8.cacheKeys
            com.bumptech.glide.load.Key r6 = r4.sourceKey
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L2f
            java.util.List<com.bumptech.glide.load.Key> r5 = r8.cacheKeys
            com.bumptech.glide.load.Key r6 = r4.sourceKey
            r5.add(r6)
        L2f:
            r5 = 0
        L30:
            java.util.List<com.bumptech.glide.load.Key> r6 = r4.alternateKeys
            int r6 = r6.size()
            if (r5 >= r6) goto L54
            java.util.List<com.bumptech.glide.load.Key> r6 = r8.cacheKeys
            java.util.List<com.bumptech.glide.load.Key> r7 = r4.alternateKeys
            java.lang.Object r7 = r7.get(r5)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L51
            java.util.List<com.bumptech.glide.load.Key> r6 = r8.cacheKeys
            java.util.List<com.bumptech.glide.load.Key> r7 = r4.alternateKeys
            java.lang.Object r7 = r7.get(r5)
            r6.add(r7)
        L51:
            int r5 = r5 + 1
            goto L30
        L54:
            int r3 = r3 + 1
            goto L16
        L57:
            java.util.List<com.bumptech.glide.load.Key> r0 = r8.cacheKeys
            return r0
    }

    public final com.bumptech.glide.load.engine.cache.DiskCache getDiskCache() {
            r1 = this;
            com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider r0 = r1.diskCacheProvider
            com.bumptech.glide.load.engine.cache.DiskCache r0 = r0.getDiskCache()
            return r0
    }

    public final com.bumptech.glide.load.engine.DiskCacheStrategy getDiskCacheStrategy() {
            r1 = this;
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r1.diskCacheStrategy
            return r0
    }

    public final int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public final java.util.List<com.bumptech.glide.load.model.ModelLoader.LoadData<?>> getLoadData() {
            r8 = this;
            boolean r0 = r8.isLoadDataSet
            if (r0 != 0) goto L3b
            r0 = 1
            r8.isLoadDataSet = r0
            java.util.List<com.bumptech.glide.load.model.ModelLoader$LoadData<?>> r0 = r8.loadData
            r0.clear()
            com.bumptech.glide.GlideContext r0 = r8.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.lang.Object r1 = r8.model
            java.util.List r0 = r0.getModelLoaders(r1)
            r1 = 0
            int r2 = r0.size()
        L1d:
            if (r1 >= r2) goto L3b
            java.lang.Object r3 = r0.get(r1)
            com.bumptech.glide.load.model.ModelLoader r3 = (com.bumptech.glide.load.model.ModelLoader) r3
            java.lang.Object r4 = r8.model
            int r5 = r8.width
            int r6 = r8.height
            com.bumptech.glide.load.Options r7 = r8.options
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = r3.buildLoadData(r4, r5, r6, r7)
            if (r3 == 0) goto L38
            java.util.List<com.bumptech.glide.load.model.ModelLoader$LoadData<?>> r4 = r8.loadData
            r4.add(r3)
        L38:
            int r1 = r1 + 1
            goto L1d
        L3b:
            java.util.List<com.bumptech.glide.load.model.ModelLoader$LoadData<?>> r0 = r8.loadData
            return r0
    }

    public final <Data> com.bumptech.glide.load.engine.LoadPath<Data, ?, Transcode> getLoadPath(java.lang.Class<Data> r4) {
            r3 = this;
            com.bumptech.glide.GlideContext r0 = r3.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.lang.Class<?> r1 = r3.resourceClass
            java.lang.Class<Transcode> r2 = r3.transcodeClass
            com.bumptech.glide.load.engine.LoadPath r4 = r0.getLoadPath(r4, r1, r2)
            return r4
    }

    public final java.lang.Class<?> getModelClass() {
            r1 = this;
            java.lang.Object r0 = r1.model
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    public final java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> getModelLoaders(java.io.File r2) throws com.bumptech.glide.Registry.NoModelLoaderAvailableException {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.util.List r2 = r0.getModelLoaders(r2)
            return r2
    }

    public final com.bumptech.glide.load.Options getOptions() {
            r1 = this;
            com.bumptech.glide.load.Options r0 = r1.options
            return r0
    }

    public final com.bumptech.glide.Priority getPriority() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.priority
            return r0
    }

    public final java.util.List<java.lang.Class<?>> getRegisteredResourceClasses() {
            r4 = this;
            com.bumptech.glide.GlideContext r0 = r4.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.lang.Object r1 = r4.model
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<?> r2 = r4.resourceClass
            java.lang.Class<Transcode> r3 = r4.transcodeClass
            java.util.List r0 = r0.getRegisteredResourceClasses(r1, r2, r3)
            return r0
    }

    public final <Z> com.bumptech.glide.load.ResourceEncoder<Z> getResultEncoder(com.bumptech.glide.load.engine.Resource<Z> r2) {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            com.bumptech.glide.load.ResourceEncoder r2 = r0.getResultEncoder(r2)
            return r2
    }

    public final com.bumptech.glide.load.Key getSignature() {
            r1 = this;
            com.bumptech.glide.load.Key r0 = r1.signature
            return r0
    }

    public final <X> com.bumptech.glide.load.Encoder<X> getSourceEncoder(X r2) throws com.bumptech.glide.Registry.NoSourceEncoderAvailableException {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            com.bumptech.glide.load.Encoder r2 = r0.getSourceEncoder(r2)
            return r2
    }

    public final java.lang.Class<?> getTranscodeClass() {
            r1 = this;
            java.lang.Class<Transcode> r0 = r1.transcodeClass
            return r0
    }

    public final <Z> com.bumptech.glide.load.Transformation<Z> getTransformation(java.lang.Class<Z> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r4.transformations
            java.lang.Object r0 = r0.get(r5)
            com.bumptech.glide.load.Transformation r0 = (com.bumptech.glide.load.Transformation) r0
            if (r0 != 0) goto L32
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r1 = r4.transformations
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            com.bumptech.glide.load.Transformation r0 = (com.bumptech.glide.load.Transformation) r0
        L32:
            if (r0 != 0) goto L62
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r4.transformations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5d
            boolean r0 = r4.isTransformationRequired
            if (r0 != 0) goto L41
            goto L5d
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing transformation for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ". If you wish to ignore unknown resource types, use the optional transformation methods."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5d:
            com.bumptech.glide.load.resource.UnitTransformation r5 = com.bumptech.glide.load.resource.UnitTransformation.get()
            return r5
        L62:
            return r0
    }

    public final int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public final boolean hasLoadPath(java.lang.Class<?> r4) {
            r3 = this;
            com.bumptech.glide.GlideContext r0 = r3.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.lang.Class<?> r1 = r3.resourceClass
            java.lang.Class<Transcode> r2 = r3.transcodeClass
            com.bumptech.glide.load.engine.LoadPath r4 = r0.getLoadPath(r4, r1, r2)
            if (r4 == 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    public final <R> void init(com.bumptech.glide.GlideContext r1, java.lang.Object r2, com.bumptech.glide.load.Key r3, int r4, int r5, com.bumptech.glide.load.engine.DiskCacheStrategy r6, java.lang.Class<?> r7, java.lang.Class<R> r8, com.bumptech.glide.Priority r9, com.bumptech.glide.load.Options r10, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r11, boolean r12, boolean r13, com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider r14) {
            r0 = this;
            r0.glideContext = r1
            r0.model = r2
            r0.signature = r3
            r0.width = r4
            r0.height = r5
            r0.diskCacheStrategy = r6
            r0.resourceClass = r7
            r0.diskCacheProvider = r14
            r0.transcodeClass = r8
            r0.priority = r9
            r0.options = r10
            r0.transformations = r11
            r0.isTransformationRequired = r12
            r0.isScaleOnlyOrNoTransform = r13
            return
    }

    public final boolean isResourceEncoderAvailable(com.bumptech.glide.load.engine.Resource<?> r2) {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            boolean r2 = r0.isResourceEncoderAvailable(r2)
            return r2
    }

    public final boolean isScaleOnlyOrNoTransform() {
            r1 = this;
            boolean r0 = r1.isScaleOnlyOrNoTransform
            return r0
    }
}
