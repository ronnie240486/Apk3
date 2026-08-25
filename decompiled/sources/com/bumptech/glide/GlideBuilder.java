package com.bumptech.glide;

/* JADX INFO: loaded from: classes3.dex */
public final class GlideBuilder {
    private com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
    private com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory;

    @androidx.annotation.Nullable
    private java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    private com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> defaultTransitionOptions;
    private com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
    private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
    private com.bumptech.glide.load.engine.Engine engine;
    private final com.bumptech.glide.GlideExperiments.Builder glideExperimentsBuilder;
    private boolean isActiveResourceRetentionAllowed;
    private int logLevel;
    private com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private com.bumptech.glide.load.engine.cache.MemorySizeCalculator memorySizeCalculator;

    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
    private com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;



    /* JADX INFO: loaded from: classes.dex */
    public static final class EnableImageDecoderForBitmaps implements com.bumptech.glide.GlideExperiments.Experiment {
        public EnableImageDecoderForBitmaps() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LogRequestOrigins implements com.bumptech.glide.GlideExperiments.Experiment {
        public LogRequestOrigins() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ManualOverrideHardwareBitmapMaxFdCount implements com.bumptech.glide.GlideExperiments.Experiment {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WaitForFramesAfterTrimMemory implements com.bumptech.glide.GlideExperiments.Experiment {
        private WaitForFramesAfterTrimMemory() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public GlideBuilder() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.defaultTransitionOptions = r0
            com.bumptech.glide.GlideExperiments$Builder r0 = new com.bumptech.glide.GlideExperiments$Builder
            r0.<init>()
            r1.glideExperimentsBuilder = r0
            r0 = 4
            r1.logLevel = r0
            com.bumptech.glide.GlideBuilder$1 r0 = new com.bumptech.glide.GlideBuilder$1
            r0.<init>()
            r1.defaultRequestOptionsFactory = r0
            return
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder addGlobalRequestListener(@androidx.annotation.NonNull com.bumptech.glide.request.RequestListener<java.lang.Object> r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.defaultRequestListeners = r0
        Lb:
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.Glide build(@androidx.annotation.NonNull android.content.Context r15) {
            r14 = this;
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r14.sourceExecutor
            if (r0 != 0) goto La
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.newSourceExecutor()
            r14.sourceExecutor = r0
        La:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r14.diskCacheExecutor
            if (r0 != 0) goto L14
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.newDiskCacheExecutor()
            r14.diskCacheExecutor = r0
        L14:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r14.animationExecutor
            if (r0 != 0) goto L1e
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.newAnimationExecutor()
            r14.animationExecutor = r0
        L1e:
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r0 = r14.memorySizeCalculator
            if (r0 != 0) goto L2d
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder r0 = new com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder
            r0.<init>(r15)
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r0 = r0.build()
            r14.memorySizeCalculator = r0
        L2d:
            com.bumptech.glide.manager.ConnectivityMonitorFactory r0 = r14.connectivityMonitorFactory
            if (r0 != 0) goto L38
            com.bumptech.glide.manager.DefaultConnectivityMonitorFactory r0 = new com.bumptech.glide.manager.DefaultConnectivityMonitorFactory
            r0.<init>()
            r14.connectivityMonitorFactory = r0
        L38:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r14.bitmapPool
            if (r0 != 0) goto L54
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r0 = r14.memorySizeCalculator
            int r0 = r0.getBitmapPoolSize()
            if (r0 <= 0) goto L4d
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool r1 = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool
            long r2 = (long) r0
            r1.<init>(r2)
            r14.bitmapPool = r1
            goto L54
        L4d:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter r0 = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter
            r0.<init>()
            r14.bitmapPool = r0
        L54:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r14.arrayPool
            if (r0 != 0) goto L65
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r14.memorySizeCalculator
            int r1 = r1.getArrayPoolSizeInBytes()
            r0.<init>(r1)
            r14.arrayPool = r0
        L65:
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r14.memoryCache
            if (r0 != 0) goto L77
            com.bumptech.glide.load.engine.cache.LruResourceCache r0 = new com.bumptech.glide.load.engine.cache.LruResourceCache
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r14.memorySizeCalculator
            int r1 = r1.getMemoryCacheSize()
            long r1 = (long) r1
            r0.<init>(r1)
            r14.memoryCache = r0
        L77:
            com.bumptech.glide.load.engine.cache.DiskCache$Factory r0 = r14.diskCacheFactory
            if (r0 != 0) goto L82
            com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory r0 = new com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
            r0.<init>(r15)
            r14.diskCacheFactory = r0
        L82:
            com.bumptech.glide.load.engine.Engine r0 = r14.engine
            if (r0 != 0) goto L9e
            com.bumptech.glide.load.engine.Engine r0 = new com.bumptech.glide.load.engine.Engine
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r14.memoryCache
            com.bumptech.glide.load.engine.cache.DiskCache$Factory r3 = r14.diskCacheFactory
            com.bumptech.glide.load.engine.executor.GlideExecutor r4 = r14.diskCacheExecutor
            com.bumptech.glide.load.engine.executor.GlideExecutor r5 = r14.sourceExecutor
            com.bumptech.glide.load.engine.executor.GlideExecutor r6 = com.bumptech.glide.load.engine.executor.GlideExecutor.newUnlimitedSourceExecutor()
            com.bumptech.glide.load.engine.executor.GlideExecutor r7 = r14.animationExecutor
            boolean r8 = r14.isActiveResourceRetentionAllowed
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.engine = r0
        L9e:
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r14.defaultRequestListeners
            if (r0 != 0) goto La9
            java.util.List r0 = java.util.Collections.emptyList()
            r14.defaultRequestListeners = r0
            goto Laf
        La9:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r14.defaultRequestListeners = r0
        Laf:
            com.bumptech.glide.GlideExperiments$Builder r0 = r14.glideExperimentsBuilder
            java.util.Objects.requireNonNull(r0)
            com.bumptech.glide.GlideExperiments r13 = new com.bumptech.glide.GlideExperiments
            r13.<init>(r0)
            com.bumptech.glide.manager.RequestManagerRetriever r7 = new com.bumptech.glide.manager.RequestManagerRetriever
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r0 = r14.requestManagerFactory
            r7.<init>(r0, r13)
            com.bumptech.glide.Glide r0 = new com.bumptech.glide.Glide
            com.bumptech.glide.load.engine.Engine r3 = r14.engine
            com.bumptech.glide.load.engine.cache.MemoryCache r4 = r14.memoryCache
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5 = r14.bitmapPool
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r14.arrayPool
            com.bumptech.glide.manager.ConnectivityMonitorFactory r8 = r14.connectivityMonitorFactory
            int r9 = r14.logLevel
            com.bumptech.glide.Glide$RequestOptionsFactory r10 = r14.defaultRequestOptionsFactory
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r11 = r14.defaultTransitionOptions
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r12 = r14.defaultRequestListeners
            r1 = r0
            r2 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setAnimationExecutor(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.animationExecutor = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setArrayPool(@androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
            r0 = this;
            r0.arrayPool = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setBitmapPool(@androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1) {
            r0 = this;
            r0.bitmapPool = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setConnectivityMonitorFactory(@androidx.annotation.Nullable com.bumptech.glide.manager.ConnectivityMonitorFactory r1) {
            r0 = this;
            r0.connectivityMonitorFactory = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.Glide.RequestOptionsFactory r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.Glide$RequestOptionsFactory r1 = (com.bumptech.glide.Glide.RequestOptionsFactory) r1
            r0.defaultRequestOptionsFactory = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(@androidx.annotation.Nullable com.bumptech.glide.request.RequestOptions r2) {
            r1 = this;
            com.bumptech.glide.GlideBuilder$2 r0 = new com.bumptech.glide.GlideBuilder$2
            r0.<init>(r2)
            com.bumptech.glide.GlideBuilder r2 = r1.setDefaultRequestOptions(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.GlideBuilder setDefaultTransitionOptions(@androidx.annotation.NonNull java.lang.Class<T> r2, @androidx.annotation.Nullable com.bumptech.glide.TransitionOptions<?, T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r0 = r1.defaultTransitionOptions
            r0.put(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setDiskCache(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.DiskCache.Factory r1) {
            r0 = this;
            r0.diskCacheFactory = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setDiskCacheExecutor(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.diskCacheExecutor = r1
            return r0
    }

    public com.bumptech.glide.GlideBuilder setImageDecoderEnabledForBitmaps(boolean r4) {
            r3 = this;
            com.bumptech.glide.GlideExperiments$Builder r0 = r3.glideExperimentsBuilder
            com.bumptech.glide.GlideBuilder$EnableImageDecoderForBitmaps r1 = new com.bumptech.glide.GlideBuilder$EnableImageDecoderForBitmaps
            r1.<init>()
            if (r4 == 0) goto L11
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            r0.update(r1, r4)
            return r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setIsActiveResourceRetentionAllowed(boolean r1) {
            r0 = this;
            r0.isActiveResourceRetentionAllowed = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setLogLevel(int r2) {
            r1 = this;
            r0 = 2
            if (r2 < r0) goto L9
            r0 = 6
            if (r2 > r0) goto L9
            r1.logLevel = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR"
            r2.<init>(r0)
            throw r2
    }

    public com.bumptech.glide.GlideBuilder setLogRequestOrigins(boolean r3) {
            r2 = this;
            com.bumptech.glide.GlideExperiments$Builder r0 = r2.glideExperimentsBuilder
            com.bumptech.glide.GlideBuilder$LogRequestOrigins r1 = new com.bumptech.glide.GlideBuilder$LogRequestOrigins
            r1.<init>()
            r0.update(r1, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setMemoryCache(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.MemoryCache r1) {
            r0 = this;
            r0.memoryCache = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder r1) {
            r0 = this;
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r1.build()
            com.bumptech.glide.GlideBuilder r1 = r0.setMemorySizeCalculator(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1) {
            r0 = this;
            r0.memorySizeCalculator = r1
            return r0
    }

    public final void setRequestManagerFactory(@androidx.annotation.Nullable com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory r1) {
            r0 = this;
            r0.requestManagerFactory = r1
            return
    }

    @java.lang.Deprecated
    public com.bumptech.glide.GlideBuilder setResizeExecutor(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            com.bumptech.glide.GlideBuilder r1 = r0.setSourceExecutor(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.GlideBuilder setSourceExecutor(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.sourceExecutor = r1
            return r0
    }
}
