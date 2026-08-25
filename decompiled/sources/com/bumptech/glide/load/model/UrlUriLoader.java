package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class UrlUriLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> SCHEMES = null;
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, Data> urlLoader;

    /* JADX INFO: loaded from: classes3.dex */
    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream> {
        public StreamFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r4) {
                r3 = this;
                com.bumptech.glide.load.model.UrlUriLoader r0 = new com.bumptech.glide.load.model.UrlUriLoader
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

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "http"
            java.lang.String r2 = "https"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.model.UrlUriLoader.SCHEMES = r0
            return
    }

    public UrlUriLoader(com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.urlLoader = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.model.GlideUrl r0 = new com.bumptech.glide.load.model.GlideUrl
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, Data> r2 = r1.urlLoader
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = r2.buildLoadData(r0, r3, r4, r5)
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.net.Uri r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = com.bumptech.glide.load.model.UrlUriLoader.SCHEMES
            java.lang.String r2 = r2.getScheme()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
