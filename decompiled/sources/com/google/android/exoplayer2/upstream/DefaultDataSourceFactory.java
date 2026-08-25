package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class DefaultDataSourceFactory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
    private final com.google.android.exoplayer2.upstream.DataSource.Factory baseDataSourceFactory;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.TransferListener listener;

    public DefaultDataSourceFactory(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public DefaultDataSourceFactory(android.content.Context r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultDataSourceFactory(android.content.Context r1, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.listener = r2
            r0.baseDataSourceFactory = r3
            return
    }

    public DefaultDataSourceFactory(android.content.Context r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultDataSourceFactory(android.content.Context r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4) {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = r0.setUserAgent(r3)
            r1.<init>(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultDataSource r0 = r1.createDataSource()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public com.google.android.exoplayer2.upstream.DefaultDataSource createDataSource() {
            r3 = this;
            com.google.android.exoplayer2.upstream.DefaultDataSource r0 = new com.google.android.exoplayer2.upstream.DefaultDataSource
            android.content.Context r1 = r3.context
            com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r3.baseDataSourceFactory
            com.google.android.exoplayer2.upstream.DataSource r2 = r2.createDataSource()
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.upstream.TransferListener r1 = r3.listener
            if (r1 == 0) goto L14
            r0.addTransferListener(r1)
        L14:
            return r0
    }
}
