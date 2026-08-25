package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes2.dex */
public class ModelToResourceClassCache {
    private final androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> registeredResourceClassCache;
    private final java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> resourceClassKeyRef;

    public ModelToResourceClassCache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.resourceClassKeyRef = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.registeredResourceClassCache = r0
            return
    }

    public void clear() {
            r2 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r0 = r2.registeredResourceClassCache
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r1 = r2.registeredResourceClassCache     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @androidx.annotation.Nullable
    public java.util.List<java.lang.Class<?>> get(@androidx.annotation.NonNull java.lang.Class<?> r3, @androidx.annotation.NonNull java.lang.Class<?> r4, @androidx.annotation.NonNull java.lang.Class<?> r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> r0 = r2.resourceClassKeyRef
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.bumptech.glide.util.MultiClassKey r0 = (com.bumptech.glide.util.MultiClassKey) r0
            if (r0 != 0) goto L11
            com.bumptech.glide.util.MultiClassKey r0 = new com.bumptech.glide.util.MultiClassKey
            r0.<init>(r3, r4, r5)
            goto L14
        L11:
            r0.set(r3, r4, r5)
        L14:
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r3 = r2.registeredResourceClassCache
            monitor-enter(r3)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r4 = r2.registeredResourceClassCache     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L26
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.MultiClassKey> r3 = r2.resourceClassKeyRef
            r3.set(r0)
            return r4
        L26:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public void put(@androidx.annotation.NonNull java.lang.Class<?> r4, @androidx.annotation.NonNull java.lang.Class<?> r5, @androidx.annotation.NonNull java.lang.Class<?> r6, @androidx.annotation.NonNull java.util.List<java.lang.Class<?>> r7) {
            r3 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r0 = r3.registeredResourceClassCache
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.MultiClassKey, java.util.List<java.lang.Class<?>>> r1 = r3.registeredResourceClassCache     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.util.MultiClassKey r2 = new com.bumptech.glide.util.MultiClassKey     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> Lf
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }
}
