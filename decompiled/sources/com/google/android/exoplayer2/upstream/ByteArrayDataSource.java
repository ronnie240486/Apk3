package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteArrayDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private int bytesRemaining;
    private final byte[] data;
    private boolean opened;
    private int readPosition;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    public ByteArrayDataSource(byte[] r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            int r1 = r3.length
            if (r1 <= 0) goto Lb
            r0 = 1
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r2.data = r3
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() {
            r1 = this;
            boolean r0 = r1.opened
            if (r0 == 0) goto La
            r0 = 0
            r1.opened = r0
            r1.transferEnded()
        La:
            r0 = 0
            r1.uri = r0
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.uri
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r8) throws java.io.IOException {
            r7 = this;
            android.net.Uri r0 = r8.uri
            r7.uri = r0
            r7.transferInitializing(r8)
            long r0 = r8.position
            byte[] r2 = r7.data
            int r3 = r2.length
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L3a
            int r3 = (int) r0
            r7.readPosition = r3
            int r2 = r2.length
            int r1 = (int) r0
            int r2 = r2 - r1
            r7.bytesRemaining = r2
            long r0 = r8.length
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L29
            long r5 = (long) r2
            long r0 = java.lang.Math.min(r5, r0)
            int r1 = (int) r0
            r7.bytesRemaining = r1
        L29:
            r0 = 1
            r7.opened = r0
            r7.transferStarted(r8)
            long r0 = r8.length
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L36
            goto L39
        L36:
            int r8 = r7.bytesRemaining
            long r0 = (long) r8
        L39:
            return r0
        L3a:
            com.google.android.exoplayer2.upstream.DataSourceException r8 = new com.google.android.exoplayer2.upstream.DataSourceException
            r0 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r0)
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
