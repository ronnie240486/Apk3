package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class VolleyError extends java.lang.Exception {
    public final com.android.volley.NetworkResponse networkResponse;
    private long networkTimeMs;

    public VolleyError() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.networkResponse = r0
            return
    }

    public VolleyError(com.android.volley.NetworkResponse r1) {
            r0 = this;
            r0.<init>()
            r0.networkResponse = r1
            return
    }

    public VolleyError(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.networkResponse = r1
            return
    }

    public VolleyError(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.networkResponse = r1
            return
    }

    public VolleyError(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.networkResponse = r1
            return
    }

    public long getNetworkTimeMs() {
            r2 = this;
            long r0 = r2.networkTimeMs
            return r0
    }

    public final void setNetworkTimeMs(long r1) {
            r0 = this;
            r0.networkTimeMs = r1
            return
    }
}
