package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes.dex */
final class BitmapPreFillRunner implements java.lang.Runnable {
    private static final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock DEFAULT_CLOCK = null;
    public static final long MAX_BACKOFF_MS = 0;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock clock;
    private long currentDelay;
    private final android.os.Handler handler;
    private boolean isCancelled;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private final java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> seenTypes;
    private final com.bumptech.glide.load.engine.prefill.PreFillQueue toPrefill;

    @androidx.annotation.VisibleForTesting
    public static class Clock {
        public Clock() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class UniqueKey implements com.bumptech.glide.load.Key {
        public UniqueKey() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    static {
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock
            r0.<init>()
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.DEFAULT_CLOCK = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.MAX_BACKOFF_MS = r0
            return
    }

    public BitmapPreFillRunner(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5, com.bumptech.glide.load.engine.cache.MemoryCache r6, com.bumptech.glide.load.engine.prefill.PreFillQueue r7) {
            r4 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.DEFAULT_CLOCK
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r4.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.seenTypes = r2
            r2 = 40
            r4.currentDelay = r2
            r4.bitmapPool = r5
            r4.memoryCache = r6
            r4.toPrefill = r7
            r4.clock = r0
            r4.handler = r1
            return
    }

    private long getFreeMemoryCacheBytes() {
            r4 = this;
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r4.memoryCache
            long r0 = r0.getMaxSize()
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r4.memoryCache
            long r2 = r2.getCurrentSize()
            long r0 = r0 - r2
            return r0
    }

    private long getNextDelay() {
            r6 = this;
            long r0 = r6.currentDelay
            r2 = 4
            long r2 = r2 * r0
            long r4 = com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.MAX_BACKOFF_MS
            long r2 = java.lang.Math.min(r2, r4)
            r6.currentDelay = r2
            return r0
    }

    private boolean isGcDetected(long r4) {
            r3 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = r3.clock
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            long r0 = r0 - r4
            r4 = 32
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.isCancelled = r0
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r10 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = r10.clock
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
        L9:
            com.bumptech.glide.load.engine.prefill.PreFillQueue r2 = r10.toPrefill
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            boolean r2 = r10.isGcDetected(r0)
            if (r2 != 0) goto Lb0
            com.bumptech.glide.load.engine.prefill.PreFillQueue r2 = r10.toPrefill
            com.bumptech.glide.load.engine.prefill.PreFillType r2 = r2.remove()
            java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> r3 = r10.seenTypes
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L3d
            java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> r3 = r10.seenTypes
            r3.add(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3 = r10.bitmapPool
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            android.graphics.Bitmap r3 = r3.getDirty(r4, r5, r6)
            goto L4d
        L3d:
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            android.graphics.Bitmap$Config r5 = r2.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
        L4d:
            int r4 = com.bumptech.glide.util.Util.getBitmapByteSize(r3)
            long r5 = r10.getFreeMemoryCacheBytes()
            long r7 = (long) r4
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L6b
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$UniqueKey r5 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$UniqueKey
            r5.<init>()
            com.bumptech.glide.load.engine.cache.MemoryCache r6 = r10.memoryCache
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r7 = r10.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r3 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r3, r7)
            r6.put(r5, r3)
            goto L70
        L6b:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5 = r10.bitmapPool
            r5.put(r3)
        L70:
            r3 = 3
            java.lang.String r5 = "PreFillRunner"
            boolean r3 = android.util.Log.isLoggable(r5, r3)
            if (r3 == 0) goto L9
            java.lang.String r3 = "allocated ["
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r6 = r2.getWidth()
            r3.append(r6)
            java.lang.String r6 = "x"
            r3.append(r6)
            int r6 = r2.getHeight()
            r3.append(r6)
            java.lang.String r6 = "] "
            r3.append(r6)
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            r3.append(r2)
            java.lang.String r2 = " size: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r5, r2)
            goto L9
        Lb0:
            boolean r0 = r10.isCancelled
            if (r0 != 0) goto Lbe
            com.bumptech.glide.load.engine.prefill.PreFillQueue r0 = r10.toPrefill
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbe
            r0 = 1
            goto Lbf
        Lbe:
            r0 = 0
        Lbf:
            if (r0 == 0) goto Lca
            android.os.Handler r0 = r10.handler
            long r1 = r10.getNextDelay()
            r0.postDelayed(r10, r1)
        Lca:
            return
    }
}
