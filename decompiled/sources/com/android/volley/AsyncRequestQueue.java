package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncRequestQueue extends com.android.volley.RequestQueue {
    private static final int DEFAULT_BLOCKING_THREAD_POOL_SIZE = 4;

    @androidx.annotation.Nullable
    private final com.android.volley.AsyncCache mAsyncCache;
    private java.util.concurrent.ExecutorService mBlockingExecutor;
    private final java.lang.Object mCacheInitializationLock;
    private com.android.volley.AsyncRequestQueue.ExecutorFactory mExecutorFactory;
    private volatile boolean mIsCacheInitialized;
    private final com.android.volley.AsyncNetwork mNetwork;
    private java.util.concurrent.ExecutorService mNonBlockingExecutor;
    private java.util.concurrent.ScheduledExecutorService mNonBlockingScheduledExecutor;
    private final java.util.List<com.android.volley.Request<?>> mRequestsAwaitingCacheInitialization;
    private final com.android.volley.WaitingRequestManager mWaitingRequestManager;




    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder {

        @androidx.annotation.Nullable
        private com.android.volley.AsyncCache mAsyncCache;

        @androidx.annotation.Nullable
        private com.android.volley.Cache mCache;

        @androidx.annotation.Nullable
        private com.android.volley.AsyncRequestQueue.ExecutorFactory mExecutorFactory;
        private final com.android.volley.AsyncNetwork mNetwork;

        @androidx.annotation.Nullable
        private com.android.volley.ResponseDelivery mResponseDelivery;


        public Builder(com.android.volley.AsyncNetwork r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mAsyncCache = r0
                r1.mCache = r0
                r1.mExecutorFactory = r0
                r1.mResponseDelivery = r0
                if (r2 == 0) goto L11
                r1.mNetwork = r2
                return
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Network cannot be null"
                r2.<init>(r0)
                throw r2
        }

        private com.android.volley.AsyncRequestQueue.ExecutorFactory getDefaultExecutorFactory() {
                r1 = this;
                com.android.volley.AsyncRequestQueue$Builder$1 r0 = new com.android.volley.AsyncRequestQueue$Builder$1
                r0.<init>()
                return r0
        }

        public com.android.volley.AsyncRequestQueue build() {
                r8 = this;
                com.android.volley.Cache r0 = r8.mCache
                if (r0 != 0) goto L11
                com.android.volley.AsyncCache r1 = r8.mAsyncCache
                if (r1 == 0) goto L9
                goto L11
            L9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "You must set one of the cache objects"
                r0.<init>(r1)
                throw r0
            L11:
                if (r0 != 0) goto L1b
                com.android.volley.AsyncRequestQueue$ThrowingCache r0 = new com.android.volley.AsyncRequestQueue$ThrowingCache
                r1 = 0
                r0.<init>(r1)
                r8.mCache = r0
            L1b:
                com.android.volley.ResponseDelivery r0 = r8.mResponseDelivery
                if (r0 != 0) goto L2f
                com.android.volley.ExecutorDelivery r0 = new com.android.volley.ExecutorDelivery
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.<init>(r1)
                r8.mResponseDelivery = r0
            L2f:
                com.android.volley.AsyncRequestQueue$ExecutorFactory r0 = r8.mExecutorFactory
                if (r0 != 0) goto L39
                com.android.volley.AsyncRequestQueue$ExecutorFactory r0 = r8.getDefaultExecutorFactory()
                r8.mExecutorFactory = r0
            L39:
                com.android.volley.AsyncRequestQueue r0 = new com.android.volley.AsyncRequestQueue
                com.android.volley.Cache r2 = r8.mCache
                com.android.volley.AsyncNetwork r3 = r8.mNetwork
                com.android.volley.AsyncCache r4 = r8.mAsyncCache
                com.android.volley.ResponseDelivery r5 = r8.mResponseDelivery
                com.android.volley.AsyncRequestQueue$ExecutorFactory r6 = r8.mExecutorFactory
                r7 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public com.android.volley.AsyncRequestQueue.Builder setAsyncCache(com.android.volley.AsyncCache r1) {
                r0 = this;
                r0.mAsyncCache = r1
                return r0
        }

        public com.android.volley.AsyncRequestQueue.Builder setCache(com.android.volley.Cache r1) {
                r0 = this;
                r0.mCache = r1
                return r0
        }

        public com.android.volley.AsyncRequestQueue.Builder setExecutorFactory(com.android.volley.AsyncRequestQueue.ExecutorFactory r1) {
                r0 = this;
                r0.mExecutorFactory = r1
                return r0
        }

        public com.android.volley.AsyncRequestQueue.Builder setResponseDelivery(com.android.volley.ResponseDelivery r1) {
                r0 = this;
                r0.mResponseDelivery = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class CacheParseTask<T> extends com.android.volley.RequestTask<T> {
        public com.android.volley.Cache.Entry entry;
        public long startTimeMillis;
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;


        public CacheParseTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2, com.android.volley.Cache.Entry r3, long r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.entry = r3
                r0.startTimeMillis = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                com.android.volley.Request<T> r0 = r9.mRequest
                java.lang.String r1 = "cache-hit"
                r0.addMarker(r1)
                com.android.volley.Request<T> r0 = r9.mRequest
                com.android.volley.NetworkResponse r8 = new com.android.volley.NetworkResponse
                com.android.volley.Cache$Entry r1 = r9.entry
                byte[] r3 = r1.data
                java.util.List<com.android.volley.Header> r7 = r1.allResponseHeaders
                r2 = 200(0xc8, float:2.8E-43)
                r4 = 0
                r5 = 0
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r7)
                com.android.volley.Response r0 = r0.parseNetworkResponse(r8)
                com.android.volley.Request<T> r1 = r9.mRequest
                java.lang.String r2 = "cache-hit-parsed"
                r1.addMarker(r2)
                com.android.volley.Cache$Entry r1 = r9.entry
                long r2 = r9.startTimeMillis
                boolean r1 = r1.refreshNeeded(r2)
                if (r1 != 0) goto L3b
                com.android.volley.AsyncRequestQueue r1 = r9.this$0
                com.android.volley.ResponseDelivery r1 = r1.getResponseDelivery()
                com.android.volley.Request<T> r2 = r9.mRequest
                r1.postResponse(r2, r0)
                goto L76
            L3b:
                com.android.volley.Request<T> r1 = r9.mRequest
                java.lang.String r2 = "cache-hit-refresh-needed"
                r1.addMarker(r2)
                com.android.volley.Request<T> r1 = r9.mRequest
                com.android.volley.Cache$Entry r2 = r9.entry
                r1.setCacheEntry(r2)
                r1 = 1
                r0.intermediate = r1
                com.android.volley.AsyncRequestQueue r1 = r9.this$0
                com.android.volley.WaitingRequestManager r1 = com.android.volley.AsyncRequestQueue.access$400(r1)
                com.android.volley.Request<T> r2 = r9.mRequest
                boolean r1 = r1.maybeAddToWaitingRequests(r2)
                if (r1 != 0) goto L6b
                com.android.volley.AsyncRequestQueue r1 = r9.this$0
                com.android.volley.ResponseDelivery r1 = r1.getResponseDelivery()
                com.android.volley.Request<T> r2 = r9.mRequest
                com.android.volley.AsyncRequestQueue$CacheParseTask$1 r3 = new com.android.volley.AsyncRequestQueue$CacheParseTask$1
                r3.<init>(r9)
                r1.postResponse(r2, r0, r3)
                goto L76
            L6b:
                com.android.volley.AsyncRequestQueue r1 = r9.this$0
                com.android.volley.ResponseDelivery r1 = r1.getResponseDelivery()
                com.android.volley.Request<T> r2 = r9.mRequest
                r1.postResponse(r2, r0)
            L76:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class CachePutTask<T> extends com.android.volley.RequestTask<T> {
        public com.android.volley.Response<?> response;
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;


        public CachePutTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2, com.android.volley.Response<?> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.response = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.android.volley.AsyncRequestQueue r0 = r4.this$0
                com.android.volley.AsyncCache r0 = com.android.volley.AsyncRequestQueue.access$100(r0)
                if (r0 == 0) goto L21
                com.android.volley.AsyncRequestQueue r0 = r4.this$0
                com.android.volley.AsyncCache r0 = com.android.volley.AsyncRequestQueue.access$100(r0)
                com.android.volley.Request<T> r1 = r4.mRequest
                java.lang.String r1 = r1.getCacheKey()
                com.android.volley.Response<?> r2 = r4.response
                com.android.volley.Cache$Entry r2 = r2.cacheEntry
                com.android.volley.AsyncRequestQueue$CachePutTask$1 r3 = new com.android.volley.AsyncRequestQueue$CachePutTask$1
                r3.<init>(r4)
                r0.put(r1, r2, r3)
                goto L3e
            L21:
                com.android.volley.AsyncRequestQueue r0 = r4.this$0
                com.android.volley.Cache r0 = r0.getCache()
                com.android.volley.Request<T> r1 = r4.mRequest
                java.lang.String r1 = r1.getCacheKey()
                com.android.volley.Response<?> r2 = r4.response
                com.android.volley.Cache$Entry r2 = r2.cacheEntry
                r0.put(r1, r2)
                com.android.volley.AsyncRequestQueue r0 = r4.this$0
                com.android.volley.Request<T> r1 = r4.mRequest
                com.android.volley.Response<?> r2 = r4.response
                r3 = 1
                com.android.volley.AsyncRequestQueue.access$700(r0, r1, r2, r3)
            L3e:
                return
        }
    }

    public class CacheTask<T> extends com.android.volley.RequestTask<T> {
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;


        public CacheTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.android.volley.Request<T> r0 = r3.mRequest
                boolean r0 = r0.isCanceled()
                if (r0 == 0) goto L10
                com.android.volley.Request<T> r0 = r3.mRequest
                java.lang.String r1 = "cache-discard-canceled"
                r0.finish(r1)
                return
            L10:
                com.android.volley.Request<T> r0 = r3.mRequest
                java.lang.String r1 = "cache-queue-take"
                r0.addMarker(r1)
                com.android.volley.AsyncRequestQueue r0 = r3.this$0
                com.android.volley.AsyncCache r0 = com.android.volley.AsyncRequestQueue.access$100(r0)
                if (r0 == 0) goto L34
                com.android.volley.AsyncRequestQueue r0 = r3.this$0
                com.android.volley.AsyncCache r0 = com.android.volley.AsyncRequestQueue.access$100(r0)
                com.android.volley.Request<T> r1 = r3.mRequest
                java.lang.String r1 = r1.getCacheKey()
                com.android.volley.AsyncRequestQueue$CacheTask$1 r2 = new com.android.volley.AsyncRequestQueue$CacheTask$1
                r2.<init>(r3)
                r0.get(r1, r2)
                goto L4b
            L34:
                com.android.volley.AsyncRequestQueue r0 = r3.this$0
                com.android.volley.Cache r0 = r0.getCache()
                com.android.volley.Request<T> r1 = r3.mRequest
                java.lang.String r1 = r1.getCacheKey()
                com.android.volley.Cache$Entry r0 = r0.get(r1)
                com.android.volley.AsyncRequestQueue r1 = r3.this$0
                com.android.volley.Request<T> r2 = r3.mRequest
                com.android.volley.AsyncRequestQueue.access$300(r1, r0, r2)
            L4b:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class ExecutorFactory {
        public ExecutorFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.util.concurrent.ExecutorService createBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> r1);

        public abstract java.util.concurrent.ExecutorService createNonBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> r1);

        public abstract java.util.concurrent.ScheduledExecutorService createNonBlockingScheduledExecutor();
    }

    public class NetworkParseTask<T> extends com.android.volley.RequestTask<T> {
        public com.android.volley.NetworkResponse networkResponse;
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;

        public NetworkParseTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2, com.android.volley.NetworkResponse r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.networkResponse = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.android.volley.Request<T> r0 = r5.mRequest
                com.android.volley.NetworkResponse r1 = r5.networkResponse
                com.android.volley.Response r0 = r0.parseNetworkResponse(r1)
                com.android.volley.Request<T> r1 = r5.mRequest
                java.lang.String r2 = "network-parse-complete"
                r1.addMarker(r2)
                com.android.volley.Request<T> r1 = r5.mRequest
                boolean r1 = r1.shouldCache()
                if (r1 == 0) goto L49
                com.android.volley.Cache$Entry r1 = r0.cacheEntry
                if (r1 == 0) goto L49
                com.android.volley.AsyncRequestQueue r1 = r5.this$0
                com.android.volley.AsyncCache r1 = com.android.volley.AsyncRequestQueue.access$100(r1)
                if (r1 == 0) goto L36
                com.android.volley.AsyncRequestQueue r1 = r5.this$0
                java.util.concurrent.ExecutorService r1 = com.android.volley.AsyncRequestQueue.access$200(r1)
                com.android.volley.AsyncRequestQueue$CachePutTask r2 = new com.android.volley.AsyncRequestQueue$CachePutTask
                com.android.volley.AsyncRequestQueue r3 = r5.this$0
                com.android.volley.Request<T> r4 = r5.mRequest
                r2.<init>(r3, r4, r0)
                r1.execute(r2)
                goto L51
            L36:
                com.android.volley.AsyncRequestQueue r1 = r5.this$0
                java.util.concurrent.ExecutorService r1 = com.android.volley.AsyncRequestQueue.access$500(r1)
                com.android.volley.AsyncRequestQueue$CachePutTask r2 = new com.android.volley.AsyncRequestQueue$CachePutTask
                com.android.volley.AsyncRequestQueue r3 = r5.this$0
                com.android.volley.Request<T> r4 = r5.mRequest
                r2.<init>(r3, r4, r0)
                r1.execute(r2)
                goto L51
            L49:
                com.android.volley.AsyncRequestQueue r1 = r5.this$0
                com.android.volley.Request<T> r2 = r5.mRequest
                r3 = 0
                com.android.volley.AsyncRequestQueue.access$700(r1, r2, r0, r3)
            L51:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class NetworkTask<T> extends com.android.volley.RequestTask<T> {
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;


        public NetworkTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.android.volley.Request<T> r0 = r5.mRequest
                boolean r0 = r0.isCanceled()
                if (r0 == 0) goto L15
                com.android.volley.Request<T> r0 = r5.mRequest
                java.lang.String r1 = "network-discard-cancelled"
                r0.finish(r1)
                com.android.volley.Request<T> r0 = r5.mRequest
                r0.notifyListenerResponseNotUsable()
                return
            L15:
                long r0 = android.os.SystemClock.elapsedRealtime()
                com.android.volley.Request<T> r2 = r5.mRequest
                java.lang.String r3 = "network-queue-take"
                r2.addMarker(r3)
                com.android.volley.AsyncRequestQueue r2 = r5.this$0
                com.android.volley.AsyncNetwork r2 = com.android.volley.AsyncRequestQueue.access$600(r2)
                com.android.volley.Request<T> r3 = r5.mRequest
                com.android.volley.AsyncRequestQueue$NetworkTask$1 r4 = new com.android.volley.AsyncRequestQueue$NetworkTask$1
                r4.<init>(r5, r0)
                r2.performRequest(r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ParseErrorTask<T> extends com.android.volley.RequestTask<T> {
        public final /* synthetic */ com.android.volley.AsyncRequestQueue this$0;
        public com.android.volley.VolleyError volleyError;

        public ParseErrorTask(com.android.volley.AsyncRequestQueue r1, com.android.volley.Request<T> r2, com.android.volley.VolleyError r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.volleyError = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.android.volley.Request<T> r0 = r3.mRequest
                com.android.volley.VolleyError r1 = r3.volleyError
                java.util.Objects.requireNonNull(r0)
                com.android.volley.AsyncRequestQueue r0 = r3.this$0
                com.android.volley.ResponseDelivery r0 = r0.getResponseDelivery()
                com.android.volley.Request<T> r2 = r3.mRequest
                r0.postError(r2, r1)
                com.android.volley.Request<T> r0 = r3.mRequest
                r0.notifyListenerResponseNotUsable()
                return
        }
    }

    public static class ThrowingCache implements com.android.volley.Cache {
        private ThrowingCache() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ThrowingCache(com.android.volley.AsyncRequestQueue.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.android.volley.Cache
        public void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.android.volley.Cache
        public com.android.volley.Cache.Entry get(java.lang.String r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.android.volley.Cache
        public void initialize() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.android.volley.Cache
        public void invalidate(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.android.volley.Cache
        public void put(java.lang.String r1, com.android.volley.Cache.Entry r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.android.volley.Cache
        public void remove(java.lang.String r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    private AsyncRequestQueue(com.android.volley.Cache r2, com.android.volley.AsyncNetwork r3, @androidx.annotation.Nullable com.android.volley.AsyncCache r4, com.android.volley.ResponseDelivery r5, com.android.volley.AsyncRequestQueue.ExecutorFactory r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r5)
            com.android.volley.WaitingRequestManager r2 = new com.android.volley.WaitingRequestManager
            r2.<init>(r1)
            r1.mWaitingRequestManager = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mRequestsAwaitingCacheInitialization = r2
            r1.mIsCacheInitialized = r0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1.mCacheInitializationLock = r2
            r1.mAsyncCache = r4
            r1.mNetwork = r3
            r1.mExecutorFactory = r6
            return
    }

    public /* synthetic */ AsyncRequestQueue(com.android.volley.Cache r1, com.android.volley.AsyncNetwork r2, com.android.volley.AsyncCache r3, com.android.volley.ResponseDelivery r4, com.android.volley.AsyncRequestQueue.ExecutorFactory r5, com.android.volley.AsyncRequestQueue.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void access$000(com.android.volley.AsyncRequestQueue r0) {
            r0.onCacheInitializationComplete()
            return
    }

    public static /* synthetic */ com.android.volley.AsyncCache access$100(com.android.volley.AsyncRequestQueue r0) {
            com.android.volley.AsyncCache r0 = r0.mAsyncCache
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ExecutorService access$200(com.android.volley.AsyncRequestQueue r0) {
            java.util.concurrent.ExecutorService r0 = r0.mNonBlockingExecutor
            return r0
    }

    public static /* synthetic */ void access$300(com.android.volley.AsyncRequestQueue r0, com.android.volley.Cache.Entry r1, com.android.volley.Request r2) {
            r0.handleEntry(r1, r2)
            return
    }

    public static /* synthetic */ com.android.volley.WaitingRequestManager access$400(com.android.volley.AsyncRequestQueue r0) {
            com.android.volley.WaitingRequestManager r0 = r0.mWaitingRequestManager
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ExecutorService access$500(com.android.volley.AsyncRequestQueue r0) {
            java.util.concurrent.ExecutorService r0 = r0.mBlockingExecutor
            return r0
    }

    public static /* synthetic */ com.android.volley.AsyncNetwork access$600(com.android.volley.AsyncRequestQueue r0) {
            com.android.volley.AsyncNetwork r0 = r0.mNetwork
            return r0
    }

    public static /* synthetic */ void access$700(com.android.volley.AsyncRequestQueue r0, com.android.volley.Request r1, com.android.volley.Response r2, boolean r3) {
            r0.finishRequest(r1, r2, r3)
            return
    }

    private void finishRequest(com.android.volley.Request<?> r1, com.android.volley.Response<?> r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L7
            java.lang.String r3 = "network-cache-written"
            r1.addMarker(r3)
        L7:
            r1.markDelivered()
            com.android.volley.ResponseDelivery r3 = r0.getResponseDelivery()
            r3.postResponse(r1, r2)
            r1.notifyListenerResponseReceived(r2)
            return
    }

    private static java.util.concurrent.PriorityBlockingQueue<java.lang.Runnable> getBlockingQueue() {
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            com.android.volley.AsyncRequestQueue$3 r1 = new com.android.volley.AsyncRequestQueue$3
            r1.<init>()
            r2 = 11
            r0.<init>(r2, r1)
            return r0
    }

    private void handleEntry(com.android.volley.Cache.Entry r9, com.android.volley.Request<?> r10) {
            r8 = this;
            if (r9 != 0) goto L13
            java.lang.String r9 = "cache-miss"
            r10.addMarker(r9)
            com.android.volley.WaitingRequestManager r9 = r8.mWaitingRequestManager
            boolean r9 = r9.maybeAddToWaitingRequests(r10)
            if (r9 != 0) goto L12
            r8.sendRequestOverNetwork(r10)
        L12:
            return
        L13:
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r9.isExpired(r4)
            if (r0 == 0) goto L31
            java.lang.String r0 = "cache-hit-expired"
            r10.addMarker(r0)
            r10.setCacheEntry(r9)
            com.android.volley.WaitingRequestManager r9 = r8.mWaitingRequestManager
            boolean r9 = r9.maybeAddToWaitingRequests(r10)
            if (r9 != 0) goto L30
            r8.sendRequestOverNetwork(r10)
        L30:
            return
        L31:
            java.util.concurrent.ExecutorService r6 = r8.mBlockingExecutor
            com.android.volley.AsyncRequestQueue$CacheParseTask r7 = new com.android.volley.AsyncRequestQueue$CacheParseTask
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            r6.execute(r7)
            return
    }

    private void onCacheInitializationComplete() {
            r3 = this;
            java.lang.Object r0 = r3.mCacheInitializationLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            java.util.List<com.android.volley.Request<?>> r2 = r3.mRequestsAwaitingCacheInitialization     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.List<com.android.volley.Request<?>> r2 = r3.mRequestsAwaitingCacheInitialization     // Catch: java.lang.Throwable -> L28
            r2.clear()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            r3.mIsCacheInitialized = r2     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r1.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            com.android.volley.Request r1 = (com.android.volley.Request) r1
            r3.beginRequest(r1)
            goto L17
        L27:
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    @Override // com.android.volley.RequestQueue
    public final <T> void beginRequest(com.android.volley.Request<T> r3) {
            r2 = this;
            boolean r0 = r2.mIsCacheInitialized
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.mCacheInitializationLock
            monitor-enter(r0)
            boolean r1 = r2.mIsCacheInitialized     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            java.util.List<com.android.volley.Request<?>> r1 = r2.mRequestsAwaitingCacheInitialization     // Catch: java.lang.Throwable -> L14
            r1.add(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        L17:
            boolean r0 = r3.shouldCache()
            if (r0 == 0) goto L37
            com.android.volley.AsyncCache r0 = r2.mAsyncCache
            if (r0 == 0) goto L2c
            java.util.concurrent.ExecutorService r0 = r2.mNonBlockingExecutor
            com.android.volley.AsyncRequestQueue$CacheTask r1 = new com.android.volley.AsyncRequestQueue$CacheTask
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L3a
        L2c:
            java.util.concurrent.ExecutorService r0 = r2.mBlockingExecutor
            com.android.volley.AsyncRequestQueue$CacheTask r1 = new com.android.volley.AsyncRequestQueue$CacheTask
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L3a
        L37:
            r2.sendRequestOverNetwork(r3)
        L3a:
            return
    }

    @Override // com.android.volley.RequestQueue
    public final <T> void sendRequestOverNetwork(com.android.volley.Request<T> r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.mNonBlockingExecutor
            com.android.volley.AsyncRequestQueue$NetworkTask r1 = new com.android.volley.AsyncRequestQueue$NetworkTask
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // com.android.volley.RequestQueue
    public void start() {
            r2 = this;
            r2.stop()
            com.android.volley.AsyncRequestQueue$ExecutorFactory r0 = r2.mExecutorFactory
            java.util.concurrent.PriorityBlockingQueue r1 = getBlockingQueue()
            java.util.concurrent.ExecutorService r0 = r0.createNonBlockingExecutor(r1)
            r2.mNonBlockingExecutor = r0
            com.android.volley.AsyncRequestQueue$ExecutorFactory r0 = r2.mExecutorFactory
            java.util.concurrent.PriorityBlockingQueue r1 = getBlockingQueue()
            java.util.concurrent.ExecutorService r0 = r0.createBlockingExecutor(r1)
            r2.mBlockingExecutor = r0
            com.android.volley.AsyncRequestQueue$ExecutorFactory r0 = r2.mExecutorFactory
            java.util.concurrent.ScheduledExecutorService r0 = r0.createNonBlockingScheduledExecutor()
            r2.mNonBlockingScheduledExecutor = r0
            com.android.volley.AsyncNetwork r0 = r2.mNetwork
            java.util.concurrent.ExecutorService r1 = r2.mBlockingExecutor
            r0.setBlockingExecutor(r1)
            com.android.volley.AsyncNetwork r0 = r2.mNetwork
            java.util.concurrent.ExecutorService r1 = r2.mNonBlockingExecutor
            r0.setNonBlockingExecutor(r1)
            com.android.volley.AsyncNetwork r0 = r2.mNetwork
            java.util.concurrent.ScheduledExecutorService r1 = r2.mNonBlockingScheduledExecutor
            r0.setNonBlockingScheduledExecutor(r1)
            com.android.volley.AsyncCache r0 = r2.mAsyncCache
            if (r0 == 0) goto L47
            java.util.concurrent.ExecutorService r0 = r2.mNonBlockingExecutor
            com.android.volley.AsyncRequestQueue$1 r1 = new com.android.volley.AsyncRequestQueue$1
            r1.<init>(r2)
            r0.execute(r1)
            goto L51
        L47:
            java.util.concurrent.ExecutorService r0 = r2.mBlockingExecutor
            com.android.volley.AsyncRequestQueue$2 r1 = new com.android.volley.AsyncRequestQueue$2
            r1.<init>(r2)
            r0.execute(r1)
        L51:
            return
    }

    @Override // com.android.volley.RequestQueue
    public void stop() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.mNonBlockingExecutor
            r1 = 0
            if (r0 == 0) goto La
            r0.shutdownNow()
            r2.mNonBlockingExecutor = r1
        La:
            java.util.concurrent.ExecutorService r0 = r2.mBlockingExecutor
            if (r0 == 0) goto L13
            r0.shutdownNow()
            r2.mBlockingExecutor = r1
        L13:
            java.util.concurrent.ScheduledExecutorService r0 = r2.mNonBlockingScheduledExecutor
            if (r0 == 0) goto L1c
            r0.shutdownNow()
            r2.mNonBlockingScheduledExecutor = r1
        L1c:
            return
    }
}
