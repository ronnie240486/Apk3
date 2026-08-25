package com.google.android.exoplayer2.upstream.crypto;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCipherDataSink implements com.google.android.exoplayer2.upstream.DataSink {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher cipher;

    @androidx.annotation.Nullable
    private final byte[] scratch;
    private final byte[] secretKey;
    private final com.google.android.exoplayer2.upstream.DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] r2, com.google.android.exoplayer2.upstream.DataSink r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AesCipherDataSink(byte[] r1, com.google.android.exoplayer2.upstream.DataSink r2, @androidx.annotation.Nullable byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.wrappedDataSink = r2
            r0.secretKey = r1
            r0.scratch = r3
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.cipher = r0
            com.google.android.exoplayer2.upstream.DataSink r0 = r1.wrappedDataSink
            r0.close()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(com.google.android.exoplayer2.upstream.DataSpec r8) throws java.io.IOException {
            r7 = this;
            com.google.android.exoplayer2.upstream.DataSink r0 = r7.wrappedDataSink
            r0.open(r8)
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r0 = new com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher
            byte[] r3 = r7.secretKey
            java.lang.String r4 = r8.key
            long r1 = r8.uriPositionOffset
            long r5 = r8.position
            long r5 = r5 + r1
            r2 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5)
            r7.cipher = r0
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] r11, int r12, int r13) throws java.io.IOException {
            r10 = this;
            byte[] r0 = r10.scratch
            if (r0 != 0) goto L15
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r0 = r10.cipher
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r0 = (com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher) r0
            r0.updateInPlace(r11, r12, r13)
            com.google.android.exoplayer2.upstream.DataSink r0 = r10.wrappedDataSink
            r0.write(r11, r12, r13)
            goto L3e
        L15:
            r0 = 0
            r1 = 0
        L17:
            if (r1 >= r13) goto L3e
            int r2 = r13 - r1
            byte[] r3 = r10.scratch
            int r3 = r3.length
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r3 = r10.cipher
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            r4 = r3
            com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher r4 = (com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher) r4
            int r6 = r12 + r1
            byte[] r8 = r10.scratch
            r9 = 0
            r5 = r11
            r7 = r2
            r4.update(r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.upstream.DataSink r3 = r10.wrappedDataSink
            byte[] r4 = r10.scratch
            r3.write(r4, r0, r2)
            int r1 = r1 + r2
            goto L17
        L3e:
            return
    }
}
