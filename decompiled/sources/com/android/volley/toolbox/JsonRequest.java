package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonRequest<T> extends com.android.volley.Request<T> {
    private static final java.lang.String PROTOCOL_CONTENT_TYPE = null;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private com.android.volley.Response.Listener<T> mListener;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    private final java.lang.String mRequestBody;

    static {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "utf-8"
            r0[r1] = r2
            java.lang.String r1 = "application/json; charset=%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.android.volley.toolbox.JsonRequest.PROTOCOL_CONTENT_TYPE = r0
            return
    }

    public JsonRequest(int r1, java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, com.android.volley.Response.Listener<T> r4, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r5) {
            r0 = this;
            r0.<init>(r1, r2, r5)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            r0.mListener = r4
            r0.mRequestBody = r3
            return
    }

    @java.lang.Deprecated
    public JsonRequest(java.lang.String r7, java.lang.String r8, com.android.volley.Response.Listener<T> r9, com.android.volley.Response.ErrorListener r10) {
            r6 = this;
            r1 = -1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.android.volley.Request
    public void cancel() {
            r2 = this;
            super.cancel()
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mListener = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.android.volley.Request
    public final void deliverResponse(T r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Response$Listener<T> r1 = r2.mListener     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.onResponse(r3)
        Lb:
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
            r5 = this;
            java.lang.String r0 = "utf-8"
            r1 = 0
            java.lang.String r2 = r5.mRequestBody     // Catch: java.io.UnsupportedEncodingException -> Le
            if (r2 != 0) goto L9
            goto Ld
        L9:
            byte[] r1 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> Le
        Ld:
            return r1
        Le:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r5.mRequestBody
            r2[r3] = r4
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "Unsupported Encoding while trying to get the bytes of %s using %s"
            com.android.volley.VolleyLog.wtf(r0, r2)
            return r1
    }

    @Override // com.android.volley.Request
    public java.lang.String getBodyContentType() {
            r1 = this;
            java.lang.String r0 = com.android.volley.toolbox.JsonRequest.PROTOCOL_CONTENT_TYPE
            return r0
    }

    @Override // com.android.volley.Request
    @java.lang.Deprecated
    public byte[] getPostBody() {
            r1 = this;
            byte[] r0 = r1.getBody()
            return r0
    }

    @Override // com.android.volley.Request
    @java.lang.Deprecated
    public java.lang.String getPostBodyContentType() {
            r1 = this;
            java.lang.String r0 = r1.getBodyContentType()
            return r0
    }
}
