package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<byte[], Data> {
    private final com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter;

    /* JADX INFO: loaded from: classes.dex */
    public static class ByteBufferFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<byte[], java.nio.ByteBuffer> {


        public ByteBufferFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<byte[], java.nio.ByteBuffer> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.ByteArrayLoader r2 = new com.bumptech.glide.load.model.ByteArrayLoader
                com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory$1 r0 = new com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory$1
                r0.<init>()
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Converter<Data> {
        Data convert(byte[] r1);

        java.lang.Class<Data> getDataClass();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Fetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data> {
        private final com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter;
        private final byte[] model;

        public Fetcher(byte[] r1, com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.model = r1
                r0.converter = r2
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public java.lang.Class<Data> getDataClass() {
                r1 = this;
                com.bumptech.glide.load.model.ByteArrayLoader$Converter<Data> r0 = r1.converter
                java.lang.Class r0 = r0.getDataClass()
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.DataSource getDataSource() {
                r1 = this;
                com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> r3) {
                r1 = this;
                com.bumptech.glide.load.model.ByteArrayLoader$Converter<Data> r2 = r1.converter
                byte[] r0 = r1.model
                java.lang.Object r2 = r2.convert(r0)
                r3.onDataReady(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<byte[], java.io.InputStream> {


        public StreamFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<byte[], java.io.InputStream> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.ByteArrayLoader r2 = new com.bumptech.glide.load.model.ByteArrayLoader
                com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory$1 r0 = new com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory$1
                r0.<init>()
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public ByteArrayLoader(com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.converter = r1
            return
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull byte[] r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull byte[] r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r4 = new com.bumptech.glide.signature.ObjectKey
            r4.<init>(r2)
            com.bumptech.glide.load.model.ByteArrayLoader$Fetcher r5 = new com.bumptech.glide.load.model.ByteArrayLoader$Fetcher
            com.bumptech.glide.load.model.ByteArrayLoader$Converter<Data> r0 = r1.converter
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull byte[] r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
