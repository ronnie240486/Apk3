package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final com.bumptech.glide.util.pool.FactoryPools.Resetter<java.lang.Object> EMPTY_RESETTER = null;
    private static final java.lang.String TAG = "FactoryPools";




    public interface Factory<T> {
        T create();
    }

    public static final class FactoryPool<T> implements androidx.core.util.Pools.Pool<T> {
        private final com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory;
        private final androidx.core.util.Pools.Pool<T> pool;
        private final com.bumptech.glide.util.pool.FactoryPools.Resetter<T> resetter;

        public FactoryPool(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Resetter<T> r3) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                r0.factory = r2
                r0.resetter = r3
                return
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
                r4 = this;
                androidx.core.util.Pools$Pool<T> r0 = r4.pool
                java.lang.Object r0 = r0.acquire()
                if (r0 != 0) goto L2b
                com.bumptech.glide.util.pool.FactoryPools$Factory<T> r0 = r4.factory
                java.lang.Object r0 = r0.create()
                r1 = 2
                java.lang.String r2 = "FactoryPools"
                boolean r1 = android.util.Log.isLoggable(r2, r1)
                if (r1 == 0) goto L2b
                java.lang.String r1 = "Created new "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.Class r3 = r0.getClass()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.v(r2, r1)
            L2b:
                boolean r1 = r0 instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable
                if (r1 == 0) goto L3a
                r1 = r0
                com.bumptech.glide.util.pool.FactoryPools$Poolable r1 = (com.bumptech.glide.util.pool.FactoryPools.Poolable) r1
                com.bumptech.glide.util.pool.StateVerifier r1 = r1.getVerifier()
                r2 = 0
                r1.setRecycled(r2)
            L3a:
                return r0
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@androidx.annotation.NonNull T r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable
                if (r0 == 0) goto Lf
                r0 = r3
                com.bumptech.glide.util.pool.FactoryPools$Poolable r0 = (com.bumptech.glide.util.pool.FactoryPools.Poolable) r0
                com.bumptech.glide.util.pool.StateVerifier r0 = r0.getVerifier()
                r1 = 1
                r0.setRecycled(r1)
            Lf:
                com.bumptech.glide.util.pool.FactoryPools$Resetter<T> r0 = r2.resetter
                r0.reset(r3)
                androidx.core.util.Pools$Pool<T> r0 = r2.pool
                boolean r3 = r0.release(r3)
                return r3
        }
    }

    public interface Poolable {
        @androidx.annotation.NonNull
        com.bumptech.glide.util.pool.StateVerifier getVerifier();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Resetter<T> {
        void reset(@androidx.annotation.NonNull T r1);
    }

    static {
            com.bumptech.glide.util.pool.FactoryPools$1 r0 = new com.bumptech.glide.util.pool.FactoryPools$1
            r0.<init>()
            com.bumptech.glide.util.pool.FactoryPools.EMPTY_RESETTER = r0
            return
    }

    private FactoryPools() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> build(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            com.bumptech.glide.util.pool.FactoryPools$Resetter r0 = emptyResetter()
            androidx.core.util.Pools$Pool r1 = build(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static <T> androidx.core.util.Pools.Pool<T> build(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Resetter<T> r3) {
            com.bumptech.glide.util.pool.FactoryPools$FactoryPool r0 = new com.bumptech.glide.util.pool.FactoryPools$FactoryPool
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static <T> com.bumptech.glide.util.pool.FactoryPools.Resetter<T> emptyResetter() {
            com.bumptech.glide.util.pool.FactoryPools$Resetter<java.lang.Object> r0 = com.bumptech.glide.util.pool.FactoryPools.EMPTY_RESETTER
            return r0
    }

    @androidx.annotation.NonNull
    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> simple(int r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r0.<init>(r1)
            androidx.core.util.Pools$Pool r1 = build(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> threadSafe(int r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.FactoryPools.Factory<T> r2) {
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r0.<init>(r1)
            androidx.core.util.Pools$Pool r1 = build(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> threadSafeList() {
            r0 = 20
            androidx.core.util.Pools$Pool r0 = threadSafeList(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> threadSafeList(int r2) {
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r0.<init>(r2)
            com.bumptech.glide.util.pool.FactoryPools$2 r2 = new com.bumptech.glide.util.pool.FactoryPools$2
            r2.<init>()
            com.bumptech.glide.util.pool.FactoryPools$3 r1 = new com.bumptech.glide.util.pool.FactoryPools$3
            r1.<init>()
            androidx.core.util.Pools$Pool r2 = build(r0, r2, r1)
            return r2
    }
}
