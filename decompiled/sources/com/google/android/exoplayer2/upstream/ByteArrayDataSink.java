package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayDataSink implements com.google.android.exoplayer2.upstream.DataSink {
    private java.io.ByteArrayOutputStream stream;

    public ByteArrayDataSink() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = r1.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            r0.close()
            return
    }

    @androidx.annotation.Nullable
    public byte[] getData() {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = r1.stream
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            byte[] r0 = r0.toByteArray()
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(com.google.android.exoplayer2.upstream.DataSpec r6) {
            r5 = this;
            long r0 = r6.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r5.stream = r6
            goto L27
        L10:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            long r1 = r6.length
            int r6 = (int) r1
            r0.<init>(r6)
            r5.stream = r0
        L27:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = r1.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            r0.write(r2, r3, r4)
            return
    }
}
