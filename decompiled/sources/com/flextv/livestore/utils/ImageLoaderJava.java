package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public class ImageLoaderJava {



    public ImageLoaderJava() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void imageLoadUrlWithVodHolder(android.content.Context r0, @androidx.annotation.NonNull android.widget.ImageView r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull android.widget.ImageView r4) {
            com.flextv.livestore.utils.GlideRequests r0 = com.flextv.livestore.utils.GlideApp.with(r0)     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L20
            com.flextv.livestore.utils.GlideRequest r0 = r0.load2(r2)     // Catch: java.lang.Exception -> L20
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 450(0x1c2, float:6.3E-43)
            com.flextv.livestore.utils.GlideRequest r0 = r0.override(r2, r3)     // Catch: java.lang.Exception -> L20
            com.flextv.livestore.utils.ImageLoaderJava$2 r2 = new com.flextv.livestore.utils.ImageLoaderJava$2     // Catch: java.lang.Exception -> L20
            r2.<init>(r4, r1)     // Catch: java.lang.Exception -> L20
            com.flextv.livestore.utils.GlideRequest r0 = r0.listener(r2)     // Catch: java.lang.Exception -> L20
            r0.into(r1)     // Catch: java.lang.Exception -> L20
        L20:
            return
    }

    public static void imageLoaderUrlWitPlaceHolder(android.content.Context r0, @org.jetbrains.annotations.NotNull android.widget.ImageView r1, @org.jetbrains.annotations.Nullable java.lang.String r2, int r3) {
            com.flextv.livestore.utils.GlideRequests r0 = com.flextv.livestore.utils.GlideApp.with(r0)
            java.lang.String r2 = r2.trim()
            com.flextv.livestore.utils.GlideRequest r0 = r0.load2(r2)
            com.flextv.livestore.utils.GlideRequest r0 = r0.placeholder(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            com.flextv.livestore.utils.GlideRequest r0 = r0.override(r2, r2)
            com.flextv.livestore.utils.ImageLoaderJava$1 r2 = new com.flextv.livestore.utils.ImageLoaderJava$1
            r2.<init>()
            com.flextv.livestore.utils.GlideRequest r0 = r0.listener(r2)
            r0.into(r1)
            return
    }
}
