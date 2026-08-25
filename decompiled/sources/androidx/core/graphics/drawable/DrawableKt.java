package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: Drawable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DrawableKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r6, @androidx.annotation.Px int r7, @androidx.annotation.Px int r8, @org.jetbrains.annotations.Nullable android.graphics.Bitmap.Config r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            java.lang.String r1 = "bitmap"
            if (r0 == 0) goto L53
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r2 = r0.getBitmap()
            if (r2 == 0) goto L4b
            if (r9 == 0) goto L20
            android.graphics.Bitmap r2 = r0.getBitmap()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            if (r2 != r9) goto L53
        L20:
            android.graphics.Bitmap r6 = r0.getBitmap()
            int r6 = r6.getWidth()
            if (r7 != r6) goto L3c
            android.graphics.Bitmap r6 = r0.getBitmap()
            int r6 = r6.getHeight()
            if (r8 != r6) goto L3c
            android.graphics.Bitmap r6 = r0.getBitmap()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            return r6
        L3c:
            android.graphics.Bitmap r6 = r0.getBitmap()
            r9 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r8, r9)
            java.lang.String r7 = "createScaledBitmap(bitmap, width, height, true)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        L4b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "bitmap is null"
            r6.<init>(r7)
            throw r6
        L53:
            android.graphics.Rect r0 = r6.getBounds()
            java.lang.String r2 = "bounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            if (r9 != 0) goto L68
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L68:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r7, r8, r9)
            r5 = 0
            r6.setBounds(r5, r5, r7, r8)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r9)
            r6.draw(r7)
            r6.setBounds(r2, r3, r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            return r9
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmap$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmap(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final android.graphics.Bitmap toBitmapOrNull(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @org.jetbrains.annotations.Nullable android.graphics.Bitmap.Config r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L14
            r0 = r1
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto L14
            r1 = 0
            return r1
        L14:
            android.graphics.Bitmap r1 = toBitmap(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmapOrNull$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmapOrNull(r0, r1, r2, r3)
            return r0
    }

    public static final void updateBounds(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Px int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setBounds(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updateBounds$default(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto La
            android.graphics.Rect r1 = r0.getBounds()
            int r1 = r1.left
        La:
            r6 = r5 & 2
            if (r6 == 0) goto L14
            android.graphics.Rect r2 = r0.getBounds()
            int r2 = r2.top
        L14:
            r6 = r5 & 4
            if (r6 == 0) goto L1e
            android.graphics.Rect r3 = r0.getBounds()
            int r3 = r3.right
        L1e:
            r5 = r5 & 8
            if (r5 == 0) goto L28
            android.graphics.Rect r4 = r0.getBounds()
            int r4 = r4.bottom
        L28:
            updateBounds(r0, r1, r2, r3, r4)
            return
    }
}
