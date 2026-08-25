package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public class SafeKeyGenerator {
    private final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.cache.SafeKeyGenerator.PoolableDigestContainer> digestPool;
    private final com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, java.lang.String> loadIdToSafeHash;


    public static final class PoolableDigestContainer implements com.bumptech.glide.util.pool.FactoryPools.Poolable {
        public final java.security.MessageDigest messageDigest;
        private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;

        public PoolableDigestContainer(java.security.MessageDigest r2) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.util.pool.StateVerifier r0 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
                r1.stateVerifier = r0
                r1.messageDigest = r2
                return
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        @androidx.annotation.NonNull
        public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
                r1 = this;
                com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
                return r0
        }
    }

    public SafeKeyGenerator() {
            r3 = this;
            r3.<init>()
            com.bumptech.glide.util.LruCache r0 = new com.bumptech.glide.util.LruCache
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            r3.loadIdToSafeHash = r0
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator$1 r0 = new com.bumptech.glide.load.engine.cache.SafeKeyGenerator$1
            r0.<init>()
            r1 = 10
            androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
            r3.digestPool = r0
            return
    }

    private java.lang.String calculateHexStringDigest(com.bumptech.glide.load.Key r3) {
            r2 = this;
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer> r0 = r2.digestPool
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer r0 = (com.bumptech.glide.load.engine.cache.SafeKeyGenerator.PoolableDigestContainer) r0
            java.security.MessageDigest r1 = r0.messageDigest     // Catch: java.lang.Throwable -> L21
            r3.updateDiskCacheKey(r1)     // Catch: java.lang.Throwable -> L21
            java.security.MessageDigest r3 = r0.messageDigest     // Catch: java.lang.Throwable -> L21
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = com.bumptech.glide.util.Util.sha256BytesToHex(r3)     // Catch: java.lang.Throwable -> L21
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer> r1 = r2.digestPool
            r1.release(r0)
            return r3
        L21:
            r3 = move-exception
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer> r1 = r2.digestPool
            r1.release(r0)
            throw r3
    }

    public java.lang.String getSafeKey(com.bumptech.glide.load.Key r4) {
            r3 = this;
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, java.lang.String> r0 = r3.loadIdToSafeHash
            monitor-enter(r0)
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, java.lang.String> r1 = r3.loadIdToSafeHash     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L12
            java.lang.String r1 = r3.calculateHexStringDigest(r4)
        L12:
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, java.lang.String> r2 = r3.loadIdToSafeHash
            monitor-enter(r2)
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, java.lang.String> r0 = r3.loadIdToSafeHash     // Catch: java.lang.Throwable -> L1c
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r4
        L1f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }
}
