package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class TeeDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private long bytesRemaining;
    private final com.google.android.exoplayer2.upstream.DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final com.google.android.exoplayer2.upstream.DataSource upstream;

    public TeeDataSource(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSink r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.upstream.DataSource r1 = (com.google.android.exoplayer2.upstream.DataSource) r1
            r0.upstream = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSink r1 = (com.google.android.exoplayer2.upstream.DataSink) r1
            r0.dataSink = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r3 = this;
            r0 = 0
            com.google.android.exoplayer2.upstream.DataSource r1 = r3.upstream     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r3.dataSinkNeedsClosing
            if (r1 == 0) goto L11
            r3.dataSinkNeedsClosing = r0
            com.google.android.exoplayer2.upstream.DataSink r0 = r3.dataSink
            r0.close()
        L11:
            return
        L12:
            r1 = move-exception
            boolean r2 = r3.dataSinkNeedsClosing
            if (r2 == 0) goto L1e
            r3.dataSinkNeedsClosing = r0
            com.google.android.exoplayer2.upstream.DataSink r0 = r3.dataSink
            r0.close()
        L1e:
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            java.util.Map r0 = r0.getResponseHeaders()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            android.net.Uri r0 = r0.getUri()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r10) throws java.io.IOException {
            r9 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r9.upstream
            long r0 = r0.open(r10)
            r9.bytesRemaining = r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r2
        Lf:
            long r4 = r10.length
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L1f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L1f
            com.google.android.exoplayer2.upstream.DataSpec r10 = r10.subrange(r2, r0)
        L1f:
            r0 = 1
            r9.dataSinkNeedsClosing = r0
            com.google.android.exoplayer2.upstream.DataSink r0 = r9.dataSink
            r0.open(r10)
            long r0 = r9.bytesRemaining
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            long r0 = r5.bytesRemaining
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r6 = -1
            return r6
        La:
            com.google.android.exoplayer2.upstream.DataSource r0 = r5.upstream
            int r8 = r0.read(r6, r7, r8)
            if (r8 <= 0) goto L23
            com.google.android.exoplayer2.upstream.DataSink r0 = r5.dataSink
            r0.write(r6, r7, r8)
            long r6 = r5.bytesRemaining
            r0 = -1
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            long r0 = (long) r8
            long r6 = r6 - r0
            r5.bytesRemaining = r6
        L23:
            return r8
    }
}
