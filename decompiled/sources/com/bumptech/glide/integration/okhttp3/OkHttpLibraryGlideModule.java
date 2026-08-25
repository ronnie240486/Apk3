package com.bumptech.glide.integration.okhttp3;

/* JADX INFO: loaded from: classes3.dex */
@com.bumptech.glide.annotation.GlideModule
public final class OkHttpLibraryGlideModule extends com.bumptech.glide.module.LibraryGlideModule {
    public OkHttpLibraryGlideModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.Glide r3, @androidx.annotation.NonNull com.bumptech.glide.Registry r4) {
            r1 = this;
            java.lang.Class<com.bumptech.glide.load.model.GlideUrl> r2 = com.bumptech.glide.load.model.GlideUrl.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory r0 = new com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory
            r0.<init>()
            r4.replace(r2, r3, r0)
            return
    }
}
