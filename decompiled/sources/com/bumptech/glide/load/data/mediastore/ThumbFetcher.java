package com.bumptech.glide.load.data.mediastore;

/* JADX INFO: loaded from: classes3.dex */
public class ThumbFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> {
    private static final java.lang.String TAG = "MediaStoreThumbFetcher";
    private java.io.InputStream inputStream;
    private final android.net.Uri mediaStoreImageUri;
    private final com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener opener;

    /* JADX INFO: loaded from: classes.dex */
    public static class ImageThumbnailQuery implements com.bumptech.glide.load.data.mediastore.ThumbnailQuery {
        private static final java.lang.String[] PATH_PROJECTION = null;
        private static final java.lang.String PATH_SELECTION = "kind = 1 AND image_id = ?";
        private final android.content.ContentResolver contentResolver;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.data.mediastore.ThumbFetcher.ImageThumbnailQuery.PATH_PROJECTION = r0
                return
        }

        public ImageThumbnailQuery(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.contentResolver = r1
                return
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public android.database.Cursor query(android.net.Uri r7) {
                r6 = this;
                java.lang.String r7 = r7.getLastPathSegment()
                android.content.ContentResolver r0 = r6.contentResolver
                android.net.Uri r1 = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI
                java.lang.String[] r2 = com.bumptech.glide.load.data.mediastore.ThumbFetcher.ImageThumbnailQuery.PATH_PROJECTION
                r3 = 1
                java.lang.String[] r4 = new java.lang.String[r3]
                r3 = 0
                r4[r3] = r7
                java.lang.String r3 = "kind = 1 AND image_id = ?"
                r5 = 0
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class VideoThumbnailQuery implements com.bumptech.glide.load.data.mediastore.ThumbnailQuery {
        private static final java.lang.String[] PATH_PROJECTION = null;
        private static final java.lang.String PATH_SELECTION = "kind = 1 AND video_id = ?";
        private final android.content.ContentResolver contentResolver;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.data.mediastore.ThumbFetcher.VideoThumbnailQuery.PATH_PROJECTION = r0
                return
        }

        public VideoThumbnailQuery(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.contentResolver = r1
                return
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public android.database.Cursor query(android.net.Uri r7) {
                r6 = this;
                java.lang.String r7 = r7.getLastPathSegment()
                android.content.ContentResolver r0 = r6.contentResolver
                android.net.Uri r1 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
                java.lang.String[] r2 = com.bumptech.glide.load.data.mediastore.ThumbFetcher.VideoThumbnailQuery.PATH_PROJECTION
                r3 = 1
                java.lang.String[] r4 = new java.lang.String[r3]
                r3 = 0
                r4[r3] = r7
                java.lang.String r3 = "kind = 1 AND video_id = ?"
                r5 = 0
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                return r7
        }
    }

    @androidx.annotation.VisibleForTesting
    public ThumbFetcher(android.net.Uri r1, com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r2) {
            r0 = this;
            r0.<init>()
            r0.mediaStoreImageUri = r1
            r0.opener = r2
            return
    }

    private static com.bumptech.glide.load.data.mediastore.ThumbFetcher build(android.content.Context r3, android.net.Uri r4, com.bumptech.glide.load.data.mediastore.ThumbnailQuery r5) {
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r0.getArrayPool()
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r1 = new com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.get(r3)
            com.bumptech.glide.Registry r2 = r2.getRegistry()
            java.util.List r2 = r2.getImageHeaderParsers()
            android.content.ContentResolver r3 = r3.getContentResolver()
            r1.<init>(r2, r5, r0, r3)
            com.bumptech.glide.load.data.mediastore.ThumbFetcher r3 = new com.bumptech.glide.load.data.mediastore.ThumbFetcher
            r3.<init>(r4, r1)
            return r3
    }

    public static com.bumptech.glide.load.data.mediastore.ThumbFetcher buildImageFetcher(android.content.Context r2, android.net.Uri r3) {
            com.bumptech.glide.load.data.mediastore.ThumbFetcher$ImageThumbnailQuery r0 = new com.bumptech.glide.load.data.mediastore.ThumbFetcher$ImageThumbnailQuery
            android.content.ContentResolver r1 = r2.getContentResolver()
            r0.<init>(r1)
            com.bumptech.glide.load.data.mediastore.ThumbFetcher r2 = build(r2, r3, r0)
            return r2
    }

    public static com.bumptech.glide.load.data.mediastore.ThumbFetcher buildVideoFetcher(android.content.Context r2, android.net.Uri r3) {
            com.bumptech.glide.load.data.mediastore.ThumbFetcher$VideoThumbnailQuery r0 = new com.bumptech.glide.load.data.mediastore.ThumbFetcher$VideoThumbnailQuery
            android.content.ContentResolver r1 = r2.getContentResolver()
            r0.<init>(r1)
            com.bumptech.glide.load.data.mediastore.ThumbFetcher r2 = build(r2, r3, r0)
            return r2
    }

    private java.io.InputStream openThumbInputStream() throws java.io.FileNotFoundException {
            r4 = this;
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r0 = r4.opener
            android.net.Uri r1 = r4.mediaStoreImageUri
            java.io.InputStream r0 = r0.open(r1)
            r1 = -1
            if (r0 == 0) goto L14
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r2 = r4.opener
            android.net.Uri r3 = r4.mediaStoreImageUri
            int r2 = r2.getOrientation(r3)
            goto L15
        L14:
            r2 = -1
        L15:
            if (r2 == r1) goto L1d
            com.bumptech.glide.load.data.ExifOrientationStream r1 = new com.bumptech.glide.load.data.ExifOrientationStream
            r1.<init>(r0, r2)
            r0 = r1
        L1d:
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public java.lang.Class<java.io.InputStream> getDataClass() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
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
    public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> r4) {
            r2 = this;
            java.io.InputStream r3 = r2.openThumbInputStream()     // Catch: java.io.FileNotFoundException -> La
            r2.inputStream = r3     // Catch: java.io.FileNotFoundException -> La
            r4.onDataReady(r3)     // Catch: java.io.FileNotFoundException -> La
            goto L1c
        La:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "MediaStoreThumbFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = "Failed to find thumbnail file"
            android.util.Log.d(r1, r0, r3)
        L19:
            r4.onLoadFailed(r3)
        L1c:
            return
    }
}
