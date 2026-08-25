package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
public class RequestFuture<T> implements java.util.concurrent.Future<T>, com.android.volley.Response.Listener<T>, com.android.volley.Response.ErrorListener {
    private com.android.volley.VolleyError mException;
    private com.android.volley.Request<?> mRequest;
    private T mResult;
    private boolean mResultReceived;

    private RequestFuture() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mResultReceived = r0
            return
    }

    private synchronized T doGet(java.lang.Long r6) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r5 = this;
            monitor-enter(r5)
            com.android.volley.VolleyError r0 = r5.mException     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L5a
            boolean r0 = r5.mResultReceived     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto Ld
            T r6 = r5.mResult     // Catch: java.lang.Throwable -> L62
            monitor-exit(r5)
            return r6
        Ld:
            r0 = 0
            if (r6 != 0) goto L1b
        L11:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L40
            r5.wait(r0)     // Catch: java.lang.Throwable -> L62
            goto L11
        L1b:
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L62
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L40
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L62
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L62
            long r2 = r2 + r0
        L2c:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L40
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L40
            long r0 = r2 - r0
            r5.wait(r0)     // Catch: java.lang.Throwable -> L62
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L62
            goto L2c
        L40:
            com.android.volley.VolleyError r6 = r5.mException     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L52
            boolean r6 = r5.mResultReceived     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L4c
            T r6 = r5.mResult     // Catch: java.lang.Throwable -> L62
            monitor-exit(r5)
            return r6
        L4c:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L62
            r6.<init>()     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L52:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L62
            com.android.volley.VolleyError r0 = r5.mException     // Catch: java.lang.Throwable -> L62
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L5a:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L62
            com.android.volley.VolleyError r0 = r5.mException     // Catch: java.lang.Throwable -> L62
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L62:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public static <E> com.android.volley.toolbox.RequestFuture<E> newFuture() {
            com.android.volley.toolbox.RequestFuture r0 = new com.android.volley.toolbox.RequestFuture
            r0.<init>()
            return r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            com.android.volley.Request<?> r2 = r1.mRequest     // Catch: java.lang.Throwable -> L18
            r0 = 0
            if (r2 != 0) goto L8
            monitor-exit(r1)
            return r0
        L8:
            boolean r2 = r1.isDone()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L16
            com.android.volley.Request<?> r2 = r1.mRequest     // Catch: java.lang.Throwable -> L18
            r2.cancel()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            monitor-exit(r1)
            return r2
        L16:
            monitor-exit(r1)
            return r0
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.doGet(r0)     // Catch: java.util.concurrent.TimeoutException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public T get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.convert(r2, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r1.doGet(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            com.android.volley.Request<?> r0 = r1.mRequest
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mResultReceived     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            com.android.volley.VolleyError r0 = r1.mException     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            boolean r0 = r1.isCancelled()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.android.volley.Response.ErrorListener
    public synchronized void onErrorResponse(com.android.volley.VolleyError r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mException = r1     // Catch: java.lang.Throwable -> L8
            r0.notifyAll()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.android.volley.Response.Listener
    public synchronized void onResponse(T r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.mResultReceived = r0     // Catch: java.lang.Throwable -> Lb
            r1.mResult = r2     // Catch: java.lang.Throwable -> Lb
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public void setRequest(com.android.volley.Request<?> r1) {
            r0 = this;
            r0.mRequest = r1
            return
    }
}
