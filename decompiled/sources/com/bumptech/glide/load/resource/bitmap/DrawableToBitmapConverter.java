package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
final class DrawableToBitmapConverter {
    private static final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool NO_RECYCLE_BITMAP_POOL = null;
    private static final java.lang.String TAG = "DrawableToBitmap";


    static {
            com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter$1 r0 = new com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter$1
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.NO_RECYCLE_BITMAP_POOL = r0
            return
    }

    private DrawableToBitmapConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> convert(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, android.graphics.drawable.Drawable r3, int r4, int r5) {
            android.graphics.drawable.Drawable r3 = r3.getCurrent()
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L10
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            goto L1b
        L10:
            boolean r0 = r3 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L1a
            android.graphics.Bitmap r3 = drawToBitmap(r2, r3, r4, r5)
            r1 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.NO_RECYCLE_BITMAP_POOL
        L20:
            com.bumptech.glide.load.resource.bitmap.BitmapResource r2 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r3, r2)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.Bitmap drawToBitmap(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6, android.graphics.drawable.Drawable r7, int r8, int r9) {
            java.lang.String r0 = "Unable to draw "
            r1 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            java.lang.String r4 = "DrawableToBitmap"
            if (r8 != r2) goto L2e
            int r5 = r7.getIntrinsicWidth()
            if (r5 > 0) goto L2e
            boolean r6 = android.util.Log.isLoggable(r4, r1)
            if (r6 == 0) goto L2d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r7)
            java.lang.String r7 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r4, r6)
        L2d:
            return r3
        L2e:
            if (r9 != r2) goto L54
            int r2 = r7.getIntrinsicHeight()
            if (r2 > 0) goto L54
            boolean r6 = android.util.Log.isLoggable(r4, r1)
            if (r6 == 0) goto L53
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r7)
            java.lang.String r7 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r4, r6)
        L53:
            return r3
        L54:
            int r0 = r7.getIntrinsicWidth()
            if (r0 <= 0) goto L5e
            int r8 = r7.getIntrinsicWidth()
        L5e:
            int r0 = r7.getIntrinsicHeight()
            if (r0 <= 0) goto L68
            int r9 = r7.getIntrinsicHeight()
        L68:
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r0.lock()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = r6.get(r8, r9, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L88
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r7.setBounds(r2, r2, r8, r9)     // Catch: java.lang.Throwable -> L88
            r7.draw(r1)     // Catch: java.lang.Throwable -> L88
            r1.setBitmap(r3)     // Catch: java.lang.Throwable -> L88
            r0.unlock()
            return r6
        L88:
            r6 = move-exception
            r0.unlock()
            throw r6
    }
}
