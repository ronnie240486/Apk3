package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public class RequestFutureTarget<R> implements com.bumptech.glide.request.FutureTarget<R>, com.bumptech.glide.request.RequestListener<R> {
    private static final com.bumptech.glide.request.RequestFutureTarget.Waiter DEFAULT_WAITER = null;
    private final boolean assertBackgroundThread;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.load.engine.GlideException exception;
    private final int height;

    @androidx.annotation.GuardedBy("this")
    private boolean isCancelled;

    @androidx.annotation.GuardedBy("this")
    private boolean loadFailed;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.Request request;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private R resource;

    @androidx.annotation.GuardedBy("this")
    private boolean resultReceived;
    private final com.bumptech.glide.request.RequestFutureTarget.Waiter waiter;
    private final int width;

    @androidx.annotation.VisibleForTesting
    public static class Waiter {
        public Waiter() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.bumptech.glide.request.RequestFutureTarget$Waiter r0 = new com.bumptech.glide.request.RequestFutureTarget$Waiter
            r0.<init>()
            com.bumptech.glide.request.RequestFutureTarget.DEFAULT_WAITER = r0
            return
    }

    public RequestFutureTarget(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.request.RequestFutureTarget$Waiter r0 = com.bumptech.glide.request.RequestFutureTarget.DEFAULT_WAITER
            r1.<init>()
            r1.width = r2
            r1.height = r3
            r2 = 1
            r1.assertBackgroundThread = r2
            r1.waiter = r0
            return
    }

    private synchronized R doGet(java.lang.Long r6) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.assertBackgroundThread     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto Le
            boolean r0 = r5.isDone()     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto Le
            com.bumptech.glide.util.Util.assertBackgroundThread()     // Catch: java.lang.Throwable -> L93
        Le:
            boolean r0 = r5.isCancelled     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L8d
            boolean r0 = r5.loadFailed     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L85
            boolean r0 = r5.resultReceived     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L1e
            R r6 = r5.resource     // Catch: java.lang.Throwable -> L93
            monitor-exit(r5)
            return r6
        L1e:
            r0 = 0
            if (r6 != 0) goto L2b
            com.bumptech.glide.request.RequestFutureTarget$Waiter r6 = r5.waiter     // Catch: java.lang.Throwable -> L93
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L93
            r5.wait(r0)     // Catch: java.lang.Throwable -> L93
            goto L55
        L2b:
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L93
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L55
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L93
            long r2 = r2 + r0
        L3c:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L55
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L55
            com.bumptech.glide.request.RequestFutureTarget$Waiter r6 = r5.waiter     // Catch: java.lang.Throwable -> L93
            long r0 = r2 - r0
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L93
            r5.wait(r0)     // Catch: java.lang.Throwable -> L93
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            goto L3c
        L55:
            boolean r6 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L7f
            boolean r6 = r5.loadFailed     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L77
            boolean r6 = r5.isCancelled     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L71
            boolean r6 = r5.resultReceived     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L6b
            R r6 = r5.resource     // Catch: java.lang.Throwable -> L93
            monitor-exit(r5)
            return r6
        L6b:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L71:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L77:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L93
            com.bumptech.glide.load.engine.GlideException r0 = r5.exception     // Catch: java.lang.Throwable -> L93
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L7f:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L85:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L93
            com.bumptech.glide.load.engine.GlideException r0 = r5.exception     // Catch: java.lang.Throwable -> L93
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L8d:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            throw r6     // Catch: java.lang.Throwable -> L93
        L93:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto La
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            return r3
        La:
            r0 = 1
            r2.isCancelled = r0     // Catch: java.lang.Throwable -> L24
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r2.waiter     // Catch: java.lang.Throwable -> L24
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L24
            r2.notifyAll()     // Catch: java.lang.Throwable -> L24
            r1 = 0
            if (r3 == 0) goto L1d
            com.bumptech.glide.request.Request r3 = r2.request     // Catch: java.lang.Throwable -> L24
            r2.request = r1     // Catch: java.lang.Throwable -> L24
            r1 = r3
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L23
            r1.clear()
        L23:
            return r0
        L24:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    @Override // java.util.concurrent.Future
    public R get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.doGet(r0)     // Catch: java.util.concurrent.TimeoutException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public R get(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            long r1 = r3.toMillis(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.doGet(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.target.Target
    @androidx.annotation.Nullable
    public synchronized com.bumptech.glide.request.Request getRequest() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.Request r0 = r1.request     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r3) {
            r2 = this;
            int r0 = r2.width
            int r1 = r2.height
            r3.onSizeReady(r0, r1)
            return
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.resultReceived     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.loadFailed     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(@androidx.annotation.Nullable com.bumptech.glide.load.engine.GlideException r1, java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, boolean r4) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.loadFailed = r2     // Catch: java.lang.Throwable -> L11
            r0.exception = r1     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r0.waiter     // Catch: java.lang.Throwable -> L11
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L11
            r0.notifyAll()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@androidx.annotation.NonNull R r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super R> r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(R r1, java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.resultReceived = r2     // Catch: java.lang.Throwable -> L11
            r0.resource = r1     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r0.waiter     // Catch: java.lang.Throwable -> L11
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L11
            r0.notifyAll()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1) {
            r0 = this;
            monitor-enter(r0)
            r0.request = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
