package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class Volley {
    private static final java.lang.String DEFAULT_CACHE_DIR = "volley";


    public Volley() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context r1) {
            r0 = 0
            com.android.volley.RequestQueue r1 = newRequestQueue(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static com.android.volley.RequestQueue newRequestQueue(android.content.Context r2, com.android.volley.Network r3) {
            android.content.Context r2 = r2.getApplicationContext()
            com.android.volley.toolbox.Volley$1 r0 = new com.android.volley.toolbox.Volley$1
            r0.<init>(r2)
            com.android.volley.RequestQueue r2 = new com.android.volley.RequestQueue
            com.android.volley.toolbox.DiskBasedCache r1 = new com.android.volley.toolbox.DiskBasedCache
            r1.<init>(r0)
            r2.<init>(r1, r3)
            r2.start()
            return r2
    }

    @androidx.annotation.NonNull
    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context r1, com.android.volley.toolbox.BaseHttpStack r2) {
            if (r2 != 0) goto Ld
            com.android.volley.toolbox.BasicNetwork r2 = new com.android.volley.toolbox.BasicNetwork
            com.android.volley.toolbox.HurlStack r0 = new com.android.volley.toolbox.HurlStack
            r0.<init>()
            r2.<init>(r0)
            goto L13
        Ld:
            com.android.volley.toolbox.BasicNetwork r0 = new com.android.volley.toolbox.BasicNetwork
            r0.<init>(r2)
            r2 = r0
        L13:
            com.android.volley.RequestQueue r1 = newRequestQueue(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context r1, com.android.volley.toolbox.HttpStack r2) {
            if (r2 != 0) goto L8
            r2 = 0
            com.android.volley.RequestQueue r1 = newRequestQueue(r1, r2)
            return r1
        L8:
            com.android.volley.toolbox.BasicNetwork r0 = new com.android.volley.toolbox.BasicNetwork
            r0.<init>(r2)
            com.android.volley.RequestQueue r1 = newRequestQueue(r1, r0)
            return r1
    }
}
