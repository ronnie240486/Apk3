package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class StatsDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private long bytesRead;
    private final com.google.android.exoplayer2.upstream.DataSource dataSource;
    private android.net.Uri lastOpenedUri;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> lastResponseHeaders;

    public StatsDataSource(com.google.android.exoplayer2.upstream.DataSource r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.upstream.DataSource r1 = (com.google.android.exoplayer2.upstream.DataSource) r1
            r0.dataSource = r1
            android.net.Uri r1 = android.net.Uri.EMPTY
            r0.lastOpenedUri = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.lastResponseHeaders = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    public long getBytesRead() {
            r2 = this;
            long r0 = r2.bytesRead
            return r0
    }

    public android.net.Uri getLastOpenedUri() {
            r1 = this;
            android.net.Uri r0 = r1.lastOpenedUri
            return r0
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLastResponseHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.lastResponseHeaders
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            java.util.Map r0 = r0.getResponseHeaders()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            android.net.Uri r0 = r0.getUri()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r3) throws java.io.IOException {
            r2 = this;
            android.net.Uri r0 = r3.uri
            r2.lastOpenedUri = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r2.lastResponseHeaders = r0
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.dataSource
            long r0 = r0.open(r3)
            android.net.Uri r3 = r2.getUri()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            r2.lastOpenedUri = r3
            java.util.Map r3 = r2.getResponseHeaders()
            r2.lastResponseHeaders = r3
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.dataSource
            int r3 = r0.read(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.bytesRead
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.bytesRead = r4
        Lf:
            return r3
    }

    public void resetBytesRead() {
            r2 = this;
            r0 = 0
            r2.bytesRead = r0
            return
    }
}
