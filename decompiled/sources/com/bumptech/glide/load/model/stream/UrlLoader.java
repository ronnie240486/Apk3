package com.bumptech.glide.load.model.stream;

/* JADX INFO: loaded from: classes.dex */
public class UrlLoader implements com.bumptech.glide.load.model.ModelLoader<java.net.URL, java.io.InputStream> {
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> glideUrlLoader;

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.net.URL, java.io.InputStream> {
        public StreamFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.net.URL, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r4) {
                r3 = this;
                com.bumptech.glide.load.model.stream.UrlLoader r0 = new com.bumptech.glide.load.model.stream.UrlLoader
                java.lang.Class<com.bumptech.glide.load.model.GlideUrl> r1 = com.bumptech.glide.load.model.GlideUrl.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                com.bumptech.glide.load.model.ModelLoader r4 = r4.build(r1, r2)
                r0.<init>(r4)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public UrlLoader(com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> r1) {
            r0 = this;
            r0.<init>()
            r0.glideUrlLoader = r1
            return
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@androidx.annotation.NonNull java.net.URL r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData2(@androidx.annotation.NonNull java.net.URL r3, int r4, int r5, @androidx.annotation.NonNull com.bumptech.glide.load.Options r6) {
            r2 = this;
            com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> r0 = r2.glideUrlLoader
            com.bumptech.glide.load.model.GlideUrl r1 = new com.bumptech.glide.load.model.GlideUrl
            r1.<init>(r3)
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = r0.buildLoadData(r1, r4, r5, r6)
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.net.URL r1) {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.net.URL r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
