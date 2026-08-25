package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedAppGlideModuleImpl extends com.bumptech.glide.GeneratedAppGlideModule {
    private final com.flextv.livestore.utils.MyGlideModule appGlideModule;

    public GeneratedAppGlideModuleImpl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.utils.MyGlideModule r2 = new com.flextv.livestore.utils.MyGlideModule
            r2.<init>()
            r1.appGlideModule = r2
            java.lang.String r2 = "Glide"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Discovered AppGlideModule from annotation: com.flextv.livestore.utils.MyGlideModule"
            android.util.Log.d(r2, r0)
            java.lang.String r0 = "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule"
            android.util.Log.d(r2, r0)
        L1d:
            return
    }

    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.GlideBuilder r3) {
            r1 = this;
            com.flextv.livestore.utils.MyGlideModule r0 = r1.appGlideModule
            r0.applyOptions(r2, r3)
            return
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @androidx.annotation.NonNull
    public java.util.Set<java.lang.Class<?>> getExcludedModuleClasses() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @androidx.annotation.NonNull
    public final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory() {
            r1 = this;
            com.bumptech.glide.GeneratedRequestManagerFactory r0 = new com.bumptech.glide.GeneratedRequestManagerFactory
            r0.<init>()
            return r0
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean isManifestParsingEnabled() {
            r1 = this;
            com.flextv.livestore.utils.MyGlideModule r0 = r1.appGlideModule
            boolean r0 = r0.isManifestParsingEnabled()
            return r0
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.Glide r3, @androidx.annotation.NonNull com.bumptech.glide.Registry r4) {
            r1 = this;
            com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule r0 = new com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule
            r0.<init>()
            r0.registerComponents(r2, r3, r4)
            com.flextv.livestore.utils.MyGlideModule r0 = r1.appGlideModule
            r0.registerComponents(r2, r3, r4)
            return
    }
}
