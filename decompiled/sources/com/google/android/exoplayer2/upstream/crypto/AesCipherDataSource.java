package com.google.android.exoplayer2.upstream.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class AesCipherDataSource implements com.google.android.exoplayer2.upstream.DataSource {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final com.google.android.exoplayer2.upstream.DataSource upstream;

    public AesCipherDataSource(byte[] r1, com.google.android.exoplayer2.upstream.DataSource r2) {
            r0 = this;
            r0.<init>()
            r0.upstream = r2
            r0.secretKey = r1
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
            r1 = this;
            r0 = 0
            r1.cipher = r0
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.close()
            return
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
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r8 = new com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher
            byte[] r4 = r9.secretKey
            java.lang.String r5 = r10.key
            long r2 = r10.uriPositionOffset
            long r6 = r10.position
            long r6 = r6 + r2
            r3 = 2
            r2 = r8
            r2.<init>(r3, r4, r5, r6)
            r9.cipher = r8
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            int r4 = r0.read(r2, r3, r4)
            r0 = -1
            if (r4 != r0) goto Le
            return r0
        Le:
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r0 = r1.cipher
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r0 = (com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher) r0
            r0.updateInPlace(r2, r3, r4)
            return r4
    }
}
