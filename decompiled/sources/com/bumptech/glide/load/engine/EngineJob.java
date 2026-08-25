package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class EngineJob<R> implements com.bumptech.glide.load.engine.DecodeJob.Callback<R>, com.bumptech.glide.util.pool.FactoryPools.Poolable {
    private static final com.bumptech.glide.load.engine.EngineJob.EngineResourceFactory DEFAULT_FACTORY = null;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
    public final com.bumptech.glide.load.engine.EngineJob.ResourceCallbacksAndExecutors cbs;
    public com.bumptech.glide.load.DataSource dataSource;
    private com.bumptech.glide.load.engine.DecodeJob<R> decodeJob;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
    private final com.bumptech.glide.load.engine.EngineJobListener engineJobListener;
    public com.bumptech.glide.load.engine.EngineResource<?> engineResource;
    private final com.bumptech.glide.load.engine.EngineJob.EngineResourceFactory engineResourceFactory;
    public com.bumptech.glide.load.engine.GlideException exception;
    private boolean hasLoadFailed;
    private boolean hasResource;
    private boolean isCacheable;
    private volatile boolean isCancelled;
    private boolean isLoadedFromAlternateCacheKey;
    private com.bumptech.glide.load.Key key;
    private boolean onlyRetrieveFromCache;
    private final java.util.concurrent.atomic.AtomicInteger pendingCallbacks;
    private final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.EngineJob<?>> pool;
    private com.bumptech.glide.load.engine.Resource<?> resource;
    private final com.bumptech.glide.load.engine.EngineResource.ResourceListener resourceListener;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor sourceUnlimitedExecutor;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorPool;

    public class CallLoadFailed implements java.lang.Runnable {
        private final com.bumptech.glide.request.ResourceCallback cb;
        public final /* synthetic */ com.bumptech.glide.load.engine.EngineJob this$0;

        public CallLoadFailed(com.bumptech.glide.load.engine.EngineJob r1, com.bumptech.glide.request.ResourceCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r4.cb
                java.lang.Object r0 = r0.getLock()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob r1 = r4.this$0     // Catch: java.lang.Throwable -> L35
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L35
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L32
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r2.cbs     // Catch: java.lang.Throwable -> L32
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L32
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L32
                if (r2 == 0) goto L2a
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L32
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L32
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L32
                com.bumptech.glide.load.engine.GlideException r2 = r2.exception     // Catch: java.lang.Throwable -> L23
                r3.onLoadFailed(r2)     // Catch: java.lang.Throwable -> L23
                goto L2a
            L23:
                r2 = move-exception
                com.bumptech.glide.load.engine.CallbackException r3 = new com.bumptech.glide.load.engine.CallbackException     // Catch: java.lang.Throwable -> L32
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L32
                throw r3     // Catch: java.lang.Throwable -> L32
            L2a:
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L32
                r2.decrementPendingCallbacks()     // Catch: java.lang.Throwable -> L32
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                return
            L32:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
                throw r2     // Catch: java.lang.Throwable -> L35
            L35:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                throw r1
        }
    }

    public class CallResourceReady implements java.lang.Runnable {
        private final com.bumptech.glide.request.ResourceCallback cb;
        public final /* synthetic */ com.bumptech.glide.load.engine.EngineJob this$0;

        public CallResourceReady(com.bumptech.glide.load.engine.EngineJob r1, com.bumptech.glide.request.ResourceCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r4.cb
                java.lang.Object r0 = r0.getLock()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob r1 = r4.this$0     // Catch: java.lang.Throwable -> L36
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L36
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r2.cbs     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L33
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L33
                if (r2 == 0) goto L2b
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.load.engine.EngineResource<?> r2 = r2.engineResource     // Catch: java.lang.Throwable -> L33
                r2.acquire()     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L33
                r2.callCallbackOnResourceReady(r3)     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L33
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L33
                r2.removeCallback(r3)     // Catch: java.lang.Throwable -> L33
            L2b:
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L33
                r2.decrementPendingCallbacks()     // Catch: java.lang.Throwable -> L33
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                return
            L33:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
                throw r2     // Catch: java.lang.Throwable -> L36
            L36:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                throw r1
        }
    }

    @androidx.annotation.VisibleForTesting
    public static class EngineResourceFactory {
        public EngineResourceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public <R> com.bumptech.glide.load.engine.EngineResource<R> build(com.bumptech.glide.load.engine.Resource<R> r8, boolean r9, com.bumptech.glide.load.Key r10, com.bumptech.glide.load.engine.EngineResource.ResourceListener r11) {
                r7 = this;
                com.bumptech.glide.load.engine.EngineResource r6 = new com.bumptech.glide.load.engine.EngineResource
                r3 = 1
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    public static final class ResourceCallbackAndExecutor {
        public final com.bumptech.glide.request.ResourceCallback cb;
        public final java.util.concurrent.Executor executor;

        public ResourceCallbackAndExecutor(com.bumptech.glide.request.ResourceCallback r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.cb = r1
                r0.executor = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r2
                com.bumptech.glide.request.ResourceCallback r0 = r1.cb
                com.bumptech.glide.request.ResourceCallback r2 = r2.cb
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r1.cb
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ResourceCallbacksAndExecutors implements java.lang.Iterable<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> {
        private final java.util.List<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> callbacksAndExecutors;

        public ResourceCallbacksAndExecutors() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 2
                r0.<init>(r1)
                r2.<init>()
                r2.callbacksAndExecutors = r0
                return
        }

        public ResourceCallbacksAndExecutors(java.util.List<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> r1) {
                r0 = this;
                r0.<init>()
                r0.callbacksAndExecutors = r1
                return
        }

        private static com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor defaultCallbackAndExecutor(com.bumptech.glide.request.ResourceCallback r2) {
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r0 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor
                java.util.concurrent.Executor r1 = com.bumptech.glide.util.Executors.directExecutor()
                r0.<init>(r2, r1)
                return r0
        }

        public final void add(com.bumptech.glide.request.ResourceCallback r3, java.util.concurrent.Executor r4) {
                r2 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r2.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r1 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor
                r1.<init>(r3, r4)
                r0.add(r1)
                return
        }

        public final void clear() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                r0.clear()
                return
        }

        public final boolean contains(com.bumptech.glide.request.ResourceCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = defaultCallbackAndExecutor(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        public final com.bumptech.glide.load.engine.EngineJob.ResourceCallbacksAndExecutors copy() {
                r3 = this;
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r2 = r3.callbacksAndExecutors
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public final boolean isEmpty() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.lang.Iterable
        @androidx.annotation.NonNull
        public java.util.Iterator<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> iterator() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        public final void remove(com.bumptech.glide.request.ResourceCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = defaultCallbackAndExecutor(r2)
                r0.remove(r2)
                return
        }

        public final int size() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r0 = new com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory
            r0.<init>()
            com.bumptech.glide.load.engine.EngineJob.DEFAULT_FACTORY = r0
            return
    }

    public EngineJob(com.bumptech.glide.load.engine.executor.GlideExecutor r3, com.bumptech.glide.load.engine.executor.GlideExecutor r4, com.bumptech.glide.load.engine.executor.GlideExecutor r5, com.bumptech.glide.load.engine.executor.GlideExecutor r6, com.bumptech.glide.load.engine.EngineJobListener r7, com.bumptech.glide.load.engine.EngineResource.ResourceListener r8, androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.EngineJob<?>> r9) {
            r2 = this;
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r0 = com.bumptech.glide.load.engine.EngineJob.DEFAULT_FACTORY
            r2.<init>()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r1 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors
            r1.<init>()
            r2.cbs = r1
            com.bumptech.glide.util.pool.StateVerifier r1 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r2.stateVerifier = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r2.pendingCallbacks = r1
            r2.diskCacheExecutor = r3
            r2.sourceExecutor = r4
            r2.sourceUnlimitedExecutor = r5
            r2.animationExecutor = r6
            r2.engineJobListener = r7
            r2.resourceListener = r8
            r2.pool = r9
            r2.engineResourceFactory = r0
            return
    }

    private com.bumptech.glide.load.engine.executor.GlideExecutor getActiveSourceExecutor() {
            r1 = this;
            boolean r0 = r1.useUnlimitedSourceGeneratorPool
            if (r0 == 0) goto L7
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceUnlimitedExecutor
            goto L10
        L7:
            boolean r0 = r1.useAnimationPool
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.animationExecutor
            goto L10
        Le:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceExecutor
        L10:
            return r0
    }

    private boolean isDone() {
            r1 = this;
            boolean r0 = r1.hasLoadFailed
            if (r0 != 0) goto Lf
            boolean r0 = r1.hasResource
            if (r0 != 0) goto Lf
            boolean r0 = r1.isCancelled
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private synchronized void release() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.load.Key r0 = r2.key     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r2.cbs     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r2.key = r0     // Catch: java.lang.Throwable -> L32
            r2.engineResource = r0     // Catch: java.lang.Throwable -> L32
            r2.resource = r0     // Catch: java.lang.Throwable -> L32
            r1 = 0
            r2.hasLoadFailed = r1     // Catch: java.lang.Throwable -> L32
            r2.isCancelled = r1     // Catch: java.lang.Throwable -> L32
            r2.hasResource = r1     // Catch: java.lang.Throwable -> L32
            r2.isLoadedFromAlternateCacheKey = r1     // Catch: java.lang.Throwable -> L32
            com.bumptech.glide.load.engine.DecodeJob<R> r1 = r2.decodeJob     // Catch: java.lang.Throwable -> L32
            r1.release$1()     // Catch: java.lang.Throwable -> L32
            r2.decodeJob = r0     // Catch: java.lang.Throwable -> L32
            r2.exception = r0     // Catch: java.lang.Throwable -> L32
            r2.dataSource = r0     // Catch: java.lang.Throwable -> L32
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.EngineJob<?>> r0 = r2.pool     // Catch: java.lang.Throwable -> L32
            r0.release(r2)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void addCallback(com.bumptech.glide.request.ResourceCallback r3, java.util.concurrent.Executor r4) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r0 = r2.stateVerifier     // Catch: java.lang.Throwable -> L39
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r2.cbs     // Catch: java.lang.Throwable -> L39
            r0.add(r3, r4)     // Catch: java.lang.Throwable -> L39
            boolean r0 = r2.hasResource     // Catch: java.lang.Throwable -> L39
            r1 = 1
            if (r0 == 0) goto L1c
            r2.incrementPendingCallbacks(r1)     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.engine.EngineJob$CallResourceReady r0 = new com.bumptech.glide.load.engine.EngineJob$CallResourceReady     // Catch: java.lang.Throwable -> L39
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L39
            r4.execute(r0)     // Catch: java.lang.Throwable -> L39
            goto L37
        L1c:
            boolean r0 = r2.hasLoadFailed     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L2c
            r2.incrementPendingCallbacks(r1)     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.engine.EngineJob$CallLoadFailed r0 = new com.bumptech.glide.load.engine.EngineJob$CallLoadFailed     // Catch: java.lang.Throwable -> L39
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L39
            r4.execute(r0)     // Catch: java.lang.Throwable -> L39
            goto L37
        L2c:
            boolean r3 = r2.isCancelled     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r3 = "Cannot add callbacks to a cancelled EngineJob"
            com.bumptech.glide.util.Preconditions.checkArgument(r1, r3)     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r2)
            return
        L39:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @androidx.annotation.GuardedBy("this")
    public final void callCallbackOnResourceReady(com.bumptech.glide.request.ResourceCallback r4) {
            r3 = this;
            com.bumptech.glide.load.engine.EngineResource<?> r0 = r3.engineResource     // Catch: java.lang.Throwable -> La
            com.bumptech.glide.load.DataSource r1 = r3.dataSource     // Catch: java.lang.Throwable -> La
            boolean r2 = r3.isLoadedFromAlternateCacheKey     // Catch: java.lang.Throwable -> La
            r4.onResourceReady(r0, r1, r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r4 = move-exception
            com.bumptech.glide.load.engine.CallbackException r0 = new com.bumptech.glide.load.engine.CallbackException
            r0.<init>(r4)
            throw r0
    }

    public final void decrementPendingCallbacks() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.stateVerifier     // Catch: java.lang.Throwable -> L2f
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r3.isDone()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicInteger r0 = r3.pendingCallbacks     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L2f
            if (r0 < 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r2 = "Can't decrement below 0"
            com.bumptech.glide.util.Preconditions.checkArgument(r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L27
            com.bumptech.glide.load.engine.EngineResource<?> r0 = r3.engineResource     // Catch: java.lang.Throwable -> L2f
            r3.release()     // Catch: java.lang.Throwable -> L2f
            goto L28
        L27:
            r0 = 0
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2e
            r0.release()
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @androidx.annotation.NonNull
    public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            return r0
    }

    public final synchronized void incrementPendingCallbacks(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.atomic.AtomicInteger r0 = r2.pendingCallbacks     // Catch: java.lang.Throwable -> L1b
            int r3 = r0.getAndAdd(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L19
            com.bumptech.glide.load.engine.EngineResource<?> r3 = r2.engineResource     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L19
            r3.acquire()     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r2)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @androidx.annotation.VisibleForTesting
    public final synchronized com.bumptech.glide.load.engine.EngineJob<R> init(com.bumptech.glide.load.Key r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r0.key = r1     // Catch: java.lang.Throwable -> Ld
            r0.isCacheable = r2     // Catch: java.lang.Throwable -> Ld
            r0.useUnlimitedSourceGeneratorPool = r3     // Catch: java.lang.Throwable -> Ld
            r0.useAnimationPool = r4     // Catch: java.lang.Throwable -> Ld
            r0.onlyRetrieveFromCache = r5     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r0
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onLoadFailed(com.bumptech.glide.load.engine.GlideException r4) {
            r3 = this;
            monitor-enter(r3)
            r3.exception = r4     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r3)
            com.bumptech.glide.util.pool.StateVerifier r4 = r3.stateVerifier     // Catch: java.lang.Throwable -> L6a
            r4.throwIfRecycled()     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r3.isCancelled     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L13
            r3.release()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            goto L59
        L13:
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r4 = r3.cbs     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L62
            boolean r4 = r3.hasLoadFailed     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L5a
            r4 = 1
            r3.hasLoadFailed = r4     // Catch: java.lang.Throwable -> L6a
            com.bumptech.glide.load.Key r0 = r3.key     // Catch: java.lang.Throwable -> L6a
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r1 = r3.cbs     // Catch: java.lang.Throwable -> L6a
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r1 = r1.copy()     // Catch: java.lang.Throwable -> L6a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L6a
            int r2 = r2 + r4
            r3.incrementPendingCallbacks(r2)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            com.bumptech.glide.load.engine.EngineJobListener r4 = r3.engineJobListener
            r2 = 0
            r4.onEngineJobComplete(r3, r0, r2)
            java.util.Iterator r4 = r1.iterator()
        L3d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.next()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r0 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r0
            java.util.concurrent.Executor r1 = r0.executor
            com.bumptech.glide.load.engine.EngineJob$CallLoadFailed r2 = new com.bumptech.glide.load.engine.EngineJob$CallLoadFailed
            com.bumptech.glide.request.ResourceCallback r0 = r0.cb
            r2.<init>(r3, r0)
            r1.execute(r2)
            goto L3d
        L56:
            r3.decrementPendingCallbacks()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "Already failed once"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            throw r4     // Catch: java.lang.Throwable -> L6a
        L62:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "Received an exception without any callbacks to notify"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            throw r4     // Catch: java.lang.Throwable -> L6a
        L6a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            throw r4
        L6d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            throw r4
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            r2.resource = r3     // Catch: java.lang.Throwable -> L87
            r2.dataSource = r4     // Catch: java.lang.Throwable -> L87
            r2.isLoadedFromAlternateCacheKey = r5     // Catch: java.lang.Throwable -> L87
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r3 = r2.stateVerifier     // Catch: java.lang.Throwable -> L84
            r3.throwIfRecycled()     // Catch: java.lang.Throwable -> L84
            boolean r3 = r2.isCancelled     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L1c
            com.bumptech.glide.load.engine.Resource<?> r3 = r2.resource     // Catch: java.lang.Throwable -> L84
            r3.recycle()     // Catch: java.lang.Throwable -> L84
            r2.release()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            goto L73
        L1c:
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r3 = r2.cbs     // Catch: java.lang.Throwable -> L84
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L7c
            boolean r3 = r2.hasResource     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L74
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r3 = r2.engineResourceFactory     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.Resource<?> r4 = r2.resource     // Catch: java.lang.Throwable -> L84
            boolean r5 = r2.isCacheable     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.Key r0 = r2.key     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r1 = r2.resourceListener     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineResource r3 = r3.build(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L84
            r2.engineResource = r3     // Catch: java.lang.Throwable -> L84
            r3 = 1
            r2.hasResource = r3     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r4 = r2.cbs     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r4 = r4.copy()     // Catch: java.lang.Throwable -> L84
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L84
            int r5 = r5 + r3
            r2.incrementPendingCallbacks(r5)     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.Key r3 = r2.key     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineResource<?> r5 = r2.engineResource     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            com.bumptech.glide.load.engine.EngineJobListener r0 = r2.engineJobListener
            r0.onEngineJobComplete(r2, r3, r5)
            java.util.Iterator r3 = r4.iterator()
        L57:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r3.next()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r4 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r4
            java.util.concurrent.Executor r5 = r4.executor
            com.bumptech.glide.load.engine.EngineJob$CallResourceReady r0 = new com.bumptech.glide.load.engine.EngineJob$CallResourceReady
            com.bumptech.glide.request.ResourceCallback r4 = r4.cb
            r0.<init>(r2, r4)
            r5.execute(r0)
            goto L57
        L70:
            r2.decrementPendingCallbacks()
        L73:
            return
        L74:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "Already have resource"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L7c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "Received a resource without any callbacks to notify"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L84:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            throw r3
        L87:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            throw r3
    }

    public final boolean onlyRetrieveFromCache() {
            r1 = this;
            boolean r0 = r1.onlyRetrieveFromCache
            return r0
    }

    public final synchronized void removeCallback(com.bumptech.glide.request.ResourceCallback r3) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r0 = r2.stateVerifier     // Catch: java.lang.Throwable -> L42
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r2.cbs     // Catch: java.lang.Throwable -> L42
            r0.remove(r3)     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r3 = r2.cbs     // Catch: java.lang.Throwable -> L42
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L40
            boolean r3 = r2.isDone()     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r3 == 0) goto L1b
            goto L29
        L1b:
            r2.isCancelled = r0     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.load.engine.DecodeJob<R> r3 = r2.decodeJob     // Catch: java.lang.Throwable -> L42
            r3.cancel()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.load.engine.EngineJobListener r3 = r2.engineJobListener     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.load.Key r1 = r2.key     // Catch: java.lang.Throwable -> L42
            r3.onEngineJobCancelled(r2, r1)     // Catch: java.lang.Throwable -> L42
        L29:
            boolean r3 = r2.hasResource     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L33
            boolean r3 = r2.hasLoadFailed     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L32
            goto L33
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L40
            java.util.concurrent.atomic.AtomicInteger r3 = r2.pendingCallbacks     // Catch: java.lang.Throwable -> L42
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L40
            r2.release()     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r2)
            return
        L42:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void reschedule(com.bumptech.glide.load.engine.DecodeJob<?> r2) {
            r1 = this;
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.getActiveSourceExecutor()
            r0.execute(r2)
            return
    }

    public synchronized void start(com.bumptech.glide.load.engine.DecodeJob<R> r2) {
            r1 = this;
            monitor-enter(r1)
            r1.decodeJob = r2     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.willDecodeFromCache()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Lc
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.diskCacheExecutor     // Catch: java.lang.Throwable -> L15
            goto L10
        Lc:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.getActiveSourceExecutor()     // Catch: java.lang.Throwable -> L15
        L10:
            r0.execute(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
