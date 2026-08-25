package com.bumptech.glide.load.engine.executor;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideExecutor implements java.util.concurrent.ExecutorService {
    private static final java.lang.String DEFAULT_ANIMATION_EXECUTOR_NAME = "animation";
    private static final java.lang.String DEFAULT_DISK_CACHE_EXECUTOR_NAME = "disk-cache";
    private static final int DEFAULT_DISK_CACHE_EXECUTOR_THREADS = 1;
    private static final java.lang.String DEFAULT_SOURCE_EXECUTOR_NAME = "source";
    private static final java.lang.String DEFAULT_SOURCE_UNLIMITED_EXECUTOR_NAME = "source-unlimited";
    private static final long KEEP_ALIVE_TIME_MS = 0;
    private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
    private static final java.lang.String TAG = "GlideExecutor";
    private static volatile int bestThreadCount;
    private final java.util.concurrent.ExecutorService delegate;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;
        private int corePoolSize;
        private int maximumPoolSize;
        private java.lang.String name;
        private final boolean preventNetworkOperations;
        private long threadTimeoutMillis;

        @androidx.annotation.NonNull
        private com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;

        public Builder(boolean r2) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT
                r1.uncaughtThrowableStrategy = r0
                r1.preventNetworkOperations = r2
                return
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor build() {
                r11 = this;
                java.lang.String r0 = r11.name
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L38
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                int r2 = r11.corePoolSize
                int r3 = r11.maximumPoolSize
                long r4 = r11.threadTimeoutMillis
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.util.concurrent.PriorityBlockingQueue r7 = new java.util.concurrent.PriorityBlockingQueue
                r7.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory r8 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory
                java.lang.String r1 = r11.name
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r9 = r11.uncaughtThrowableStrategy
                boolean r10 = r11.preventNetworkOperations
                r8.<init>(r1, r9, r10)
                r1 = r0
                r1.<init>(r2, r3, r4, r6, r7, r8)
                long r1 = r11.threadTimeoutMillis
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L32
                r1 = 1
                r0.allowCoreThreadTimeOut(r1)
            L32:
                com.bumptech.glide.load.engine.executor.GlideExecutor r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor
                r1.<init>(r0)
                return r1
            L38:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Name must be non-null and non-empty, but given: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r2 = r11.name
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setName(java.lang.String r1) {
                r0 = this;
                r0.name = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadCount(@androidx.annotation.IntRange(from = 1) int r1) {
                r0 = this;
                r0.corePoolSize = r1
                r0.maximumPoolSize = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadTimeoutMillis(long r1) {
                r0 = this;
                r0.threadTimeoutMillis = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setUncaughtThrowableStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
                r0 = this;
                r0.uncaughtThrowableStrategy = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private static final int DEFAULT_PRIORITY = 9;
        private final java.lang.String name;
        public final boolean preventNetworkOperations;
        private int threadNum;
        public final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;


        public DefaultThreadFactory(java.lang.String r1, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.uncaughtThrowableStrategy = r2
                r0.preventNetworkOperations = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r4) {
                r3 = this;
                monitor-enter(r3)
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory$1 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory$1     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "glide-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = r3.name     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "-thread-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                int r2 = r3.threadNum     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L2b
                int r4 = r3.threadNum     // Catch: java.lang.Throwable -> L2b
                int r4 = r4 + 1
                r3.threadNum = r4     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r3)
                return r0
            L2b:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface UncaughtThrowableStrategy {
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy DEFAULT = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy IGNORE = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy LOG = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy THROW = null;




        static {
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1
                r0.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.IGNORE = r0
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2
                r0.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.LOG = r0
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3 r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3
                r1.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.THROW = r1
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT = r0
                return
        }

        void handle(java.lang.Throwable r1);
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 10
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor.KEEP_ALIVE_TIME_MS = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public GlideExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    public static int calculateBestThreadCount() {
            int r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount
            if (r0 != 0) goto L13
            r0 = 4
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r0 = java.lang.Math.min(r0, r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount = r0
        L13:
            int r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newAnimationBuilder() {
            int r0 = calculateBestThreadCount()
            r1 = 1
            r2 = 4
            if (r0 < r2) goto La
            r0 = 2
            goto Lb
        La:
            r0 = 1
        Lb:
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r2 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r2.<init>(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r2.setThreadCount(r0)
            java.lang.String r1 = "animation"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newAnimationBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor(int r1, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r2) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newAnimationBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newDiskCacheBuilder() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r1 = 1
            r0.<init>(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setThreadCount(r1)
            java.lang.String r1 = "disk-cache"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r3) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setName(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r3)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setUncaughtThrowableStrategy(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newSourceBuilder() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r1 = 0
            r0.<init>(r1)
            int r1 = calculateBestThreadCount()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setThreadCount(r1)
            java.lang.String r1 = "source"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r3) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setName(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r3)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setUncaughtThrowableStrategy(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newUnlimitedSourceExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            long r4 = com.bumptech.glide.load.engine.executor.GlideExecutor.KEEP_ALIVE_TIME_MS
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory r8 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory
            com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r1 = com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT
            java.lang.String r2 = "source-unlimited"
            r3 = 0
            r8.<init>(r2, r1, r3)
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = r9
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0.<init>(r9)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public java.util.concurrent.Future<?> submit(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.concurrent.Future<T> submit(@androidx.annotation.NonNull java.lang.Runnable r2, T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(@androidx.annotation.NonNull java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
