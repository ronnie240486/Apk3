package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class ListPreloader<T> implements android.widget.AbsListView.OnScrollListener {
    private boolean isIncreasing;
    private int lastEnd;
    private int lastFirstVisible;
    private int lastStart;
    private final int maxPreload;
    private final com.bumptech.glide.ListPreloader.PreloadSizeProvider<T> preloadDimensionProvider;
    private final com.bumptech.glide.ListPreloader.PreloadModelProvider<T> preloadModelProvider;
    private final com.bumptech.glide.ListPreloader.PreloadTargetQueue preloadTargetQueue;
    private final com.bumptech.glide.RequestManager requestManager;
    private int totalItemCount;

    /* JADX INFO: loaded from: classes2.dex */
    public interface PreloadModelProvider<U> {
        @androidx.annotation.NonNull
        java.util.List<U> getPreloadItems(int r1);

        @androidx.annotation.Nullable
        com.bumptech.glide.RequestBuilder<?> getPreloadRequestBuilder(@androidx.annotation.NonNull U r1);
    }

    public interface PreloadSizeProvider<T> {
        @androidx.annotation.Nullable
        int[] getPreloadSize(@androidx.annotation.NonNull T r1, int r2, int r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PreloadTarget implements com.bumptech.glide.request.target.Target<java.lang.Object> {
        public int photoHeight;
        public int photoWidth;

        @androidx.annotation.Nullable
        private com.bumptech.glide.request.Request request;

        public PreloadTarget() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        @androidx.annotation.Nullable
        public com.bumptech.glide.request.Request getRequest() {
                r1 = this;
                com.bumptech.glide.request.Request r0 = r1.request
                return r0
        }

        @Override // com.bumptech.glide.request.target.Target
        public void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r3) {
                r2 = this;
                int r0 = r2.photoWidth
                int r1 = r2.photoHeight
                r3.onSizeReady(r0, r1)
                return
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
        public void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super java.lang.Object> r2) {
                r0 = this;
                return
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
        public void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1) {
                r0 = this;
                r0.request = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PreloadTargetQueue {
        public final java.util.Queue<com.bumptech.glide.ListPreloader.PreloadTarget> queue;

        public PreloadTargetQueue(int r4) {
                r3 = this;
                r3.<init>()
                java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r4)
                r3.queue = r0
                r0 = 0
            La:
                if (r0 >= r4) goto L19
                java.util.Queue<com.bumptech.glide.ListPreloader$PreloadTarget> r1 = r3.queue
                com.bumptech.glide.ListPreloader$PreloadTarget r2 = new com.bumptech.glide.ListPreloader$PreloadTarget
                r2.<init>()
                r1.offer(r2)
                int r0 = r0 + 1
                goto La
            L19:
                return
        }

        public com.bumptech.glide.ListPreloader.PreloadTarget next(int r3, int r4) {
                r2 = this;
                java.util.Queue<com.bumptech.glide.ListPreloader$PreloadTarget> r0 = r2.queue
                java.lang.Object r0 = r0.poll()
                com.bumptech.glide.ListPreloader$PreloadTarget r0 = (com.bumptech.glide.ListPreloader.PreloadTarget) r0
                java.util.Queue<com.bumptech.glide.ListPreloader$PreloadTarget> r1 = r2.queue
                r1.offer(r0)
                r0.photoWidth = r3
                r0.photoHeight = r4
                return r0
        }
    }

    public ListPreloader(@androidx.annotation.NonNull com.bumptech.glide.RequestManager r2, @androidx.annotation.NonNull com.bumptech.glide.ListPreloader.PreloadModelProvider<T> r3, @androidx.annotation.NonNull com.bumptech.glide.ListPreloader.PreloadSizeProvider<T> r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.lastFirstVisible = r0
            r0 = 1
            r1.isIncreasing = r0
            r1.requestManager = r2
            r1.preloadModelProvider = r3
            r1.preloadDimensionProvider = r4
            r1.maxPreload = r5
            com.bumptech.glide.ListPreloader$PreloadTargetQueue r2 = new com.bumptech.glide.ListPreloader$PreloadTargetQueue
            int r5 = r5 + r0
            r2.<init>(r5)
            r1.preloadTargetQueue = r2
            return
    }

    private void cancelAll() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.bumptech.glide.ListPreloader$PreloadTargetQueue r2 = r4.preloadTargetQueue
            java.util.Queue<com.bumptech.glide.ListPreloader$PreloadTarget> r2 = r2.queue
            int r2 = r2.size()
            if (r1 >= r2) goto L1a
            com.bumptech.glide.RequestManager r2 = r4.requestManager
            com.bumptech.glide.ListPreloader$PreloadTargetQueue r3 = r4.preloadTargetQueue
            com.bumptech.glide.ListPreloader$PreloadTarget r3 = r3.next(r0, r0)
            r2.clear(r3)
            int r1 = r1 + 1
            goto L2
        L1a:
            return
    }

    private void preload(int r5, int r6) {
            r4 = this;
            if (r5 >= r6) goto Lb
            int r0 = r4.lastEnd
            int r0 = java.lang.Math.max(r0, r5)
            r1 = r0
            r0 = r6
            goto L12
        Lb:
            int r0 = r4.lastStart
            int r0 = java.lang.Math.min(r0, r5)
            r1 = r6
        L12:
            int r2 = r4.totalItemCount
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = r4.totalItemCount
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = java.lang.Math.min(r2, r1)
            if (r5 >= r6) goto L35
            r5 = r1
        L26:
            if (r5 >= r0) goto L45
            com.bumptech.glide.ListPreloader$PreloadModelProvider<T> r6 = r4.preloadModelProvider
            java.util.List r6 = r6.getPreloadItems(r5)
            r2 = 1
            r4.preloadAdapterPosition(r6, r5, r2)
            int r5 = r5 + 1
            goto L26
        L35:
            int r5 = r0 + (-1)
        L37:
            if (r5 < r1) goto L45
            com.bumptech.glide.ListPreloader$PreloadModelProvider<T> r6 = r4.preloadModelProvider
            java.util.List r6 = r6.getPreloadItems(r5)
            r4.preloadAdapterPosition(r6, r5, r3)
            int r5 = r5 + (-1)
            goto L37
        L45:
            r4.lastStart = r1
            r4.lastEnd = r0
            return
    }

    private void preload(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isIncreasing
            if (r0 == r3) goto L9
            r1.isIncreasing = r3
            r1.cancelAll()
        L9:
            if (r3 == 0) goto Le
            int r3 = r1.maxPreload
            goto L11
        Le:
            int r3 = r1.maxPreload
            int r3 = -r3
        L11:
            int r3 = r3 + r2
            r1.preload(r2, r3)
            return
    }

    private void preloadAdapterPosition(java.util.List<T> r3, int r4, boolean r5) {
            r2 = this;
            int r0 = r3.size()
            if (r5 == 0) goto L13
            r5 = 0
        L7:
            if (r5 >= r0) goto L21
            java.lang.Object r1 = r3.get(r5)
            r2.preloadItem(r1, r4, r5)
            int r5 = r5 + 1
            goto L7
        L13:
            int r0 = r0 + (-1)
        L15:
            if (r0 < 0) goto L21
            java.lang.Object r5 = r3.get(r0)
            r2.preloadItem(r5, r4, r0)
            int r0 = r0 + (-1)
            goto L15
        L21:
            return
    }

    private void preloadItem(@androidx.annotation.Nullable T r3, int r4, int r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.bumptech.glide.ListPreloader$PreloadSizeProvider<T> r0 = r2.preloadDimensionProvider
            int[] r4 = r0.getPreloadSize(r3, r4, r5)
            if (r4 != 0) goto Lc
            return
        Lc:
            com.bumptech.glide.ListPreloader$PreloadModelProvider<T> r5 = r2.preloadModelProvider
            com.bumptech.glide.RequestBuilder r3 = r5.getPreloadRequestBuilder(r3)
            if (r3 != 0) goto L15
            return
        L15:
            com.bumptech.glide.ListPreloader$PreloadTargetQueue r5 = r2.preloadTargetQueue
            r0 = 0
            r0 = r4[r0]
            r1 = 1
            r4 = r4[r1]
            com.bumptech.glide.ListPreloader$PreloadTarget r4 = r5.next(r0, r4)
            r3.into(r4)
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            r0.totalItemCount = r4
            int r1 = r0.lastFirstVisible
            if (r2 <= r1) goto Lc
            int r3 = r3 + r2
            r1 = 1
            r0.preload(r3, r1)
            goto L12
        Lc:
            if (r2 >= r1) goto L12
            r1 = 0
            r0.preload(r2, r1)
        L12:
            r0.lastFirstVisible = r2
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
            r0 = this;
            return
    }
}
