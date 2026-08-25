package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
@com.bumptech.glide.annotation.GlideModule
public class MyGlideModule extends com.bumptech.glide.module.AppGlideModule {
    public MyGlideModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(android.content.Context r1, com.bumptech.glide.GlideBuilder r2) {
            r0 = this;
            super.applyOptions(r1, r2)
            return
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.Glide r4, @androidx.annotation.NonNull com.bumptech.glide.Registry r5) {
            r2 = this;
            okhttp3.OkHttpClient r3 = com.flextv.livestore.utils.UnsafeOkHttpClient.getUnsafeOkHttpClient()
            java.lang.Class<com.bumptech.glide.load.model.GlideUrl> r4 = com.bumptech.glide.load.model.GlideUrl.class
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory r1 = new com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory
            r1.<init>(r3)
            r5.replace(r4, r0, r1)
            return
    }
}
