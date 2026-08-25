package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class AssetUriLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> {
    private static final java.lang.String ASSET_PATH_SEGMENT = "android_asset";
    private static final java.lang.String ASSET_PREFIX = "file:///android_asset/";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private final android.content.res.AssetManager assetManager;
    private final com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory<Data> factory;

    /* JADX INFO: loaded from: classes3.dex */
    public interface AssetFetcherFactory<Data> {
        com.bumptech.glide.load.data.DataFetcher<Data> buildFetcher(android.content.res.AssetManager r1, java.lang.String r2);
    }

    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.os.ParcelFileDescriptor>, com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory<android.os.ParcelFileDescriptor> {
        private final android.content.res.AssetManager assetManager;

        public FileDescriptorFactory(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.assetManager = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.os.ParcelFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.AssetUriLoader r2 = new com.bumptech.glide.load.model.AssetUriLoader
                android.content.res.AssetManager r0 = r1.assetManager
                r2.<init>(r0, r1)
                return r2
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<android.os.ParcelFileDescriptor> buildFetcher(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher r0 = new com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream>, com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory<java.io.InputStream> {
        private final android.content.res.AssetManager assetManager;

        public StreamFactory(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.assetManager = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.AssetUriLoader r2 = new com.bumptech.glide.load.model.AssetUriLoader
                android.content.res.AssetManager r0 = r1.assetManager
                r2.<init>(r0, r1)
                return r2
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> buildFetcher(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.StreamAssetPathFetcher r0 = new com.bumptech.glide.load.data.StreamAssetPathFetcher
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public AssetUriLoader(android.content.res.AssetManager r1, com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory<Data> r2) {
            r0 = this;
            r0.<init>()
            r0.assetManager = r1
            r0.factory = r2
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            java.lang.String r3 = r2.toString()
            int r4 = com.bumptech.glide.load.model.AssetUriLoader.ASSET_PREFIX_LENGTH
            java.lang.String r3 = r3.substring(r4)
            com.bumptech.glide.load.model.ModelLoader$LoadData r4 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r5 = new com.bumptech.glide.signature.ObjectKey
            r5.<init>(r2)
            com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory<Data> r2 = r1.factory
            android.content.res.AssetManager r0 = r1.assetManager
            com.bumptech.glide.load.data.DataFetcher r2 = r2.buildFetcher(r0, r3)
            r4.<init>(r5, r2)
            return r4
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L28
            java.util.List r0 = r3.getPathSegments()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.util.List r3 = r3.getPathSegments()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r0 = "android_asset"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L28
            r1 = 1
        L28:
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
