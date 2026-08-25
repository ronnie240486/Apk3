package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class UriLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> SCHEMES = null;
    private final com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<Data> factory;

    /* JADX INFO: loaded from: classes.dex */
    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.content.res.AssetFileDescriptor>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<android.content.res.AssetFileDescriptor> {
        private final android.content.ContentResolver contentResolver;

        public AssetFileDescriptorFactory(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.contentResolver = r1
                return
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<android.content.res.AssetFileDescriptor> build(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher r0 = new com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher
                android.content.ContentResolver r1 = r2.contentResolver
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.content.res.AssetFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r1) {
                r0 = this;
                com.bumptech.glide.load.model.UriLoader r1 = new com.bumptech.glide.load.model.UriLoader
                r1.<init>(r0)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.os.ParcelFileDescriptor>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<android.os.ParcelFileDescriptor> {
        private final android.content.ContentResolver contentResolver;

        public FileDescriptorFactory(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.contentResolver = r1
                return
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<android.os.ParcelFileDescriptor> build(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher r0 = new com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher
                android.content.ContentResolver r1 = r2.contentResolver
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.os.ParcelFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r1) {
                r0 = this;
                com.bumptech.glide.load.model.UriLoader r1 = new com.bumptech.glide.load.model.UriLoader
                r1.<init>(r0)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface LocalUriFetcherFactory<Data> {
        com.bumptech.glide.load.data.DataFetcher<Data> build(android.net.Uri r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<java.io.InputStream> {
        private final android.content.ContentResolver contentResolver;

        public StreamFactory(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.contentResolver = r1
                return
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> build(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.StreamLocalUriFetcher r0 = new com.bumptech.glide.load.data.StreamLocalUriFetcher
                android.content.ContentResolver r1 = r2.contentResolver
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r1) {
                r0 = this;
                com.bumptech.glide.load.model.UriLoader r1 = new com.bumptech.glide.load.model.UriLoader
                r1.<init>(r0)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "file"
            java.lang.String r2 = "android.resource"
            java.lang.String r3 = "content"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.model.UriLoader.SCHEMES = r0
            return
    }

    public UriLoader(com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.factory = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r3 = new com.bumptech.glide.signature.ObjectKey
            r3.<init>(r1)
            com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory<Data> r4 = r0.factory
            com.bumptech.glide.load.data.DataFetcher r1 = r4.build(r1)
            r2.<init>(r3, r1)
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
            java.util.Set<java.lang.String> r0 = com.bumptech.glide.load.model.UriLoader.SCHEMES
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
