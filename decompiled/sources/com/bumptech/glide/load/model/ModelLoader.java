package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes3.dex */
public interface ModelLoader<Model, Data> {

    /* JADX INFO: loaded from: classes2.dex */
    public static class LoadData<Data> {
        public final java.util.List<com.bumptech.glide.load.Key> alternateKeys;
        public final com.bumptech.glide.load.data.DataFetcher<Data> fetcher;
        public final com.bumptech.glide.load.Key sourceKey;

        public LoadData(@androidx.annotation.NonNull com.bumptech.glide.load.Key r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher<Data> r3) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r0, r3)
                return
        }

        public LoadData(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.Key> r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher<Data> r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.Key r1 = (com.bumptech.glide.load.Key) r1
                r0.sourceKey = r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
                java.util.List r1 = (java.util.List) r1
                r0.alternateKeys = r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
                com.bumptech.glide.load.data.DataFetcher r1 = (com.bumptech.glide.load.data.DataFetcher) r1
                r0.fetcher = r1
                return
        }
    }

    @androidx.annotation.Nullable
    com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(@androidx.annotation.NonNull Model r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4);

    boolean handles(@androidx.annotation.NonNull Model r1);
}
