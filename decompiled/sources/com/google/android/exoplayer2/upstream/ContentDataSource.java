package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {

    @androidx.annotation.Nullable
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;

    @androidx.annotation.Nullable
    private java.io.FileInputStream inputStream;
    private boolean opened;
    private final android.content.ContentResolver resolver;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    public static class ContentDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public ContentDataSourceException(java.io.IOException r2) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r0)
                return
        }

        public ContentDataSourceException(@androidx.annotation.Nullable java.io.IOException r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public ContentDataSource(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.ContentResolver r2 = r2.getContentResolver()
            r1.resolver = r2
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
            r5 = this;
            r0 = 0
            r5.uri = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.inputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.inputStream = r0
            android.content.res.AssetFileDescriptor r3 = r5.assetFileDescriptor     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.assetFileDescriptor = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L21
            r5.opened = r2
            r5.transferEnded()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.assetFileDescriptor = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L36
            r5.opened = r2
            r5.transferEnded()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.inputStream = r0
            android.content.res.AssetFileDescriptor r4 = r5.assetFileDescriptor     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.assetFileDescriptor = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L54
            r5.opened = r2
            r5.transferEnded()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.assetFileDescriptor = r0
            boolean r0 = r5.opened
            if (r0 == 0) goto L69
            r5.opened = r2
            r5.transferEnded()
        L69:
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.uri
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r18) throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 2000(0x7d0, float:2.803E-42)
            android.net.Uri r3 = r0.uri     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r1.uri = r3     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r17.transferInitializing(r18)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r4 = "content"
            android.net.Uri r5 = r0.uri     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r5 = r5.getScheme()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            boolean r4 = r4.equals(r5)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r5 = 1
            if (r4 == 0) goto L2f
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r4.<init>()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r6 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"
            r4.putBoolean(r6, r5)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            android.content.ContentResolver r6 = r1.resolver     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r4 = r6.openTypedAssetFileDescriptor(r3, r7, r4)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            goto L38
        L2f:
            android.content.ContentResolver r4 = r1.resolver     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r3, r6)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        L38:
            r1.assetFileDescriptor = r4     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            if (r4 == 0) goto Ld0
            long r6 = r4.getLength()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.io.FileDescriptor r8 = r4.getFileDescriptor()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r3.<init>(r8)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r1.inputStream = r3     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            long r13 = r0.position     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L5b
            goto L61
        L5b:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r0 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            throw r0     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        L61:
            long r13 = r4.getStartOffset()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r15 = r6
            long r5 = r0.position     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            long r5 = r5 + r13
            long r5 = r3.skip(r5)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            long r5 = r5 - r13
            long r13 = r0.position     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto Lca
            r13 = 0
            if (r12 != 0) goto L99
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            long r5 = r3.size()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L87
            r1.bytesRemaining = r10     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            goto La1
        L87:
            long r15 = r3.position()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            long r5 = r5 - r15
            r1.bytesRemaining = r5     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 < 0) goto L93
            goto La1
        L93:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r0 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            throw r0     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        L99:
            long r6 = r15 - r5
            r1.bytesRemaining = r6     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 < 0) goto Lc4
        La1:
            long r2 = r0.length
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto Lb4
            long r5 = r1.bytesRemaining
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 != 0) goto Lae
            goto Lb2
        Lae:
            long r2 = java.lang.Math.min(r5, r2)
        Lb2:
            r1.bytesRemaining = r2
        Lb4:
            r2 = 1
            r1.opened = r2
            r17.transferStarted(r18)
            long r2 = r0.length
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto Lc1
            goto Lc3
        Lc1:
            long r2 = r1.bytesRemaining
        Lc3:
            return r2
        Lc4:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r0 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            throw r0     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        Lca:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r0 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            throw r0     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        Ld0:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r0 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.io.IOException r4 = new java.io.IOException     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r5.<init>()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r6 = "Could not open file descriptor for: "
            r5.append(r6)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r5.append(r3)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r4.<init>(r3)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            r0.<init>(r4, r2)     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
            throw r0     // Catch: java.io.IOException -> Lec com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException -> Lf9
        Lec:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r3 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto Lf5
            r2 = 2005(0x7d5, float:2.81E-42)
        Lf5:
            r3.<init>(r0, r2)
            throw r3
        Lf9:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r8, int r9, int r10) throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
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
            java.io.FileInputStream r0 = r7.inputStream     // Catch: java.io.IOException -> L38
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.io.IOException -> L38
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch: java.io.IOException -> L38
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
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r9 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
    }
}
