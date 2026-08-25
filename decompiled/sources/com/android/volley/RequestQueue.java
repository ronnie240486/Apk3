package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class RequestQueue {
    private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
    private final com.android.volley.Cache mCache;
    private com.android.volley.CacheDispatcher mCacheDispatcher;
    private final java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> mCacheQueue;
    private final java.util.Set<com.android.volley.Request<?>> mCurrentRequests;
    private final com.android.volley.ResponseDelivery mDelivery;
    private final com.android.volley.NetworkDispatcher[] mDispatchers;
    private final java.util.List<com.android.volley.RequestQueue.RequestEventListener> mEventListeners;
    private final java.util.List<com.android.volley.RequestQueue.RequestFinishedListener> mFinishedListeners;
    private final com.android.volley.Network mNetwork;
    private final java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> mNetworkQueue;
    private final java.util.concurrent.atomic.AtomicInteger mSequenceGenerator;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequestEvent {
        public static final int REQUEST_CACHE_LOOKUP_FINISHED = 2;
        public static final int REQUEST_CACHE_LOOKUP_STARTED = 1;
        public static final int REQUEST_FINISHED = 5;
        public static final int REQUEST_NETWORK_DISPATCH_FINISHED = 4;
        public static final int REQUEST_NETWORK_DISPATCH_STARTED = 3;
        public static final int REQUEST_QUEUED = 0;
    }

    public interface RequestEventListener {
        void onRequestEvent(com.android.volley.Request<?> r1, int r2);
    }

    public interface RequestFilter {
        boolean apply(com.android.volley.Request<?> r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.Deprecated
    public interface RequestFinishedListener<T> {
        void onRequestFinished(com.android.volley.Request<T> r1);
    }

    public RequestQueue(com.android.volley.Cache r2, com.android.volley.Network r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0)
            return
    }

    public RequestQueue(com.android.volley.Cache r4, com.android.volley.Network r5, int r6) {
            r3 = this;
            com.android.volley.ExecutorDelivery r0 = new com.android.volley.ExecutorDelivery
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            r3.<init>(r4, r5, r6, r0)
            return
    }

    public RequestQueue(com.android.volley.Cache r2, com.android.volley.Network r3, int r4, com.android.volley.ResponseDelivery r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.mSequenceGenerator = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mCurrentRequests = r0
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            r1.mCacheQueue = r0
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            r1.mNetworkQueue = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mFinishedListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mEventListeners = r0
            r1.mCache = r2
            r1.mNetwork = r3
            com.android.volley.NetworkDispatcher[] r2 = new com.android.volley.NetworkDispatcher[r4]
            r1.mDispatchers = r2
            r1.mDelivery = r5
            return
    }

    public <T> com.android.volley.Request<T> add(com.android.volley.Request<T> r3) {
            r2 = this;
            r3.setRequestQueue(r2)
            java.util.Set<com.android.volley.Request<?>> r0 = r2.mCurrentRequests
            monitor-enter(r0)
            java.util.Set<com.android.volley.Request<?>> r1 = r2.mCurrentRequests     // Catch: java.lang.Throwable -> L20
            r1.add(r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            int r0 = r2.getSequenceNumber()
            r3.setSequence(r0)
            java.lang.String r0 = "add-to-queue"
            r3.addMarker(r0)
            r0 = 0
            r2.sendRequestEvent(r3, r0)
            r2.beginRequest(r3)
            return r3
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public void addRequestEventListener(com.android.volley.RequestQueue.RequestEventListener r3) {
            r2 = this;
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r0 = r2.mEventListeners
            monitor-enter(r0)
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r1 = r2.mEventListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @java.lang.Deprecated
    public <T> void addRequestFinishedListener(com.android.volley.RequestQueue.RequestFinishedListener<T> r3) {
            r2 = this;
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r0 = r2.mFinishedListeners
            monitor-enter(r0)
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r1 = r2.mFinishedListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public <T> void beginRequest(com.android.volley.Request<T> r2) {
            r1 = this;
            boolean r0 = r2.shouldCache()
            if (r0 != 0) goto La
            r1.sendRequestOverNetwork(r2)
            goto Lf
        La:
            java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> r0 = r1.mCacheQueue
            r0.add(r2)
        Lf:
            return
    }

    public void cancelAll(com.android.volley.RequestQueue.RequestFilter r5) {
            r4 = this;
            java.util.Set<com.android.volley.Request<?>> r0 = r4.mCurrentRequests
            monitor-enter(r0)
            java.util.Set<com.android.volley.Request<?>> r1 = r4.mCurrentRequests     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            com.android.volley.Request r2 = (com.android.volley.Request) r2     // Catch: java.lang.Throwable -> L21
            boolean r3 = r5.apply(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L9
            r2.cancel()     // Catch: java.lang.Throwable -> L21
            goto L9
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    public void cancelAll(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            com.android.volley.RequestQueue$1 r0 = new com.android.volley.RequestQueue$1
            r0.<init>(r2)
            r1.cancelAll(r0)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot cancelAll with a null tag"
            r2.<init>(r0)
            throw r2
    }

    public final <T> void finish(com.android.volley.Request<T> r4) {
            r3 = this;
            java.util.Set<com.android.volley.Request<?>> r0 = r3.mCurrentRequests
            monitor-enter(r0)
            java.util.Set<com.android.volley.Request<?>> r1 = r3.mCurrentRequests     // Catch: java.lang.Throwable -> L2b
            r1.remove(r4)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r1 = r3.mFinishedListeners
            monitor-enter(r1)
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r0 = r3.mFinishedListeners     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L28
            com.android.volley.RequestQueue$RequestFinishedListener r2 = (com.android.volley.RequestQueue.RequestFinishedListener) r2     // Catch: java.lang.Throwable -> L28
            r2.onRequestFinished(r4)     // Catch: java.lang.Throwable -> L28
            goto L12
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            r0 = 5
            r3.sendRequestEvent(r4, r0)
            return
        L28:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r4
        L2b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public com.android.volley.Cache getCache() {
            r1 = this;
            com.android.volley.Cache r0 = r1.mCache
            return r0
    }

    public com.android.volley.ResponseDelivery getResponseDelivery() {
            r1 = this;
            com.android.volley.ResponseDelivery r0 = r1.mDelivery
            return r0
    }

    public int getSequenceNumber() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mSequenceGenerator
            int r0 = r0.incrementAndGet()
            return r0
    }

    public void removeRequestEventListener(com.android.volley.RequestQueue.RequestEventListener r3) {
            r2 = this;
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r0 = r2.mEventListeners
            monitor-enter(r0)
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r1 = r2.mEventListeners     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @java.lang.Deprecated
    public <T> void removeRequestFinishedListener(com.android.volley.RequestQueue.RequestFinishedListener<T> r3) {
            r2 = this;
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r0 = r2.mFinishedListeners
            monitor-enter(r0)
            java.util.List<com.android.volley.RequestQueue$RequestFinishedListener> r1 = r2.mFinishedListeners     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void sendRequestEvent(com.android.volley.Request<?> r4, int r5) {
            r3 = this;
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r0 = r3.mEventListeners
            monitor-enter(r0)
            java.util.List<com.android.volley.RequestQueue$RequestEventListener> r1 = r3.mEventListeners     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.android.volley.RequestQueue$RequestEventListener r2 = (com.android.volley.RequestQueue.RequestEventListener) r2     // Catch: java.lang.Throwable -> L1b
            r2.onRequestEvent(r4, r5)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    public <T> void sendRequestOverNetwork(com.android.volley.Request<T> r2) {
            r1 = this;
            java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> r0 = r1.mNetworkQueue
            r0.add(r2)
            return
    }

    public void start() {
            r6 = this;
            r6.stop()
            com.android.volley.CacheDispatcher r0 = new com.android.volley.CacheDispatcher
            java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> r1 = r6.mCacheQueue
            java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> r2 = r6.mNetworkQueue
            com.android.volley.Cache r3 = r6.mCache
            com.android.volley.ResponseDelivery r4 = r6.mDelivery
            r0.<init>(r1, r2, r3, r4)
            r6.mCacheDispatcher = r0
            r0.start()
            r0 = 0
        L16:
            com.android.volley.NetworkDispatcher[] r1 = r6.mDispatchers
            int r1 = r1.length
            if (r0 >= r1) goto L32
            com.android.volley.NetworkDispatcher r1 = new com.android.volley.NetworkDispatcher
            java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> r2 = r6.mNetworkQueue
            com.android.volley.Network r3 = r6.mNetwork
            com.android.volley.Cache r4 = r6.mCache
            com.android.volley.ResponseDelivery r5 = r6.mDelivery
            r1.<init>(r2, r3, r4, r5)
            com.android.volley.NetworkDispatcher[] r2 = r6.mDispatchers
            r2[r0] = r1
            r1.start()
            int r0 = r0 + 1
            goto L16
        L32:
            return
    }

    public void stop() {
            r4 = this;
            com.android.volley.CacheDispatcher r0 = r4.mCacheDispatcher
            if (r0 == 0) goto L7
            r0.quit()
        L7:
            com.android.volley.NetworkDispatcher[] r0 = r4.mDispatchers
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            if (r3 == 0) goto L14
            r3.quit()
        L14:
            int r2 = r2 + 1
            goto Lb
        L17:
            return
    }
}
