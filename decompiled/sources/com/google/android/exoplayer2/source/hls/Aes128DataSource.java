package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes3.dex */
class Aes128DataSource implements com.google.android.exoplayer2.upstream.DataSource {

    @androidx.annotation.Nullable
    private javax.crypto.CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final com.google.android.exoplayer2.upstream.DataSource upstream;

    public Aes128DataSource(com.google.android.exoplayer2.upstream.DataSource r1, byte[] r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            r0.encryptionKey = r2
            r0.encryptionIv = r3
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r1 = this;
            javax.crypto.CipherInputStream r0 = r1.cipherInputStream
            if (r0 == 0) goto Lc
            r0 = 0
            r1.cipherInputStream = r0
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.close()
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            java.util.Map r0 = r0.getResponseHeaders()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public final android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            android.net.Uri r0 = r0.getUri()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public final long open(com.google.android.exoplayer2.upstream.DataSpec r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: javax.crypto.NoSuchPaddingException -> L37 java.security.NoSuchAlgorithmException -> L39
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r2 = r4.encryptionKey
            java.lang.String r3 = "AES"
            r1.<init>(r2, r3)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            byte[] r3 = r4.encryptionIv
            r2.<init>(r3)
            r3 = 2
            r0.init(r3, r1, r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L2e java.security.InvalidKeyException -> L30
            com.google.android.exoplayer2.upstream.DataSourceInputStream r1 = new com.google.android.exoplayer2.upstream.DataSourceInputStream
            com.google.android.exoplayer2.upstream.DataSource r2 = r4.upstream
            r1.<init>(r2, r5)
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream
            r5.<init>(r1, r0)
            r4.cipherInputStream = r5
            r1.open()
            r0 = -1
            return r0
        L2e:
            r5 = move-exception
            goto L31
        L30:
            r5 = move-exception
        L31:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L37:
            r5 = move-exception
            goto L3a
        L39:
            r5 = move-exception
        L3a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public final int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            javax.crypto.CipherInputStream r0 = r1.cipherInputStream
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            javax.crypto.CipherInputStream r0 = r1.cipherInputStream
            int r2 = r0.read(r2, r3, r4)
            if (r2 >= 0) goto Le
            r2 = -1
        Le:
            return r2
    }
}
