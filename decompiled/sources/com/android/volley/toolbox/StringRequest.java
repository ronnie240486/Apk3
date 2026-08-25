package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
public class StringRequest extends com.android.volley.Request<java.lang.String> {

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private com.android.volley.Response.Listener<java.lang.String> mListener;
    private final java.lang.Object mLock;

    public StringRequest(int r1, java.lang.String r2, com.android.volley.Response.Listener<java.lang.String> r3, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            r0.mListener = r3
            return
    }

    public StringRequest(java.lang.String r2, com.android.volley.Response.Listener<java.lang.String> r3, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r4)
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
    public final void deliverResponse(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Response$Listener<java.lang.String> r1 = r2.mListener     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.onResponse(r3)
        Ld:
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // com.android.volley.Request
    public final com.android.volley.Response<java.lang.String> parseNetworkResponse(com.android.volley.NetworkResponse r4) {
            r3 = this;
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Le
            byte[] r1 = r4.data     // Catch: java.io.UnsupportedEncodingException -> Le
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.headers     // Catch: java.io.UnsupportedEncodingException -> Le
            java.lang.String r2 = com.android.volley.toolbox.HttpHeaderParser.parseCharset(r2)     // Catch: java.io.UnsupportedEncodingException -> Le
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Le
            goto L15
        Le:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.data
            r0.<init>(r1)
        L15:
            com.android.volley.Cache$Entry r4 = com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(r4)
            com.android.volley.Response r4 = com.android.volley.Response.success(r0, r4)
            return r4
    }
}
