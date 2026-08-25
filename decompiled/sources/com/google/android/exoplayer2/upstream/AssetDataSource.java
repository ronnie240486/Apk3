package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private final android.content.res.AssetManager assetManager;
    private long bytesRemaining;

    @androidx.annotation.Nullable
    private java.io.InputStream inputStream;
    private boolean opened;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AssetDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public AssetDataSourceException(java.io.IOException r2) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r0)
                return
        }

        public AssetDataSourceException(@androidx.annotation.Nullable java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public AssetDataSource(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.res.AssetManager r2 = r2.getAssets()
            r1.assetManager = r2
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
            r5 = this;
            r0 = 0
            r5.uri = r0
            r1 = 0
            java.io.InputStream r2 = r5.inputStream     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.inputStream = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L16
            r5.opened = r1
            r5.transferEnded()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r3 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.inputStream = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L2d
            r5.opened = r1
            r5.transferEnded()
        L2d:
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.uri
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r9) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
            r8 = this;
            android.net.Uri r0 = r9.uri     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r8.uri = r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            java.lang.String r0 = r0.getPath()     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            java.lang.String r1 = "/android_asset/"
            boolean r1 = r0.startsWith(r1)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r2 = 1
            if (r1 == 0) goto L1e
            r1 = 15
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            goto L2a
        L1e:
            java.lang.String r1 = "/"
            boolean r1 = r0.startsWith(r1)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            if (r1 == 0) goto L2a
            java.lang.String r0 = r0.substring(r2)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
        L2a:
            r8.transferInitializing(r9)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            android.content.res.AssetManager r1 = r8.assetManager     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            java.io.InputStream r0 = r1.open(r0, r2)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r8.inputStream = r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            long r3 = r9.position     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            long r0 = r0.skip(r3)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            long r3 = r9.position     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L66
            long r0 = r9.length     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L4c
            r8.bytesRemaining = r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            goto L5e
        L4c:
            java.io.InputStream r0 = r8.inputStream     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            int r0 = r0.available()     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            long r0 = (long) r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r8.bytesRemaining = r0     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L5e
            r8.bytesRemaining = r3     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
        L5e:
            r8.opened = r2
            r8.transferStarted(r9)
            long r0 = r8.bytesRemaining
            return r0
        L66:
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r9 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r1)     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
            throw r9     // Catch: java.io.IOException -> L6f com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L7f
        L6f:
            r9 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r0 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L79
            r1 = 2005(0x7d5, float:2.81E-42)
            goto L7b
        L79:
            r1 = 2000(0x7d0, float:2.803E-42)
        L7b:
            r0.<init>(r9, r1)
            throw r0
        L7f:
            r9 = move-exception
            throw r9
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r8, int r9, int r10) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            long r0 = r7.bytesRemaining
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            goto L1b
        L15:
            long r5 = (long) r10
            long r0 = java.lang.Math.min(r0, r5)     // Catch: java.io.IOException -> L38
            int r10 = (int) r0     // Catch: java.io.IOException -> L38
        L1b:
            java.io.InputStream r0 = r7.inputStream     // Catch: java.io.IOException -> L38
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.io.IOException -> L38
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L38
            int r8 = r0.read(r8, r9, r10)     // Catch: java.io.IOException -> L38
            if (r8 != r4) goto L2a
            return r4
        L2a:
            long r9 = r7.bytesRemaining
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            long r0 = (long) r8
            long r9 = r9 - r0
            r7.bytesRemaining = r9
        L34:
            r7.bytesTransferred(r8)
            return r8
        L38:
            r8 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r9 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
    }
}
