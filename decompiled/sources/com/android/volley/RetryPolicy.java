package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public interface RetryPolicy {
    int getCurrentRetryCount();

    int getCurrentTimeout();

    void retry(com.android.volley.VolleyError r1) throws com.android.volley.VolleyError;
}
