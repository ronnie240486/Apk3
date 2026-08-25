package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class TransformationUtils {
    private static final java.util.concurrent.locks.Lock BITMAP_DRAWABLE_LOCK = null;
    private static final android.graphics.Paint CIRCLE_CROP_BITMAP_PAINT = null;
    private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
    private static final android.graphics.Paint CIRCLE_CROP_SHAPE_PAINT = null;
    private static final android.graphics.Paint DEFAULT_PAINT = null;
    private static final java.util.Set<java.lang.String> MODELS_REQUIRING_BITMAP_LOCK = null;
    public static final int PAINT_FLAGS = 6;
    private static final java.lang.String TAG = "TransformationUtils";



    /* JADX INFO: loaded from: classes2.dex */
    public interface DrawRoundedCornerFn {
        void drawRoundedCorners(android.graphics.Canvas r1, android.graphics.Paint r2, android.graphics.RectF r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class NoLock implements java.util.concurrent.locks.Lock {
        public NoLock() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        @androidx.annotation.NonNull
        public java.util.concurrent.locks.Condition newCondition() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
                r0 = this;
                return
        }
    }

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 6
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.TransformationUtils.DEFAULT_PAINT = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 7
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.TransformationUtils.CIRCLE_CROP_SHAPE_PAINT = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r2 = "XT1085"
            java.lang.String r3 = "XT1092"
            java.lang.String r4 = "XT1093"
            java.lang.String r5 = "XT1094"
            java.lang.String r6 = "XT1095"
            java.lang.String r7 = "XT1096"
            java.lang.String r8 = "XT1097"
            java.lang.String r9 = "XT1098"
            java.lang.String r10 = "XT1031"
            java.lang.String r11 = "XT1028"
            java.lang.String r12 = "XT937C"
            java.lang.String r13 = "XT1032"
            java.lang.String r14 = "XT1008"
            java.lang.String r15 = "XT1033"
            java.lang.String r16 = "XT1035"
            java.lang.String r17 = "XT1034"
            java.lang.String r18 = "XT939G"
            java.lang.String r19 = "XT1039"
            java.lang.String r20 = "XT1040"
            java.lang.String r21 = "XT1042"
            java.lang.String r22 = "XT1045"
            java.lang.String r23 = "XT1063"
            java.lang.String r24 = "XT1064"
            java.lang.String r25 = "XT1068"
            java.lang.String r26 = "XT1069"
            java.lang.String r27 = "XT1072"
            java.lang.String r28 = "XT1077"
            java.lang.String r29 = "XT1078"
            java.lang.String r30 = "XT1079"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            com.bumptech.glide.load.resource.bitmap.TransformationUtils.MODELS_REQUIRING_BITMAP_LOCK = r0
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L67
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            goto L6c
        L67:
            com.bumptech.glide.load.resource.bitmap.TransformationUtils$NoLock r0 = new com.bumptech.glide.load.resource.bitmap.TransformationUtils$NoLock
            r0.<init>()
        L6c:
            com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.TransformationUtils.CIRCLE_CROP_BITMAP_PAINT = r0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    private TransformationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void applyMatrix(@androidx.annotation.NonNull android.graphics.Bitmap r2, @androidx.annotation.NonNull android.graphics.Bitmap r3, android.graphics.Matrix r4) {
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r0.lock()
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L16
            android.graphics.Paint r3 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.DEFAULT_PAINT     // Catch: java.lang.Throwable -> L16
            r1.drawBitmap(r2, r4, r3)     // Catch: java.lang.Throwable -> L16
            clear(r1)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L16:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r3.unlock()
            throw r2
    }

    public static android.graphics.Bitmap centerCrop(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9) {
            int r0 = r7.getWidth()
            if (r0 != r8) goto Ld
            int r0 = r7.getHeight()
            if (r0 != r9) goto Ld
            return r7
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r7.getWidth()
            int r1 = r1 * r9
            int r2 = r7.getHeight()
            int r2 = r2 * r8
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r2) goto L38
            float r1 = (float) r9
            int r2 = r7.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r8
            int r5 = r7.getWidth()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r4
            r3 = r2
            r2 = 0
            goto L4a
        L38:
            float r1 = (float) r8
            int r2 = r7.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r9
            int r5 = r7.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r4
        L4a:
            r0.setScale(r1, r1)
            float r3 = r3 + r4
            int r1 = (int) r3
            float r1 = (float) r1
            float r2 = r2 + r4
            int r2 = (int) r2
            float r2 = (float) r2
            r0.postTranslate(r1, r2)
            android.graphics.Bitmap$Config r1 = getNonNullConfig(r7)
            android.graphics.Bitmap r6 = r6.get(r8, r9, r1)
            setAlpha(r7, r6)
            applyMatrix(r7, r6, r0)
            return r6
    }

    public static android.graphics.Bitmap centerInside(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3, @androidx.annotation.NonNull android.graphics.Bitmap r4, int r5, int r6) {
            int r0 = r4.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 > r5) goto L1c
            int r0 = r4.getHeight()
            if (r0 > r6) goto L1c
            boolean r3 = android.util.Log.isLoggable(r2, r1)
            if (r3 == 0) goto L1b
            java.lang.String r3 = "requested target size larger or equal to input, returning input"
            android.util.Log.v(r2, r3)
        L1b:
            return r4
        L1c:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L28
            java.lang.String r0 = "requested target size too big for input, fit centering instead"
            android.util.Log.v(r2, r0)
        L28:
            android.graphics.Bitmap r3 = fitCenter(r3, r4, r5, r6)
            return r3
    }

    public static android.graphics.Bitmap circleCrop(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9) {
            int r8 = java.lang.Math.min(r8, r9)
            float r9 = (float) r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r9 / r0
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            float r2 = (float) r2
            float r4 = r9 / r2
            float r3 = (float) r3
            float r5 = r9 / r3
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r4 = r4 * r3
            float r3 = r9 - r2
            float r3 = r3 / r0
            float r9 = r9 - r4
            float r9 = r9 / r0
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r2 + r3
            float r4 = r4 + r9
            r0.<init>(r3, r9, r2, r4)
            android.graphics.Bitmap r9 = getAlphaSafeBitmap(r6, r7)
            android.graphics.Bitmap$Config r2 = getAlphaSafeConfig(r7)
            android.graphics.Bitmap r8 = r6.get(r8, r8, r2)
            r2 = 1
            r8.setHasAlpha(r2)
            java.util.concurrent.locks.Lock r2 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r2.lock()
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L60
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L60
            android.graphics.Paint r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.CIRCLE_CROP_SHAPE_PAINT     // Catch: java.lang.Throwable -> L60
            r3.drawCircle(r1, r1, r1, r4)     // Catch: java.lang.Throwable -> L60
            r1 = 0
            android.graphics.Paint r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.CIRCLE_CROP_BITMAP_PAINT     // Catch: java.lang.Throwable -> L60
            r3.drawBitmap(r9, r1, r0, r4)     // Catch: java.lang.Throwable -> L60
            clear(r3)     // Catch: java.lang.Throwable -> L60
            r2.unlock()
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L5f
            r6.put(r9)
        L5f:
            return r8
        L60:
            r6 = move-exception
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r7.unlock()
            throw r6
    }

    private static void clear(android.graphics.Canvas r1) {
            r0 = 0
            r1.setBitmap(r0)
            return
    }

    public static android.graphics.Bitmap fitCenter(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9) {
            int r0 = r7.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 != r8) goto L1c
            int r0 = r7.getHeight()
            if (r0 != r9) goto L1c
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L1b
            java.lang.String r6 = "requested target size matches input, returning input"
            android.util.Log.v(r2, r6)
        L1b:
            return r7
        L1c:
            float r0 = (float) r8
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = (float) r9
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = java.lang.Math.min(r0, r3)
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            int r5 = r7.getWidth()
            if (r5 != r3) goto L5c
            int r3 = r7.getHeight()
            if (r3 != r4) goto L5c
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L5b
            java.lang.String r6 = "adjusted target size matches input, returning input"
            android.util.Log.v(r2, r6)
        L5b:
            return r7
        L5c:
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = (int) r4
            android.graphics.Bitmap$Config r5 = getNonNullConfig(r7)
            android.graphics.Bitmap r6 = r6.get(r3, r4, r5)
            setAlpha(r7, r6)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Lf5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "request: "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = "x"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "toFit:   "
            r9.append(r1)
            int r1 = r7.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r1 = r7.getHeight()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "toReuse: "
            r9.append(r1)
            int r1 = r6.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r8 = r6.getHeight()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "minPct:   "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        Lf5:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r8.setScale(r0, r0)
            applyMatrix(r7, r6, r8)
            return r6
    }

    private static android.graphics.Bitmap getAlphaSafeBitmap(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3, @androidx.annotation.NonNull android.graphics.Bitmap r4) {
            android.graphics.Bitmap$Config r0 = getAlphaSafeConfig(r4)
            android.graphics.Bitmap$Config r1 = r4.getConfig()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lf
            return r4
        Lf:
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            android.graphics.Bitmap r3 = r3.get(r1, r2, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r3)
            r1 = 0
            r2 = 0
            r0.drawBitmap(r4, r2, r2, r1)
            return r3
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap.Config getAlphaSafeConfig(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L15
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L15
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
            return r2
        L15:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            return r2
    }

    public static java.util.concurrent.locks.Lock getBitmapDrawableLock() {
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            return r0
    }

    public static int getExifOrientationDegrees(int r0) {
            switch(r0) {
                case 3: goto Lb;
                case 4: goto Lb;
                case 5: goto L8;
                case 6: goto L8;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            goto Ld
        L5:
            r0 = 270(0x10e, float:3.78E-43)
            goto Ld
        L8:
            r0 = 90
            goto Ld
        Lb:
            r0 = 180(0xb4, float:2.52E-43)
        Ld:
            return r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap.Config getNonNullConfig(@androidx.annotation.NonNull android.graphics.Bitmap r1) {
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            if (r0 == 0) goto Lb
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            goto Ld
        Lb:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        Ld:
            return r1
    }

    public static boolean isExifOrientationRequired(int r0) {
            switch(r0) {
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 1
            return r0
    }

    public static android.graphics.Bitmap rotateImage(@androidx.annotation.NonNull android.graphics.Bitmap r7, int r8) {
            if (r8 == 0) goto L2b
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch: java.lang.Exception -> L1c
            r5.<init>()     // Catch: java.lang.Exception -> L1c
            float r8 = (float) r8     // Catch: java.lang.Exception -> L1c
            r5.setRotate(r8)     // Catch: java.lang.Exception -> L1c
            r1 = 0
            r2 = 0
            int r3 = r7.getWidth()     // Catch: java.lang.Exception -> L1c
            int r4 = r7.getHeight()     // Catch: java.lang.Exception -> L1c
            r6 = 1
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L1c
            goto L2b
        L1c:
            r8 = move-exception
            r0 = 6
            java.lang.String r1 = "TransformationUtils"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "Exception when trying to orient image"
            android.util.Log.e(r1, r0, r8)
        L2b:
            return r7
    }

    public static android.graphics.Bitmap rotateImageExif(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8) {
            boolean r0 = isExifOrientationRequired(r8)
            if (r0 != 0) goto L7
            return r7
        L7:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r3 = 1127481344(0x43340000, float:180.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r8) {
                case 2: goto L3b;
                case 3: goto L37;
                case 4: goto L30;
                case 5: goto L29;
                case 6: goto L25;
                case 7: goto L1e;
                case 8: goto L1a;
                default: goto L19;
            }
        L19:
            goto L3e
        L1a:
            r0.setRotate(r1)
            goto L3e
        L1e:
            r0.setRotate(r1)
            r0.postScale(r5, r4)
            goto L3e
        L25:
            r0.setRotate(r2)
            goto L3e
        L29:
            r0.setRotate(r2)
            r0.postScale(r5, r4)
            goto L3e
        L30:
            r0.setRotate(r3)
            r0.postScale(r5, r4)
            goto L3e
        L37:
            r0.setRotate(r3)
            goto L3e
        L3b:
            r0.setScale(r5, r4)
        L3e:
            android.graphics.RectF r8 = new android.graphics.RectF
            int r1 = r7.getWidth()
            float r1 = (float) r1
            int r2 = r7.getHeight()
            float r2 = (float) r2
            r3 = 0
            r8.<init>(r3, r3, r1, r2)
            r0.mapRect(r8)
            float r1 = r8.width()
            int r1 = java.lang.Math.round(r1)
            float r2 = r8.height()
            int r2 = java.lang.Math.round(r2)
            android.graphics.Bitmap$Config r3 = getNonNullConfig(r7)
            android.graphics.Bitmap r6 = r6.get(r1, r2, r3)
            float r1 = r8.left
            float r1 = -r1
            float r8 = r8.top
            float r8 = -r8
            r0.postTranslate(r1, r8)
            boolean r8 = r7.hasAlpha()
            r6.setHasAlpha(r8)
            applyMatrix(r7, r6, r0)
            return r6
    }

    public static android.graphics.Bitmap roundedCorners(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, float r3, float r4, float r5, float r6) {
            com.bumptech.glide.load.resource.bitmap.TransformationUtils$2 r0 = new com.bumptech.glide.load.resource.bitmap.TransformationUtils$2
            r0.<init>(r3, r4, r5, r6)
            android.graphics.Bitmap r1 = roundedCorners(r1, r2, r0)
            return r1
    }

    public static android.graphics.Bitmap roundedCorners(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, @androidx.annotation.NonNull android.graphics.Bitmap r3, int r4) {
            if (r4 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "roundingRadius must be greater than 0."
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
            com.bumptech.glide.load.resource.bitmap.TransformationUtils$1 r0 = new com.bumptech.glide.load.resource.bitmap.TransformationUtils$1
            r0.<init>(r4)
            android.graphics.Bitmap r2 = roundedCorners(r2, r3, r0)
            return r2
    }

    @java.lang.Deprecated
    public static android.graphics.Bitmap roundedCorners(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0, @androidx.annotation.NonNull android.graphics.Bitmap r1, int r2, int r3, int r4) {
            android.graphics.Bitmap r0 = roundedCorners(r0, r1, r4)
            return r0
    }

    private static android.graphics.Bitmap roundedCorners(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8, @androidx.annotation.NonNull android.graphics.Bitmap r9, com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn r10) {
            android.graphics.Bitmap$Config r0 = getAlphaSafeConfig(r9)
            android.graphics.Bitmap r1 = getAlphaSafeBitmap(r8, r9)
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap r0 = r8.get(r2, r3, r0)
            r2 = 1
            r0.setHasAlpha(r2)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r1, r4, r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r2)
            r4.setShader(r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r2.<init>(r6, r6, r3, r5)
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r3.lock()
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            r6 = 0
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L5d
            r5.drawColor(r6, r7)     // Catch: java.lang.Throwable -> L5d
            r10.drawRoundedCorners(r5, r4, r2)     // Catch: java.lang.Throwable -> L5d
            clear(r5)     // Catch: java.lang.Throwable -> L5d
            r3.unlock()
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L5c
            r8.put(r1)
        L5c:
            return r0
        L5d:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.BITMAP_DRAWABLE_LOCK
            r9.unlock()
            throw r8
    }

    public static void setAlpha(android.graphics.Bitmap r0, android.graphics.Bitmap r1) {
            boolean r0 = r0.hasAlpha()
            r1.setHasAlpha(r0)
            return
    }
}
