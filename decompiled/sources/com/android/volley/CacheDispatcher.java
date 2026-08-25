package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class CacheDispatcher extends java.lang.Thread {
    private static final boolean DEBUG = false;
    private final com.android.volley.Cache mCache;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> mCacheQueue;
    private final com.android.volley.ResponseDelivery mDelivery;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> mNetworkQueue;
    private volatile boolean mQuit;
    private final com.android.volley.WaitingRequestManager mWaitingRequestManager;


    static {
            boolean r0 = com.android.volley.VolleyLog.DEBUG
            com.android.volley.CacheDispatcher.DEBUG = r0
            return
    }

    public CacheDispatcher(java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r2, java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r3, com.android.volley.Cache r4, com.android.volley.ResponseDelivery r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mQuit = r0
            r1.mCacheQueue = r2
            r1.mNetworkQueue = r3
            r1.mCache = r4
            r1.mDelivery = r5
            com.android.volley.WaitingRequestManager r2 = new com.android.volley.WaitingRequestManager
            r2.<init>(r1, r3, r5)
            r1.mWaitingRequestManager = r2
            return
    }

    public static /* synthetic */ java.util.concurrent.BlockingQueue access$000(com.android.volley.CacheDispatcher r0) {
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r0 = r0.mNetworkQueue
            return r0
    }

    private void processRequest() throws java.lang.InterruptedException {
            r9 = this;
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r0 = r9.mCacheQueue
            java.lang.Object r0 = r0.take()
            com.android.volley.Request r0 = (com.android.volley.Request) r0
            java.lang.String r1 = "cache-queue-take"
            r0.addMarker(r1)
            r1 = 1
            r0.sendEvent(r1)
            r2 = 2
            boolean r3 = r0.isCanceled()     // Catch: java.lang.Throwable -> Ld2
            if (r3 == 0) goto L22
            java.lang.String r1 = "cache-discard-canceled"
            r0.finish(r1)     // Catch: java.lang.Throwable -> Ld2
        L1d:
            r0.sendEvent(r2)
            goto Ld1
        L22:
            com.android.volley.Cache r3 = r9.mCache     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r4 = r0.getCacheKey()     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.Cache$Entry r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Ld2
            if (r3 != 0) goto L41
            java.lang.String r1 = "cache-miss"
            r0.addMarker(r1)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.WaitingRequestManager r1 = r9.mWaitingRequestManager     // Catch: java.lang.Throwable -> Ld2
            boolean r1 = r1.maybeAddToWaitingRequests(r0)     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r1 = r9.mNetworkQueue     // Catch: java.lang.Throwable -> Ld2
            r1.put(r0)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        L41:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld2
            boolean r6 = r3.isExpired(r4)     // Catch: java.lang.Throwable -> Ld2
            if (r6 == 0) goto L61
            java.lang.String r1 = "cache-hit-expired"
            r0.addMarker(r1)     // Catch: java.lang.Throwable -> Ld2
            r0.setCacheEntry(r3)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.WaitingRequestManager r1 = r9.mWaitingRequestManager     // Catch: java.lang.Throwable -> Ld2
            boolean r1 = r1.maybeAddToWaitingRequests(r0)     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r1 = r9.mNetworkQueue     // Catch: java.lang.Throwable -> Ld2
            r1.put(r0)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        L61:
            java.lang.String r6 = "cache-hit"
            r0.addMarker(r6)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.NetworkResponse r6 = new com.android.volley.NetworkResponse     // Catch: java.lang.Throwable -> Ld2
            byte[] r7 = r3.data     // Catch: java.lang.Throwable -> Ld2
            java.util.Map<java.lang.String, java.lang.String> r8 = r3.responseHeaders     // Catch: java.lang.Throwable -> Ld2
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.Response r6 = r0.parseNetworkResponse(r6)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r7 = "cache-hit-parsed"
            r0.addMarker(r7)     // Catch: java.lang.Throwable -> Ld2
            boolean r7 = r6.isSuccess()     // Catch: java.lang.Throwable -> Ld2
            if (r7 != 0) goto L9f
            java.lang.String r3 = "cache-parsing-failed"
            r0.addMarker(r3)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.Cache r3 = r9.mCache     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r4 = r0.getCacheKey()     // Catch: java.lang.Throwable -> Ld2
            r3.invalidate(r4, r1)     // Catch: java.lang.Throwable -> Ld2
            r1 = 0
            r0.setCacheEntry(r1)     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.WaitingRequestManager r1 = r9.mWaitingRequestManager     // Catch: java.lang.Throwable -> Ld2
            boolean r1 = r1.maybeAddToWaitingRequests(r0)     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r1 = r9.mNetworkQueue     // Catch: java.lang.Throwable -> Ld2
            r1.put(r0)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        L9f:
            boolean r4 = r3.refreshNeeded(r4)     // Catch: java.lang.Throwable -> Ld2
            if (r4 != 0) goto Lac
            com.android.volley.ResponseDelivery r1 = r9.mDelivery     // Catch: java.lang.Throwable -> Ld2
            r1.postResponse(r0, r6)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        Lac:
            java.lang.String r4 = "cache-hit-refresh-needed"
            r0.addMarker(r4)     // Catch: java.lang.Throwable -> Ld2
            r0.setCacheEntry(r3)     // Catch: java.lang.Throwable -> Ld2
            r6.intermediate = r1     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.WaitingRequestManager r1 = r9.mWaitingRequestManager     // Catch: java.lang.Throwable -> Ld2
            boolean r1 = r1.maybeAddToWaitingRequests(r0)     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto Lca
            com.android.volley.ResponseDelivery r1 = r9.mDelivery     // Catch: java.lang.Throwable -> Ld2
            com.android.volley.CacheDispatcher$1 r3 = new com.android.volley.CacheDispatcher$1     // Catch: java.lang.Throwable -> Ld2
            r3.<init>(r9, r0)     // Catch: java.lang.Throwable -> Ld2
            r1.postResponse(r0, r6, r3)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        Lca:
            com.android.volley.ResponseDelivery r1 = r9.mDelivery     // Catch: java.lang.Throwable -> Ld2
            r1.postResponse(r0, r6)     // Catch: java.lang.Throwable -> Ld2
            goto L1d
        Ld1:
            return
        Ld2:
            r1 = move-exception
            r0.sendEvent(r2)
            throw r1
    }

    public void quit() {
            r1 = this;
            r0 = 1
            r1.mQuit = r0
            r1.interrupt()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            boolean r0 = com.android.volley.CacheDispatcher.DEBUG
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "start new dispatcher"
            com.android.volley.VolleyLog.v(r2, r0)
        Ld:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.android.volley.Cache r0 = r3.mCache
            r0.initialize()
        L17:
            r3.processRequest()     // Catch: java.lang.InterruptedException -> L1b
            goto L17
        L1b:
            boolean r0 = r3.mQuit
            if (r0 == 0) goto L27
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L27:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"
            com.android.volley.VolleyLog.e(r2, r0)
            goto L17
    }
}
