package com.bumptech.glide.load.model.stream;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(29)
public final class QMediaStoreUriLoader<DataT> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> {
    private final android.content.Context context;
    private final java.lang.Class<DataT> dataClass;
    private final com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> fileDelegate;
    private final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> uriDelegate;

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Factory<DataT> implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, DataT> {
        private final android.content.Context context;
        private final java.lang.Class<DataT> dataClass;

        public Factory(android.content.Context r1, java.lang.Class<DataT> r2) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.dataClass = r2
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r6) {
                r5 = this;
                com.bumptech.glide.load.model.stream.QMediaStoreUriLoader r0 = new com.bumptech.glide.load.model.stream.QMediaStoreUriLoader
                android.content.Context r1 = r5.context
                java.lang.Class<java.io.File> r2 = java.io.File.class
                java.lang.Class<DataT> r3 = r5.dataClass
                com.bumptech.glide.load.model.ModelLoader r2 = r6.build(r2, r3)
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                java.lang.Class<DataT> r4 = r5.dataClass
                com.bumptech.glide.load.model.ModelLoader r6 = r6.build(r3, r4)
                java.lang.Class<DataT> r3 = r5.dataClass
                r0.<init>(r1, r2, r6, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static final class FileDescriptorFactory extends com.bumptech.glide.load.model.stream.QMediaStoreUriLoader.Factory<android.os.ParcelFileDescriptor> {
        public FileDescriptorFactory(android.content.Context r2) {
                r1 = this;
                java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                r1.<init>(r2, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static final class InputStreamFactory extends com.bumptech.glide.load.model.stream.QMediaStoreUriLoader.Factory<java.io.InputStream> {
        public InputStreamFactory(android.content.Context r2) {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                r1.<init>(r2, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class QMediaStoreUriFetcher<DataT> implements com.bumptech.glide.load.data.DataFetcher<DataT> {
        private static final java.lang.String[] PROJECTION = null;
        private final android.content.Context context;
        private final java.lang.Class<DataT> dataClass;

        @androidx.annotation.Nullable
        private volatile com.bumptech.glide.load.data.DataFetcher<DataT> delegate;
        private final com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> fileDelegate;
        private final int height;
        private volatile boolean isCancelled;
        private final com.bumptech.glide.load.Options options;
        private final android.net.Uri uri;
        private final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> uriDelegate;
        private final int width;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.model.stream.QMediaStoreUriLoader.QMediaStoreUriFetcher.PROJECTION = r0
                return
        }

        public QMediaStoreUriFetcher(android.content.Context r1, com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> r2, com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> r3, android.net.Uri r4, int r5, int r6, com.bumptech.glide.load.Options r7, java.lang.Class<DataT> r8) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.context = r1
                r0.fileDelegate = r2
                r0.uriDelegate = r3
                r0.uri = r4
                r0.width = r5
                r0.height = r6
                r0.options = r7
                r0.dataClass = r8
                return
        }

        @androidx.annotation.Nullable
        private com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> buildDelegateData() throws java.io.FileNotFoundException {
                r5 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                if (r0 == 0) goto L19
                com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> r0 = r5.fileDelegate
                android.net.Uri r1 = r5.uri
                java.io.File r1 = r5.queryForFilePath(r1)
                int r2 = r5.width
                int r3 = r5.height
                com.bumptech.glide.load.Options r4 = r5.options
                com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r1, r2, r3, r4)
                return r0
            L19:
                boolean r0 = r5.isAccessMediaLocationGranted()
                if (r0 == 0) goto L26
                android.net.Uri r0 = r5.uri
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L28
            L26:
                android.net.Uri r0 = r5.uri
            L28:
                com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> r1 = r5.uriDelegate
                int r2 = r5.width
                int r3 = r5.height
                com.bumptech.glide.load.Options r4 = r5.options
                com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r1.buildLoadData(r0, r2, r3, r4)
                return r0
        }

        @androidx.annotation.Nullable
        private com.bumptech.glide.load.data.DataFetcher<DataT> buildDelegateFetcher() throws java.io.FileNotFoundException {
                r1 = this;
                com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r1.buildDelegateData()
                if (r0 == 0) goto L9
                com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        private boolean isAccessMediaLocationGranted() {
                r2 = this;
                android.content.Context r0 = r2.context
                java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r1)
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @androidx.annotation.NonNull
        private java.io.File queryForFilePath(android.net.Uri r9) throws java.io.FileNotFoundException {
                r8 = this;
                r0 = 0
                android.content.Context r1 = r8.context     // Catch: java.lang.Throwable -> L60
                android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L60
                java.lang.String[] r4 = com.bumptech.glide.load.model.stream.QMediaStoreUriLoader.QMediaStoreUriFetcher.PROJECTION     // Catch: java.lang.Throwable -> L60
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r9
                android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L60
                if (r0 == 0) goto L49
                boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L49
                java.lang.String r1 = "_data"
                int r1 = r0.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L60
                java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L60
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L60
                if (r2 != 0) goto L32
                java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L60
                r9.<init>(r1)     // Catch: java.lang.Throwable -> L60
                r0.close()
                return r9
            L32:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r2.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r3 = "File path was empty in media store for: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L60
                r2.append(r9)     // Catch: java.lang.Throwable -> L60
                java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L60
                r1.<init>(r9)     // Catch: java.lang.Throwable -> L60
                throw r1     // Catch: java.lang.Throwable -> L60
            L49:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r2.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r3 = "Failed to media store entry for: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L60
                r2.append(r9)     // Catch: java.lang.Throwable -> L60
                java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L60
                r1.<init>(r9)     // Catch: java.lang.Throwable -> L60
                throw r1     // Catch: java.lang.Throwable -> L60
            L60:
                r9 = move-exception
                if (r0 == 0) goto L66
                r0.close()
            L66:
                throw r9
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.isCancelled = r0
                com.bumptech.glide.load.data.DataFetcher<DataT> r0 = r1.delegate
                if (r0 == 0) goto La
                r0.cancel()
            La:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
                r1 = this;
                com.bumptech.glide.load.data.DataFetcher<DataT> r0 = r1.delegate
                if (r0 == 0) goto L7
                r0.cleanup()
            L7:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public java.lang.Class<DataT> getDataClass() {
                r1 = this;
                java.lang.Class<DataT> r0 = r1.dataClass
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
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super DataT> r4) {
                r2 = this;
                com.bumptech.glide.load.data.DataFetcher r0 = r2.buildDelegateFetcher()     // Catch: java.io.FileNotFoundException -> L30
                if (r0 != 0) goto L22
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.io.FileNotFoundException -> L30
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L30
                r0.<init>()     // Catch: java.io.FileNotFoundException -> L30
                java.lang.String r1 = "Failed to build fetcher for: "
                r0.append(r1)     // Catch: java.io.FileNotFoundException -> L30
                android.net.Uri r1 = r2.uri     // Catch: java.io.FileNotFoundException -> L30
                r0.append(r1)     // Catch: java.io.FileNotFoundException -> L30
                java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L30
                r3.<init>(r0)     // Catch: java.io.FileNotFoundException -> L30
                r4.onLoadFailed(r3)     // Catch: java.io.FileNotFoundException -> L30
                return
            L22:
                r2.delegate = r0     // Catch: java.io.FileNotFoundException -> L30
                boolean r1 = r2.isCancelled     // Catch: java.io.FileNotFoundException -> L30
                if (r1 == 0) goto L2c
                r2.cancel()     // Catch: java.io.FileNotFoundException -> L30
                goto L34
            L2c:
                r0.loadData(r3, r4)     // Catch: java.io.FileNotFoundException -> L30
                goto L34
            L30:
                r3 = move-exception
                r4.onLoadFailed(r3)
            L34:
                return
        }
    }

    public QMediaStoreUriLoader(android.content.Context r1, com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> r2, com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> r3, java.lang.Class<DataT> r4) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.fileDelegate = r2
            r0.uriDelegate = r3
            r0.dataClass = r4
            return
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> buildLoadData2(@androidx.annotation.NonNull android.net.Uri r14, int r15, int r16, @androidx.annotation.NonNull com.bumptech.glide.load.Options r17) {
            r13 = this;
            r0 = r13
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r2 = new com.bumptech.glide.signature.ObjectKey
            r7 = r14
            r2.<init>(r14)
            com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$QMediaStoreUriFetcher r12 = new com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$QMediaStoreUriFetcher
            android.content.Context r4 = r0.context
            com.bumptech.glide.load.model.ModelLoader<java.io.File, DataT> r5 = r0.fileDelegate
            com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> r6 = r0.uriDelegate
            java.lang.Class<DataT> r11 = r0.dataClass
            r3 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.<init>(r2, r12)
            return r1
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
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            boolean r3 = com.bumptech.glide.load.data.mediastore.MediaStoreUtil.isMediaStoreUri(r3)
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
