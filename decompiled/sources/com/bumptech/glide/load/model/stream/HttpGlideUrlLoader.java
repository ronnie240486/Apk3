package com.bumptech.glide.load.model.stream;

/* JADX INFO: loaded from: classes2.dex */
public class HttpGlideUrlLoader implements com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
    public static final com.bumptech.glide.load.Option<java.lang.Integer> TIMEOUT = null;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache;

    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
        private final com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache;

        public Factory() {
                r3 = this;
                r3.<init>()
                com.bumptech.glide.load.model.ModelCache r0 = new com.bumptech.glide.load.model.ModelCache
                r1 = 500(0x1f4, double:2.47E-321)
                r0.<init>(r1)
                r3.modelCache = r0
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.stream.HttpGlideUrlLoader r2 = new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader
                com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> r0 = r1.modelCache
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    static {
            r0 = 2500(0x9c4, float:3.503E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.TIMEOUT = r0
            return
    }

    public HttpGlideUrlLoader() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public HttpGlideUrlLoader(@androidx.annotation.Nullable com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> r1) {
            r0 = this;
            r0.<init>()
            r0.modelCache = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData2(@androidx.annotation.NonNull com.bumptech.glide.load.model.GlideUrl r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> r2 = r0.modelCache
            if (r2 == 0) goto L14
            r3 = 0
            java.lang.Object r2 = r2.get(r1, r3, r3)
            com.bumptech.glide.load.model.GlideUrl r2 = (com.bumptech.glide.load.model.GlideUrl) r2
            if (r2 != 0) goto L13
            com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> r2 = r0.modelCache
            r2.put(r1, r3, r3, r1)
            goto L14
        L13:
            r1 = r2
        L14:
            com.bumptech.glide.load.Option<java.lang.Integer> r2 = com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.TIMEOUT
            java.lang.Object r2 = r4.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.load.data.HttpUrlFetcher r4 = new com.bumptech.glide.load.data.HttpUrlFetcher
            r4.<init>(r1, r2)
            r3.<init>(r1, r4)
            return r3
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
