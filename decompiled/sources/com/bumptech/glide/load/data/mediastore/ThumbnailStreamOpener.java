package com.bumptech.glide.load.data.mediastore;

/* JADX INFO: loaded from: classes3.dex */
class ThumbnailStreamOpener {
    private static final com.bumptech.glide.load.data.mediastore.FileService DEFAULT_SERVICE = null;
    private static final java.lang.String TAG = "ThumbStreamOpener";
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final android.content.ContentResolver contentResolver;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;
    private final com.bumptech.glide.load.data.mediastore.ThumbnailQuery query;
    private final com.bumptech.glide.load.data.mediastore.FileService service;

    static {
            com.bumptech.glide.load.data.mediastore.FileService r0 = new com.bumptech.glide.load.data.mediastore.FileService
            r0.<init>()
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener.DEFAULT_SERVICE = r0
            return
    }

    public ThumbnailStreamOpener(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.data.mediastore.ThumbnailQuery r3, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r4, android.content.ContentResolver r5) {
            r1 = this;
            com.bumptech.glide.load.data.mediastore.FileService r0 = com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener.DEFAULT_SERVICE
            r1.<init>()
            r1.service = r0
            r1.query = r3
            r1.byteArrayPool = r4
            r1.contentResolver = r5
            r1.parsers = r2
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String getPath(@androidx.annotation.NonNull android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.data.mediastore.ThumbnailQuery r2 = r6.query     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.query(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
    }

    private boolean isValid(java.io.File r5) {
            r4 = this;
            com.bumptech.glide.load.data.mediastore.FileService r0 = r4.service
            boolean r0 = r0.exists(r5)
            if (r0 == 0) goto L16
            r0 = 0
            com.bumptech.glide.load.data.mediastore.FileService r2 = r4.service
            long r2 = r2.length(r5)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            return r5
    }

    public final int getOrientation(android.net.Uri r6) {
            r5 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            android.content.ContentResolver r2 = r5.contentResolver     // Catch: java.lang.Throwable -> L17 java.lang.NullPointerException -> L19 java.io.IOException -> L1b
            java.io.InputStream r1 = r2.openInputStream(r6)     // Catch: java.lang.Throwable -> L17 java.lang.NullPointerException -> L19 java.io.IOException -> L1b
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r5.parsers     // Catch: java.lang.Throwable -> L17 java.lang.NullPointerException -> L19 java.io.IOException -> L1b
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = r5.byteArrayPool     // Catch: java.lang.Throwable -> L17 java.lang.NullPointerException -> L19 java.io.IOException -> L1b
            int r6 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r2, r1, r3)     // Catch: java.lang.Throwable -> L17 java.lang.NullPointerException -> L19 java.io.IOException -> L1b
            if (r1 == 0) goto L16
            r1.close()     // Catch: java.io.IOException -> L16
        L16:
            return r6
        L17:
            r6 = move-exception
            goto L3e
        L19:
            r2 = move-exception
            goto L1c
        L1b:
            r2 = move-exception
        L1c:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r3.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "Failed to open uri: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L17
            r3.append(r6)     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L17
            android.util.Log.d(r0, r6, r2)     // Catch: java.lang.Throwable -> L17
        L37:
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r6 = -1
            return r6
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r6
    }

    public java.io.InputStream open(android.net.Uri r6) throws java.io.FileNotFoundException {
            r5 = this;
            java.lang.String r0 = r5.getPath(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            com.bumptech.glide.load.data.mediastore.FileService r1 = r5.service
            java.io.File r0 = r1.get(r0)
            boolean r1 = r5.isValid(r0)
            if (r1 != 0) goto L19
            return r2
        L19:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.content.ContentResolver r1 = r5.contentResolver     // Catch: java.lang.NullPointerException -> L24
            java.io.InputStream r6 = r1.openInputStream(r0)     // Catch: java.lang.NullPointerException -> L24
            return r6
        L24:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NPE opening uri: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " -> "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            java.lang.Throwable r6 = r2.initCause(r1)
            java.io.FileNotFoundException r6 = (java.io.FileNotFoundException) r6
            throw r6
    }
}
