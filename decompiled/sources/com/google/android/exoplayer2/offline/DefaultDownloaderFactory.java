package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultDownloaderFactory implements com.google.android.exoplayer2.offline.DownloaderFactory {
    private static final android.util.SparseArray<java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.offline.Downloader>> CONSTRUCTORS = null;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final java.util.concurrent.Executor executor;

    static {
            android.util.SparseArray r0 = createDownloaderConstructors()
            com.google.android.exoplayer2.offline.DefaultDownloaderFactory.CONSTRUCTORS = r0
            return
    }

    @java.lang.Deprecated
    public DefaultDownloaderFactory(com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r2) {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r0 = com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE$1
            r1.<init>(r2, r0)
            return
    }

    public DefaultDownloaderFactory(com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = (com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory) r1
            r0.cacheDataSourceFactory = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.executor = r1
            return
    }

    private com.google.android.exoplayer2.offline.Downloader createDownloader(com.google.android.exoplayer2.offline.DownloadRequest r4, int r5) {
            r3 = this;
            android.util.SparseArray<java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.offline.Downloader>> r0 = com.google.android.exoplayer2.offline.DefaultDownloaderFactory.CONSTRUCTORS
            java.lang.Object r0 = r0.get(r5)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 == 0) goto L49
            com.google.android.exoplayer2.MediaItem$Builder r1 = new com.google.android.exoplayer2.MediaItem$Builder
            r1.<init>()
            android.net.Uri r2 = r4.uri
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setUri(r2)
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r4.streamKeys
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setStreamKeys(r2)
            java.lang.String r4 = r4.customCacheKey
            com.google.android.exoplayer2.MediaItem$Builder r4 = r1.setCustomCacheKey(r4)
            com.google.android.exoplayer2.MediaItem r4 = r4.build()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L3c
            r4 = 1
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r2 = r3.cacheDataSourceFactory     // Catch: java.lang.Exception -> L3c
            r1[r4] = r2     // Catch: java.lang.Exception -> L3c
            r4 = 2
            java.util.concurrent.Executor r2 = r3.executor     // Catch: java.lang.Exception -> L3c
            r1[r4] = r2     // Catch: java.lang.Exception -> L3c
            java.lang.Object r4 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L3c
            com.google.android.exoplayer2.offline.Downloader r4 = (com.google.android.exoplayer2.offline.Downloader) r4     // Catch: java.lang.Exception -> L3c
            return r4
        L3c:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to instantiate downloader for content type "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5)
            r0.<init>(r5, r4)
            throw r0
        L49:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Module missing for content type "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r4.<init>(r5)
            throw r4
    }

    private static android.util.SparseArray<java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.offline.Downloader>> createDownloaderConstructors() {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
            java.lang.Class<com.google.android.exoplayer2.source.dash.offline.DashDownloader> r2 = com.google.android.exoplayer2.source.dash.offline.DashDownloader.class
            java.lang.reflect.Constructor r2 = getDownloaderConstructor(r2)     // Catch: java.lang.ClassNotFoundException -> Lf
            r0.put(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Lf
        Lf:
            r1 = 2
            java.lang.Class<com.google.android.exoplayer2.source.hls.offline.HlsDownloader> r2 = com.google.android.exoplayer2.source.hls.offline.HlsDownloader.class
            java.lang.reflect.Constructor r2 = getDownloaderConstructor(r2)     // Catch: java.lang.ClassNotFoundException -> L19
            r0.put(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L19
        L19:
            r1 = 1
            java.lang.String r2 = "com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L27
            java.lang.reflect.Constructor r2 = getDownloaderConstructor(r2)     // Catch: java.lang.ClassNotFoundException -> L27
            r0.put(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L27
        L27:
            return r0
    }

    private static java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.offline.Downloader> getDownloaderConstructor(java.lang.Class<?> r3) {
            java.lang.Class<com.google.android.exoplayer2.offline.Downloader> r0 = com.google.android.exoplayer2.offline.Downloader.class
            java.lang.Class r3 = r3.asSubclass(r0)     // Catch: java.lang.NoSuchMethodException -> L1d
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1d
            r1 = 0
            java.lang.Class<com.google.android.exoplayer2.MediaItem> r2 = com.google.android.exoplayer2.MediaItem.class
            r0[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L1d
            r1 = 1
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory> r2 = com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory.class
            r0[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L1d
            r1 = 2
            java.lang.Class<java.util.concurrent.Executor> r2 = java.util.concurrent.Executor.class
            r0[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L1d
            return r3
        L1d:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Downloader constructor missing"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public com.google.android.exoplayer2.offline.Downloader createDownloader(com.google.android.exoplayer2.offline.DownloadRequest r4) {
            r3 = this;
            android.net.Uri r0 = r4.uri
            java.lang.String r1 = r4.mimeType
            int r0 = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(r0, r1)
            if (r0 == 0) goto L3e
            r1 = 1
            if (r0 == r1) goto L3e
            r1 = 2
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 != r1) goto L32
            com.google.android.exoplayer2.offline.ProgressiveDownloader r0 = new com.google.android.exoplayer2.offline.ProgressiveDownloader
            com.google.android.exoplayer2.MediaItem$Builder r1 = new com.google.android.exoplayer2.MediaItem$Builder
            r1.<init>()
            android.net.Uri r2 = r4.uri
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setUri(r2)
            java.lang.String r4 = r4.customCacheKey
            com.google.android.exoplayer2.MediaItem$Builder r4 = r1.setCustomCacheKey(r4)
            com.google.android.exoplayer2.MediaItem r4 = r4.build()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = r3.cacheDataSourceFactory
            java.util.concurrent.Executor r2 = r3.executor
            r0.<init>(r4, r1, r2)
            return r0
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported type: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r4.<init>(r0)
            throw r4
        L3e:
            com.google.android.exoplayer2.offline.Downloader r4 = r3.createDownloader(r4, r0)
            return r4
    }
}
