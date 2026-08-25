package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes2.dex */
public class LoadPathCache {
    private static final com.bumptech.glide.load.engine.LoadPath<?, ?, ?> NO_PATHS_SIGNAL = null;
    private final androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, com.bumptech.glide.load.engine.LoadPath<?, ?, ?>> cache;
    private final java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> keyRef;

    static {
            com.bumptech.glide.load.engine.LoadPath r6 = new com.bumptech.glide.load.engine.LoadPath
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            com.bumptech.glide.load.engine.DecodePath r0 = new com.bumptech.glide.load.engine.DecodePath
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            java.util.List r11 = java.util.Collections.emptyList()
            com.bumptech.glide.load.resource.transcode.UnitTranscoder r12 = new com.bumptech.glide.load.resource.transcode.UnitTranscoder
            r12.<init>()
            r13 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.List r4 = java.util.Collections.singletonList(r0)
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.bumptech.glide.provider.LoadPathCache.NO_PATHS_SIGNAL = r6
            return
    }

    public LoadPathCache() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.cache = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.keyRef = r0
            return
    }

    private com.bumptech.glide.util.MultiClassKey getKey(java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> r0 = r2.keyRef
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.bumptech.glide.util.MultiClassKey r0 = (com.bumptech.glide.util.MultiClassKey) r0
            if (r0 != 0) goto L10
            com.bumptech.glide.util.MultiClassKey r0 = new com.bumptech.glide.util.MultiClassKey
            r0.<init>()
        L10:
            r0.set(r3, r4, r5)
            return r0
    }

    @androidx.annotation.Nullable
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.LoadPath<Data, TResource, Transcode> get(java.lang.Class<Data> r1, java.lang.Class<TResource> r2, java.lang.Class<Transcode> r3) {
            r0 = this;
            com.bumptech.glide.util.MultiClassKey r1 = r0.getKey(r1, r2, r3)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, com.bumptech.glide.load.engine.LoadPath<?, ?, ?>> r2 = r0.cache
            monitor-enter(r2)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, com.bumptech.glide.load.engine.LoadPath<?, ?, ?>> r3 = r0.cache     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L16
            com.bumptech.glide.load.engine.LoadPath r3 = (com.bumptech.glide.load.engine.LoadPath) r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> r2 = r0.keyRef
            r2.set(r1)
            return r3
        L16:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public boolean isEmptyLoadPath(@androidx.annotation.Nullable com.bumptech.glide.load.engine.LoadPath<?, ?, ?> r2) {
            r1 = this;
            com.bumptech.glide.load.engine.LoadPath<?, ?, ?> r0 = com.bumptech.glide.provider.LoadPathCache.NO_PATHS_SIGNAL
            boolean r2 = r0.equals(r2)
            return r2
    }

    public void put(java.lang.Class<?> r4, java.lang.Class<?> r5, java.lang.Class<?> r6, @androidx.annotation.Nullable com.bumptech.glide.load.engine.LoadPath<?, ?, ?> r7) {
            r3 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, com.bumptech.glide.load.engine.LoadPath<?, ?, ?>> r0 = r3.cache
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, com.bumptech.glide.load.engine.LoadPath<?, ?, ?>> r1 = r3.cache     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.util.MultiClassKey r2 = new com.bumptech.glide.util.MultiClassKey     // Catch: java.lang.Throwable -> L14
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto Ld
            goto Lf
        Ld:
            com.bumptech.glide.load.engine.LoadPath<?, ?, ?> r7 = com.bumptech.glide.provider.LoadPathCache.NO_PATHS_SIGNAL     // Catch: java.lang.Throwable -> L14
        Lf:
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }
}
