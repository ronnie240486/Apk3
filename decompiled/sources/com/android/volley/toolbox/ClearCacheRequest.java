package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class ClearCacheRequest extends com.android.volley.Request<java.lang.Object> {
    private final com.android.volley.Cache mCache;
    private final java.lang.Runnable mCallback;

    public ClearCacheRequest(com.android.volley.Cache r3, java.lang.Runnable r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1, r1)
            r2.mCache = r3
            r2.mCallback = r4
            return
    }

    @Override // com.android.volley.Request
    public final void deliverResponse(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // com.android.volley.Request
    public com.android.volley.Request.Priority getPriority() {
            r1 = this;
            com.android.volley.Request$Priority r0 = com.android.volley.Request.Priority.IMMEDIATE
            return r0
    }

    @Override // com.android.volley.Request
    public boolean isCanceled() {
            r2 = this;
            com.android.volley.Cache r0 = r2.mCache
            r0.clear()
            java.lang.Runnable r0 = r2.mCallback
            if (r0 == 0) goto L17
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            java.lang.Runnable r1 = r2.mCallback
            r0.postAtFrontOfQueue(r1)
        L17:
            r0 = 1
            return r0
    }

    @Override // com.android.volley.Request
    public final com.android.volley.Response<java.lang.Object> parseNetworkResponse(com.android.volley.NetworkResponse r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
