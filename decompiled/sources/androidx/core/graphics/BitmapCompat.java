package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapCompat {

    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean hasMipMap(android.graphics.Bitmap r0) {
                boolean r0 = r0.hasMipMap()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setHasMipMap(android.graphics.Bitmap r0, boolean r1) {
                r0.setHasMipMap(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getAllocationByteCount(android.graphics.Bitmap r0) {
                int r0 = r0.getAllocationByteCount()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(27)
    public static class Api27Impl {
        private Api27Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L19
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r3 = r3.copy(r0, r1)
            L19:
                return r3
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Bitmap createBitmapWithSourceColorspace(int r3, int r4, android.graphics.Bitmap r5, boolean r6) {
                android.graphics.Bitmap$Config r0 = r5.getConfig()
                android.graphics.ColorSpace r1 = r5.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r6 == 0) goto L1e
                android.graphics.ColorSpace r6 = r5.getColorSpace()
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r6 = r5.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
                if (r6 != r2) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r6 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r6 < r2) goto L32
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r5)
            L32:
                boolean r5 = r5.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0, r5, r1)
                return r3
        }

        @androidx.annotation.DoNotInline
        public static boolean isAlreadyF16AndLinear(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r3 = r3.getColorSpace()
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1a
                r3 = 1
                goto L1b
            L1a:
                r3 = 0
            L1b:
                return r3
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setPaintBlendMode(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    @androidx.annotation.RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap r1) {
                android.hardware.HardwareBuffer r1 = r1.getHardwareBuffer()
                int r1 = r1.getFormat()
                r0 = 22
                if (r1 != r0) goto Lf
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
                return r1
            Lf:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                return r1
        }
    }

    private BitmapCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap createScaledBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.Nullable android.graphics.Rect r24, boolean r25) {
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            if (r1 <= 0) goto L20c
            if (r2 <= 0) goto L20c
            if (r3 == 0) goto L36
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r21.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r21.getHeight()
            if (r4 > r5) goto L2d
            goto L36
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "srcRect must be contained by srcBm!"
            r0.<init>(r1)
            throw r0
        L36:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L41
            android.graphics.Bitmap r6 = androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(r21)
            goto L42
        L41:
            r6 = r0
        L42:
            if (r3 == 0) goto L49
            int r7 = r24.width()
            goto L4d
        L49:
            int r7 = r21.getWidth()
        L4d:
            if (r3 == 0) goto L54
            int r8 = r24.height()
            goto L58
        L54:
            int r8 = r21.getHeight()
        L58:
            float r9 = (float) r1
            float r10 = (float) r7
            float r9 = r9 / r10
            float r10 = (float) r2
            float r11 = (float) r8
            float r10 = r10 / r11
            if (r3 == 0) goto L63
            int r12 = r3.left
            goto L64
        L63:
            r12 = 0
        L64:
            if (r3 == 0) goto L69
            int r3 = r3.top
            goto L6a
        L69:
            r3 = 0
        L6a:
            r13 = 1
            if (r12 != 0) goto L8d
            if (r3 != 0) goto L8d
            int r14 = r21.getWidth()
            if (r1 != r14) goto L8d
            int r14 = r21.getHeight()
            if (r2 != r14) goto L8d
            boolean r1 = r21.isMutable()
            if (r1 == 0) goto L8c
            if (r0 != r6) goto L8c
            android.graphics.Bitmap$Config r1 = r21.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r1, r13)
            return r0
        L8c:
            return r6
        L8d:
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>(r13)
            r14.setFilterBitmap(r13)
            r15 = 29
            if (r4 < r15) goto L9d
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(r14)
            goto La7
        L9d:
            android.graphics.PorterDuffXfermode r15 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC
            r15.<init>(r11)
            r14.setXfermode(r15)
        La7:
            if (r7 != r1) goto Lc0
            if (r8 != r2) goto Lc0
            android.graphics.Bitmap$Config r0 = r6.getConfig()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = -r12
            float r2 = (float) r2
            int r3 = -r3
            float r3 = (float) r3
            r1.drawBitmap(r6, r2, r3, r14)
            return r0
        Lc0:
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = java.lang.Math.log(r16)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto Lda
            r24 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r16
            double r13 = java.lang.Math.ceil(r13)
            goto Le7
        Lda:
            r24 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r16
            double r13 = java.lang.Math.floor(r13)
        Le7:
            int r9 = (int) r13
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto Lf8
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.ceil(r10)
            goto L103
        Lf8:
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.floor(r10)
        L103:
            int r10 = (int) r10
            r11 = 0
            if (r25 == 0) goto L13b
            if (r4 < r5) goto L13b
            boolean r4 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r21)
            if (r4 != 0) goto L13b
            r4 = 1
            if (r9 <= 0) goto L117
            int r11 = sizeAtStep(r7, r1, r4, r9)
            goto L118
        L117:
            r11 = r7
        L118:
            if (r10 <= 0) goto L11f
            int r13 = sizeAtStep(r8, r2, r4, r10)
            goto L120
        L11f:
            r13 = r8
        L120:
            android.graphics.Bitmap r11 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r11, r13, r0, r4)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r11)
            int r12 = -r12
            float r12 = (float) r12
            int r3 = -r3
            float r3 = (float) r3
            r14 = r24
            r13.drawBitmap(r6, r12, r3, r14)
            r3 = 0
            r12 = 0
            r13 = 1
            r20 = r11
            r11 = r6
            r6 = r20
            goto L13f
        L13b:
            r14 = r24
            r4 = 1
            r13 = 0
        L13f:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r12, r3, r7, r8)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12 = r9
            r16 = r10
        L14c:
            if (r12 != 0) goto L159
            if (r16 == 0) goto L151
            goto L159
        L151:
            if (r11 == r0) goto L158
            if (r11 == 0) goto L158
            r11.recycle()
        L158:
            return r6
        L159:
            if (r12 >= 0) goto L15e
            int r12 = r12 + 1
            goto L162
        L15e:
            if (r12 <= 0) goto L162
            int r12 = r12 + (-1)
        L162:
            if (r16 >= 0) goto L167
            int r16 = r16 + 1
            goto L16b
        L167:
            if (r16 <= 0) goto L16b
            int r16 = r16 + (-1)
        L16b:
            r4 = r16
            int r5 = sizeAtStep(r7, r1, r12, r9)
            r24 = r14
            int r14 = sizeAtStep(r8, r2, r4, r10)
            r18 = r15
            r15 = 0
            r3.set(r15, r15, r5, r14)
            if (r12 != 0) goto L183
            if (r4 != 0) goto L183
            r5 = 1
            goto L184
        L183:
            r5 = 0
        L184:
            if (r11 == 0) goto L194
            int r14 = r11.getWidth()
            if (r14 != r1) goto L194
            int r14 = r11.getHeight()
            if (r14 != r2) goto L194
            r14 = 1
            goto L195
        L194:
            r14 = 0
        L195:
            if (r11 == 0) goto L1b7
            if (r11 == r0) goto L1b7
            if (r25 == 0) goto L1aa
            int r15 = android.os.Build.VERSION.SDK_INT
            r19 = r3
            r3 = 27
            if (r15 < r3) goto L1ac
            boolean r3 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r11)
            if (r3 == 0) goto L1b9
            goto L1ac
        L1aa:
            r19 = r3
        L1ac:
            if (r5 == 0) goto L1b3
            if (r14 == 0) goto L1b9
            if (r13 == 0) goto L1b3
            goto L1b9
        L1b3:
            r3 = r11
            r15 = 27
            goto L1ec
        L1b7:
            r19 = r3
        L1b9:
            if (r11 == r0) goto L1c0
            if (r11 == 0) goto L1c0
            r11.recycle()
        L1c0:
            if (r12 <= 0) goto L1c4
            r3 = r13
            goto L1c5
        L1c4:
            r3 = r12
        L1c5:
            int r3 = sizeAtStep(r7, r1, r3, r9)
            if (r4 <= 0) goto L1cd
            r11 = r13
            goto L1ce
        L1cd:
            r11 = r4
        L1ce:
            int r11 = sizeAtStep(r8, r2, r11, r10)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 27
            if (r14 < r15) goto L1e4
            if (r25 == 0) goto L1de
            if (r5 != 0) goto L1de
            r5 = 1
            goto L1df
        L1de:
            r5 = 0
        L1df:
            android.graphics.Bitmap r3 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r3, r11, r0, r5)
            goto L1ec
        L1e4:
            android.graphics.Bitmap$Config r5 = r6.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r11, r5)
        L1ec:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            r11 = r24
            r14 = r18
            r15 = r19
            r5.drawBitmap(r6, r14, r15, r11)
            r14.set(r15)
            r16 = r4
            r4 = 1
            r5 = 27
            r20 = r6
            r6 = r3
            r3 = r15
            r15 = r14
            r14 = r11
            r11 = r20
            goto L14c
        L20c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "dstW and dstH must be > 0!"
            r0.<init>(r1)
            throw r0
    }

    public static int getAllocationByteCount(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            int r0 = androidx.core.graphics.BitmapCompat.Api19Impl.getAllocationByteCount(r0)
            return r0
    }

    public static boolean hasMipMap(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            boolean r0 = androidx.core.graphics.BitmapCompat.Api17Impl.hasMipMap(r0)
            return r0
    }

    public static void setHasMipMap(@androidx.annotation.NonNull android.graphics.Bitmap r0, boolean r1) {
            androidx.core.graphics.BitmapCompat.Api17Impl.setHasMipMap(r0, r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    public static int sizeAtStep(int r1, int r2, int r3, int r4) {
            if (r3 != 0) goto L3
            return r2
        L3:
            r0 = 1
            if (r3 <= 0) goto Lc
            int r4 = r4 - r3
            int r2 = r0 << r4
            int r1 = r1 * r2
            return r1
        Lc:
            int r1 = -r3
            int r1 = r1 - r0
            int r1 = r2 << r1
            return r1
    }
}
