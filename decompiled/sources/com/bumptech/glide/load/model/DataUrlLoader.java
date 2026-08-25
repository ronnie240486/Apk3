package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public final class DataUrlLoader<Model, Data> implements com.bumptech.glide.load.model.ModelLoader<Model, Data> {
    private static final java.lang.String BASE64_TAG = ";base64";
    private static final java.lang.String DATA_SCHEME_IMAGE = "data:image";
    private final com.bumptech.glide.load.model.DataUrlLoader.DataDecoder<Data> dataDecoder;

    /* JADX INFO: loaded from: classes3.dex */
    public interface DataDecoder<Data> {
        void close(Data r1) throws java.io.IOException;

        Data decode(java.lang.String r1) throws java.lang.IllegalArgumentException;

        java.lang.Class<Data> getDataClass();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DataUriFetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data> {
        private Data data;
        private final java.lang.String dataUri;
        private final com.bumptech.glide.load.model.DataUrlLoader.DataDecoder<Data> reader;

        public DataUriFetcher(java.lang.String r1, com.bumptech.glide.load.model.DataUrlLoader.DataDecoder<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.dataUri = r1
                r0.reader = r2
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
                r2 = this;
                com.bumptech.glide.load.model.DataUrlLoader$DataDecoder<Data> r0 = r2.reader     // Catch: java.io.IOException -> L7
                Data r1 = r2.data     // Catch: java.io.IOException -> L7
                r0.close(r1)     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public java.lang.Class<Data> getDataClass() {
                r1 = this;
                com.bumptech.glide.load.model.DataUrlLoader$DataDecoder<Data> r0 = r1.reader
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
                com.bumptech.glide.load.model.DataUrlLoader$DataDecoder<Data> r2 = r1.reader     // Catch: java.lang.IllegalArgumentException -> Le
                java.lang.String r0 = r1.dataUri     // Catch: java.lang.IllegalArgumentException -> Le
                java.lang.Object r2 = r2.decode(r0)     // Catch: java.lang.IllegalArgumentException -> Le
                r1.data = r2     // Catch: java.lang.IllegalArgumentException -> Le
                r3.onDataReady(r2)     // Catch: java.lang.IllegalArgumentException -> Le
                goto L12
            Le:
                r2 = move-exception
                r3.onLoadFailed(r2)
            L12:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StreamFactory<Model> implements com.bumptech.glide.load.model.ModelLoaderFactory<Model, java.io.InputStream> {
        private final com.bumptech.glide.load.model.DataUrlLoader.DataDecoder<java.io.InputStream> opener;


        public StreamFactory() {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.load.model.DataUrlLoader$StreamFactory$1 r0 = new com.bumptech.glide.load.model.DataUrlLoader$StreamFactory$1
                r0.<init>()
                r1.opener = r0
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<Model, java.io.InputStream> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.DataUrlLoader r2 = new com.bumptech.glide.load.model.DataUrlLoader
                com.bumptech.glide.load.model.DataUrlLoader$DataDecoder<java.io.InputStream> r0 = r1.opener
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public DataUrlLoader(com.bumptech.glide.load.model.DataUrlLoader.DataDecoder<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.dataDecoder = r1
            return
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(@androidx.annotation.NonNull Model r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r4 = new com.bumptech.glide.signature.ObjectKey
            r4.<init>(r2)
            com.bumptech.glide.load.model.DataUrlLoader$DataUriFetcher r5 = new com.bumptech.glide.load.model.DataUrlLoader$DataUriFetcher
            java.lang.String r2 = r2.toString()
            com.bumptech.glide.load.model.DataUrlLoader$DataDecoder<Data> r0 = r1.dataDecoder
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@androidx.annotation.NonNull Model r2) {
            r1 = this;
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "data:image"
            boolean r2 = r2.startsWith(r0)
            return r2
    }
}
