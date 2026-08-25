package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsingLoadable<T> implements com.google.android.exoplayer2.upstream.Loader.Loadable {
    private final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
    public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    public final long loadTaskId;
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> parser;

    @androidx.annotation.Nullable
    private volatile T result;
    public final int type;

    /* JADX INFO: loaded from: classes.dex */
    public interface Parser<T> {
        T parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException;
    }

    public ParsingLoadable(com.google.android.exoplayer2.upstream.DataSource r2, android.net.Uri r3, int r4, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> r5) {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r0.<init>()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r0.setUri(r3)
            r0 = 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setFlags(r0)
            com.google.android.exoplayer2.upstream.DataSpec r3 = r3.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public ParsingLoadable(com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> r5) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = new com.google.android.exoplayer2.upstream.StatsDataSource
            r0.<init>(r2)
            r1.dataSource = r0
            r1.dataSpec = r3
            r1.type = r4
            r1.parser = r5
            long r2 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
            r1.loadTaskId = r2
            return
    }

    public static <T> T load(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> r2, android.net.Uri r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.upstream.ParsingLoadable r0 = new com.google.android.exoplayer2.upstream.ParsingLoadable
            r0.<init>(r1, r3, r4, r2)
            r0.load()
            java.lang.Object r1 = r0.getResult()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            return r1
    }

    public static <T> T load(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.upstream.ParsingLoadable r0 = new com.google.android.exoplayer2.upstream.ParsingLoadable
            r0.<init>(r1, r3, r4, r2)
            r0.load()
            java.lang.Object r1 = r0.getResult()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            return r1
    }

    public long bytesLoaded() {
            r2 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r2.dataSource
            long r0 = r0.getBytesRead()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
            r0 = this;
            return
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r1.dataSource
            java.util.Map r0 = r0.getLastResponseHeaders()
            return r0
    }

    @androidx.annotation.Nullable
    public final T getResult() {
            r1 = this;
            T r0 = r1.result
            return r0
    }

    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r1.dataSource
            android.net.Uri r0 = r0.getLastOpenedUri()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r3.dataSource
            r0.resetBytesRead()
            com.google.android.exoplayer2.upstream.DataSourceInputStream r0 = new com.google.android.exoplayer2.upstream.DataSourceInputStream
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r3.dataSource
            com.google.android.exoplayer2.upstream.DataSpec r2 = r3.dataSpec
            r0.<init>(r1, r2)
            r0.open()     // Catch: java.lang.Throwable -> L29
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r3.dataSource     // Catch: java.lang.Throwable -> L29
            android.net.Uri r1 = r1.getUri()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L29
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> L29
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> r2 = r3.parser     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r2.parse(r1, r0)     // Catch: java.lang.Throwable -> L29
            r3.result = r1     // Catch: java.lang.Throwable -> L29
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            return
        L29:
            r1 = move-exception
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            throw r1
    }
}
