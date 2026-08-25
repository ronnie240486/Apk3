package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class LruArrayPool implements com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool {
    private static final int DEFAULT_SIZE = 4194304;
    private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<?>> adapters;
    private int currentSize;
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key, java.lang.Object> groupedMap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.KeyPool keyPool;
    private final int maxSize;
    private final java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> sortedSizes;

    public static final class Key implements com.bumptech.glide.load.engine.bitmap_recycle.Poolable {
        private java.lang.Class<?> arrayClass;
        private final com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.KeyPool pool;
        public int size;

        public Key(com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.KeyPool r1) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key
                r1 = 0
                if (r0 == 0) goto L14
                com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r4 = (com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key) r4
                int r0 = r3.size
                int r2 = r4.size
                if (r0 != r2) goto L14
                java.lang.Class<?> r0 = r3.arrayClass
                java.lang.Class<?> r4 = r4.arrayClass
                if (r0 != r4) goto L14
                r1 = 1
            L14:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.size
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.arrayClass
                if (r1 == 0) goto Ld
                int r1 = r1.hashCode()
                goto Le
            Ld:
                r1 = 0
            Le:
                int r0 = r0 + r1
                return r0
        }

        public final void init(int r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.size = r1
                r0.arrayClass = r2
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = r1.pool
                r0.offer(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Key{size="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r2.size
                r0.append(r1)
                java.lang.String r1 = "array="
                r0.append(r1)
                java.lang.Class<?> r1 = r2.arrayClass
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class KeyPool extends com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool<com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key> {
        public KeyPool() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final com.bumptech.glide.load.engine.bitmap_recycle.Poolable create() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r0 = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key
                r0.<init>(r1)
                return r0
        }

        public final com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key get(int r2, java.lang.Class<?> r3) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r1.get()
                com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key) r0
                r0.init(r2, r3)
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting
    public LruArrayPool() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap
            r0.<init>()
            r1.groupedMap = r0
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.sortedSizes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.adapters = r0
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1.maxSize = r0
            return
    }

    public LruArrayPool(int r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap
            r0.<init>()
            r1.groupedMap = r0
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.sortedSizes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.adapters = r0
            r1.maxSize = r2
            return
    }

    private void decrementArrayOfSize(int r4, java.lang.Class<?> r5) {
            r3 = this;
            java.util.NavigableMap r5 = r3.getSizesForAdapter(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L30
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.remove(r4)
            goto L2f
        L1f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r4, r0)
        L2f:
            return
        L30:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Tried to decrement empty size, size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", this: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    private void evict() {
            r1 = this;
            int r0 = r1.maxSize
            r1.evictToSize(r0)
            return
    }

    private void evictToSize(int r6) {
            r5 = this;
        L0:
            int r0 = r5.currentSize
            if (r0 <= r6) goto L4f
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key, java.lang.Object> r0 = r5.groupedMap
            java.lang.Object r0 = r0.removeLast()
            com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface r1 = r5.getAdapterFromObject(r0)
            int r2 = r5.currentSize
            int r3 = r1.getArrayLength(r0)
            int r4 = r1.getElementSizeInBytes()
            int r3 = r3 * r4
            int r2 = r2 - r3
            r5.currentSize = r2
            int r2 = r1.getArrayLength(r0)
            java.lang.Class r3 = r0.getClass()
            r5.decrementArrayOfSize(r2, r3)
            java.lang.String r2 = r1.getTag()
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L0
            java.lang.String r2 = r1.getTag()
            java.lang.String r3 = "evicted: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r0 = r1.getArrayLength(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r2, r0)
            goto L0
        L4f:
            return
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<T> getAdapterFromObject(T r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface r1 = r0.getAdapterFromType(r1)
            return r1
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<T> getAdapterFromType(java.lang.Class<T> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<?>> r0 = r2.adapters
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface r0 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface) r0
            if (r0 != 0) goto L42
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L18
            com.bumptech.glide.load.engine.bitmap_recycle.IntegerArrayAdapter r0 = new com.bumptech.glide.load.engine.bitmap_recycle.IntegerArrayAdapter
            r0.<init>()
            goto L25
        L18:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2b
            com.bumptech.glide.load.engine.bitmap_recycle.ByteArrayAdapter r0 = new com.bumptech.glide.load.engine.bitmap_recycle.ByteArrayAdapter
            r0.<init>()
        L25:
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<?>> r1 = r2.adapters
            r1.put(r3, r0)
            goto L42
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No array pool found for: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L42:
            return r0
    }

    @androidx.annotation.Nullable
    private <T> T getArrayForKey(com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key, java.lang.Object> r0 = r1.groupedMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    private <T> T getForKey(com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key r6, java.lang.Class<T> r7) {
            r5 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface r0 = r5.getAdapterFromType(r7)
            java.lang.Object r1 = r5.getArrayForKey(r6)
            if (r1 == 0) goto L20
            int r2 = r5.currentSize
            int r3 = r0.getArrayLength(r1)
            int r4 = r0.getElementSizeInBytes()
            int r3 = r3 * r4
            int r2 = r2 - r3
            r5.currentSize = r2
            int r2 = r0.getArrayLength(r1)
            r5.decrementArrayOfSize(r2, r7)
        L20:
            if (r1 != 0) goto L4e
            java.lang.String r7 = r0.getTag()
            r1 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L48
            java.lang.String r7 = r0.getTag()
            java.lang.String r1 = "Allocated "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r6.size
            r1.append(r2)
            java.lang.String r2 = " bytes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r7, r1)
        L48:
            int r6 = r6.size
            java.lang.Object r1 = r0.newArray(r6)
        L4e:
            return r1
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> getSizesForAdapter(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.sortedSizes
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.sortedSizes
            r1.put(r3, r0)
        L14:
            return r0
    }

    private boolean isNoMoreThanHalfFull() {
            r2 = this;
            int r0 = r2.currentSize
            if (r0 == 0) goto Ld
            int r1 = r2.maxSize
            int r1 = r1 / r0
            r0 = 2
            if (r1 < r0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private boolean isSmallEnoughForReuse(int r2) {
            r1 = this;
            int r0 = r1.maxSize
            int r0 = r0 / 2
            if (r2 > r0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    private boolean mayFillRequest(int r2, java.lang.Integer r3) {
            r1 = this;
            if (r3 == 0) goto L12
            boolean r0 = r1.isNoMoreThanHalfFull()
            if (r0 != 0) goto L10
            int r3 = r3.intValue()
            int r2 = r2 * 8
            if (r3 > r2) goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.evictToSize(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int r3, java.lang.Class<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.NavigableMap r0 = r2.getSizesForAdapter(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r2.mayFillRequest(r3, r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L20
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r3 = r2.keyPool     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r3 = r3.get(r0, r4)     // Catch: java.lang.Throwable -> L2c
            goto L26
        L20:
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = r2.keyPool     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r3 = r0.get(r3, r4)     // Catch: java.lang.Throwable -> L2c
        L26:
            java.lang.Object r3 = r2.getForKey(r3, r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r3
        L2c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int r2, java.lang.Class<T> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = r1.keyPool     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r2 = r0.get(r2, r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r1.getForKey(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface r1 = r4.getAdapterFromType(r0)     // Catch: java.lang.Throwable -> L56
            int r2 = r1.getArrayLength(r5)     // Catch: java.lang.Throwable -> L56
            int r1 = r1.getElementSizeInBytes()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 * r2
            boolean r3 = r4.isSmallEnoughForReuse(r1)     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L1b
            monitor-exit(r4)
            return
        L1b:
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r3 = r4.keyPool     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r2 = r3.get(r2, r0)     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key, java.lang.Object> r3 = r4.groupedMap     // Catch: java.lang.Throwable -> L56
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L56
            java.util.NavigableMap r5 = r4.getSizesForAdapter(r0)     // Catch: java.lang.Throwable -> L56
            int r0 = r2.size     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L56
            int r2 = r2.size     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r3 = 1
            if (r0 != 0) goto L40
            goto L45
        L40:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + r0
        L45:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L56
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L56
            int r5 = r4.currentSize     // Catch: java.lang.Throwable -> L56
            int r5 = r5 + r1
            r4.currentSize = r5     // Catch: java.lang.Throwable -> L56
            r4.evict()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)
            return
        L56:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @java.lang.Deprecated
    public <T> void put(T r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.put(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void trimMemory(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto Lb
            r1.clearMemory()     // Catch: java.lang.Throwable -> L9
            goto L1a
        L9:
            r2 = move-exception
            goto L1c
        Lb:
            r0 = 20
            if (r2 >= r0) goto L13
            r0 = 15
            if (r2 != r0) goto L1a
        L13:
            int r2 = r1.maxSize     // Catch: java.lang.Throwable -> L9
            int r2 = r2 / 2
            r1.evictToSize(r2)     // Catch: java.lang.Throwable -> L9
        L1a:
            monitor-exit(r1)
            return
        L1c:
            monitor-exit(r1)
            throw r2
    }
}
