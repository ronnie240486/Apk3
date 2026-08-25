package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    public static final java.lang.String RAW_RESOURCE_SCHEME = "rawresource";

    @androidx.annotation.Nullable
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;

    @androidx.annotation.Nullable
    private java.io.InputStream inputStream;
    private boolean opened;
    private final java.lang.String packageName;
    private final android.content.res.Resources resources;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    /* JADX INFO: loaded from: classes2.dex */
    public static class RawResourceDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.String r3) {
                r2 = this;
                r0 = 0
                r1 = 2000(0x7d0, float:2.803E-42)
                r2.<init>(r3, r0, r1)
                return
        }

        public RawResourceDataSourceException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.Throwable r2) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r0)
                return
        }
    }

    public RawResourceDataSource(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.res.Resources r0 = r2.getResources()
            r1.resources = r0
            java.lang.String r2 = r2.getPackageName()
            r1.packageName = r2
            return
    }

    public static android.net.Uri buildRawResourceUri(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rawresource:///"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
            r5 = this;
            r0 = 0
            r5.uri = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.inputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
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
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
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
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
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
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
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
    public long open(com.google.android.exoplayer2.upstream.DataSpec r15) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
            r14 = this;
            android.net.Uri r0 = r15.uri
            r14.uri = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 2005(0x7d5, float:2.81E-42)
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L9a
            java.lang.String r1 = r0.getScheme()
            java.lang.String r6 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L40
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r4) goto L40
            java.lang.String r1 = r0.getLastPathSegment()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r7 = "\\d+"
            boolean r1 = r1.matches(r7)
            if (r1 == 0) goto L40
            goto L9a
        L40:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L92
            java.lang.String r1 = r0.getPath()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L60
            java.lang.String r1 = r1.substring(r4)
        L60:
            java.lang.String r3 = r0.getHost()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L72
            java.lang.String r3 = ""
            goto L78
        L72:
            java.lang.String r7 = ":"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r7)
        L78:
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r3, r1)
            android.content.res.Resources r3 = r14.resources
            java.lang.String r6 = r14.packageName
            java.lang.String r7 = "raw"
            int r1 = r3.getIdentifier(r1, r7, r6)
            if (r1 == 0) goto L8a
            goto La8
        L8a:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource not found."
            r15.<init>(r0, r5, r2)
            throw r15
        L92:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r15.<init>(r0, r5, r3)
            throw r15
        L9a:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch: java.lang.NumberFormatException -> L17a
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L17a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L17a
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L17a
        La8:
            r14.transferInitializing(r15)
            android.content.res.Resources r3 = r14.resources     // Catch: android.content.res.Resources.NotFoundException -> L173
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch: android.content.res.Resources.NotFoundException -> L173
            r14.assetFileDescriptor = r1
            if (r1 == 0) goto L15a
            long r2 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r6 = r1.getFileDescriptor()
            r0.<init>(r6)
            r14.inputStream = r0
            r6 = 2008(0x7d8, float:2.814E-42)
            r7 = -1
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto Ld9
            long r10 = r15.position     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto Ld3
            goto Ld9
        Ld3:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            r15.<init>(r5, r5, r6)     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            throw r15     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
        Ld9:
            long r10 = r1.getStartOffset()     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r12 = r15.position     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r12 = r12 + r10
            long r12 = r0.skip(r12)     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r12 = r12 - r10
            long r10 = r15.position     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 != 0) goto L147
            r10 = 0
            if (r9 != 0) goto L116
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r1 = r0.size()     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto Lfe
            r14.bytesRemaining = r7     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            goto L11d
        Lfe:
            long r1 = r0.size()     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r12 = r0.position()     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            long r1 = r1 - r12
            r14.bytesRemaining = r1     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L10e
            goto L11d
        L10e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            r0 = 2008(0x7d8, float:2.814E-42)
            r15.<init>(r5, r5, r0)     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            throw r15     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
        L116:
            long r2 = r2 - r12
            r14.bytesRemaining = r2     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 < 0) goto L13f
        L11d:
            long r0 = r15.length
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L130
            long r2 = r14.bytesRemaining
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto L12a
            goto L12e
        L12a:
            long r0 = java.lang.Math.min(r2, r0)
        L12e:
            r14.bytesRemaining = r0
        L130:
            r14.opened = r4
            r14.transferStarted(r15)
            long r0 = r15.length
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto L13c
            goto L13e
        L13c:
            long r0 = r14.bytesRemaining
        L13e:
            return r0
        L13f:
            com.google.android.exoplayer2.upstream.DataSourceException r15 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            r0 = 2008(0x7d8, float:2.814E-42)
            r15.<init>(r0)     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            throw r15     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
        L147:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            r0 = 2008(0x7d8, float:2.814E-42)
            r15.<init>(r5, r5, r0)     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
            throw r15     // Catch: java.io.IOException -> L14f com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException -> L158
        L14f:
            r15 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r5, r15, r1)
            throw r0
        L158:
            r15 = move-exception
            throw r15
        L15a:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Resource is compressed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            r15.<init>(r0, r5, r1)
            throw r15
        L173:
            r15 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>(r5, r15, r2)
            throw r0
        L17a:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r15 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource identifier must be an integer."
            r15.<init>(r0, r5, r3)
            throw r15
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r10, int r11, int r12) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
            r9 = this;
            if (r12 != 0) goto L4
            r10 = 0
            return r10
        L4:
            long r0 = r9.bytesRemaining
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r2 = 2000(0x7d0, float:2.803E-42)
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L17
            goto L1d
        L17:
            long r7 = (long) r12
            long r0 = java.lang.Math.min(r0, r7)     // Catch: java.io.IOException -> L4d
            int r12 = (int) r0     // Catch: java.io.IOException -> L4d
        L1d:
            java.io.InputStream r0 = r9.inputStream     // Catch: java.io.IOException -> L4d
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.io.IOException -> L4d
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L4d
            int r10 = r0.read(r10, r11, r12)     // Catch: java.io.IOException -> L4d
            if (r10 != r4) goto L3f
            long r10 = r9.bytesRemaining
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L32
            return r4
        L32:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r10 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            java.lang.String r12 = "End of stream reached having not read sufficient data."
            r10.<init>(r12, r11, r2)
            throw r10
        L3f:
            long r11 = r9.bytesRemaining
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L49
            long r0 = (long) r10
            long r11 = r11 - r0
            r9.bytesRemaining = r11
        L49:
            r9.bytesTransferred(r10)
            return r10
        L4d:
            r10 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r11 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r12 = 0
            r11.<init>(r12, r10, r2)
            throw r11
    }
}
