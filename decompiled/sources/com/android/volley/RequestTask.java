package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestTask<T> implements java.lang.Runnable {
    public final com.android.volley.Request<T> mRequest;

    public RequestTask(com.android.volley.Request<T> r1) {
            r0 = this;
            r0.<init>()
            r0.mRequest = r1
            return
    }

    public int compareTo(com.android.volley.RequestTask<?> r2) {
            r1 = this;
            com.android.volley.Request<T> r0 = r1.mRequest
            com.android.volley.Request<T> r2 = r2.mRequest
            int r2 = r0.compareTo(r2)
            return r2
    }
}
