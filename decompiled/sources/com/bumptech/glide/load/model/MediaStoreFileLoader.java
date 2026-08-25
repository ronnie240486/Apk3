package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public final class MediaStoreFileLoader implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.File> {
    private final android.content.Context context;

    public static final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.File> {
        private final android.content.Context context;

        public Factory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.File> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.MediaStoreFileLoader r2 = new com.bumptech.glide.load.model.MediaStoreFileLoader
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

    /* JADX INFO: loaded from: classes3.dex */
    public static class FilePathFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.File> {
        private static final java.lang.String[] PROJECTION = null;
        private final android.content.Context context;
        private final android.net.Uri uri;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.model.MediaStoreFileLoader.FilePathFetcher.PROJECTION = r0
                return
        }

        public FilePathFetcher(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.uri = r2
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
        public java.lang.Class<java.io.File> getDataClass() {
                r1 = this;
                java.lang.Class<java.io.File> r0 = java.io.File.class
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
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r7, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.File> r8) {
                r6 = this;
                android.content.Context r7 = r6.context
                android.content.ContentResolver r0 = r7.getContentResolver()
                android.net.Uri r1 = r6.uri
                java.lang.String[] r2 = com.bumptech.glide.load.model.MediaStoreFileLoader.FilePathFetcher.PROJECTION
                r3 = 0
                r4 = 0
                r5 = 0
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                r0 = 0
                if (r7 == 0) goto L2d
                boolean r1 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L28
                if (r1 == 0) goto L24
                java.lang.String r0 = "_data"
                int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L28
            L24:
                r7.close()
                goto L2d
            L28:
                r8 = move-exception
                r7.close()
                throw r8
            L2d:
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 == 0) goto L4b
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
                java.lang.String r0 = "Failed to find file path for: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                android.net.Uri r1 = r6.uri
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                r8.onLoadFailed(r7)
                goto L53
            L4b:
                java.io.File r7 = new java.io.File
                r7.<init>(r0)
                r8.onDataReady(r7)
            L53:
                return
        }
    }

    public MediaStoreFileLoader(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.File> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r4 = new com.bumptech.glide.signature.ObjectKey
            r4.<init>(r2)
            com.bumptech.glide.load.model.MediaStoreFileLoader$FilePathFetcher r5 = new com.bumptech.glide.load.model.MediaStoreFileLoader$FilePathFetcher
            android.content.Context r0 = r1.context
            r5.<init>(r0, r2)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.File> buildLoadData(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.mediastore.MediaStoreUtil.isMediaStoreUri(r1)
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
