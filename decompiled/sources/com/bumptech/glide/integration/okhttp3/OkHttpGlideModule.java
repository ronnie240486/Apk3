package com.bumptech.glide.integration.okhttp3;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class OkHttpGlideModule implements com.bumptech.glide.module.GlideModule {
    public OkHttpGlideModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.module.GlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bumptech.glide.GlideBuilder r2) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.module.GlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(android.content.Context r2, com.bumptech.glide.Glide r3, com.bumptech.glide.Registry r4) {
            r1 = this;
            java.lang.Class<com.bumptech.glide.load.model.GlideUrl> r2 = com.bumptech.glide.load.model.GlideUrl.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory r0 = new com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory
            r0.<init>()
            r4.replace(r2, r3, r0)
            return
    }
}
