package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapPreFiller {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner current;
    private final com.bumptech.glide.load.DecodeFormat defaultFormat;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;

    public BitmapPreFiller(com.bumptech.glide.load.engine.cache.MemoryCache r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.load.DecodeFormat r3) {
            r0 = this;
            r0.<init>()
            r0.memoryCache = r1
            r0.bitmapPool = r2
            r0.defaultFormat = r3
            return
    }

    private static int getSizeInBytes(com.bumptech.glide.load.engine.prefill.PreFillType r2) {
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            int r2 = com.bumptech.glide.util.Util.getBitmapByteSize(r0, r1, r2)
            return r2
    }

    public void preFill(com.bumptech.glide.load.engine.prefill.PreFillType.Builder... r8) {
            r7 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner r0 = r7.current
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            int r0 = r8.length
            com.bumptech.glide.load.engine.prefill.PreFillType[] r1 = new com.bumptech.glide.load.engine.prefill.PreFillType[r0]
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r8.length
            if (r3 >= r4) goto L2e
            r4 = r8[r3]
            android.graphics.Bitmap$Config r5 = r4.getConfig()
            if (r5 != 0) goto L25
            com.bumptech.glide.load.DecodeFormat r5 = r7.defaultFormat
            com.bumptech.glide.load.DecodeFormat r6 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r5 != r6) goto L20
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            goto L22
        L20:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
        L22:
            r4.setConfig(r5)
        L25:
            com.bumptech.glide.load.engine.prefill.PreFillType r4 = r4.build()
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lc
        L2e:
            com.bumptech.glide.load.engine.cache.MemoryCache r8 = r7.memoryCache
            long r3 = r8.getMaxSize()
            com.bumptech.glide.load.engine.cache.MemoryCache r8 = r7.memoryCache
            long r5 = r8.getCurrentSize()
            long r3 = r3 - r5
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8 = r7.bitmapPool
            long r5 = r8.getMaxSize()
            long r5 = r5 + r3
            r8 = 0
            r3 = 0
        L44:
            if (r8 >= r0) goto L50
            r4 = r1[r8]
            int r4 = r4.getWeight()
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L44
        L50:
            float r8 = (float) r5
            float r3 = (float) r3
            float r8 = r8 / r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L58:
            if (r2 >= r0) goto L76
            r4 = r1[r2]
            int r5 = r4.getWeight()
            float r5 = (float) r5
            float r5 = r5 * r8
            int r5 = java.lang.Math.round(r5)
            int r6 = getSizeInBytes(r4)
            int r5 = r5 / r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r4, r5)
            int r2 = r2 + 1
            goto L58
        L76:
            com.bumptech.glide.load.engine.prefill.PreFillQueue r8 = new com.bumptech.glide.load.engine.prefill.PreFillQueue
            r8.<init>(r3)
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner r0 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r7.bitmapPool
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r7.memoryCache
            r0.<init>(r1, r2, r8)
            r7.current = r0
            com.bumptech.glide.util.Util.postOnUiThread(r0)
            return
    }
}
