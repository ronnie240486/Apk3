package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncHttpStack extends com.android.volley.toolbox.BaseHttpStack {
    private java.util.concurrent.ExecutorService mBlockingExecutor;
    private java.util.concurrent.ExecutorService mNonBlockingExecutor;


    /* JADX INFO: loaded from: classes2.dex */
    public interface OnRequestComplete {
        void onAuthError(com.android.volley.AuthFailureError r1);

        void onError(java.io.IOException r1);

        void onSuccess(com.android.volley.toolbox.HttpResponse r1);
    }

    public static class Response {
        public com.android.volley.AuthFailureError authFailureError;
        public com.android.volley.toolbox.HttpResponse httpResponse;
        public java.io.IOException ioException;

        private Response(@androidx.annotation.Nullable com.android.volley.toolbox.HttpResponse r1, @androidx.annotation.Nullable java.io.IOException r2, @androidx.annotation.Nullable com.android.volley.AuthFailureError r3) {
                r0 = this;
                r0.<init>()
                r0.httpResponse = r1
                r0.ioException = r2
                r0.authFailureError = r3
                return
        }

        public /* synthetic */ Response(com.android.volley.toolbox.HttpResponse r1, java.io.IOException r2, com.android.volley.AuthFailureError r3, com.android.volley.toolbox.AsyncHttpStack.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    public AsyncHttpStack() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public final com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> r4, java.util.Map<java.lang.String, java.lang.String> r5) throws java.io.IOException, com.android.volley.AuthFailureError {
            r3 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.android.volley.toolbox.AsyncHttpStack$1 r2 = new com.android.volley.toolbox.AsyncHttpStack$1
            r2.<init>(r1, r0)
            r3.executeRequest(r4, r5, r2)
            r0.await()     // Catch: java.lang.InterruptedException -> L29
            java.lang.Object r4 = r1.get()
            com.android.volley.toolbox.AsyncHttpStack$Response r4 = (com.android.volley.toolbox.AsyncHttpStack.Response) r4
            com.android.volley.toolbox.HttpResponse r5 = r4.httpResponse
            if (r5 == 0) goto L21
            return r5
        L21:
            java.io.IOException r5 = r4.ioException
            if (r5 == 0) goto L26
            throw r5
        L26:
            com.android.volley.AuthFailureError r4 = r4.authFailureError
            throw r4
        L29:
            r4 = move-exception
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "while waiting for CountDownLatch"
            com.android.volley.VolleyLog.e(r4, r0, r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            java.io.InterruptedIOException r5 = new java.io.InterruptedIOException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public abstract void executeRequest(com.android.volley.Request<?> r1, java.util.Map<java.lang.String, java.lang.String> r2, com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete r3);

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setBlockingExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.mBlockingExecutor = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.mNonBlockingExecutor = r1
            return
    }
}
