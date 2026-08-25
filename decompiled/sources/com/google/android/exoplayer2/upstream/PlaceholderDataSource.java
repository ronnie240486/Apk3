package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    public static final com.google.android.exoplayer2.upstream.DataSource.Factory FACTORY = null;
    public static final com.google.android.exoplayer2.upstream.PlaceholderDataSource INSTANCE = null;

    public static /* synthetic */ com.google.android.exoplayer2.upstream.PlaceholderDataSource $r8$lambda$Qku_15DubQGfyuKLu3QSDqilS4U() {
            com.google.android.exoplayer2.upstream.PlaceholderDataSource r0 = new com.google.android.exoplayer2.upstream.PlaceholderDataSource
            r0.<init>()
            return r0
    }

    static {
            com.google.android.exoplayer2.upstream.PlaceholderDataSource r0 = new com.google.android.exoplayer2.upstream.PlaceholderDataSource
            r0.<init>()
            com.google.android.exoplayer2.upstream.PlaceholderDataSource.INSTANCE = r0
            com.google.android.exoplayer2.upstream.PlaceholderDataSource$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.upstream.PlaceholderDataSource$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.upstream.PlaceholderDataSource.FACTORY = r0
            return
    }

    private PlaceholderDataSource() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public final /* synthetic */ java.util.Map getResponseHeaders() {
            r1 = this;
            java.util.Map r0 = com.google.android.exoplayer2.upstream.DataSource.CC.$default$getResponseHeaders(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r2) throws java.io.IOException {
            r1 = this;
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "PlaceholderDataSource cannot be opened"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r1, int r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
