package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes.dex */
class GifFrameLoader {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback> callbacks;
    private com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget current;
    private android.graphics.Bitmap firstFrame;
    private int firstFrameSize;
    private final com.bumptech.glide.gifdecoder.GifDecoder gifDecoder;
    private final android.os.Handler handler;
    private int height;
    private boolean isCleared;
    private boolean isLoadPending;
    private boolean isRunning;
    private com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget next;

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.resource.gif.GifFrameLoader.OnEveryFrameListener onEveryFrameListener;
    private com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget pendingTarget;
    private com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> requestBuilder;
    public final com.bumptech.glide.RequestManager requestManager;
    private boolean startFromFirstFrame;
    private com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation;
    private int width;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static class DelayTarget extends com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap> {
        private final android.os.Handler handler;
        public final int index;
        private android.graphics.Bitmap resource;
        private final long targetTime;

        public DelayTarget(android.os.Handler r1, int r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                r0.index = r2
                r0.targetTime = r3
                return
        }

        public final android.graphics.Bitmap getResource() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.resource
                return r0
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                r1 = 0
                r0.resource = r1
                return
        }

        public void onResourceReady(@androidx.annotation.NonNull android.graphics.Bitmap r3, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> r4) {
                r2 = this;
                r2.resource = r3
                android.os.Handler r3 = r2.handler
                r4 = 1
                android.os.Message r3 = r3.obtainMessage(r4, r2)
                android.os.Handler r4 = r2.handler
                long r0 = r2.targetTime
                r4.sendMessageAtTime(r3, r0)
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition r2) {
                r0 = this;
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                r0.onResourceReady(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface FrameCallback {
        void onFrameReady();
    }

    public class FrameLoaderCallback implements android.os.Handler.Callback {
        public final /* synthetic */ com.bumptech.glide.load.resource.gif.GifFrameLoader this$0;

        public FrameLoaderCallback(com.bumptech.glide.load.resource.gif.GifFrameLoader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Lf
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r3 = (com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget) r3
                com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r2.this$0
                r0.onFrameReady(r3)
                return r1
            Lf:
                r1 = 2
                if (r0 != r1) goto L1d
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r3 = (com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget) r3
                com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r2.this$0
                com.bumptech.glide.RequestManager r0 = r0.requestManager
                r0.clear(r3)
            L1d:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.VisibleForTesting
    public interface OnEveryFrameListener {
        void onFrameReady();
    }

    public GifFrameLoader(com.bumptech.glide.Glide r3, com.bumptech.glide.gifdecoder.GifDecoder r4, int r5, int r6, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r7, android.graphics.Bitmap r8) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r3.getBitmapPool()
            android.content.Context r1 = r3.getContext()
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            android.content.Context r3 = r3.getContext()
            com.bumptech.glide.RequestManager r3 = com.bumptech.glide.Glide.with(r3)
            com.bumptech.glide.RequestBuilder r3 = getRequestBuilder(r3, r5, r6)
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.callbacks = r5
            r2.requestManager = r1
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameLoaderCallback r1 = new com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameLoaderCallback
            r1.<init>(r2)
            r5.<init>(r6, r1)
            r2.bitmapPool = r0
            r2.handler = r5
            r2.requestBuilder = r3
            r2.gifDecoder = r4
            r2.setFrameTransformation(r7, r8)
            return
    }

    private static com.bumptech.glide.load.Key getFrameSignature() {
            com.bumptech.glide.signature.ObjectKey r0 = new com.bumptech.glide.signature.ObjectKey
            double r1 = java.lang.Math.random()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    private static com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> getRequestBuilder(com.bumptech.glide.RequestManager r2, int r3, int r4) {
            com.bumptech.glide.RequestBuilder r2 = r2.asBitmap()
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.NONE
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            r1 = 1
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.useAnimationPool(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.skipMemoryCache(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r3 = r0.override(r3, r4)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r3)
            return r2
    }

    private void loadNextFrame() {
            r5 = this;
            boolean r0 = r5.isRunning
            if (r0 == 0) goto L68
            boolean r0 = r5.isLoadPending
            if (r0 == 0) goto L9
            goto L68
        L9:
            boolean r0 = r5.startFromFirstFrame
            r1 = 1
            if (r0 == 0) goto L22
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r5.pendingTarget
            r2 = 0
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            java.lang.String r3 = "Pending target must be null when starting from the first frame"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r3)
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.gifDecoder
            r0.resetFrameIndex()
            r5.startFromFirstFrame = r2
        L22:
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r5.pendingTarget
            if (r0 == 0) goto L2d
            r1 = 0
            r5.pendingTarget = r1
            r5.onFrameReady(r0)
            return
        L2d:
            r5.isLoadPending = r1
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.gifDecoder
            int r0 = r0.getNextDelay()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = (long) r0
            long r1 = r1 + r3
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.gifDecoder
            r0.advance()
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = new com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget
            android.os.Handler r3 = r5.handler
            com.bumptech.glide.gifdecoder.GifDecoder r4 = r5.gifDecoder
            int r4 = r4.getCurrentFrameIndex()
            r0.<init>(r3, r4, r1)
            r5.next = r0
            com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> r0 = r5.requestBuilder
            com.bumptech.glide.load.Key r1 = getFrameSignature()
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.signatureOf(r1)
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            com.bumptech.glide.gifdecoder.GifDecoder r1 = r5.gifDecoder
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r1 = r5.next
            r0.into(r1)
        L68:
            return
    }

    private void recycleFirstFrame() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.firstFrame
            if (r0 == 0) goto Lc
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r2.bitmapPool
            r1.put(r0)
            r0 = 0
            r2.firstFrame = r0
        Lc:
            return
    }

    private void start() {
            r1 = this;
            boolean r0 = r1.isRunning
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.isRunning = r0
            r0 = 0
            r1.isCleared = r0
            r1.loadNextFrame()
            return
    }

    private void stop() {
            r1 = this;
            r0 = 0
            r1.isRunning = r0
            return
    }

    public final void clear() {
            r3 = this;
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r0 = r3.callbacks
            r0.clear()
            r3.recycleFirstFrame()
            r3.stop()
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r3.current
            r1 = 0
            if (r0 == 0) goto L17
            com.bumptech.glide.RequestManager r2 = r3.requestManager
            r2.clear(r0)
            r3.current = r1
        L17:
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r3.next
            if (r0 == 0) goto L22
            com.bumptech.glide.RequestManager r2 = r3.requestManager
            r2.clear(r0)
            r3.next = r1
        L22:
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r3.pendingTarget
            if (r0 == 0) goto L2d
            com.bumptech.glide.RequestManager r2 = r3.requestManager
            r2.clear(r0)
            r3.pendingTarget = r1
        L2d:
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r3.gifDecoder
            r0.clear()
            r0 = 1
            r3.isCleared = r0
            return
    }

    public final java.nio.ByteBuffer getBuffer() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.gifDecoder
            java.nio.ByteBuffer r0 = r0.getData()
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    public final android.graphics.Bitmap getCurrentFrame() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r1.current
            if (r0 == 0) goto L9
            android.graphics.Bitmap r0 = r0.getResource()
            goto Lb
        L9:
            android.graphics.Bitmap r0 = r1.firstFrame
        Lb:
            return r0
    }

    public final int getCurrentIndex() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r1.current
            if (r0 == 0) goto L7
            int r0 = r0.index
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    public final android.graphics.Bitmap getFirstFrame() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.firstFrame
            return r0
    }

    public final int getFrameCount() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.gifDecoder
            int r0 = r0.getFrameCount()
            return r0
    }

