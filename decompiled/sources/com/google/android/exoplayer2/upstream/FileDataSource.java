package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class FileDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private long bytesRemaining;

    @androidx.annotation.Nullable
    private java.io.RandomAccessFile file;
    private boolean opened;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static final class Api21 {
        private Api21() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean access$000(java.lang.Throwable r0) {
                boolean r0 = isPermissionError(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        private static boolean isPermissionError(@androidx.annotation.Nullable java.lang.Throwable r1) {
                boolean r0 = r1 instanceof android.system.ErrnoException
                if (r0 == 0) goto Le
                android.system.ErrnoException r1 = (android.system.ErrnoException) r1
                int r1 = r1.errno
                int r0 = android.system.OsConstants.EACCES
                if (r1 != r0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.TransferListener listener;

        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.FileDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.FileDataSource createDataSource() {
                r2 = this;
                com.google.android.exoplayer2.upstream.FileDataSource r0 = new com.google.android.exoplayer2.upstream.FileDataSource
                r0.<init>()
                com.google.android.exoplayer2.upstream.TransferListener r1 = r2.listener
                if (r1 == 0) goto Lc
                r0.addTransferListener(r1)
            Lc:
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.FileDataSource.Factory setListener(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
                r0 = this;
                r0.listener = r1
                return r0
        }
    }

    public static class FileDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public FileDataSourceException(java.lang.Exception r2) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r0)
                return
        }

        @java.lang.Deprecated
        public FileDataSourceException(java.lang.String r2, java.io.IOException r3) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r3, r0)
                return
        }

        public FileDataSourceException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public FileDataSourceException(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public FileDataSource() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private static java.io.RandomAccessFile openLocalFile(android.net.Uri r5) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
            r0 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L15 java.lang.SecurityException -> L1e java.io.FileNotFoundException -> L25
            java.lang.String r2 = r5.getPath()     // Catch: java.lang.RuntimeException -> L15 java.lang.SecurityException -> L1e java.io.FileNotFoundException -> L25
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.lang.RuntimeException -> L15 java.lang.SecurityException -> L1e java.io.FileNotFoundException -> L25
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.RuntimeException -> L15 java.lang.SecurityException -> L1e java.io.FileNotFoundException -> L25
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: java.lang.RuntimeException -> L15 java.lang.SecurityException -> L1e java.io.FileNotFoundException -> L25
            return r1
        L15:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r0 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r5, r1)
            throw r0
        L1e:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r1 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r1.<init>(r5, r0)
            throw r1
        L25:
            r1 = move-exception
            java.lang.String r2 = r5.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L53
            java.lang.String r2 = r5.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L53
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r5 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 21
            if (r2 < r3) goto L4d
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = com.google.android.exoplayer2.upstream.FileDataSource.Api21.access$000(r2)
            if (r2 == 0) goto L4d
            goto L4f
        L4d:
            r0 = 2005(0x7d5, float:2.81E-42)
        L4f:
            r5.<init>(r1, r0)
            throw r5
        L53:
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r0 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r5.getPath()
            r2[r3] = r4
            r3 = 1
            java.lang.String r4 = r5.getQuery()
            r2[r3] = r4
            r3 = 2
            java.lang.String r5 = r5.getFragment()
            r2[r3] = r5
            java.lang.String r5 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r2 = 1004(0x3ec, float:1.407E-42)
            r0.<init>(r5, r1, r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
            r5 = this;
            r0 = 0
            r5.uri = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.file     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.file = r0
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
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r3 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.file = r0
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
    public long open(com.google.android.exoplayer2.upstream.DataSpec r6) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
            r5 = this;
            android.net.Uri r0 = r6.uri
            r5.uri = r0
            r5.transferInitializing(r6)
            java.io.RandomAccessFile r0 = openLocalFile(r0)
            r5.file = r0
            long r1 = r6.position     // Catch: java.io.IOException -> L3d
            r0.seek(r1)     // Catch: java.io.IOException -> L3d
            long r0 = r6.length     // Catch: java.io.IOException -> L3d
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            java.io.RandomAccessFile r0 = r5.file     // Catch: java.io.IOException -> L3d
            long r0 = r0.length()     // Catch: java.io.IOException -> L3d
            long r2 = r6.position     // Catch: java.io.IOException -> L3d
            long r0 = r0 - r2
        L23:
            r5.bytesRemaining = r0     // Catch: java.io.IOException -> L3d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L34
            r0 = 1
            r5.opened = r0
            r5.transferStarted(r6)
            long r0 = r5.bytesRemaining
            return r0
        L34:
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r6 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r6.<init>(r1, r1, r0)
            throw r6
        L3d:
            r6 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r0 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r6, r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r6, int r7, int r8) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
            r5 = this;
            if (r8 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r5.bytesRemaining
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r6 = -1
            return r6
        Le:
            java.io.RandomAccessFile r0 = r5.file     // Catch: java.io.IOException -> L2e
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.io.IOException -> L2e
            java.io.RandomAccessFile r0 = (java.io.RandomAccessFile) r0     // Catch: java.io.IOException -> L2e
            long r1 = r5.bytesRemaining     // Catch: java.io.IOException -> L2e
            long r3 = (long) r8     // Catch: java.io.IOException -> L2e
            long r1 = java.lang.Math.min(r1, r3)     // Catch: java.io.IOException -> L2e
            int r8 = (int) r1     // Catch: java.io.IOException -> L2e
            int r6 = r0.read(r6, r7, r8)     // Catch: java.io.IOException -> L2e
            if (r6 <= 0) goto L2d
            long r7 = r5.bytesRemaining
            long r0 = (long) r6
            long r7 = r7 - r0
            r5.bytesRemaining = r7
            r5.bytesTransferred(r6)
        L2d:
            return r6
        L2e:
            r6 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r7 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r8 = 2000(0x7d0, float:2.803E-42)
            r7.<init>(r6, r8)
            throw r7
    }
}
