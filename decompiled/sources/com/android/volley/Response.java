package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class Response<T> {

    @androidx.annotation.Nullable
    public final com.android.volley.Cache.Entry cacheEntry;

    @androidx.annotation.Nullable
    public final com.android.volley.VolleyError error;
    public boolean intermediate;

    @androidx.annotation.Nullable
    public final T result;

    public interface ErrorListener {
        void onErrorResponse(com.android.volley.VolleyError r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Listener<T> {
        void onResponse(T r1);
    }

    private Response(com.android.volley.VolleyError r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.intermediate = r0
            r0 = 0
            r1.result = r0
            r1.cacheEntry = r0
            r1.error = r2
            return
    }

    private Response(@androidx.annotation.Nullable T r2, @androidx.annotation.Nullable com.android.volley.Cache.Entry r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.intermediate = r0
            r1.result = r2
            r1.cacheEntry = r3
            r2 = 0
            r1.error = r2
            return
    }

    public static <T> com.android.volley.Response<T> error(com.android.volley.VolleyError r1) {
            com.android.volley.Response r0 = new com.android.volley.Response
            r0.<init>(r1)
            return r0
    }

    public static <T> com.android.volley.Response<T> success(@androidx.annotation.Nullable T r1, @androidx.annotation.Nullable com.android.volley.Cache.Entry r2) {
            com.android.volley.Response r0 = new com.android.volley.Response
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            com.android.volley.VolleyError r0 = r1.error
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
