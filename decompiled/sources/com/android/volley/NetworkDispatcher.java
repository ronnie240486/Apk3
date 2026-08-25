package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkDispatcher extends java.lang.Thread {
    private final com.android.volley.Cache mCache;
    private final com.android.volley.ResponseDelivery mDelivery;
    private final com.android.volley.Network mNetwork;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> mQueue;
    private volatile boolean mQuit;

    public NetworkDispatcher(java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r2, com.android.volley.Network r3, com.android.volley.Cache r4, com.android.volley.ResponseDelivery r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mQuit = r0
            r1.mQueue = r2
            r1.mNetwork = r3
            r1.mCache = r4
            r1.mDelivery = r5
            return
    }

    @android.annotation.TargetApi(14)
    private void addTrafficStatsTag(com.android.volley.Request<?> r1) {
            r0 = this;
            int r1 = r1.getTrafficStatsTag()
            android.net.TrafficStats.setThreadStatsTag(r1)
            return
    }

    private void parseAndDeliverNetworkError(com.android.volley.Request<?> r2, com.android.volley.VolleyError r3) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.android.volley.ResponseDelivery r0 = r1.mDelivery
            r0.postError(r2, r3)
            return
    }

    private void processRequest() throws java.lang.InterruptedException {
            r9 = this;
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r0 = r9.mQueue
            java.lang.Object r0 = r0.take()
            com.android.volley.Request r0 = (com.android.volley.Request) r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 3
            r0.sendEvent(r3)
            r3 = 4
            java.lang.String r4 = "network-queue-take"
            r0.addMarker(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            boolean r4 = r0.isCanceled()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            if (r4 == 0) goto L26
            java.lang.String r4 = "network-discard-cancelled"
            r0.finish(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            r0.notifyListenerResponseNotUsable()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            goto Lad
        L26:
            r9.addTrafficStatsTag(r0)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            com.android.volley.Network r4 = r9.mNetwork     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            com.android.volley.NetworkResponse r4 = r4.performRequest(r0)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            java.lang.String r5 = "network-http-complete"
            r0.addMarker(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            boolean r5 = r4.notModified     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            if (r5 == 0) goto L47
            boolean r5 = r0.hasHadResponseDelivered()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            if (r5 == 0) goto L47
            java.lang.String r4 = "not-modified"
            r0.finish(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            r0.notifyListenerResponseNotUsable()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            goto Lad
        L47:
            com.android.volley.Response r4 = r0.parseNetworkResponse(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            java.lang.String r5 = "network-parse-complete"
            r0.addMarker(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            boolean r5 = r0.shouldCache()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            if (r5 == 0) goto L6a
            com.android.volley.Cache$Entry r5 = r4.cacheEntry     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            if (r5 == 0) goto L6a
            com.android.volley.Cache r5 = r9.mCache     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            java.lang.String r6 = r0.getCacheKey()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            com.android.volley.Cache$Entry r7 = r4.cacheEntry     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            java.lang.String r5 = "network-cache-written"
            r0.addMarker(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
        L6a:
            r0.markDelivered()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            com.android.volley.ResponseDelivery r5 = r9.mDelivery     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            r5.postResponse(r0, r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            r0.notifyListenerResponseReceived(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78 com.android.volley.VolleyError -> L9e
            goto Lad
        L76:
            r1 = move-exception
            goto Lb1
        L78:
            r4 = move-exception
            java.lang.String r5 = "Unhandled exception %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L76
            r7 = 0
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L76
            r6[r7] = r8     // Catch: java.lang.Throwable -> L76
            com.android.volley.VolleyLog.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L76
            com.android.volley.VolleyError r5 = new com.android.volley.VolleyError     // Catch: java.lang.Throwable -> L76
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L76
            long r6 = r6 - r1
            r5.setNetworkTimeMs(r6)     // Catch: java.lang.Throwable -> L76
            com.android.volley.ResponseDelivery r1 = r9.mDelivery     // Catch: java.lang.Throwable -> L76
            r1.postError(r0, r5)     // Catch: java.lang.Throwable -> L76
            r0.notifyListenerResponseNotUsable()     // Catch: java.lang.Throwable -> L76
            goto Lad
        L9e:
            r4 = move-exception
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L76
            long r5 = r5 - r1
            r4.setNetworkTimeMs(r5)     // Catch: java.lang.Throwable -> L76
            r9.parseAndDeliverNetworkError(r0, r4)     // Catch: java.lang.Throwable -> L76
            r0.notifyListenerResponseNotUsable()     // Catch: java.lang.Throwable -> L76
        Lad:
            r0.sendEvent(r3)
            return
        Lb1:
            r0.sendEvent(r3)
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
            r2 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            r2.processRequest()     // Catch: java.lang.InterruptedException -> L9
            goto L5
        L9:
            boolean r0 = r2.mQuit
            if (r0 == 0) goto L15
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L15:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"
            com.android.volley.VolleyLog.e(r1, r0)
            goto L5
    }
}
