package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Executors {
    private static final java.util.concurrent.Executor DIRECT_EXECUTOR = null;
    private static final java.util.concurrent.Executor MAIN_THREAD_EXECUTOR = null;



    static {
            com.bumptech.glide.util.Executors$1 r0 = new com.bumptech.glide.util.Executors$1
            r0.<init>()
            com.bumptech.glide.util.Executors.MAIN_THREAD_EXECUTOR = r0
            com.bumptech.glide.util.Executors$2 r0 = new com.bumptech.glide.util.Executors$2
            r0.<init>()
            com.bumptech.glide.util.Executors.DIRECT_EXECUTOR = r0
            return
    }

    private Executors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor directExecutor() {
            java.util.concurrent.Executor r0 = com.bumptech.glide.util.Executors.DIRECT_EXECUTOR
            return r0
    }

    public static java.util.concurrent.Executor mainThreadExecutor() {
            java.util.concurrent.Executor r0 = com.bumptech.glide.util.Executors.MAIN_THREAD_EXECUTOR
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static void shutdownAndAwaitTermination(java.util.concurrent.ExecutorService r4) {
            r4.shutdownNow()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L20
            r1 = 5
            boolean r3 = r4.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L20
            if (r3 != 0) goto L1f
            r4.shutdownNow()     // Catch: java.lang.InterruptedException -> L20
            boolean r0 = r4.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L20
            if (r0 == 0) goto L17
            goto L1f
        L17:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L20
            java.lang.String r1 = "Failed to shutdown"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L20
            throw r0     // Catch: java.lang.InterruptedException -> L20
        L1f:
            return
        L20:
            r0 = move-exception
            r4.shutdownNow()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r0)
            throw r4
    }
}
