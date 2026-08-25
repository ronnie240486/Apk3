package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
public class ImageLoader {
    private int mBatchResponseDelayMs;
    private final java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader.BatchedImageRequest> mBatchedResponses;
    private final com.android.volley.toolbox.ImageLoader.ImageCache mCache;
    private final android.os.Handler mHandler;
    private final java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader.BatchedImageRequest> mInFlightRequests;
    private final com.android.volley.RequestQueue mRequestQueue;
    private java.lang.Runnable mRunnable;





    /* JADX INFO: loaded from: classes.dex */
    public static class BatchedImageRequest {
        private final java.util.List<com.android.volley.toolbox.ImageLoader.ImageContainer> mContainers;
        private com.android.volley.VolleyError mError;
        private final com.android.volley.Request<?> mRequest;
        private android.graphics.Bitmap mResponseBitmap;

        public BatchedImageRequest(com.android.volley.Request<?> r2, com.android.volley.toolbox.ImageLoader.ImageContainer r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mContainers = r0
                r1.mRequest = r2
                r0.add(r3)
                return
        }

        public static /* synthetic */ android.graphics.Bitmap access$000(com.android.volley.toolbox.ImageLoader.BatchedImageRequest r0) {
                android.graphics.Bitmap r0 = r0.mResponseBitmap
                return r0
        }

        public static /* synthetic */ android.graphics.Bitmap access$002(com.android.volley.toolbox.ImageLoader.BatchedImageRequest r0, android.graphics.Bitmap r1) {
                r0.mResponseBitmap = r1
                return r1
        }

        public static /* synthetic */ java.util.List access$300(com.android.volley.toolbox.ImageLoader.BatchedImageRequest r0) {
                java.util.List<com.android.volley.toolbox.ImageLoader$ImageContainer> r0 = r0.mContainers
                return r0
        }

        public void addContainer(com.android.volley.toolbox.ImageLoader.ImageContainer r2) {
                r1 = this;
                java.util.List<com.android.volley.toolbox.ImageLoader$ImageContainer> r0 = r1.mContainers
                r0.add(r2)
                return
        }

        public com.android.volley.VolleyError getError() {
                r1 = this;
                com.android.volley.VolleyError r0 = r1.mError
                return r0
        }

        public boolean removeContainerAndCancelIfNecessary(com.android.volley.toolbox.ImageLoader.ImageContainer r2) {
                r1 = this;
                java.util.List<com.android.volley.toolbox.ImageLoader$ImageContainer> r0 = r1.mContainers
                r0.remove(r2)
                java.util.List<com.android.volley.toolbox.ImageLoader$ImageContainer> r2 = r1.mContainers
                int r2 = r2.size()
                if (r2 != 0) goto L14
                com.android.volley.Request<?> r2 = r1.mRequest
                r2.cancel()
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }

        public void setError(com.android.volley.VolleyError r1) {
                r0 = this;
                r0.mError = r1
                return
        }
    }

    public interface ImageCache {
        @androidx.annotation.Nullable
        android.graphics.Bitmap getBitmap(java.lang.String r1);

        void putBitmap(java.lang.String r1, android.graphics.Bitmap r2);
    }

    public class ImageContainer {
        private android.graphics.Bitmap mBitmap;
        private final java.lang.String mCacheKey;
        private final com.android.volley.toolbox.ImageLoader.ImageListener mListener;
        private final java.lang.String mRequestUrl;
        public final /* synthetic */ com.android.volley.toolbox.ImageLoader this$0;

        public ImageContainer(com.android.volley.toolbox.ImageLoader r1, android.graphics.Bitmap r2, java.lang.String r3, java.lang.String r4, com.android.volley.toolbox.ImageLoader.ImageListener r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mBitmap = r2
                r0.mRequestUrl = r3
                r0.mCacheKey = r4
                r0.mListener = r5
                return
        }

        public static /* synthetic */ com.android.volley.toolbox.ImageLoader.ImageListener access$400(com.android.volley.toolbox.ImageLoader.ImageContainer r0) {
                com.android.volley.toolbox.ImageLoader$ImageListener r0 = r0.mListener
                return r0
        }

        public static /* synthetic */ android.graphics.Bitmap access$502(com.android.volley.toolbox.ImageLoader.ImageContainer r0, android.graphics.Bitmap r1) {
                r0.mBitmap = r1
                return r1
        }

