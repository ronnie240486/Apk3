package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class DataSchemeDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    public static final java.lang.String SCHEME_DATA = "data";
    private int bytesRemaining;

    @androidx.annotation.Nullable
    private byte[] data;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() {
            r2 = this;
            byte[] r0 = r2.data
            r1 = 0
            if (r0 == 0) goto La
            r2.data = r1
            r2.transferEnded()
        La:
            r2.dataSpec = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSpec r0 = r1.dataSpec
            if (r0 == 0) goto L7
            android.net.Uri r0 = r0.uri
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r8) throws java.io.IOException {
            r7 = this;
            r7.transferInitializing(r8)
            r7.dataSpec = r8
            android.net.Uri r0 = r8.uri
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "data"
            boolean r2 = r2.equals(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported scheme: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2, r1)
            java.lang.String r1 = r0.getSchemeSpecificPart()
            java.lang.String r2 = ","
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r1, r2)
            int r2 = r1.length
            r3 = 0
            r4 = 2
            if (r2 != r4) goto La9
            r0 = 1
            r0 = r1[r0]
            r2 = 0
            r1 = r1[r2]
            java.lang.String r4 = ";base64"
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L60
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L49
            r7.data = r1     // Catch: java.lang.IllegalArgumentException -> L49
            goto L70
        L49:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while parsing Base64 encoded string: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.createForMalformedDataOfUnknownType(r0, r8)
            throw r8
        L60:
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.US_ASCII
            java.lang.String r1 = r1.name()
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)
            byte[] r0 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r0)
            r7.data = r0
        L70:
            long r0 = r8.position
            byte[] r2 = r7.data
            int r4 = r2.length
            long r4 = (long) r4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L9f
            int r1 = (int) r0
            r7.readPosition = r1
            int r0 = r2.length
            int r0 = r0 - r1
            r7.bytesRemaining = r0
            long r1 = r8.length
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L91
            long r5 = (long) r0
            long r0 = java.lang.Math.min(r5, r1)
            int r1 = (int) r0
            r7.bytesRemaining = r1
        L91:
            r7.transferStarted(r8)
            long r0 = r8.length
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L9b
            goto L9e
        L9b:
            int r8 = r7.bytesRemaining
            long r0 = (long) r8
        L9e:
            return r0
        L9f:
            r7.data = r3
            com.google.android.exoplayer2.upstream.DataSourceException r8 = new com.google.android.exoplayer2.upstream.DataSourceException
            r0 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r0)
            throw r8
        La9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Unexpected URI format: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.createForMalformedDataOfUnknownType(r8, r3)
            throw r8
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.bytesRemaining
            if (r0 != 0) goto La
            r3 = -1
            return r3
        La:
            int r5 = java.lang.Math.min(r5, r0)
            byte[] r0 = r2.data
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            int r1 = r2.readPosition
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.readPosition
            int r3 = r3 + r5
            r2.readPosition = r3
            int r3 = r2.bytesRemaining
            int r3 = r3 - r5
            r2.bytesRemaining = r3
            r2.bytesTransferred(r5)
            return r5
    }
}
