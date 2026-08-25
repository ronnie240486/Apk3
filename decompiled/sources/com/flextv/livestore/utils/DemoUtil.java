package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public final class DemoUtil {
    private static final java.lang.String DOWNLOAD_CONTENT_DIRECTORY = "downloads";
    private static final boolean USE_CRONET_FOR_NETWORKING = true;
    private static com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private static com.google.android.exoplayer2.database.DatabaseProvider databaseProvider;
    private static com.google.android.exoplayer2.upstream.cache.Cache downloadCache;
    private static java.io.File downloadDirectory;
    private static com.google.android.exoplayer2.upstream.HttpDataSource.Factory httpDataSourceFactory;

    private DemoUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory buildReadOnlyCacheDataSource(com.google.android.exoplayer2.upstream.DataSource.Factory r1, com.google.android.exoplayer2.upstream.cache.Cache r2) {
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r2 = r0.setCache(r2)
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = r2.setUpstreamDataSourceFactory(r1)
            r2 = 0
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = r1.setCacheWriteDataSinkFactory(r2)
            r2 = 2
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = r1.setFlags(r2)
            return r1
    }

    public static com.google.android.exoplayer2.RenderersFactory buildRenderersFactory(android.content.Context r1, boolean r2) {
            boolean r0 = useExtensionRenderers()
            if (r0 == 0) goto Lc
            if (r2 == 0) goto La
            r2 = 2
            goto Ld
        La:
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            com.google.android.exoplayer2.DefaultRenderersFactory r0 = new com.google.android.exoplayer2.DefaultRenderersFactory
            android.content.Context r1 = r1.getApplicationContext()
            r0.<init>(r1)
            com.google.android.exoplayer2.DefaultRenderersFactory r1 = r0.setExtensionRendererMode(r2)
            return r1
    }

    public static synchronized com.google.android.exoplayer2.upstream.DataSource.Factory getDataSourceFactory(android.content.Context r3) {
            java.lang.Class<com.flextv.livestore.utils.DemoUtil> r0 = com.flextv.livestore.utils.DemoUtil.class
            monitor-enter(r0)
            com.google.android.exoplayer2.upstream.DataSource$Factory r1 = com.flextv.livestore.utils.DemoUtil.dataSourceFactory     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            com.google.android.exoplayer2.upstream.DefaultDataSource$Factory r1 = new com.google.android.exoplayer2.upstream.DefaultDataSource$Factory     // Catch: java.lang.Throwable -> L22
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r2 = getHttpDataSourceFactory(r3)     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L22
            com.google.android.exoplayer2.upstream.cache.Cache r3 = getDownloadCache(r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r3 = buildReadOnlyCacheDataSource(r1, r3)     // Catch: java.lang.Throwable -> L22
            com.flextv.livestore.utils.DemoUtil.dataSourceFactory = r3     // Catch: java.lang.Throwable -> L22
        L1e:
            com.google.android.exoplayer2.upstream.DataSource$Factory r3 = com.flextv.livestore.utils.DemoUtil.dataSourceFactory     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return r3
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private static synchronized com.google.android.exoplayer2.database.DatabaseProvider getDatabaseProvider(android.content.Context r2) {
            java.lang.Class<com.flextv.livestore.utils.DemoUtil> r0 = com.flextv.livestore.utils.DemoUtil.class
            monitor-enter(r0)
            com.google.android.exoplayer2.database.DatabaseProvider r1 = com.flextv.livestore.utils.DemoUtil.databaseProvider     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.exoplayer2.database.StandaloneDatabaseProvider r1 = new com.google.android.exoplayer2.database.StandaloneDatabaseProvider     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.flextv.livestore.utils.DemoUtil.databaseProvider = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.exoplayer2.database.DatabaseProvider r2 = com.flextv.livestore.utils.DemoUtil.databaseProvider     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private static synchronized com.google.android.exoplayer2.upstream.cache.Cache getDownloadCache(android.content.Context r4) {
            java.lang.Class<com.flextv.livestore.utils.DemoUtil> r0 = com.flextv.livestore.utils.DemoUtil.class
            monitor-enter(r0)
            com.google.android.exoplayer2.upstream.cache.Cache r1 = com.flextv.livestore.utils.DemoUtil.downloadCache     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L22
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = getDownloadDirectory(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "downloads"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.upstream.cache.SimpleCache r2 = new com.google.android.exoplayer2.upstream.cache.SimpleCache     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor r3 = new com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.database.DatabaseProvider r4 = getDatabaseProvider(r4)     // Catch: java.lang.Throwable -> L26
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L26
            com.flextv.livestore.utils.DemoUtil.downloadCache = r2     // Catch: java.lang.Throwable -> L26
        L22:
            com.google.android.exoplayer2.upstream.cache.Cache r4 = com.flextv.livestore.utils.DemoUtil.downloadCache     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return r4
        L26:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    private static synchronized java.io.File getDownloadDirectory(android.content.Context r2) {
            java.lang.Class<com.flextv.livestore.utils.DemoUtil> r0 = com.flextv.livestore.utils.DemoUtil.class
            monitor-enter(r0)
            java.io.File r1 = com.flextv.livestore.utils.DemoUtil.downloadDirectory     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            r1 = 0
            java.io.File r1 = r2.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L1a
            com.flextv.livestore.utils.DemoUtil.downloadDirectory = r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L1a
            com.flextv.livestore.utils.DemoUtil.downloadDirectory = r2     // Catch: java.lang.Throwable -> L1a
        L16:
            java.io.File r2 = com.flextv.livestore.utils.DemoUtil.downloadDirectory     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static synchronized com.google.android.exoplayer2.upstream.HttpDataSource.Factory getHttpDataSourceFactory(android.content.Context r3) {
            java.lang.Class<com.flextv.livestore.utils.DemoUtil> r0 = com.flextv.livestore.utils.DemoUtil.class
            monitor-enter(r0)
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r1 = com.flextv.livestore.utils.DemoUtil.httpDataSourceFactory     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L34
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L38
            org.chromium.net.CronetEngine r3 = com.google.android.exoplayer2.ext.cronet.CronetUtil.buildCronetEngine(r3)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory r1 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L38
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L38
            com.flextv.livestore.utils.DemoUtil.httpDataSourceFactory = r1     // Catch: java.lang.Throwable -> L38
        L1c:
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r3 = com.flextv.livestore.utils.DemoUtil.httpDataSourceFactory     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L34
            java.net.CookieManager r3 = new java.net.CookieManager     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            java.net.CookiePolicy r1 = java.net.CookiePolicy.ACCEPT_ORIGINAL_SERVER     // Catch: java.lang.Throwable -> L38
            r3.setCookiePolicy(r1)     // Catch: java.lang.Throwable -> L38
            java.net.CookieHandler.setDefault(r3)     // Catch: java.lang.Throwable -> L38
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            com.flextv.livestore.utils.DemoUtil.httpDataSourceFactory = r3     // Catch: java.lang.Throwable -> L38
        L34:
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r3 = com.flextv.livestore.utils.DemoUtil.httpDataSourceFactory     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            return r3
        L38:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static boolean useExtensionRenderers() {
            r0 = 1
            return r0
    }
}
