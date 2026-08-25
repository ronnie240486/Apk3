package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    private DrawableDecoderCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r0, @androidx.annotation.DrawableRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
            android.graphics.drawable.Drawable r0 = getDrawable(r0, r0, r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = getDrawable(r1, r2, r3, r0)
            return r1
    }

    private static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, android.content.Context r2, @androidx.annotation.DrawableRes int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
            boolean r0 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.shouldCallAppCompatResources     // Catch: android.content.res.Resources.NotFoundException -> L9 java.lang.IllegalStateException -> Lb java.lang.NoClassDefFoundError -> L20
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r1 = loadDrawableV7(r2, r3, r4)     // Catch: android.content.res.Resources.NotFoundException -> L9 java.lang.IllegalStateException -> Lb java.lang.NoClassDefFoundError -> L20
            return r1
        L9:
            goto L23
        Lb:
            r4 = move-exception
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = r2.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1f
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r2, r3)
            return r1
        L1f:
            throw r4
        L20:
            r1 = 0
            com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.shouldCallAppCompatResources = r1
        L23:
            if (r4 == 0) goto L26
            goto L2a
        L26:
            android.content.res.Resources$Theme r4 = r2.getTheme()
        L2a:
            android.graphics.drawable.Drawable r1 = loadDrawableV4(r2, r3, r4)
            return r1
    }

    private static android.graphics.drawable.Drawable loadDrawableV4(android.content.Context r0, @androidx.annotation.DrawableRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r1, r2)
            return r0
    }

    private static android.graphics.drawable.Drawable loadDrawableV7(android.content.Context r1, @androidx.annotation.DrawableRes int r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) {
            if (r3 == 0) goto L8
            androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
            r0.<init>(r1, r3)
            r1 = r0
        L8:
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            return r1
    }
}
