package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public interface ResponseDelivery {
    void postError(com.android.volley.Request<?> r1, com.android.volley.VolleyError r2);

    void postResponse(com.android.volley.Request<?> r1, com.android.volley.Response<?> r2);

    void postResponse(com.android.volley.Request<?> r1, com.android.volley.Response<?> r2, java.lang.Runnable r3);
}
