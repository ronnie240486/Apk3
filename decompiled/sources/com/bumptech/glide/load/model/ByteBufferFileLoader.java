package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferFileLoader implements com.bumptech.glide.load.model.ModelLoader<java.io.File, java.nio.ByteBuffer> {
    private static final java.lang.String TAG = "ByteBufferFileLoader";

    public static final class ByteBufferFetcher implements com.bumptech.glide.load.data.DataFetcher<java.nio.ByteBuffer> {
        private final java.io.File file;

        public ByteBufferFetcher(java.io.File r1) {
                r0 = this;
                r0.<init>()
                r0.file = r1
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
        public java.lang.Class<java.nio.ByteBuffer> getDataClass() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
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
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.nio.ByteBuffer> r4) {
                r2 = this;
                java.io.File r3 = r2.file     // Catch: java.io.IOException -> La
                java.nio.ByteBuffer r3 = com.bumptech.glide.util.ByteBufferUtil.fromFile(r3)     // Catch: java.io.IOException -> La
                r4.onDataReady(r3)     // Catch: java.io.IOException -> La
                goto L1c
            La:
                r3 = move-exception
                r0 = 3
                java.lang.String r1 = "ByteBufferFileLoader"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L19
                java.lang.String r0 = "Failed to obtain ByteBuffer for file"
                android.util.Log.d(r1, r0, r3)
            L19:
                r4.onLoadFailed(r3)
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.io.File, java.nio.ByteBuffer> {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.io.File, java.nio.ByteBuffer> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r1) {
                r0 = this;
                com.bumptech.glide.load.model.ByteBufferFileLoader r1 = new com.bumptech.glide.load.model.ByteBufferFileLoader
                r1.<init>()
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public ByteBufferFileLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.nio.ByteBuffer> buildLoadData2(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r3 = new com.bumptech.glide.signature.ObjectKey
            r3.<init>(r1)
            com.bumptech.glide.load.model.ByteBufferFileLoader$ByteBufferFetcher r4 = new com.bumptech.glide.load.model.ByteBufferFileLoader$ByteBufferFetcher
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData<java.nio.ByteBuffer> buildLoadData(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
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
