package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolvingDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private final com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver;
    private final com.google.android.exoplayer2.upstream.DataSource upstreamDataSource;
    private boolean upstreamOpened;

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private final com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r1, com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver r2) {
                r0 = this;
                r0.<init>()
                r0.upstreamFactory = r1
                r0.resolver = r2
                return
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.ResolvingDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.ResolvingDataSource createDataSource() {
                r3 = this;
                com.google.android.exoplayer2.upstream.ResolvingDataSource r0 = new com.google.android.exoplayer2.upstream.ResolvingDataSource
                com.google.android.exoplayer2.upstream.DataSource$Factory r1 = r3.upstreamFactory
                com.google.android.exoplayer2.upstream.DataSource r1 = r1.createDataSource()
                com.google.android.exoplayer2.upstream.ResolvingDataSource$Resolver r2 = r3.resolver
                r0.<init>(r1, r2)
                return r0
        }
    }

    public interface Resolver {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.ResolvingDataSource$Resolver$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            public static android.net.Uri $default$resolveReportedUri(com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver r0, android.net.Uri r1) {
                    return r1
            }
        }

        com.google.android.exoplayer2.upstream.DataSpec resolveDataSpec(com.google.android.exoplayer2.upstream.DataSpec r1) throws java.io.IOException;

        android.net.Uri resolveReportedUri(android.net.Uri r1);
    }

    public ResolvingDataSource(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver r2) {
            r0 = this;
            r0.<init>()
            r0.upstreamDataSource = r1
            r0.resolver = r2
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.upstreamOpened
            if (r0 == 0) goto Lc
            r0 = 0
            r1.upstreamOpened = r0
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            r0.close()
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            java.util.Map r0 = r0.getResponseHeaders()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.upstreamDataSource
            android.net.Uri r0 = r0.getUri()
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            com.google.android.exoplayer2.upstream.ResolvingDataSource$Resolver r1 = r2.resolver
            android.net.Uri r0 = r1.resolveReportedUri(r0)
        L10:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.upstream.ResolvingDataSource$Resolver r0 = r2.resolver
            com.google.android.exoplayer2.upstream.DataSpec r3 = r0.resolveDataSpec(r3)
            r0 = 1
            r2.upstreamOpened = r0
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.upstreamDataSource
            long r0 = r0.open(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            int r2 = r0.read(r2, r3, r4)
            return r2
    }
}
