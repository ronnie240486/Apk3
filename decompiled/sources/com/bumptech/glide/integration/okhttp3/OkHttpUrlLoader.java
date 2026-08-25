package com.bumptech.glide.integration.okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpUrlLoader implements com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
    private final okhttp3.Call.Factory client;

    /* JADX INFO: loaded from: classes3.dex */
    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
        private static volatile okhttp3.Call.Factory internalClient;
        private final okhttp3.Call.Factory client;

        public Factory() {
                r1 = this;
                okhttp3.Call$Factory r0 = getInternalClient()
                r1.<init>(r0)
                return
        }

        public Factory(@androidx.annotation.NonNull okhttp3.Call.Factory r1) {
                r0 = this;
                r0.<init>()
                r0.client = r1
                return
        }

        private static okhttp3.Call.Factory getInternalClient() {
                okhttp3.Call$Factory r0 = com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory.internalClient
                if (r0 != 0) goto L17
                java.lang.Class<com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader$Factory> r0 = com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory.class
                monitor-enter(r0)
                okhttp3.Call$Factory r1 = com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory.internalClient     // Catch: java.lang.Throwable -> L14
                if (r1 != 0) goto L12
                okhttp3.OkHttpClient r1 = new okhttp3.OkHttpClient     // Catch: java.lang.Throwable -> L14
                r1.<init>()     // Catch: java.lang.Throwable -> L14
                com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory.internalClient = r1     // Catch: java.lang.Throwable -> L14
            L12:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                goto L17
            L14:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                throw r1
            L17:
                okhttp3.Call$Factory r0 = com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory.internalClient
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader r2 = new com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader
                okhttp3.Call$Factory r0 = r1.client
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public OkHttpUrlLoader(@androidx.annotation.NonNull okhttp3.Call.Factory r1) {
            r0 = this;
            r0.<init>()
            r0.client = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData2(@androidx.annotation.NonNull com.bumptech.glide.load.model.GlideUrl r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.integration.okhttp3.OkHttpStreamFetcher r3 = new com.bumptech.glide.integration.okhttp3.OkHttpStreamFetcher
            okhttp3.Call$Factory r4 = r0.client
            r3.<init>(r4, r1)
            r2.<init>(r1, r3)
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@androidx.annotation.NonNull com.bumptech.glide.load.model.GlideUrl r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.GlideUrl r1 = (com.bumptech.glide.load.model.GlideUrl) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull com.bumptech.glide.load.model.GlideUrl r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull com.bumptech.glide.load.model.GlideUrl r1) {
            r0 = this;
            com.bumptech.glide.load.model.GlideUrl r1 = (com.bumptech.glide.load.model.GlideUrl) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
