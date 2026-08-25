package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
public class RequestManager implements android.content.ComponentCallbacks2, com.bumptech.glide.manager.LifecycleListener, com.bumptech.glide.ModelTypes<com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>> {
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_BITMAP = null;
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_GIF = null;
    private static final com.bumptech.glide.request.RequestOptions DOWNLOAD_ONLY_OPTIONS = null;
    private final java.lang.Runnable addSelfToLifecycle;
    private final com.bumptech.glide.manager.ConnectivityMonitor connectivityMonitor;
    public final android.content.Context context;
    private final java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    public final com.bumptech.glide.Glide glide;
    public final com.bumptech.glide.manager.Lifecycle lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;

    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.RequestOptions requestOptions;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.RequestTracker requestTracker;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.TargetTracker targetTracker;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.RequestManagerTreeNode treeNode;


    public static class ClearTarget extends com.bumptech.glide.request.target.CustomViewTarget<android.view.View, java.lang.Object> {
        public ClearTarget(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public final void onResourceCleared() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super java.lang.Object> r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class RequestManagerConnectivityListener implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener {

        @androidx.annotation.GuardedBy("RequestManager.this")
        private final com.bumptech.glide.manager.RequestTracker requestTracker;
        public final /* synthetic */ com.bumptech.glide.RequestManager this$0;

        public RequestManagerConnectivityListener(@androidx.annotation.NonNull com.bumptech.glide.RequestManager r1, com.bumptech.glide.manager.RequestTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.requestTracker = r2
                return
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                com.bumptech.glide.RequestManager r2 = r1.this$0
                monitor-enter(r2)
                com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> Lc
                r0.restartRequests()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                goto Lf
            Lc:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r0
            Lf:
                return
        }
    }

    static {
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.decodeTypeOf(r0)
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.lock()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DECODE_TYPE_BITMAP = r0
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.decodeTypeOf(r0)
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.lock()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DECODE_TYPE_GIF = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.DATA
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.priority(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            r1 = 1
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.skipMemoryCache(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DOWNLOAD_ONLY_OPTIONS = r0
            return
    }

    public RequestManager(@androidx.annotation.NonNull com.bumptech.glide.Glide r4, @androidx.annotation.NonNull com.bumptech.glide.manager.Lifecycle r5, @androidx.annotation.NonNull com.bumptech.glide.manager.RequestManagerTreeNode r6, @androidx.annotation.NonNull android.content.Context r7) {
            r3 = this;
            com.bumptech.glide.manager.RequestTracker r0 = new com.bumptech.glide.manager.RequestTracker
            r0.<init>()
            com.bumptech.glide.manager.ConnectivityMonitorFactory r1 = r4.getConnectivityMonitorFactory()
            r3.<init>()
            com.bumptech.glide.manager.TargetTracker r2 = new com.bumptech.glide.manager.TargetTracker
            r2.<init>()
            r3.targetTracker = r2
            com.bumptech.glide.RequestManager$1 r2 = new com.bumptech.glide.RequestManager$1
            r2.<init>(r3)
            r3.addSelfToLifecycle = r2
            r3.glide = r4
            r3.lifecycle = r5
            r3.treeNode = r6
            r3.requestTracker = r0
            r3.context = r7
            android.content.Context r6 = r7.getApplicationContext()
            com.bumptech.glide.RequestManager$RequestManagerConnectivityListener r7 = new com.bumptech.glide.RequestManager$RequestManagerConnectivityListener
            r7.<init>(r3, r0)
            com.bumptech.glide.manager.ConnectivityMonitor r6 = r1.build(r6, r7)
            r3.connectivityMonitor = r6
            boolean r7 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r7 == 0) goto L3d
            com.bumptech.glide.util.Util.postOnUiThread(r2)
            goto L40
        L3d:
            r5.addListener(r3)
        L40:
            r5.addListener(r6)
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.GlideContext r6 = r4.getGlideContext()
            java.util.List r6 = r6.getDefaultRequestListeners()
            r5.<init>(r6)
            r3.defaultRequestListeners = r5
            com.bumptech.glide.GlideContext r5 = r4.getGlideContext()
            com.bumptech.glide.request.RequestOptions r5 = r5.getDefaultRequestOptions()
            r3.setRequestOptions(r5)
            r4.registerRequestManager(r3)
            return
    }

    private void untrackOrDelegate(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r3) {
            r2 = this;
            boolean r0 = r2.untrack(r3)
            com.bumptech.glide.request.Request r1 = r3.getRequest()
            if (r0 != 0) goto L1b
            com.bumptech.glide.Glide r0 = r2.glide
            boolean r0 = r0.removeFromManagers(r3)
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L1b
            r0 = 0
            r3.setRequest(r0)
            r1.clear()
        L1b:
            return
    }

    private synchronized void updateRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.RequestOptions r0 = r1.requestOptions     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.RequestOptions r2 = (com.bumptech.glide.request.RequestOptions) r2     // Catch: java.lang.Throwable -> Ld
            r1.requestOptions = r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public com.bumptech.glide.RequestManager addDefaultRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public synchronized com.bumptech.glide.RequestManager applyDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            r0.updateRequestOptions(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <ResourceType> com.bumptech.glide.RequestBuilder<ResourceType> as(@androidx.annotation.NonNull java.lang.Class<ResourceType> r4) {
            r3 = this;
            com.bumptech.glide.RequestBuilder r0 = new com.bumptech.glide.RequestBuilder
            com.bumptech.glide.Glide r1 = r3.glide
            android.content.Context r2 = r3.context
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> asBitmap() {
            r2 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DECODE_TYPE_BITMAP
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> asDrawable() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.RequestBuilder r0 = r1.as(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<java.io.File> asFile() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            r1 = 1
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheOf(r1)
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<com.bumptech.glide.load.resource.gif.GifDrawable> asGif() {
            r2 = this;
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DECODE_TYPE_GIF
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    public void clear(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.bumptech.glide.RequestManager$ClearTarget r0 = new com.bumptech.glide.RequestManager$ClearTarget
            r0.<init>(r2)
            r1.clear(r0)
            return
    }

    public void clear(@androidx.annotation.Nullable com.bumptech.glide.request.target.Target<?> r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.untrackOrDelegate(r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<java.io.File> download(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.downloadOnly()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<java.io.File> downloadOnly() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DOWNLOAD_ONLY_OPTIONS
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    public final java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> getDefaultRequestListeners() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            return r0
    }

    public final synchronized com.bumptech.glide.request.RequestOptions getDefaultRequestOptions() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.RequestOptions r0 = r1.requestOptions     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean isPaused() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isPaused()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.net.Uri r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.io.File r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.net.URL r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L42
            r0.onDestroy()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L42
            java.util.List r0 = r0.getAll()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.request.target.Target r1 = (com.bumptech.glide.request.target.Target) r1     // Catch: java.lang.Throwable -> L42
            r2.clear(r1)     // Catch: java.lang.Throwable -> L42
            goto L10
        L20:
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L42
            r0.clear()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.manager.RequestTracker r0 = r2.requestTracker     // Catch: java.lang.Throwable -> L42
            r0.clearRequests()     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.manager.Lifecycle r0 = r2.lifecycle     // Catch: java.lang.Throwable -> L42
            r0.removeListener(r2)     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.manager.Lifecycle r0 = r2.lifecycle     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.manager.ConnectivityMonitor r1 = r2.connectivityMonitor     // Catch: java.lang.Throwable -> L42
            r0.removeListener(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Runnable r0 = r2.addSelfToLifecycle     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.util.Util.removeCallbacksOnUiThread(r0)     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.Glide r0 = r2.glide     // Catch: java.lang.Throwable -> L42
            r0.unregisterRequestManager(r2)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r2)
            return
        L42:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
            r1 = this;
            monitor-enter(r1)
            r1.resumeRequests()     // Catch: java.lang.Throwable -> Lb
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Lb
            r0.onStart()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
            r1 = this;
            monitor-enter(r1)
            r1.pauseRequests()     // Catch: java.lang.Throwable -> Lb
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Lb
            r0.onStop()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r2) {
            r1 = this;
            r0 = 60
            if (r2 != r0) goto Lb
            boolean r2 = r1.pauseAllRequestsOnTrimMemoryModerate
            if (r2 == 0) goto Lb
            r1.pauseAllRequestsRecursive()
        Lb:
            return
    }

    public synchronized void pauseAllRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.pauseAllRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void pauseAllRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            r2.pauseAllRequests()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L20
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L20
            r1.pauseAllRequests()     // Catch: java.lang.Throwable -> L20
            goto Le
        L1e:
            monitor-exit(r2)
            return
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized void pauseRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.pauseRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void pauseRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            r2.pauseRequests()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L20
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L20
            r1.pauseRequests()     // Catch: java.lang.Throwable -> L20
            goto Le
        L1e:
            monitor-exit(r2)
            return
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized void resumeRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.resumeRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void resumeRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.Util.assertMainThread()     // Catch: java.lang.Throwable -> L23
            r2.resumeRequests()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L23
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L23
            r1.resumeRequests()     // Catch: java.lang.Throwable -> L23
            goto L11
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @androidx.annotation.NonNull
    public synchronized com.bumptech.glide.RequestManager setDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            r0.setRequestOptions(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean r1) {
            r0 = this;
            r0.pauseAllRequestsOnTrimMemoryModerate = r1
            return
    }

    public synchronized void setRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.clone()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.autoClone()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1     // Catch: java.lang.Throwable -> L11
            r0.requestOptions = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = super.toString()     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "{tracker="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.manager.RequestTracker r1 = r2.requestTracker     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = ", treeNode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.manager.RequestManagerTreeNode r1 = r2.treeNode     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            return r0
        L2e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void track(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r2, @androidx.annotation.NonNull com.bumptech.glide.request.Request r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Ld
            r0.track(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.manager.RequestTracker r2 = r1.requestTracker     // Catch: java.lang.Throwable -> Ld
            r2.runRequest(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean untrack(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r4) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.request.Request r0 = r4.getRequest()     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            com.bumptech.glide.manager.RequestTracker r2 = r3.requestTracker     // Catch: java.lang.Throwable -> L20
            boolean r0 = r2.clearAndRemove(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            com.bumptech.glide.manager.TargetTracker r0 = r3.targetTracker     // Catch: java.lang.Throwable -> L20
            r0.untrack(r4)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r4.setRequest(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)
            return r1
        L1d:
            r4 = 0
            monitor-exit(r3)
            return r4
        L20:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
