package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class FileLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<java.io.File, Data> {
    private static final java.lang.String TAG = "FileLoader";
    private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> fileOpener;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Factory<Data> implements com.bumptech.glide.load.model.ModelLoaderFactory<java.io.File, Data> {
        private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> opener;

        public Factory(com.bumptech.glide.load.model.FileLoader.FileOpener<Data> r1) {
                r0 = this;
                r0.<init>()
                r0.opener = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public final com.bumptech.glide.load.model.ModelLoader<java.io.File, Data> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.FileLoader r2 = new com.bumptech.glide.load.model.FileLoader
                com.bumptech.glide.load.model.FileLoader$FileOpener<Data> r0 = r1.opener
                r2.<init>(r0)
                return r2
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
                r0 = this;
                return
        }
    }

    public static class FileDescriptorFactory extends com.bumptech.glide.load.model.FileLoader.Factory<android.os.ParcelFileDescriptor> {


        public FileDescriptorFactory() {
                r1 = this;
                com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory$1 r0 = new com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory$1
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FileFetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data> {
        private Data data;
        private final java.io.File file;
        private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> opener;

        public FileFetcher(java.io.File r1, com.bumptech.glide.load.model.FileLoader.FileOpener<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.file = r1
                r0.opener = r2
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
                Data r0 = r2.data
                if (r0 == 0) goto L9
                com.bumptech.glide.load.model.FileLoader$FileOpener<Data> r1 = r2.opener     // Catch: java.io.IOException -> L9
                r1.close(r0)     // Catch: java.io.IOException -> L9
            L9:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public java.lang.Class<Data> getDataClass() {
                r1 = this;
                com.bumptech.glide.load.model.FileLoader$FileOpener<Data> r0 = r1.opener
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
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> r4) {
                r2 = this;
                com.bumptech.glide.load.model.FileLoader$FileOpener<Data> r3 = r2.opener     // Catch: java.io.FileNotFoundException -> Le
                java.io.File r0 = r2.file     // Catch: java.io.FileNotFoundException -> Le
                java.lang.Object r3 = r3.open(r0)     // Catch: java.io.FileNotFoundException -> Le
                r2.data = r3     // Catch: java.io.FileNotFoundException -> Le
                r4.onDataReady(r3)     // Catch: java.io.FileNotFoundException -> Le
                goto L20
            Le:
                r3 = move-exception
                r0 = 3
                java.lang.String r1 = "FileLoader"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1d
                java.lang.String r0 = "Failed to open file"
                android.util.Log.d(r1, r0, r3)
            L1d:
                r4.onLoadFailed(r3)
            L20:
                return
        }
    }

    public interface FileOpener<Data> {
        void close(Data r1) throws java.io.IOException;

        java.lang.Class<Data> getDataClass();

        Data open(java.io.File r1) throws java.io.FileNotFoundException;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class StreamFactory extends com.bumptech.glide.load.model.FileLoader.Factory<java.io.InputStream> {


        public StreamFactory() {
                r1 = this;
                com.bumptech.glide.load.model.FileLoader$StreamFactory$1 r0 = new com.bumptech.glide.load.model.FileLoader$StreamFactory$1
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    public FileLoader(com.bumptech.glide.load.model.FileLoader.FileOpener<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.fileOpener = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull java.io.File r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r4 = new com.bumptech.glide.signature.ObjectKey
            r4.<init>(r2)
            com.bumptech.glide.load.model.FileLoader$FileFetcher r5 = new com.bumptech.glide.load.model.FileLoader$FileFetcher
            com.bumptech.glide.load.model.FileLoader$FileOpener<Data> r0 = r1.fileOpener
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.io.File r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.io.File r1) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
