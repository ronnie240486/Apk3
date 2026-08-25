package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public class Engine implements com.bumptech.glide.load.engine.EngineJobListener, com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener, com.bumptech.glide.load.engine.EngineResource.ResourceListener {
    private static final int JOB_POOL_SIZE = 150;
    private static final java.lang.String TAG = "Engine";
    private static final boolean VERBOSE_IS_LOGGABLE = false;
    private final com.bumptech.glide.load.engine.ActiveResources activeResources;
    private final com.bumptech.glide.load.engine.cache.MemoryCache cache;
    private final com.bumptech.glide.load.engine.Engine.DecodeJobFactory decodeJobFactory;
    private final com.bumptech.glide.load.engine.Engine.LazyDiskCacheProvider diskCacheProvider;
    private final com.bumptech.glide.load.engine.Engine.EngineJobFactory engineJobFactory;
    private final com.bumptech.glide.load.engine.Jobs jobs;
    private final com.bumptech.glide.load.engine.EngineKeyFactory keyFactory;
    private final com.bumptech.glide.load.engine.ResourceRecycler resourceRecycler;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static class DecodeJobFactory {
        private int creationOrder;
        public final com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider diskCacheProvider;
        public final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.DecodeJob<?>> pool;


        public DecodeJobFactory(com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider r3) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.Engine$DecodeJobFactory$1 r0 = new com.bumptech.glide.load.engine.Engine$DecodeJobFactory$1
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
                r2.pool = r0
                r2.diskCacheProvider = r3
                return
        }

        public final <R> com.bumptech.glide.load.engine.DecodeJob<R> build(com.bumptech.glide.GlideContext r21, java.lang.Object r22, com.bumptech.glide.load.engine.EngineKey r23, com.bumptech.glide.load.Key r24, int r25, int r26, java.lang.Class<?> r27, java.lang.Class<R> r28, com.bumptech.glide.Priority r29, com.bumptech.glide.load.engine.DiskCacheStrategy r30, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r31, boolean r32, boolean r33, boolean r34, com.bumptech.glide.load.Options r35, com.bumptech.glide.load.engine.DecodeJob.Callback<R> r36) {
                r20 = this;
                r0 = r20
                r2 = r21
                r3 = r22
                r4 = r23
                r5 = r24
                r6 = r25
                r7 = r26
                r8 = r27
                r9 = r28
                r10 = r29
                r11 = r30
                r12 = r31
                r13 = r32
                r14 = r33
                r15 = r34
                r16 = r35
                r17 = r36
                androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.DecodeJob<?>> r1 = r0.pool
                java.lang.Object r1 = r1.acquire()
                com.bumptech.glide.load.engine.DecodeJob r1 = (com.bumptech.glide.load.engine.DecodeJob) r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                r19 = r1
                com.bumptech.glide.load.engine.DecodeJob r19 = (com.bumptech.glide.load.engine.DecodeJob) r19
                r1 = r19
                r21 = r1
                int r1 = r0.creationOrder
                r18 = r1
                int r1 = r1 + 1
                r0.creationOrder = r1
                r1 = r21
                r1.init(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r19
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static class EngineJobFactory {
        public final com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
        public final com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
        public final com.bumptech.glide.load.engine.EngineJobListener engineJobListener;
        public final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.EngineJob<?>> pool;
        public final com.bumptech.glide.load.engine.EngineResource.ResourceListener resourceListener;
        public final com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;
        public final com.bumptech.glide.load.engine.executor.GlideExecutor sourceUnlimitedExecutor;


        public EngineJobFactory(com.bumptech.glide.load.engine.executor.GlideExecutor r3, com.bumptech.glide.load.engine.executor.GlideExecutor r4, com.bumptech.glide.load.engine.executor.GlideExecutor r5, com.bumptech.glide.load.engine.executor.GlideExecutor r6, com.bumptech.glide.load.engine.EngineJobListener r7, com.bumptech.glide.load.engine.EngineResource.ResourceListener r8) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.Engine$EngineJobFactory$1 r0 = new com.bumptech.glide.load.engine.Engine$EngineJobFactory$1
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
                r2.pool = r0
                r2.diskCacheExecutor = r3
                r2.sourceExecutor = r4
                r2.sourceUnlimitedExecutor = r5
                r2.animationExecutor = r6
                r2.engineJobListener = r7
                r2.resourceListener = r8
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LazyDiskCacheProvider implements com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider {
        private volatile com.bumptech.glide.load.engine.cache.DiskCache diskCache;
        private final com.bumptech.glide.load.engine.cache.DiskCache.Factory factory;

        public LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache.Factory r1) {
                r0 = this;
                r0.<init>()
                r0.factory = r1
                return
        }

        @androidx.annotation.VisibleForTesting
        public final synchronized void clearDiskCacheIfCreated() {
                r1 = this;
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L7
                monitor-exit(r1)
                return
            L7:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> Le
                r0.clear()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r1)
                return
            Le:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider
        public com.bumptech.glide.load.engine.cache.DiskCache getDiskCache() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache
                if (r0 != 0) goto L21
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> L1e
                if (r0 != 0) goto L11
                com.bumptech.glide.load.engine.cache.DiskCache$Factory r0 = r1.factory     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r0.build()     // Catch: java.lang.Throwable -> L1e
                r1.diskCache = r0     // Catch: java.lang.Throwable -> L1e
            L11:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> L1e
                if (r0 != 0) goto L1c
                com.bumptech.glide.load.engine.cache.DiskCacheAdapter r0 = new com.bumptech.glide.load.engine.cache.DiskCacheAdapter     // Catch: java.lang.Throwable -> L1e
                r0.<init>()     // Catch: java.lang.Throwable -> L1e
                r1.diskCache = r0     // Catch: java.lang.Throwable -> L1e
            L1c:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                goto L21
            L1e:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                throw r0
            L21:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class LoadStatus {
        private final com.bumptech.glide.request.ResourceCallback cb;
        private final com.bumptech.glide.load.engine.EngineJob<?> engineJob;
        public final /* synthetic */ com.bumptech.glide.load.engine.Engine this$0;

        public LoadStatus(com.bumptech.glide.load.engine.Engine r1, com.bumptech.glide.request.ResourceCallback r2, com.bumptech.glide.load.engine.EngineJob<?> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                r0.engineJob = r3
                return
        }

        public void cancel() {
                r3 = this;
                com.bumptech.glide.load.engine.Engine r0 = r3.this$0
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob<?> r1 = r3.engineJob     // Catch: java.lang.Throwable -> Lc
                com.bumptech.glide.request.ResourceCallback r2 = r3.cb     // Catch: java.lang.Throwable -> Lc
                r1.removeCallback(r2)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }
    }

    static {
            java.lang.String r0 = "Engine"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE = r0
            return
    }

    public Engine(com.bumptech.glide.load.engine.cache.MemoryCache r9, com.bumptech.glide.load.engine.cache.DiskCache.Factory r10, com.bumptech.glide.load.engine.executor.GlideExecutor r11, com.bumptech.glide.load.engine.executor.GlideExecutor r12, com.bumptech.glide.load.engine.executor.GlideExecutor r13, com.bumptech.glide.load.engine.executor.GlideExecutor r14, boolean r15) {
            r8 = this;
            r8.<init>()
            r8.cache = r9
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r0 = new com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider
            r0.<init>(r10)
            r8.diskCacheProvider = r0
            com.bumptech.glide.load.engine.ActiveResources r10 = new com.bumptech.glide.load.engine.ActiveResources
            r10.<init>(r15)
            r8.activeResources = r10
            r10.setListener(r8)
            com.bumptech.glide.load.engine.EngineKeyFactory r10 = new com.bumptech.glide.load.engine.EngineKeyFactory
            r10.<init>()
            r8.keyFactory = r10
            com.bumptech.glide.load.engine.Jobs r10 = new com.bumptech.glide.load.engine.Jobs
            r10.<init>()
            r8.jobs = r10
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r10 = new com.bumptech.glide.load.engine.Engine$EngineJobFactory
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r8
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.engineJobFactory = r10
            com.bumptech.glide.load.engine.Engine$DecodeJobFactory r10 = new com.bumptech.glide.load.engine.Engine$DecodeJobFactory
            r10.<init>(r0)
            r8.decodeJobFactory = r10
            com.bumptech.glide.load.engine.ResourceRecycler r10 = new com.bumptech.glide.load.engine.ResourceRecycler
            r10.<init>()
            r8.resourceRecycler = r10
            r9.setResourceRemovedListener(r8)
            return
    }

    private com.bumptech.glide.load.engine.EngineResource<?> getEngineResourceFromCache(com.bumptech.glide.load.Key r8) {
            r7 = this;
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r7.cache
            com.bumptech.glide.load.engine.Resource r2 = r0.remove(r8)
            if (r2 != 0) goto La
            r8 = 0
            goto L1d
        La:
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineResource
            if (r0 == 0) goto L12
            r8 = r2
            com.bumptech.glide.load.engine.EngineResource r8 = (com.bumptech.glide.load.engine.EngineResource) r8
            goto L1d
        L12:
            com.bumptech.glide.load.engine.EngineResource r0 = new com.bumptech.glide.load.engine.EngineResource
            r3 = 1
            r4 = 1
            r1 = r0
            r5 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r0
        L1d:
            return r8
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.engine.EngineResource<?> loadFromActiveResources(com.bumptech.glide.load.Key r3) {
            r2 = this;
            com.bumptech.glide.load.engine.ActiveResources r0 = r2.activeResources
            monitor-enter(r0)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r1 = r0.activeEngineResources     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r3 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r3     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L10
            r3 = 0
            monitor-exit(r0)
            goto L1d
        L10:
            java.lang.Object r1 = r3.get()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.EngineResource r1 = (com.bumptech.glide.load.engine.EngineResource) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1b
            r0.cleanupActiveReference(r3)     // Catch: java.lang.Throwable -> L23
        L1b:
            monitor-exit(r0)
            r3 = r1
        L1d:
            if (r3 == 0) goto L22
            r3.acquire()
        L22:
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private com.bumptech.glide.load.engine.EngineResource<?> loadFromCache(com.bumptech.glide.load.Key r3) {
            r2 = this;
            com.bumptech.glide.load.engine.EngineResource r0 = r2.getEngineResourceFromCache(r3)
            if (r0 == 0) goto Le
            r0.acquire()
            com.bumptech.glide.load.engine.ActiveResources r1 = r2.activeResources
            r1.activate(r3, r0)
        Le:
            return r0
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.engine.EngineResource<?> loadFromMemory(com.bumptech.glide.load.engine.EngineKey r2, boolean r3, long r4) {
            r1 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.bumptech.glide.load.engine.EngineResource r3 = r1.loadFromActiveResources(r2)
            if (r3 == 0) goto L14
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto L13
            java.lang.String r0 = "Loaded resource from active resources"
            logWithTimeAndKey(r0, r4, r2)
        L13:
            return r3
        L14:
            com.bumptech.glide.load.engine.EngineResource r3 = r1.loadFromCache(r2)
            if (r3 == 0) goto L24
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto L23
            java.lang.String r0 = "Loaded resource from cache"
            logWithTimeAndKey(r0, r4, r2)
        L23:
            return r3
        L24:
            return r0
    }

    private static void logWithTimeAndKey(java.lang.String r1, long r2, com.bumptech.glide.load.Key r4) {
            java.lang.String r0 = " in "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r0)
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)
            r1.append(r2)
            java.lang.String r2 = "ms, key: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Engine"
            android.util.Log.v(r2, r1)
            return
    }

    private <R> com.bumptech.glide.load.engine.Engine.LoadStatus waitForExistingOrStartNewJob(com.bumptech.glide.GlideContext r21, java.lang.Object r22, com.bumptech.glide.load.Key r23, int r24, int r25, java.lang.Class<?> r26, java.lang.Class<R> r27, com.bumptech.glide.Priority r28, com.bumptech.glide.load.engine.DiskCacheStrategy r29, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r30, boolean r31, boolean r32, com.bumptech.glide.load.Options r33, boolean r34, boolean r35, boolean r36, boolean r37, com.bumptech.glide.request.ResourceCallback r38, java.util.concurrent.Executor r39, com.bumptech.glide.load.engine.EngineKey r40, long r41) {
            r20 = this;
            r0 = r20
            r1 = r38
            r2 = r39
            r15 = r40
            r13 = r41
            com.bumptech.glide.load.engine.Jobs r3 = r0.jobs
            r12 = r37
            com.bumptech.glide.load.engine.EngineJob r3 = r3.get(r15, r12)
            if (r3 == 0) goto L26
            r3.addCallback(r1, r2)
            boolean r2 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r2 == 0) goto L20
            java.lang.String r2 = "Added to existing load"
            logWithTimeAndKey(r2, r13, r15)
        L20:
            com.bumptech.glide.load.engine.Engine$LoadStatus r2 = new com.bumptech.glide.load.engine.Engine$LoadStatus
            r2.<init>(r0, r1, r3)
            return r2
        L26:
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r3 = r0.engineJobFactory
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.EngineJob<?>> r3 = r3.pool
            java.lang.Object r3 = r3.acquire()
            com.bumptech.glide.load.engine.EngineJob r3 = (com.bumptech.glide.load.engine.EngineJob) r3
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            r11 = r3
            com.bumptech.glide.load.engine.EngineJob r11 = (com.bumptech.glide.load.engine.EngineJob) r11
            r3 = r11
            r4 = r40
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r3.init(r4, r5, r6, r7, r8)
            com.bumptech.glide.load.engine.Engine$DecodeJobFactory r3 = r0.decodeJobFactory
            r4 = r21
            r5 = r22
            r6 = r40
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r21 = r11
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r1 = r15
            r15 = r31
            r16 = r32
            r17 = r37
            r18 = r33
            r19 = r21
            com.bumptech.glide.load.engine.DecodeJob r3 = r3.build(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.bumptech.glide.load.engine.Jobs r4 = r0.jobs
            r5 = r21
            r4.put(r1, r5)
            r4 = r1
            r1 = r38
            r5.addCallback(r1, r2)
            r5.start(r3)
            boolean r2 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r2 == 0) goto L89
            java.lang.String r2 = "Started new load"
            r6 = r41
            logWithTimeAndKey(r2, r6, r4)
        L89:
            com.bumptech.glide.load.engine.Engine$LoadStatus r2 = new com.bumptech.glide.load.engine.Engine$LoadStatus
            r2.<init>(r0, r1, r5)
            return r2
    }

    public void clearDiskCache() {
            r1 = this;
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r0 = r1.diskCacheProvider
            com.bumptech.glide.load.engine.cache.DiskCache r0 = r0.getDiskCache()
            r0.clear()
            return
    }

    public <R> com.bumptech.glide.load.engine.Engine.LoadStatus load(com.bumptech.glide.GlideContext r25, java.lang.Object r26, com.bumptech.glide.load.Key r27, int r28, int r29, java.lang.Class<?> r30, java.lang.Class<R> r31, com.bumptech.glide.Priority r32, com.bumptech.glide.load.engine.DiskCacheStrategy r33, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r34, boolean r35, boolean r36, com.bumptech.glide.load.Options r37, boolean r38, boolean r39, boolean r40, boolean r41, com.bumptech.glide.request.ResourceCallback r42, java.util.concurrent.Executor r43) {
            r24 = this;
            r15 = r24
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto Lb
            long r0 = com.bumptech.glide.util.LogTime.getLogTime()
            goto Ld
        Lb:
            r0 = 0
        Ld:
            r13 = r0
            com.bumptech.glide.load.engine.EngineKeyFactory r0 = r15.keyFactory
            java.util.Objects.requireNonNull(r0)
            com.bumptech.glide.load.engine.EngineKey r0 = new com.bumptech.glide.load.engine.EngineKey
            r1 = r0
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r34
            r7 = r30
            r8 = r31
            r9 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            monitor-enter(r24)
            r12 = r38
            com.bumptech.glide.load.engine.EngineResource r1 = r15.loadFromMemory(r0, r12, r13)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L64
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r22 = r13
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r0
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.waitForExistingOrStartNewJob(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L6f
            return r0
        L64:
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L6f
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            r2 = 0
            r3 = r42
            r3.onResourceReady(r1, r0, r2)
            r0 = 0
            return r0
        L6f:
            r0 = move-exception
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L6f
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public synchronized void onEngineJobCancelled(com.bumptech.glide.load.engine.EngineJob<?> r2, com.bumptech.glide.load.Key r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.engine.Jobs r0 = r1.jobs     // Catch: java.lang.Throwable -> L8
            r0.removeIfCurrent(r3, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public synchronized void onEngineJobComplete(com.bumptech.glide.load.engine.EngineJob<?> r2, com.bumptech.glide.load.Key r3, com.bumptech.glide.load.engine.EngineResource<?> r4) {
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto Le
            boolean r0 = r4.isMemoryCacheable()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.ActiveResources r0 = r1.activeResources     // Catch: java.lang.Throwable -> L15
            r0.activate(r3, r4)     // Catch: java.lang.Throwable -> L15
        Le:
            com.bumptech.glide.load.engine.Jobs r4 = r1.jobs     // Catch: java.lang.Throwable -> L15
            r4.removeIfCurrent(r3, r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.EngineResource.ResourceListener
    public void onResourceReleased(com.bumptech.glide.load.Key r4, com.bumptech.glide.load.engine.EngineResource<?> r5) {
            r3 = this;
            com.bumptech.glide.load.engine.ActiveResources r0 = r3.activeResources
            monitor-enter(r0)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r1 = r0.activeEngineResources     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L27
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r1 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r1     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L13
            r2 = 0
            r1.resource = r2     // Catch: java.lang.Throwable -> L27
            r1.clear()     // Catch: java.lang.Throwable -> L27
        L13:
            monitor-exit(r0)
            boolean r0 = r5.isMemoryCacheable()
            if (r0 == 0) goto L20
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r3.cache
            r0.put(r4, r5)
            goto L26
        L20:
            com.bumptech.glide.load.engine.ResourceRecycler r4 = r3.resourceRecycler
            r0 = 0
            r4.recycle(r5, r0)
        L26:
            return
        L27:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public void onResourceRemoved(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<?> r3) {
            r2 = this;
            com.bumptech.glide.load.engine.ResourceRecycler r0 = r2.resourceRecycler
            r1 = 1
            r0.recycle(r3, r1)
            return
    }

    public void release(com.bumptech.glide.load.engine.Resource<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineResource
            if (r0 == 0) goto La
            com.bumptech.glide.load.engine.EngineResource r2 = (com.bumptech.glide.load.engine.EngineResource) r2
            r2.release()
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot release anything but an EngineResource"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.VisibleForTesting
    public void shutdown() {
            r2 = this;
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r0 = r2.engineJobFactory
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.diskCacheExecutor
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.sourceExecutor
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.sourceUnlimitedExecutor
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.animationExecutor
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r0 = r2.diskCacheProvider
            r0.clearDiskCacheIfCreated()
            com.bumptech.glide.load.engine.ActiveResources r0 = r2.activeResources
            r0.shutdown()
            return
    }
}
