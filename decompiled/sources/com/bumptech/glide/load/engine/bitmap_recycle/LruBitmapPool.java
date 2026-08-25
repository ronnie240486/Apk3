package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes3.dex */
public class LruBitmapPool implements com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool {
    private static final android.graphics.Bitmap.Config DEFAULT_CONFIG = null;
    private static final java.lang.String TAG = "LruBitmapPool";
    private final java.util.Set<android.graphics.Bitmap.Config> allowedConfigs;
    private long currentSize;
    private int evictions;
    private int hits;
    private final long initialMaxSize;
    private long maxSize;
    private int misses;
    private int puts;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy strategy;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker tracker;

    /* JADX INFO: loaded from: classes.dex */
    public interface BitmapTracker {
        void add(android.graphics.Bitmap r1);

        void remove(android.graphics.Bitmap r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class NullBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        public NullBitmapTracker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ThrowingBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        private final java.util.Set<android.graphics.Bitmap> bitmaps;

        private ThrowingBitmapTracker() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
                r1.bitmaps = r0
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap r4) {
                r3 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r3.bitmaps
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r3.bitmaps
                r0.add(r4)
                return
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Can't add already added bitmap: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " ["
                r1.append(r2)
                int r2 = r4.getWidth()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r4 = r4.getHeight()
                r1.append(r4)
                java.lang.String r4 = "]"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap r2) {
                r1 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r1.bitmaps
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r1.bitmaps
                r0.remove(r2)
                return
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot remove bitmap not in tracker"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG = r0
            return
    }

    public LruBitmapPool(long r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = getDefaultStrategy()
            java.util.Set r1 = getDefaultAllowedConfigs()
            r2.<init>()
            r2.initialMaxSize = r3
            r2.maxSize = r3
            r2.strategy = r0
            r2.allowedConfigs = r1
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker r3 = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker
            r3.<init>()
            r2.tracker = r3
            return
    }

    public LruBitmapPool(long r2, java.util.Set<android.graphics.Bitmap.Config> r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = getDefaultStrategy()
            r1.<init>()
            r1.initialMaxSize = r2
            r1.maxSize = r2
            r1.strategy = r0
            r1.allowedConfigs = r4
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker r2 = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker
            r2.<init>()
            r1.tracker = r2
            return
    }

