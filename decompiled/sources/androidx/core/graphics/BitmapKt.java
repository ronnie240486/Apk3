package androidx.core.graphics;

/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a)\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0014H\u0086\n\u001a\u001d\u0010\u0015\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\n\u001a'\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086\b\u001a'\u0010\u001a\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0003H\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "hasAlpha", "", "colorSpace", "Landroid/graphics/ColorSpace;", "applyCanvas", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "contains", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "get", "x", "y", "scale", "filter", "set", "color", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BitmapKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap applyCanvas(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r2.invoke(r0)
            return r1
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r4, @org.jetbrains.annotations.NotNull android.graphics.Point r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.getWidth()
            int r1 = r5.x
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L18
            if (r1 >= r0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L26
            int r5 = r5.y
            if (r5 < 0) goto L26
            int r4 = r4.getHeight()
            if (r5 >= r4) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r3, @org.jetbrains.annotations.NotNull android.graphics.PointF r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            float r0 = r4.x
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L2b
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2b
            float r4 = r4.y
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L2b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap createBitmap(int r1, int r2, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r3) {
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            java.lang.String r2 = "createBitmap(width, height, config)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap createBitmap(int r1, int r2, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r3, boolean r4, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r5) {
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5)
            java.lang.String r2 = "createBitmap(width, heig…ig, hasAlpha, colorSpace)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            java.lang.String r3 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            java.lang.String r1 = "createBitmap(width, height, config)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r6 = r5 & 8
            if (r6 == 0) goto Lb
            r3 = 1
        Lb:
            r5 = r5 & 16
            if (r5 == 0) goto L1a
            android.graphics.ColorSpace$Named r4 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r4 = android.graphics.ColorSpace.get(r4)
            java.lang.String r5 = "get(ColorSpace.Named.SRGB)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L1a:
            java.lang.String r5 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            java.lang.String r1 = "createBitmap(width, heig…ig, hasAlpha, colorSpace)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final int get(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getPixel(r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap scale(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, int r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r3, r4)
            java.lang.String r2 = "createScaledBitmap(this, width, height, filter)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            java.lang.String r1 = "createScaledBitmap(this, width, height, filter)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, int r2, int r3, @androidx.annotation.ColorInt int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setPixel(r2, r3, r4)
            return
    }
}