        @androidx.annotation.MainThread
        public void cancelRequest() {
                r2 = this;
                com.android.volley.toolbox.Threads.throwIfNotOnMainThread()
                com.android.volley.toolbox.ImageLoader$ImageListener r0 = r2.mListener
                if (r0 != 0) goto L8
                return
            L8:
                com.android.volley.toolbox.ImageLoader r0 = r2.this$0
                java.util.HashMap r0 = com.android.volley.toolbox.ImageLoader.access$100(r0)
                java.lang.String r1 = r2.mCacheKey
                java.lang.Object r0 = r0.get(r1)
                com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
                if (r0 == 0) goto L2a
                boolean r0 = r0.removeContainerAndCancelIfNecessary(r2)
                if (r0 == 0) goto L52
                com.android.volley.toolbox.ImageLoader r0 = r2.this$0
                java.util.HashMap r0 = com.android.volley.toolbox.ImageLoader.access$100(r0)
                java.lang.String r1 = r2.mCacheKey
                r0.remove(r1)
                goto L52
            L2a:
                com.android.volley.toolbox.ImageLoader r0 = r2.this$0
                java.util.HashMap r0 = com.android.volley.toolbox.ImageLoader.access$200(r0)
                java.lang.String r1 = r2.mCacheKey
                java.lang.Object r0 = r0.get(r1)
                com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
                if (r0 == 0) goto L52
                r0.removeContainerAndCancelIfNecessary(r2)
                java.util.List r0 = com.android.volley.toolbox.ImageLoader.BatchedImageRequest.access$300(r0)
                int r0 = r0.size()
                if (r0 != 0) goto L52
                com.android.volley.toolbox.ImageLoader r0 = r2.this$0
                java.util.HashMap r0 = com.android.volley.toolbox.ImageLoader.access$200(r0)
                java.lang.String r1 = r2.mCacheKey
                r0.remove(r1)
            L52:
                return
        }

        public android.graphics.Bitmap getBitmap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBitmap
                return r0
        }

        public java.lang.String getRequestUrl() {
                r1 = this;
                java.lang.String r0 = r1.mRequestUrl
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface ImageListener extends com.android.volley.Response.ErrorListener {
        void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer r1, boolean r2);
    }

    public ImageLoader(com.android.volley.RequestQueue r3, com.android.volley.toolbox.ImageLoader.ImageCache r4) {
            r2 = this;
            r2.<init>()
            r0 = 100
            r2.mBatchResponseDelayMs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mInFlightRequests = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBatchedResponses = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mHandler = r0
            r2.mRequestQueue = r3
            r2.mCache = r4
            return
    }

    public static /* synthetic */ java.util.HashMap access$100(com.android.volley.toolbox.ImageLoader r0) {
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r0.mInFlightRequests
            return r0
    }

    public static /* synthetic */ java.util.HashMap access$200(com.android.volley.toolbox.ImageLoader r0) {
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r0.mBatchedResponses
            return r0
    }

    public static /* synthetic */ void access$602(com.android.volley.toolbox.ImageLoader r1) {
            r0 = 0
            r1.mRunnable = r0
            return
    }

    private void batchResponse(java.lang.String r3, com.android.volley.toolbox.ImageLoader.BatchedImageRequest r4) {
            r2 = this;
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r2.mBatchedResponses
            r0.put(r3, r4)
            java.lang.Runnable r3 = r2.mRunnable
            if (r3 != 0) goto L18
            com.android.volley.toolbox.ImageLoader$4 r3 = new com.android.volley.toolbox.ImageLoader$4
            r3.<init>(r2)
            r2.mRunnable = r3
            android.os.Handler r4 = r2.mHandler
            int r0 = r2.mBatchResponseDelayMs
            long r0 = (long) r0
            r4.postDelayed(r3, r0)
        L18:
            return
    }

