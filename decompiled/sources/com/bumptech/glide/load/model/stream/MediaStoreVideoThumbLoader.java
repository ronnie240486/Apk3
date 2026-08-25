package com.bumptech.glide.load.model.stream;

/* JADX INFO: loaded from: classes.dex */
public class MediaStoreVideoThumbLoader implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> {
    private final android.content.Context context;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream> {
        private final android.content.Context context;

        public Factory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader r2 = new com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader
                android.content.Context r0 = r1.context
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public MediaStoreVideoThumbLoader(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            return
    }

    private boolean isRequestingDefaultFrame(com.bumptech.glide.load.Options r5) {
            r4 = this;
            com.bumptech.glide.load.Option<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME
            java.lang.Object r5 = r5.get(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L16
            long r0 = r5.longValue()
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            return r5
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            boolean r2 = com.bumptech.glide.load.data.mediastore.MediaStoreUtil.isThumbnailSize(r2, r3)
            if (r2 == 0) goto L1d
            boolean r2 = r0.isRequestingDefaultFrame(r4)
            if (r2 == 0) goto L1d
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r3 = new com.bumptech.glide.signature.ObjectKey
            r3.<init>(r1)
            android.content.Context r4 = r0.context
            com.bumptech.glide.load.data.mediastore.ThumbFetcher r1 = com.bumptech.glide.load.data.mediastore.ThumbFetcher.buildVideoFetcher(r4, r1)
            r2.<init>(r3, r1)
            return r2
        L1d:
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.mediastore.MediaStoreUtil.isMediaStoreVideoUri(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
