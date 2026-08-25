package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class UnitModelLoader<Model> implements com.bumptech.glide.load.model.ModelLoader<Model, Model> {
    private static final com.bumptech.glide.load.model.UnitModelLoader<?> INSTANCE = null;

    /* JADX INFO: loaded from: classes3.dex */
    public static class Factory<Model> implements com.bumptech.glide.load.model.ModelLoaderFactory<Model, Model> {
        private static final com.bumptech.glide.load.model.UnitModelLoader.Factory<?> FACTORY = null;

        static {
                com.bumptech.glide.load.model.UnitModelLoader$Factory r0 = new com.bumptech.glide.load.model.UnitModelLoader$Factory
                r0.<init>()
                com.bumptech.glide.load.model.UnitModelLoader.Factory.FACTORY = r0
                return
        }

        @java.lang.Deprecated
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        public static <T> com.bumptech.glide.load.model.UnitModelLoader.Factory<T> getInstance() {
                com.bumptech.glide.load.model.UnitModelLoader$Factory<?> r0 = com.bumptech.glide.load.model.UnitModelLoader.Factory.FACTORY
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<Model, Model> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r1) {
                r0 = this;
                com.bumptech.glide.load.model.UnitModelLoader r1 = com.bumptech.glide.load.model.UnitModelLoader.getInstance()
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class UnitFetcher<Model> implements com.bumptech.glide.load.data.DataFetcher<Model> {
        private final Model resource;

        public UnitFetcher(Model r1) {
                r0 = this;
                r0.<init>()
                r0.resource = r1
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
        public java.lang.Class<Model> getDataClass() {
                r1 = this;
                Model r0 = r1.resource
                java.lang.Class r0 = r0.getClass()
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
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Model> r2) {
                r0 = this;
                Model r1 = r0.resource
                r2.onDataReady(r1)
                return
        }
    }

    static {
            com.bumptech.glide.load.model.UnitModelLoader r0 = new com.bumptech.glide.load.model.UnitModelLoader
            r0.<init>()
            com.bumptech.glide.load.model.UnitModelLoader.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public UnitModelLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.bumptech.glide.load.model.UnitModelLoader<T> getInstance() {
            com.bumptech.glide.load.model.UnitModelLoader<?> r0 = com.bumptech.glide.load.model.UnitModelLoader.INSTANCE
            return r0
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Model> buildLoadData(@androidx.annotation.NonNull Model r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r3 = new com.bumptech.glide.signature.ObjectKey
            r3.<init>(r1)
            com.bumptech.glide.load.model.UnitModelLoader$UnitFetcher r4 = new com.bumptech.glide.load.model.UnitModelLoader$UnitFetcher
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@androidx.annotation.NonNull Model r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
