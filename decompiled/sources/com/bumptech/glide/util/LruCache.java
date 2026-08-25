package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<T, Y> {
    private final java.util.Map<T, com.bumptech.glide.util.LruCache.Entry<Y>> cache;
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    public static final class Entry<Y> {
        public final int size;
        public final Y value;

        public Entry(Y r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.size = r2
                return
        }
    }

    public LruCache(long r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 100
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r4.cache = r0
            r4.initialMaxSize = r5
            r4.maxSize = r5
            return
    }

    private void evict() {
            r2 = this;
            long r0 = r2.maxSize
            r2.trimToSize(r0)
            return
    }

    public void clearMemory() {
            r2 = this;
            r0 = 0
            r2.trimToSize(r0)
            return
    }

    public synchronized boolean contains(@androidx.annotation.NonNull T r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r1.cache     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.Nullable
    public synchronized Y get(@androidx.annotation.NonNull T r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r1.cache     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.util.LruCache$Entry r2 = (com.bumptech.glide.util.LruCache.Entry) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Le
            Y r2 = r2.value     // Catch: java.lang.Throwable -> L11
            goto Lf
        Le:
            r2 = 0
        Lf:
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized long getCurrentSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.currentSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public int getSize(@androidx.annotation.Nullable Y r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void onItemEvicted(@androidx.annotation.NonNull T r1, @androidx.annotation.Nullable Y r2) {
            r0 = this;
            return
    }

    @androidx.annotation.Nullable
    public synchronized Y put(@androidx.annotation.NonNull T r8, @androidx.annotation.Nullable Y r9) {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.getSize(r9)     // Catch: java.lang.Throwable -> L4a
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L4a
            long r3 = r7.maxSize     // Catch: java.lang.Throwable -> L4a
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L12
            r7.onItemEvicted(r8, r9)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r7)
            return r5
        L12:
            if (r9 == 0) goto L19
            long r3 = r7.currentSize     // Catch: java.lang.Throwable -> L4a
            long r3 = r3 + r1
            r7.currentSize = r3     // Catch: java.lang.Throwable -> L4a
        L19:
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r1 = r7.cache     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L1f
            r2 = r5
            goto L24
        L1f:
            com.bumptech.glide.util.LruCache$Entry r2 = new com.bumptech.glide.util.LruCache$Entry     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L4a
        L24:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.util.LruCache$Entry r0 = (com.bumptech.glide.util.LruCache.Entry) r0     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L41
            long r1 = r7.currentSize     // Catch: java.lang.Throwable -> L4a
            int r3 = r0.size     // Catch: java.lang.Throwable -> L4a
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4a
            long r1 = r1 - r3
            r7.currentSize = r1     // Catch: java.lang.Throwable -> L4a
            Y r1 = r0.value     // Catch: java.lang.Throwable -> L4a
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L41
            Y r9 = r0.value     // Catch: java.lang.Throwable -> L4a
            r7.onItemEvicted(r8, r9)     // Catch: java.lang.Throwable -> L4a
        L41:
            r7.evict()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L48
            Y r5 = r0.value     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r7)
            return r5
        L4a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @androidx.annotation.Nullable
    public synchronized Y remove(@androidx.annotation.NonNull T r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r4.cache     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r0.remove(r5)     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.util.LruCache$Entry r5 = (com.bumptech.glide.util.LruCache.Entry) r5     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto Le
            r5 = 0
            monitor-exit(r4)
            return r5
        Le:
            long r0 = r4.currentSize     // Catch: java.lang.Throwable -> L1a
            int r2 = r5.size     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            long r0 = r0 - r2
            r4.currentSize = r0     // Catch: java.lang.Throwable -> L1a
            Y r5 = r5.value     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void setSizeMultiplier(float r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L19
            long r0 = r2.initialMaxSize     // Catch: java.lang.Throwable -> L17
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L17
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L17
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L17
            r2.maxSize = r0     // Catch: java.lang.Throwable -> L17
            r2.evict()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        L17:
            r3 = move-exception
            goto L21
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Multiplier must be >= 0"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L21:
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void trimToSize(long r8) {
            r7 = this;
            monitor-enter(r7)
        L1:
            long r0 = r7.currentSize     // Catch: java.lang.Throwable -> L34
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L32
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r7.cache     // Catch: java.lang.Throwable -> L34
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L34
            com.bumptech.glide.util.LruCache$Entry r2 = (com.bumptech.glide.util.LruCache.Entry) r2     // Catch: java.lang.Throwable -> L34
            long r3 = r7.currentSize     // Catch: java.lang.Throwable -> L34
            int r5 = r2.size     // Catch: java.lang.Throwable -> L34
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L34
            long r3 = r3 - r5
            r7.currentSize = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L34
            r0.remove()     // Catch: java.lang.Throwable -> L34
            Y r0 = r2.value     // Catch: java.lang.Throwable -> L34
            r7.onItemEvicted(r1, r0)     // Catch: java.lang.Throwable -> L34
            goto L1
        L32:
            monitor-exit(r7)
            return
        L34:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