    private static java.lang.String getCacheKey(java.lang.String r2, int r3, int r4, android.widget.ImageView.ScaleType r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.length()
            int r1 = r1 + 12
            r0.<init>(r1)
            java.lang.String r1 = "#W"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "#H"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "#S"
            r0.append(r3)
            int r3 = r5.ordinal()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static com.android.volley.toolbox.ImageLoader.ImageListener getImageListener(android.widget.ImageView r1, int r2, int r3) {
            com.android.volley.toolbox.ImageLoader$1 r0 = new com.android.volley.toolbox.ImageLoader$1
            r0.<init>(r3, r1, r2)
            return r0
    }

    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String r2, com.android.volley.toolbox.ImageLoader.ImageListener r3) {
            r1 = this;
            r0 = 0
            com.android.volley.toolbox.ImageLoader$ImageContainer r2 = r1.get(r2, r3, r0, r0)
            return r2
    }

    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String r7, com.android.volley.toolbox.ImageLoader.ImageListener r8, int r9, int r10) {
            r6 = this;
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.android.volley.toolbox.ImageLoader$ImageContainer r7 = r0.get(r1, r2, r3, r4, r5)
            return r7
    }

    @androidx.annotation.MainThread
    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String r17, com.android.volley.toolbox.ImageLoader.ImageListener r18, int r19, int r20, android.widget.ImageView.ScaleType r21) {
            r16 = this;
            r6 = r16
            r7 = r18
            com.android.volley.toolbox.Threads.throwIfNotOnMainThread()
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r21
            java.lang.String r15 = getCacheKey(r8, r10, r11, r12)
            com.android.volley.toolbox.ImageLoader$ImageCache r0 = r6.mCache
            android.graphics.Bitmap r2 = r0.getBitmap(r15)
            r9 = 1
            if (r2 == 0) goto L2c
            com.android.volley.toolbox.ImageLoader$ImageContainer r10 = new com.android.volley.toolbox.ImageLoader$ImageContainer
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r16
            r3 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r7.onResponse(r10, r9)
            return r10
        L2c:
            com.android.volley.toolbox.ImageLoader$ImageContainer r14 = new com.android.volley.toolbox.ImageLoader$ImageContainer
            r2 = 0
            r0 = r14
            r1 = r16
            r3 = r17
            r4 = r15
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r7.onResponse(r14, r9)
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r6.mInFlightRequests
            java.lang.Object r0 = r0.get(r15)
            com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
            if (r0 != 0) goto L4f
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r6.mBatchedResponses
            java.lang.Object r0 = r0.get(r15)
            com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
        L4f:
            if (r0 == 0) goto L55
            r0.addContainer(r14)
            return r14
        L55:
            com.android.volley.toolbox.ImageRequest r0 = new com.android.volley.toolbox.ImageRequest
            com.android.volley.toolbox.ImageLoader$2 r9 = new com.android.volley.toolbox.ImageLoader$2
            r9.<init>(r6, r15)
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.RGB_565
            com.android.volley.toolbox.ImageLoader$3 r1 = new com.android.volley.toolbox.ImageLoader$3
            r1.<init>(r6, r15)
            r7 = r0
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r21
            r2 = r14
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.android.volley.RequestQueue r1 = r6.mRequestQueue
            r1.add(r0)
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r1 = r6.mInFlightRequests
            com.android.volley.toolbox.ImageLoader$BatchedImageRequest r3 = new com.android.volley.toolbox.ImageLoader$BatchedImageRequest
            r3.<init>(r0, r2)
            r1.put(r15, r3)
            return r2
    }

    public boolean isCached(java.lang.String r2, int r3, int r4) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            boolean r2 = r1.isCached(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.MainThread
    public boolean isCached(java.lang.String r1, int r2, int r3, android.widget.ImageView.ScaleType r4) {
            r0 = this;
            com.android.volley.toolbox.Threads.throwIfNotOnMainThread()
            java.lang.String r1 = getCacheKey(r1, r2, r3, r4)
            com.android.volley.toolbox.ImageLoader$ImageCache r2 = r0.mCache
            android.graphics.Bitmap r1 = r2.getBitmap(r1)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final void onGetImageError(java.lang.String r2, com.android.volley.VolleyError r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r1.mInFlightRequests
            java.lang.Object r0 = r0.remove(r2)
            com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
            if (r0 == 0) goto L10
            r0.setError(r3)
            r1.batchResponse(r2, r0)
        L10:
            return
    }

    public final void onGetImageSuccess(java.lang.String r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.android.volley.toolbox.ImageLoader$ImageCache r0 = r1.mCache
            r0.putBitmap(r2, r3)
            java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader$BatchedImageRequest> r0 = r1.mInFlightRequests
            java.lang.Object r0 = r0.remove(r2)
            com.android.volley.toolbox.ImageLoader$BatchedImageRequest r0 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) r0
            if (r0 == 0) goto L15
            com.android.volley.toolbox.ImageLoader.BatchedImageRequest.access$002(r0, r3)
            r1.batchResponse(r2, r0)
        L15:
            return
    }

    public void setBatchedResponseDelay(int r1) {
            r0 = this;
            r0.mBatchResponseDelayMs = r1
            return
    }
}