    public final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> getFrameTransformation() {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.transformation
            return r0
    }

    public final int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public final int getLoopCount() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.gifDecoder
            int r0 = r0.getTotalIterationCount()
            return r0
    }

    public final int getSize() {
            r2 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r2.gifDecoder
            int r0 = r0.getByteSize()
            int r1 = r2.firstFrameSize
            int r0 = r0 + r1
            return r0
    }

    public final int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public final void onFrameReady(com.bumptech.glide.load.resource.gif.GifFrameLoader.DelayTarget r4) {
            r3 = this;
            com.bumptech.glide.load.resource.gif.GifFrameLoader$OnEveryFrameListener r0 = r3.onEveryFrameListener
            if (r0 == 0) goto L7
            r0.onFrameReady()
        L7:
            r0 = 0
            r3.isLoadPending = r0
            boolean r0 = r3.isCleared
            r1 = 2
            if (r0 == 0) goto L19
            android.os.Handler r0 = r3.handler
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
        L19:
            boolean r0 = r3.isRunning
            if (r0 != 0) goto L2e
            boolean r0 = r3.startFromFirstFrame
            if (r0 == 0) goto L2b
            android.os.Handler r0 = r3.handler
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            goto L2d
        L2b:
            r3.pendingTarget = r4
        L2d:
            return
        L2e:
            android.graphics.Bitmap r0 = r4.getResource()
            if (r0 == 0) goto L5e
            r3.recycleFirstFrame()
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r3.current
            r3.current = r4
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r4 = r3.callbacks
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L43:
            if (r4 < 0) goto L53
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r2 = r3.callbacks
            java.lang.Object r2 = r2.get(r4)
            com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback r2 = (com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback) r2
            r2.onFrameReady()
            int r4 = r4 + (-1)
            goto L43
        L53:
            if (r0 == 0) goto L5e
            android.os.Handler r4 = r3.handler
            android.os.Message r4 = r4.obtainMessage(r1, r0)
            r4.sendToTarget()
        L5e:
            r3.loadNextFrame()
            return
    }

    public final void setFrameTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
            r2 = this;
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.Transformation r0 = (com.bumptech.glide.load.Transformation) r0
            r2.transformation = r0
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.firstFrame = r0
            com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> r0 = r2.requestBuilder
            com.bumptech.glide.request.RequestOptions r1 = new com.bumptech.glide.request.RequestOptions
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r3 = r1.transform(r3)
            com.bumptech.glide.RequestBuilder r3 = r0.apply(r3)
            r2.requestBuilder = r3
            int r3 = com.bumptech.glide.util.Util.getBitmapByteSize(r4)
            r2.firstFrameSize = r3
            int r3 = r4.getWidth()
            r2.width = r3
            int r3 = r4.getHeight()
            r2.height = r3
            return
    }

    public final void setNextStartFromFirstFrame() {
            r3 = this;
            boolean r0 = r3.isRunning
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Can't restart a running animation"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r2)
            r3.startFromFirstFrame = r1
            com.bumptech.glide.load.resource.gif.GifFrameLoader$DelayTarget r0 = r3.pendingTarget
            if (r0 == 0) goto L17
            com.bumptech.glide.RequestManager r1 = r3.requestManager
            r1.clear(r0)
            r0 = 0
            r3.pendingTarget = r0
        L17:
            return
    }

    public final void subscribe(com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback r3) {
            r2 = this;
            boolean r0 = r2.isCleared
            if (r0 != 0) goto L25
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r0 = r2.callbacks
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1d
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r0 = r2.callbacks
            boolean r0 = r0.isEmpty()
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r1 = r2.callbacks
            r1.add(r3)
            if (r0 == 0) goto L1c
            r2.start()
        L1c:
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot subscribe twice in a row"
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot subscribe to a cleared frame loader"
            r3.<init>(r0)
            throw r3
    }

    public final void unsubscribe(com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r0 = r1.callbacks
            r0.remove(r2)
            java.util.List<com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback> r2 = r1.callbacks
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L10
            r1.stop()
        L10:
            return
    }
}
