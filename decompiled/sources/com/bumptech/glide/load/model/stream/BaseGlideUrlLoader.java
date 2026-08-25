package com.bumptech.glide.load.model.stream;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGlideUrlLoader<Model> implements com.bumptech.glide.load.model.ModelLoader<Model, java.io.InputStream> {
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> concreteLoader;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.model.ModelCache<Model, com.bumptech.glide.load.model.GlideUrl> modelCache;

    private static java.util.List<com.bumptech.glide.load.Key> getAlternateKeys(java.util.Collection<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bumptech.glide.load.model.GlideUrl r2 = new com.bumptech.glide.load.model.GlideUrl
            r2.<init>(r1)
            r0.add(r2)
            goto Ld
        L22:
            return r0
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@androidx.annotation.NonNull Model r4, int r5, int r6, @androidx.annotation.NonNull com.bumptech.glide.load.Options r7) {
            r3 = this;
            com.bumptech.glide.load.model.ModelCache<Model, com.bumptech.glide.load.model.GlideUrl> r0 = r3.modelCache
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get(r4, r5, r6)
            com.bumptech.glide.load.model.GlideUrl r0 = (com.bumptech.glide.load.model.GlideUrl) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L29
            java.lang.String r0 = r3.getUrl()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            com.bumptech.glide.load.model.GlideUrl r1 = new com.bumptech.glide.load.model.GlideUrl
            com.bumptech.glide.load.model.Headers r2 = com.bumptech.glide.load.model.Headers.DEFAULT
            r1.<init>(r0, r2)
            com.bumptech.glide.load.model.ModelCache<Model, com.bumptech.glide.load.model.GlideUrl> r0 = r3.modelCache
            if (r0 == 0) goto L28
            r0.put(r4, r5, r6, r1)
        L28:
            r0 = r1
        L29:
            java.util.List r4 = java.util.Collections.emptyList()
            com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> r1 = r3.concreteLoader
            com.bumptech.glide.load.model.ModelLoader$LoadData r5 = r1.buildLoadData(r0, r5, r6, r7)
            if (r5 == 0) goto L4a
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L3c
            goto L4a
        L3c:
            com.bumptech.glide.load.model.ModelLoader$LoadData r6 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.load.Key r7 = r5.sourceKey
            java.util.List r4 = getAlternateKeys(r4)
            com.bumptech.glide.load.data.DataFetcher<Data> r5 = r5.fetcher
            r6.<init>(r7, r4, r5)
            return r6
        L4a:
            return r5
    }

    public abstract java.lang.String getUrl();
}
