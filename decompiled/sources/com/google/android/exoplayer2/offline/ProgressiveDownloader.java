package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
public final class ProgressiveDownloader implements com.google.android.exoplayer2.offline.Downloader {
    private final com.google.android.exoplayer2.upstream.cache.CacheWriter cacheWriter;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource dataSource;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private volatile com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> downloadRunnable;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener;


    /* JADX INFO: renamed from: $r8$lambda$jTR-yQ80tvqq1k5F55r6HxM2p9Y, reason: not valid java name */
    public static /* synthetic */ void m234$r8$lambda$jTRyQ80tvqq1k5F55r6HxM2p9Y(com.google.android.exoplayer2.offline.ProgressiveDownloader r0, long r1, long r3, long r5) {
            r0.onProgress(r1, r3, r5)
            return
    }

    public ProgressiveDownloader(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r3) {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r0 = com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE$2
            r1.<init>(r2, r3, r0)
            return
    }

    public ProgressiveDownloader(com.google.android.exoplayer2.MediaItem r4, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r5, java.util.concurrent.Executor r6) {
            r3 = this;
            r3.<init>()
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            r3.executor = r6
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r6 = r4.localConfiguration
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r6.<init>()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r4.localConfiguration
            android.net.Uri r0 = r0.uri
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r6.setUri(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r4 = r4.localConfiguration
            java.lang.String r4 = r4.customCacheKey
            com.google.android.exoplayer2.upstream.DataSpec$Builder r4 = r6.setKey(r4)
            r6 = 4
            com.google.android.exoplayer2.upstream.DataSpec$Builder r4 = r4.setFlags(r6)
            com.google.android.exoplayer2.upstream.DataSpec r4 = r4.build()
            r3.dataSpec = r4
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r6 = r5.createDataSourceForDownloading()
            r3.dataSource = r6
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r0.<init>(r3)
            com.google.android.exoplayer2.upstream.cache.CacheWriter r1 = new com.google.android.exoplayer2.upstream.cache.CacheWriter
            r2 = 0
            r1.<init>(r6, r4, r2, r0)
            r3.cacheWriter = r1
            com.google.android.exoplayer2.util.PriorityTaskManager r4 = r5.getUpstreamPriorityTaskManager()
            r3.priorityTaskManager = r4
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.cache.CacheWriter access$000(com.google.android.exoplayer2.offline.ProgressiveDownloader r0) {
            com.google.android.exoplayer2.upstream.cache.CacheWriter r0 = r0.cacheWriter
            return r0
    }

    private void onProgress(long r7, long r9, long r11) {
            r6 = this;
            com.google.android.exoplayer2.offline.Downloader$ProgressListener r0 = r6.progressListener
            if (r0 != 0) goto L5
            return
        L5:
            r11 = -1
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 == 0) goto L1b
            r11 = 0
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L12
            goto L1b
        L12:
            float r11 = (float) r9
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r12
            float r12 = (float) r7
            float r11 = r11 / r12
            r5 = r11
            goto L1f
        L1b:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L1f:
            r1 = r7
            r3 = r9
            r0.onProgress(r1, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
            r2 = this;
            r0 = 1
            r2.isCanceled = r0
            com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r1 = r2.downloadRunnable
            if (r1 == 0) goto La
            r1.cancel(r0)
        La:
            return
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.Downloader.ProgressListener r4) throws java.io.IOException, java.lang.InterruptedException {
            r3 = this;
            r3.progressListener = r4
            com.google.android.exoplayer2.util.PriorityTaskManager r4 = r3.priorityTaskManager
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            if (r4 == 0) goto Lb
            r4.add(r0)
        Lb:
            r4 = 0
        Lc:
            if (r4 != 0) goto L5d
            boolean r1 = r3.isCanceled     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L5d
            com.google.android.exoplayer2.offline.ProgressiveDownloader$1 r1 = new com.google.android.exoplayer2.offline.ProgressiveDownloader$1     // Catch: java.lang.Throwable -> L49
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L49
            r3.downloadRunnable = r1     // Catch: java.lang.Throwable -> L49
            com.google.android.exoplayer2.util.PriorityTaskManager r1 = r3.priorityTaskManager     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L20
            r1.proceed(r0)     // Catch: java.lang.Throwable -> L49
        L20:
            java.util.concurrent.Executor r1 = r3.executor     // Catch: java.lang.Throwable -> L49
            com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r2 = r3.downloadRunnable     // Catch: java.lang.Throwable -> L49
            r1.execute(r2)     // Catch: java.lang.Throwable -> L49
            com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r1 = r3.downloadRunnable     // Catch: java.util.concurrent.ExecutionException -> L2e java.lang.Throwable -> L49
            r1.get()     // Catch: java.util.concurrent.ExecutionException -> L2e java.lang.Throwable -> L49
            r4 = 1
            goto Lc
        L2e:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L49
            boolean r2 = r1 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L3e
            goto Lc
        L3e:
            boolean r2 = r1 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L46
            com.google.android.exoplayer2.util.Util.sneakyThrow(r1)     // Catch: java.lang.Throwable -> L49
            goto Lc
        L46:
            java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r1 = r3.downloadRunnable
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.util.RunnableFutureTask r1 = (com.google.android.exoplayer2.util.RunnableFutureTask) r1
            r1.blockUntilFinished()
            com.google.android.exoplayer2.util.PriorityTaskManager r1 = r3.priorityTaskManager
            if (r1 == 0) goto L5c
            r1.remove(r0)
        L5c:
            throw r4
        L5d:
            com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> r4 = r3.downloadRunnable
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.util.RunnableFutureTask r4 = (com.google.android.exoplayer2.util.RunnableFutureTask) r4
            r4.blockUntilFinished()
            com.google.android.exoplayer2.util.PriorityTaskManager r4 = r3.priorityTaskManager
            if (r4 == 0) goto L6f
            r4.remove(r0)
        L6f:
            return
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
            r3 = this;
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r3.dataSource
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r0.getCache()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r1 = r3.dataSource
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r1 = r1.getCacheKeyFactory()
            com.google.android.exoplayer2.upstream.DataSpec r2 = r3.dataSpec
            java.lang.String r1 = r1.buildCacheKey(r2)
            r0.removeResource(r1)
            return
    }
}
