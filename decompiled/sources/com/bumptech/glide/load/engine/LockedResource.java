package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class LockedResource<Z> implements com.bumptech.glide.load.engine.Resource<Z>, com.bumptech.glide.util.pool.FactoryPools.Poolable {
    private static final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.LockedResource<?>> POOL = null;
    private boolean isLocked;
    private boolean isRecycled;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private com.bumptech.glide.load.engine.Resource<Z> toWrap;


    static {
            com.bumptech.glide.load.engine.LockedResource$1 r0 = new com.bumptech.glide.load.engine.LockedResource$1
            r0.<init>()
            r1 = 20
            androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
            com.bumptech.glide.load.engine.LockedResource.POOL = r0
            return
    }

    public LockedResource() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.pool.StateVerifier r0 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r1.stateVerifier = r0
            return
    }

    private void init(com.bumptech.glide.load.engine.Resource<Z> r2) {
            r1 = this;
            r0 = 0
            r1.isRecycled = r0
            r0 = 1
            r1.isLocked = r0
            r1.toWrap = r2
            return
    }

    @androidx.annotation.NonNull
    public static <Z> com.bumptech.glide.load.engine.LockedResource<Z> obtain(com.bumptech.glide.load.engine.Resource<Z> r1) {
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.LockedResource<?>> r0 = com.bumptech.glide.load.engine.LockedResource.POOL
            java.lang.Object r0 = r0.acquire()
            com.bumptech.glide.load.engine.LockedResource r0 = (com.bumptech.glide.load.engine.LockedResource) r0
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.engine.LockedResource r0 = (com.bumptech.glide.load.engine.LockedResource) r0
            r0.init(r1)
            return r0
    }

    private void release() {
            r1 = this;
            r0 = 0
            r1.toWrap = r0
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.LockedResource<?>> r0 = com.bumptech.glide.load.engine.LockedResource.POOL
            r0.release(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public Z get() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<Z> getResourceClass() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            java.lang.Class r0 = r0.getResourceClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @androidx.annotation.NonNull
    public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier     // Catch: java.lang.Throwable -> L17
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L17
            r0 = 1
            r1.isRecycled = r0     // Catch: java.lang.Throwable -> L17
            boolean r0 = r1.isLocked     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            com.bumptech.glide.load.engine.Resource<Z> r0 = r1.toWrap     // Catch: java.lang.Throwable -> L17
            r0.recycle()     // Catch: java.lang.Throwable -> L17
            r1.release()     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void unlock() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r0 = r2.stateVerifier     // Catch: java.lang.Throwable -> L1e
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2.isLocked     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L16
            r0 = 0
            r2.isLocked = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2.isRecycled     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L14
            r2.recycle()     // Catch: java.lang.Throwable -> L1e
        L14:
            monitor-exit(r2)
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Already unlocked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
