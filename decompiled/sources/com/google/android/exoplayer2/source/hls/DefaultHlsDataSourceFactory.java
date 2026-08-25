package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsDataSourceFactory implements com.google.android.exoplayer2.source.hls.HlsDataSourceFactory {
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;

    public DefaultHlsDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
            r0 = this;
            r0.<init>()
            r0.dataSourceFactory = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsDataSourceFactory
    public com.google.android.exoplayer2.upstream.DataSource createDataSource(int r1) {
            r0 = this;
            com.google.android.exoplayer2.upstream.DataSource$Factory r1 = r0.dataSourceFactory
            com.google.android.exoplayer2.upstream.DataSource r1 = r1.createDataSource()
            return r1
    }
}
