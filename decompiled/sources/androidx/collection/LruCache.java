package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final java.util.LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.maxSize = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r4.<init>(r0, r1, r2)
            r3.map = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    private int safeSizeOf(K r1, V r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    public final synchronized int createCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.createCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final synchronized int evictionCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.evictionCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public final V get(@androidx.annotation.NonNull K r2) {
            r1 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r2, r0)
            monitor-enter(r1)
            java.util.LinkedHashMap<K, V> r0 = r1.map     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L16
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L1f
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return r2
        L16:
            int r2 = r1.missCount     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 + 1
            r1.missCount = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            return r2
        L1f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int maxSize() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int missCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.missCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public final V put(@androidx.annotation.NonNull K r3, @androidx.annotation.NonNull V r4) {
            r2 = this;
            if (r3 == 0) goto L2f
            if (r4 == 0) goto L2f
            monitor-enter(r2)
            int r0 = r2.putCount     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + 1
            r2.putCount = r0     // Catch: java.lang.Throwable -> L2c
            int r0 = r2.size     // Catch: java.lang.Throwable -> L2c
            int r1 = r2.safeSizeOf(r3, r4)     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + r1
            r2.size = r0     // Catch: java.lang.Throwable -> L2c
            java.util.LinkedHashMap<K, V> r0 = r2.map     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L25
            int r0 = r2.size     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.safeSizeOf(r3, r4)     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 - r3
            r2.size = r0     // Catch: java.lang.Throwable -> L2c
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.maxSize
            r2.trimToSize(r3)
            return r4
        L2c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r3
        L2f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
    }

    public final synchronized int putCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.putCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public final V remove(@androidx.annotation.NonNull K r3) {
            r2 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r3, r0)
            monitor-enter(r2)
            java.util.LinkedHashMap<K, V> r0 = r2.map     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L17
            int r1 = r2.size     // Catch: java.lang.Throwable -> L19
            int r3 = r2.safeSizeOf(r3, r0)     // Catch: java.lang.Throwable -> L19
            int r1 = r1 - r3
            r2.size = r1     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public void resize(int r2) {
            r1 = this;
            if (r2 <= 0) goto Ld
            monitor-enter(r1)
            r1.maxSize = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            r1.trimToSize(r2)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r2.<init>(r0)
            throw r2
    }

    public final synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.util.Map<K, V> snapshot() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap<K, V> r1 = r2.map     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.hitCount     // Catch: java.lang.Throwable -> L3c
            int r1 = r6.missCount     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r0
            r2 = 0
            if (r1 == 0) goto Ld
            int r0 = r0 * 100
            int r0 = r0 / r1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            int r5 = r6.maxSize     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            int r5 = r6.hitCount     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 2
            int r5 = r6.missCount     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = java.lang.String.format(r1, r3, r4)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)
            return r0
        L3c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public void trimToSize(int r4) {
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.size     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.size     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.size     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.map     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.size     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.safeSizeOf(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.size = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.evictionCount     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.evictionCount = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            throw r4
    }
}