    @android.annotation.TargetApi(26)
    private static void assertNotHardwareConfig(android.graphics.Bitmap.Config r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L7
            return
        L7:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            if (r3 == r0) goto Lc
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create a mutable Bitmap with config: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap createBitmap(int r0, int r1, @androidx.annotation.Nullable android.graphics.Bitmap.Config r2) {
            if (r2 == 0) goto L3
            goto L5
        L3:
            android.graphics.Bitmap$Config r2 = com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    private void dump() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Lc
            r2.dumpUnchecked()
        Lc:
            return
    }

    private void dumpUnchecked() {
            r3 = this;
            java.lang.String r0 = "Hits="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.hits
            r0.append(r1)
            java.lang.String r1 = ", misses="
            r0.append(r1)
            int r1 = r3.misses
            r0.append(r1)
            java.lang.String r1 = ", puts="
            r0.append(r1)
            int r1 = r3.puts
            r0.append(r1)
            java.lang.String r1 = ", evictions="
            r0.append(r1)
            int r1 = r3.evictions
            r0.append(r1)
            java.lang.String r1 = ", currentSize="
            r0.append(r1)
            long r1 = r3.currentSize
            r0.append(r1)
            java.lang.String r1 = ", maxSize="
            r0.append(r1)
            long r1 = r3.maxSize
            r0.append(r1)
            java.lang.String r1 = "\nStrategy="
            r0.append(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r1 = r3.strategy
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LruBitmapPool"
            android.util.Log.v(r1, r0)
            return
    }

    private void evict() {
            r2 = this;
            long r0 = r2.maxSize
            r2.trimToSize(r0)
            return
    }

    @android.annotation.TargetApi(26)
    private static java.util.Set<android.graphics.Bitmap.Config> getDefaultAllowedConfigs() {
            java.util.HashSet r0 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r1 = android.graphics.Bitmap.Config.values()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r0.add(r2)
            r2 = 26
            if (r1 < r2) goto L1c
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            r0.remove(r1)
        L1c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    private static com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy getDefaultStrategy() {
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    private synchronized android.graphics.Bitmap getDirtyOrNull(int r6, int r7, @androidx.annotation.Nullable android.graphics.Bitmap.Config r8) {
            r5 = this;
            monitor-enter(r5)
            assertNotHardwareConfig(r8)     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r5.strategy     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto La
            r1 = r8
            goto Lc
        La:
            android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG     // Catch: java.lang.Throwable -> L82
        Lc:
            android.graphics.Bitmap r0 = r0.get(r6, r7, r1)     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L3e
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L37
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Missing bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r3.logBitmap(r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            r2.append(r3)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L82
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L82
        L37:
            int r1 = r5.misses     // Catch: java.lang.Throwable -> L82
            int r1 = r1 + 1
            r5.misses = r1     // Catch: java.lang.Throwable -> L82
            goto L58
        L3e:
            int r1 = r5.hits     // Catch: java.lang.Throwable -> L82
            int r1 = r1 + 1
            r5.hits = r1     // Catch: java.lang.Throwable -> L82
            long r1 = r5.currentSize     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L82
            int r3 = r3.getSize(r0)     // Catch: java.lang.Throwable -> L82
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L82
            long r1 = r1 - r3
            r5.currentSize = r1     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r1 = r5.tracker     // Catch: java.lang.Throwable -> L82
            r1.remove(r0)     // Catch: java.lang.Throwable -> L82
            normalize(r0)     // Catch: java.lang.Throwable -> L82
        L58:
            java.lang.String r1 = "LruBitmapPool"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L7d
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Get bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r3.logBitmap(r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            r2.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L82
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> L82
        L7d:
            r5.dump()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)
            return r0
        L82:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @android.annotation.TargetApi(19)
    private static void maybeSetPreMultiplied(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setPremultiplied(r0)
            return
    }

    private static void normalize(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setHasAlpha(r0)
            maybeSetPreMultiplied(r1)
            return
    }

    private synchronized void trimToSize(long r6) {
            r5 = this;
            monitor-enter(r5)
        L1:
            long r0 = r5.currentSize     // Catch: java.lang.Throwable -> L6d
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6b
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r5.strategy     // Catch: java.lang.Throwable -> L6d
            android.graphics.Bitmap r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L28
            java.lang.String r6 = "LruBitmapPool"
            r7 = 5
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L22
            java.lang.String r6 = "LruBitmapPool"
            java.lang.String r7 = "Size mismatch, resetting"
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L6d
            r5.dumpUnchecked()     // Catch: java.lang.Throwable -> L6d
        L22:
            r6 = 0
            r5.currentSize = r6     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
            return
        L28:
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r1 = r5.tracker     // Catch: java.lang.Throwable -> L6d
            r1.remove(r0)     // Catch: java.lang.Throwable -> L6d
            long r1 = r5.currentSize     // Catch: java.lang.Throwable -> L6d
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L6d
            int r3 = r3.getSize(r0)     // Catch: java.lang.Throwable -> L6d
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L6d
            long r1 = r1 - r3
            r5.currentSize = r1     // Catch: java.lang.Throwable -> L6d
            int r1 = r5.evictions     // Catch: java.lang.Throwable -> L6d
            int r1 = r1 + 1
            r5.evictions = r1     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L64
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "Evicting bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = r3.logBitmap(r0)     // Catch: java.lang.Throwable -> L6d
            r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6d
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L6d
        L64:
            r5.dump()     // Catch: java.lang.Throwable -> L6d
            r0.recycle()     // Catch: java.lang.Throwable -> L6d
            goto L1
        L6b:
            monitor-exit(r5)
            return
        L6d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Le
            java.lang.String r1 = "clearMemory"
            android.util.Log.d(r0, r1)
        Le:
            r0 = 0
            r2.trimToSize(r0)
            return
    }

    public long evictionCount() {
            r2 = this;
            int r0 = r2.evictions
            long r0 = (long) r0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @androidx.annotation.NonNull
    public android.graphics.Bitmap get(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getDirtyOrNull(r2, r3, r4)
            if (r0 == 0) goto Lb
            r2 = 0
            r0.eraseColor(r2)
            goto Lf
        Lb:
            android.graphics.Bitmap r0 = createBitmap(r2, r3, r4)
        Lf:
            return r0
    }

    public long getCurrentSize() {
            r2 = this;
            long r0 = r2.currentSize
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @androidx.annotation.NonNull
    public android.graphics.Bitmap getDirty(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getDirtyOrNull(r2, r3, r4)
            if (r0 != 0) goto La
            android.graphics.Bitmap r0 = createBitmap(r2, r3, r4)
        La:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
            r2 = this;
            long r0 = r2.maxSize
            return r0
    }

    public long hitCount() {
            r2 = this;
            int r0 = r2.hits
            long r0 = (long) r0
            return r0
    }

    public long missCount() {
            r2 = this;
            int r0 = r2.misses
            long r0 = (long) r0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(android.graphics.Bitmap r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto Lc3
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto Lb9
            boolean r0 = r7.isMutable()     // Catch: java.lang.Throwable -> Lc1
            r1 = 2
            if (r0 == 0) goto L72
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r6.strategy     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.getSize(r7)     // Catch: java.lang.Throwable -> Lc1
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lc1
            long r4 = r6.maxSize     // Catch: java.lang.Throwable -> Lc1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L72
            java.util.Set<android.graphics.Bitmap$Config> r0 = r6.allowedConfigs     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Bitmap$Config r2 = r7.getConfig()     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L2a
            goto L72
        L2a:
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r6.strategy     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.getSize(r7)     // Catch: java.lang.Throwable -> Lc1
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> Lc1
            r2.put(r7)     // Catch: java.lang.Throwable -> Lc1
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r2 = r6.tracker     // Catch: java.lang.Throwable -> Lc1
            r2.add(r7)     // Catch: java.lang.Throwable -> Lc1
            int r2 = r6.puts     // Catch: java.lang.Throwable -> Lc1
            int r2 = r2 + 1
            r6.puts = r2     // Catch: java.lang.Throwable -> Lc1
            long r2 = r6.currentSize     // Catch: java.lang.Throwable -> Lc1
            long r4 = (long) r0     // Catch: java.lang.Throwable -> Lc1
            long r2 = r2 + r4
            r6.currentSize = r2     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L6a
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "Put bitmap in pool="
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = r2.logBitmap(r7)     // Catch: java.lang.Throwable -> Lc1
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            android.util.Log.v(r0, r7)     // Catch: java.lang.Throwable -> Lc1
        L6a:
            r6.dump()     // Catch: java.lang.Throwable -> Lc1
            r6.evict()     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r6)
            return
        L72:
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "Reject bitmap from pool, bitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r2.logBitmap(r7)     // Catch: java.lang.Throwable -> Lc1
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = ", is mutable: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            boolean r2 = r7.isMutable()     // Catch: java.lang.Throwable -> Lc1
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = ", is allowed config: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.util.Set<android.graphics.Bitmap$Config> r2 = r6.allowedConfigs     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Bitmap$Config r3 = r7.getConfig()     // Catch: java.lang.Throwable -> Lc1
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Lc1
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> Lc1
        Lb4:
            r7.recycle()     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r6)
            return
        Lb9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "Cannot pool recycled bitmap"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r7     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r7 = move-exception
            goto Lcb
        Lc3:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "Bitmap must not be null"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r7     // Catch: java.lang.Throwable -> Lc1
        Lcb:
            monitor-exit(r6)
            throw r7
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.initialMaxSize     // Catch: java.lang.Throwable -> L12
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L12
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L12
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L12
            r2.maxSize = r0     // Catch: java.lang.Throwable -> L12
            r2.evict()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @android.annotation.SuppressLint({"InlinedApi"})
    public void trimMemory(int r5) {
            r4 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "trimMemory, level="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1e:
            r0 = 40
            if (r5 >= r0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 20
            if (r0 < r1) goto L2d
            if (r5 < r2) goto L2d
            goto L3e
        L2d:
            if (r5 >= r2) goto L33
            r0 = 15
            if (r5 != r0) goto L41
        L33:
            long r0 = r4.getMaxSize()
            r2 = 2
            long r0 = r0 / r2
            r4.trimToSize(r0)
            goto L41
        L3e:
            r4.clearMemory()
        L41:
            return
    }
}
