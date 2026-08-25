package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes2.dex */
public class VolleySingleton {
    private static android.content.Context mCtx;
    private static com.flextv.livestore.remote.VolleySingleton mInstance;
    private com.android.volley.RequestQueue mRequestQueue;

    private VolleySingleton(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.flextv.livestore.remote.VolleySingleton.mCtx = r1
            com.android.volley.RequestQueue r1 = r0.getRequestQueue()
            r0.mRequestQueue = r1
            return
    }

    public static synchronized com.flextv.livestore.remote.VolleySingleton getInstance(android.content.Context r2) {
            java.lang.Class<com.flextv.livestore.remote.VolleySingleton> r0 = com.flextv.livestore.remote.VolleySingleton.class
            monitor-enter(r0)
            com.flextv.livestore.remote.VolleySingleton r1 = com.flextv.livestore.remote.VolleySingleton.mInstance     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.flextv.livestore.remote.VolleySingleton r1 = new com.flextv.livestore.remote.VolleySingleton     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.flextv.livestore.remote.VolleySingleton.mInstance = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.flextv.livestore.remote.VolleySingleton r2 = com.flextv.livestore.remote.VolleySingleton.mInstance     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public <T> void addToRequestQueue(com.android.volley.Request<T> r2) {
            r1 = this;
            com.android.volley.RequestQueue r0 = r1.getRequestQueue()
            r0.add(r2)
            return
    }

    public com.android.volley.RequestQueue getRequestQueue() {
            r1 = this;
            com.android.volley.RequestQueue r0 = r1.mRequestQueue
            if (r0 != 0) goto L10
            android.content.Context r0 = com.flextv.livestore.remote.VolleySingleton.mCtx
            android.content.Context r0 = r0.getApplicationContext()
            com.android.volley.RequestQueue r0 = com.android.volley.toolbox.Volley.newRequestQueue(r0)
            r1.mRequestQueue = r0
        L10:
            com.android.volley.RequestQueue r0 = r1.mRequestQueue
            return r0
    }
}
