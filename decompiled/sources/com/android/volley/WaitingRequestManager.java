package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
class WaitingRequestManager implements com.android.volley.Request.NetworkRequestCompleteListener {

    @androidx.annotation.Nullable
    private final com.android.volley.CacheDispatcher mCacheDispatcher;

    @androidx.annotation.Nullable
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> mNetworkQueue;

    @androidx.annotation.Nullable
    private final com.android.volley.RequestQueue mRequestQueue;
    private final com.android.volley.ResponseDelivery mResponseDelivery;
    private final java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> mWaitingRequests;

    public WaitingRequestManager(@androidx.annotation.NonNull com.android.volley.CacheDispatcher r2, @androidx.annotation.NonNull java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r3, com.android.volley.ResponseDelivery r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mWaitingRequests = r0
            r0 = 0
            r1.mRequestQueue = r0
            r1.mResponseDelivery = r4
            r1.mCacheDispatcher = r2
            r1.mNetworkQueue = r3
            return
    }

    public WaitingRequestManager(@androidx.annotation.NonNull com.android.volley.RequestQueue r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mWaitingRequests = r0
            r1.mRequestQueue = r2
            com.android.volley.ResponseDelivery r2 = r2.getResponseDelivery()
            r1.mResponseDelivery = r2
            r2 = 0
            r1.mCacheDispatcher = r2
            r1.mNetworkQueue = r2
            return
    }

    public final synchronized boolean maybeAddToWaitingRequests(com.android.volley.Request<?> r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.getCacheKey()     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.mWaitingRequests     // Catch: java.lang.Throwable -> L53
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L53
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3b
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.mWaitingRequests     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L53
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
        L1e:
            java.lang.String r4 = "waiting-for-response"
            r6.addMarker(r4)     // Catch: java.lang.Throwable -> L53
            r1.add(r6)     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r6 = r5.mWaitingRequests     // Catch: java.lang.Throwable -> L53
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L53
            boolean r6 = com.android.volley.VolleyLog.DEBUG     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L39
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L53
            r1[r3] = r0     // Catch: java.lang.Throwable -> L53
            com.android.volley.VolleyLog.d(r6, r1)     // Catch: java.lang.Throwable -> L53
        L39:
            monitor-exit(r5)
            return r2
        L3b:
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.mWaitingRequests     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L53
            r6.setNetworkRequestCompleteListener(r5)     // Catch: java.lang.Throwable -> L53
            boolean r6 = com.android.volley.VolleyLog.DEBUG     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L51
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L53
            r1[r3] = r0     // Catch: java.lang.Throwable -> L53
            com.android.volley.VolleyLog.d(r6, r1)     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r5)
            return r3
        L53:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public synchronized void onNoUsableResponseReceived(com.android.volley.Request<?> r7) {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r7 = r7.getCacheKey()     // Catch: java.lang.Throwable -> L6d
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r0 = r6.mWaitingRequests     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.remove(r7)     // Catch: java.lang.Throwable -> L6d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6b
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L6b
            boolean r1 = com.android.volley.VolleyLog.DEBUG     // Catch: java.lang.Throwable -> L6d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            java.lang.String r1 = "%d waiting requests for cacheKey=%s; resend to network"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6d
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6d
            r4[r3] = r5     // Catch: java.lang.Throwable -> L6d
            r4[r2] = r7     // Catch: java.lang.Throwable -> L6d
            com.android.volley.VolleyLog.v(r1, r4)     // Catch: java.lang.Throwable -> L6d
        L2f:
            java.lang.Object r1 = r0.remove(r3)     // Catch: java.lang.Throwable -> L6d
            com.android.volley.Request r1 = (com.android.volley.Request) r1     // Catch: java.lang.Throwable -> L6d
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r4 = r6.mWaitingRequests     // Catch: java.lang.Throwable -> L6d
            r4.put(r7, r0)     // Catch: java.lang.Throwable -> L6d
            r1.setNetworkRequestCompleteListener(r6)     // Catch: java.lang.Throwable -> L6d
            com.android.volley.RequestQueue r7 = r6.mRequestQueue     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L45
            r7.sendRequestOverNetwork(r1)     // Catch: java.lang.Throwable -> L6d
            goto L6b
        L45:
            com.android.volley.CacheDispatcher r7 = r6.mCacheDispatcher     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L6b
            java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> r7 = r6.mNetworkQueue     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L6b
            r7.put(r1)     // Catch: java.lang.InterruptedException -> L51 java.lang.Throwable -> L6d
            goto L6b
        L51:
            r7 = move-exception
            java.lang.String r0 = "Couldn't add request to queue. %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6d
            r1[r3] = r7     // Catch: java.lang.Throwable -> L6d
            com.android.volley.VolleyLog.e(r0, r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6d
            r7.interrupt()     // Catch: java.lang.Throwable -> L6d
            com.android.volley.CacheDispatcher r7 = r6.mCacheDispatcher     // Catch: java.lang.Throwable -> L6d
            r7.quit()     // Catch: java.lang.Throwable -> L6d
        L6b:
            monitor-exit(r6)
            return
        L6d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public void onResponseReceived(com.android.volley.Request<?> r6, com.android.volley.Response<?> r7) {
            r5 = this;
            com.android.volley.Cache$Entry r0 = r7.cacheEntry
            if (r0 == 0) goto L4f
            boolean r0 = r0.isExpired()
            if (r0 == 0) goto Lb
            goto L4f
        Lb:
            java.lang.String r6 = r6.getCacheKey()
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r0 = r5.mWaitingRequests     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L4c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4b
            boolean r1 = com.android.volley.VolleyLog.DEBUG
            if (r1 == 0) goto L35
            java.lang.String r1 = "Releasing %d waiting requests for cacheKey=%s."
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r0.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 1
            r2[r3] = r6
            com.android.volley.VolleyLog.v(r1, r2)
        L35:
            java.util.Iterator r6 = r0.iterator()
        L39:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r6.next()
            com.android.volley.Request r0 = (com.android.volley.Request) r0
            com.android.volley.ResponseDelivery r1 = r5.mResponseDelivery
            r1.postResponse(r0, r7)
            goto L39
        L4b:
            return
        L4c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r6
        L4f:
            r5.onNoUsableResponseReceived(r6)
            return
    }
}
