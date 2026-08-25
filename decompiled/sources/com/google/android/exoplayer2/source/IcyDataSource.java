package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
final class IcyDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private int bytesUntilMetadata;
    private final com.google.android.exoplayer2.source.IcyDataSource.Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final com.google.android.exoplayer2.upstream.DataSource upstream;

    /* JADX INFO: loaded from: classes.dex */
    public interface Listener {
        void onIcyMetadata(com.google.android.exoplayer2.util.ParsableByteArray r1);
    }

    public IcyDataSource(com.google.android.exoplayer2.upstream.DataSource r3, int r4, com.google.android.exoplayer2.source.IcyDataSource.Listener r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r4 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r2.upstream = r3
            r2.metadataIntervalBytes = r4
            r2.listener = r5
            byte[] r3 = new byte[r0]
            r2.metadataLengthByteHolder = r3
            r2.bytesUntilMetadata = r4
            return
    }

    private boolean readMetadata() throws java.io.IOException {
            r8 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r8.upstream
            byte[] r1 = r8.metadataLengthByteHolder
            r2 = 0
            r3 = 1
            int r0 = r0.read(r1, r2, r3)
            r1 = -1
            if (r0 != r1) goto Le
            return r2
        Le:
            byte[] r0 = r8.metadataLengthByteHolder
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 4
            if (r0 != 0) goto L19
            return r3
        L19:
            byte[] r4 = new byte[r0]
            r5 = r0
            r6 = 0
        L1d:
            if (r5 <= 0) goto L2b
            com.google.android.exoplayer2.upstream.DataSource r7 = r8.upstream
            int r7 = r7.read(r4, r6, r5)
            if (r7 != r1) goto L28
            return r2
        L28:
            int r6 = r6 + r7
            int r5 = r5 - r7
            goto L1d
        L2b:
            if (r0 <= 0) goto L36
            int r1 = r0 + (-1)
            r1 = r4[r1]
            if (r1 != 0) goto L36
            int r0 = r0 + (-1)
            goto L2b
        L36:
            if (r0 <= 0) goto L42
            com.google.android.exoplayer2.source.IcyDataSource$Listener r1 = r8.listener
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>(r4, r0)
            r1.onIcyMetadata(r2)
        L42:
            return r3
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
    public void close() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
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
    public long open(com.google.android.exoplayer2.upstream.DataSpec r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.bytesUntilMetadata
            r1 = -1
            if (r0 != 0) goto L11
            boolean r0 = r3.readMetadata()
            if (r0 == 0) goto L10
            int r0 = r3.metadataIntervalBytes
            r3.bytesUntilMetadata = r0
            goto L11
        L10:
            return r1
        L11:
            com.google.android.exoplayer2.upstream.DataSource r0 = r3.upstream
            int r2 = r3.bytesUntilMetadata
            int r6 = java.lang.Math.min(r2, r6)
            int r4 = r0.read(r4, r5, r6)
            if (r4 == r1) goto L24
            int r5 = r3.bytesUntilMetadata
            int r5 = r5 - r4
            r3.bytesUntilMetadata = r5
        L24:
            return r4
    }
}
