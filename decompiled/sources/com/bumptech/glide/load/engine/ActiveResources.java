package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes3.dex */
final class ActiveResources {

    @androidx.annotation.VisibleForTesting
    public final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference> activeEngineResources;

    @androidx.annotation.Nullable
    private volatile com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback cb;
    private final boolean isActiveResourceRetentionAllowed;
    private volatile boolean isShutdown;
    private com.bumptech.glide.load.engine.EngineResource.ResourceListener listener;
    private final java.util.concurrent.Executor monitorClearedResourcesExecutor;
    private final java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> resourceReferenceQueue;



    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public interface DequeuedResourceCallback {
        void onResourceDequeued();
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static final class ResourceWeakReference extends java.lang.ref.WeakReference<com.bumptech.glide.load.engine.EngineResource<?>> {
        public final boolean isCacheable;
        public final com.bumptech.glide.load.Key key;

        @androidx.annotation.Nullable
        public com.bumptech.glide.load.engine.Resource<?> resource;

        public ResourceWeakReference(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.EngineResource<?> r2, @androidx.annotation.NonNull java.lang.ref.ReferenceQueue<? super com.bumptech.glide.load.engine.EngineResource<?>> r3, boolean r4) {
                r0 = this;
                r0.<init>(r2, r3)
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.Key r1 = (com.bumptech.glide.load.Key) r1
                r0.key = r1
                boolean r1 = r2.isMemoryCacheable()
                if (r1 == 0) goto L1e
                if (r4 == 0) goto L1e
                com.bumptech.glide.load.engine.Resource r1 = r2.getResource()
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                r0.resource = r1
                boolean r1 = r2.isMemoryCacheable()
                r0.isCacheable = r1
                return
        }
    }

    public ActiveResources(boolean r3) {
            r2 = this;
            com.bumptech.glide.load.engine.ActiveResources$1 r0 = new com.bumptech.glide.load.engine.ActiveResources$1
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r2.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.activeEngineResources = r1
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r1.<init>()
            r2.resourceReferenceQueue = r1
            r2.isActiveResourceRetentionAllowed = r3
            r2.monitorClearedResourcesExecutor = r0
            com.bumptech.glide.load.engine.ActiveResources$2 r3 = new com.bumptech.glide.load.engine.ActiveResources$2
            r3.<init>(r2)
            r0.execute(r3)
            return
    }

    public final synchronized void activate(com.bumptech.glide.load.Key r4, com.bumptech.glide.load.engine.EngineResource<?> r5) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r0 = new com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference     // Catch: java.lang.Throwable -> L1c
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> r1 = r3.resourceReferenceQueue     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r3.isActiveResourceRetentionAllowed     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r5 = r3.activeEngineResources     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r5.put(r4, r0)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r4 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r4     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1a
            r5 = 0
            r4.resource = r5     // Catch: java.lang.Throwable -> L1c
            r4.clear()     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void cleanReferenceQueue() {
            r1 = this;
        L0:
            boolean r0 = r1.isShutdown
            if (r0 != 0) goto L1f
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> r0 = r1.resourceReferenceQueue     // Catch: java.lang.InterruptedException -> L17
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r0 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r0     // Catch: java.lang.InterruptedException -> L17
            r1.cleanupActiveReference(r0)     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.ActiveResources$DequeuedResourceCallback r0 = r1.cb     // Catch: java.lang.InterruptedException -> L17
            if (r0 == 0) goto L0
            r0.onResourceDequeued()     // Catch: java.lang.InterruptedException -> L17
            goto L0
        L17:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L0
        L1f:
            return
    }

    public final void cleanupActiveReference(@androidx.annotation.NonNull com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference r8) {
            r7 = this;
            monitor-enter(r7)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r0 = r7.activeEngineResources     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.load.Key r1 = r8.key     // Catch: java.lang.Throwable -> L28
            r0.remove(r1)     // Catch: java.lang.Throwable -> L28
            boolean r0 = r8.isCacheable     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L26
            com.bumptech.glide.load.engine.Resource<?> r2 = r8.resource     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L11
            goto L26
        L11:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.load.engine.EngineResource r0 = new com.bumptech.glide.load.engine.EngineResource
            r3 = 1
            r4 = 0
            com.bumptech.glide.load.Key r5 = r8.key
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r6 = r7.listener
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r1 = r7.listener
            com.bumptech.glide.load.Key r8 = r8.key
            r1.onResourceReleased(r8, r0)
            return
        L26:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            throw r8
    }

    public final void setListener(com.bumptech.glide.load.engine.EngineResource.ResourceListener r2) {
            r1 = this;
            monitor-enter(r2)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La
            r1.listener = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0     // Catch: java.lang.Throwable -> La
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    public final void shutdown() {
            r2 = this;
            r0 = 1
            r2.isShutdown = r0
            java.util.concurrent.Executor r0 = r2.monitorClearedResourcesExecutor
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Le
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
        Le:
            return
    }
}
