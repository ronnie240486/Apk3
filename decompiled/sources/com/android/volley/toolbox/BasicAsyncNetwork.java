package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class BasicAsyncNetwork extends com.android.volley.AsyncNetwork {
    private final com.android.volley.toolbox.AsyncHttpStack mAsyncStack;
    private final com.android.volley.toolbox.ByteArrayPool mPool;


    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private static final int DEFAULT_POOL_SIZE = 4096;

        @androidx.annotation.NonNull
        private com.android.volley.toolbox.AsyncHttpStack mAsyncStack;
        private com.android.volley.toolbox.ByteArrayPool mPool;

        public Builder(@androidx.annotation.NonNull com.android.volley.toolbox.AsyncHttpStack r1) {
                r0 = this;
                r0.<init>()
                r0.mAsyncStack = r1
                r1 = 0
                r0.mPool = r1
                return
        }

        public com.android.volley.toolbox.BasicAsyncNetwork build() {
                r4 = this;
                com.android.volley.toolbox.ByteArrayPool r0 = r4.mPool
                if (r0 != 0) goto Ld
                com.android.volley.toolbox.ByteArrayPool r0 = new com.android.volley.toolbox.ByteArrayPool
                r1 = 4096(0x1000, float:5.74E-42)
                r0.<init>(r1)
                r4.mPool = r0
            Ld:
                com.android.volley.toolbox.BasicAsyncNetwork r0 = new com.android.volley.toolbox.BasicAsyncNetwork
                com.android.volley.toolbox.AsyncHttpStack r1 = r4.mAsyncStack
                com.android.volley.toolbox.ByteArrayPool r2 = r4.mPool
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.android.volley.toolbox.BasicAsyncNetwork.Builder setPool(com.android.volley.toolbox.ByteArrayPool r1) {
                r0 = this;
                r0.mPool = r1
                return r0
        }
    }

    public class InvokeRetryPolicyTask<T> extends com.android.volley.RequestTask<T> {
        public final com.android.volley.AsyncNetwork.OnRequestComplete callback;
        public final com.android.volley.Request<T> request;
        public final com.android.volley.toolbox.NetworkUtility.RetryInfo retryInfo;
        public final /* synthetic */ com.android.volley.toolbox.BasicAsyncNetwork this$0;

        public InvokeRetryPolicyTask(com.android.volley.toolbox.BasicAsyncNetwork r1, com.android.volley.Request<T> r2, com.android.volley.toolbox.NetworkUtility.RetryInfo r3, com.android.volley.AsyncNetwork.OnRequestComplete r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.request = r2
                r0.retryInfo = r3
                r0.callback = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.android.volley.Request<T> r0 = r3.request     // Catch: com.android.volley.VolleyError -> L11
                com.android.volley.toolbox.NetworkUtility$RetryInfo r1 = r3.retryInfo     // Catch: com.android.volley.VolleyError -> L11
                com.android.volley.toolbox.NetworkUtility.attemptRetryOnException(r0, r1)     // Catch: com.android.volley.VolleyError -> L11
                com.android.volley.toolbox.BasicAsyncNetwork r0 = r3.this$0     // Catch: com.android.volley.VolleyError -> L11
                com.android.volley.Request<T> r1 = r3.request     // Catch: com.android.volley.VolleyError -> L11
                com.android.volley.AsyncNetwork$OnRequestComplete r2 = r3.callback     // Catch: com.android.volley.VolleyError -> L11
                r0.performRequest(r1, r2)     // Catch: com.android.volley.VolleyError -> L11
                goto L17
            L11:
                r0 = move-exception
                com.android.volley.AsyncNetwork$OnRequestComplete r1 = r3.callback
                r1.onError(r0)
            L17:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ResponseParsingTask<T> extends com.android.volley.RequestTask<T> {
        public com.android.volley.AsyncNetwork.OnRequestComplete callback;
        public com.android.volley.toolbox.HttpResponse httpResponse;
        public java.io.InputStream inputStream;
        public com.android.volley.Request<T> request;
        public long requestStartMs;
        public java.util.List<com.android.volley.Header> responseHeaders;
        public int statusCode;
        public final /* synthetic */ com.android.volley.toolbox.BasicAsyncNetwork this$0;

        public ResponseParsingTask(com.android.volley.toolbox.BasicAsyncNetwork r1, java.io.InputStream r2, com.android.volley.toolbox.HttpResponse r3, com.android.volley.Request<T> r4, com.android.volley.AsyncNetwork.OnRequestComplete r5, long r6, java.util.List<com.android.volley.Header> r8, int r9) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r4)
                r0.inputStream = r2
                r0.httpResponse = r3
                r0.request = r4
                r0.callback = r5
                r0.requestStartMs = r6
                r0.responseHeaders = r8
                r0.statusCode = r9
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                java.io.InputStream r0 = r12.inputStream     // Catch: java.io.IOException -> L24
                com.android.volley.toolbox.HttpResponse r1 = r12.httpResponse     // Catch: java.io.IOException -> L24
                int r1 = r1.getContentLength()     // Catch: java.io.IOException -> L24
                com.android.volley.toolbox.BasicAsyncNetwork r2 = r12.this$0     // Catch: java.io.IOException -> L24
                com.android.volley.toolbox.ByteArrayPool r2 = com.android.volley.toolbox.BasicAsyncNetwork.access$200(r2)     // Catch: java.io.IOException -> L24
                byte[] r11 = com.android.volley.toolbox.NetworkUtility.inputStreamToBytes(r0, r1, r2)     // Catch: java.io.IOException -> L24
                com.android.volley.toolbox.BasicAsyncNetwork r3 = r12.this$0
                long r4 = r12.requestStartMs
                int r6 = r12.statusCode
                com.android.volley.toolbox.HttpResponse r7 = r12.httpResponse
                com.android.volley.Request<T> r8 = r12.request
                com.android.volley.AsyncNetwork$OnRequestComplete r9 = r12.callback
                java.util.List<com.android.volley.Header> r10 = r12.responseHeaders
                com.android.volley.toolbox.BasicAsyncNetwork.access$300(r3, r4, r6, r7, r8, r9, r10, r11)
                return
            L24:
                r0 = move-exception
                r4 = r0
                com.android.volley.toolbox.BasicAsyncNetwork r1 = r12.this$0
                com.android.volley.Request<T> r2 = r12.request
                com.android.volley.AsyncNetwork$OnRequestComplete r3 = r12.callback
                long r5 = r12.requestStartMs
                com.android.volley.toolbox.HttpResponse r7 = r12.httpResponse
                com.android.volley.toolbox.BasicAsyncNetwork.access$100(r1, r2, r3, r4, r5, r7)
                return
        }
    }

    private BasicAsyncNetwork(com.android.volley.toolbox.AsyncHttpStack r1, com.android.volley.toolbox.ByteArrayPool r2) {
            r0 = this;
            r0.<init>()
            r0.mAsyncStack = r1
            r0.mPool = r2
            return
    }

    public /* synthetic */ BasicAsyncNetwork(com.android.volley.toolbox.AsyncHttpStack r1, com.android.volley.toolbox.ByteArrayPool r2, com.android.volley.toolbox.BasicAsyncNetwork.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void access$000(com.android.volley.toolbox.BasicAsyncNetwork r0, com.android.volley.Request r1, long r2, com.android.volley.toolbox.HttpResponse r4, com.android.volley.AsyncNetwork.OnRequestComplete r5) {
            r0.onRequestSucceeded(r1, r2, r4, r5)
            return
    }

    public static /* synthetic */ void access$100(com.android.volley.toolbox.BasicAsyncNetwork r8, com.android.volley.Request r9, com.android.volley.AsyncNetwork.OnRequestComplete r10, java.io.IOException r11, long r12, com.android.volley.toolbox.HttpResponse r14) {
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r0.onRequestFailed(r1, r2, r3, r4, r6, r7)
            return
    }

    public static /* synthetic */ com.android.volley.toolbox.ByteArrayPool access$200(com.android.volley.toolbox.BasicAsyncNetwork r0) {
            com.android.volley.toolbox.ByteArrayPool r0 = r0.mPool
            return r0
    }

    public static /* synthetic */ void access$300(com.android.volley.toolbox.BasicAsyncNetwork r0, long r1, int r3, com.android.volley.toolbox.HttpResponse r4, com.android.volley.Request r5, com.android.volley.AsyncNetwork.OnRequestComplete r6, java.util.List r7, byte[] r8) {
            r0.onResponseRead(r1, r3, r4, r5, r6, r7, r8)
            return
    }

    private void onRequestFailed(com.android.volley.Request<?> r7, com.android.volley.AsyncNetwork.OnRequestComplete r8, java.io.IOException r9, long r10, @androidx.annotation.Nullable com.android.volley.toolbox.HttpResponse r12, @androidx.annotation.Nullable byte[] r13) {
            r6 = this;
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            com.android.volley.toolbox.NetworkUtility$RetryInfo r9 = com.android.volley.toolbox.NetworkUtility.shouldRetryException(r0, r1, r2, r4, r5)     // Catch: com.android.volley.VolleyError -> L16
            java.util.concurrent.ExecutorService r10 = r6.getBlockingExecutor()     // Catch: com.android.volley.VolleyError -> L16
            com.android.volley.toolbox.BasicAsyncNetwork$InvokeRetryPolicyTask r11 = new com.android.volley.toolbox.BasicAsyncNetwork$InvokeRetryPolicyTask     // Catch: com.android.volley.VolleyError -> L16
            r11.<init>(r6, r7, r9, r8)     // Catch: com.android.volley.VolleyError -> L16
            r10.execute(r11)     // Catch: com.android.volley.VolleyError -> L16
            goto L1a
        L16:
            r7 = move-exception
            r8.onError(r7)
        L1a:
            return
    }

    private void onRequestSucceeded(com.android.volley.Request<?> r13, long r14, com.android.volley.toolbox.HttpResponse r16, com.android.volley.AsyncNetwork.OnRequestComplete r17) {
            r12 = this;
            int r9 = r16.getStatusCode()
            java.util.List r8 = r16.getHeaders()
            r0 = 304(0x130, float:4.26E-43)
            if (r9 != r0) goto L1c
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r14
            r5 = r13
            com.android.volley.NetworkResponse r0 = com.android.volley.toolbox.NetworkUtility.getNotModifiedNetworkResponse(r13, r0, r8)
            r6 = r17
            r6.onSuccess(r0)
            return
        L1c:
            r5 = r13
            r6 = r17
            byte[] r0 = r16.getContentBytes()
            if (r0 != 0) goto L2e
            java.io.InputStream r1 = r16.getContent()
            if (r1 != 0) goto L2e
            r0 = 0
            byte[] r0 = new byte[r0]
        L2e:
            r10 = r0
            if (r10 == 0) goto L3f
            r0 = r12
            r1 = r14
            r3 = r9
            r4 = r16
            r5 = r13
            r6 = r17
            r7 = r8
            r8 = r10
            r0.onResponseRead(r1, r3, r4, r5, r6, r7, r8)
            return
        L3f:
            java.io.InputStream r2 = r16.getContent()
            java.util.concurrent.ExecutorService r10 = r12.getBlockingExecutor()
            com.android.volley.toolbox.BasicAsyncNetwork$ResponseParsingTask r11 = new com.android.volley.toolbox.BasicAsyncNetwork$ResponseParsingTask
            r0 = r11
            r1 = r12
            r3 = r16
            r4 = r13
            r5 = r17
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.execute(r11)
            return
    }

    private void onResponseRead(long r10, int r12, com.android.volley.toolbox.HttpResponse r13, com.android.volley.Request<?> r14, com.android.volley.AsyncNetwork.OnRequestComplete r15, java.util.List<com.android.volley.Header> r16, byte[] r17) {
            r9 = this;
            r1 = r12
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            r4 = r14
            r7 = r17
            com.android.volley.toolbox.NetworkUtility.logSlowRequests(r2, r14, r7, r12)
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L2b
            r0 = 299(0x12b, float:4.19E-43)
            if (r1 <= r0) goto L15
            goto L2b
        L15:
            com.android.volley.NetworkResponse r8 = new com.android.volley.NetworkResponse
            r3 = 0
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r10
            r0 = r8
            r1 = r12
            r2 = r17
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            r2 = r15
            r15.onSuccess(r8)
            return
        L2b:
            r2 = r15
            java.io.IOException r3 = new java.io.IOException
            r3.<init>()
            r0 = r9
            r1 = r14
            r2 = r15
            r4 = r10
            r6 = r13
            r7 = r17
            r0.onRequestFailed(r1, r2, r3, r4, r6, r7)
            return
    }

    @Override // com.android.volley.AsyncNetwork
    public void performRequest(com.android.volley.Request<?> r10, com.android.volley.AsyncNetwork.OnRequestComplete r11) {
            r9 = this;
            java.util.concurrent.ExecutorService r0 = r9.getBlockingExecutor()
            if (r0 == 0) goto L21
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.android.volley.Cache$Entry r0 = r10.getCacheEntry()
            java.util.Map r0 = com.android.volley.toolbox.HttpHeaderParser.getCacheHeaders(r0)
            com.android.volley.toolbox.AsyncHttpStack r7 = r9.mAsyncStack
            com.android.volley.toolbox.BasicAsyncNetwork$1 r8 = new com.android.volley.toolbox.BasicAsyncNetwork$1
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r6)
            r7.executeRequest(r10, r0, r8)
            return
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "mBlockingExecuter must be set before making a request"
            r10.<init>(r11)
            throw r10
    }

    @Override // com.android.volley.AsyncNetwork
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setBlockingExecutor(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            super.setBlockingExecutor(r2)
            com.android.volley.toolbox.AsyncHttpStack r0 = r1.mAsyncStack
            r0.setBlockingExecutor(r2)
            return
    }

    @Override // com.android.volley.AsyncNetwork
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            super.setNonBlockingExecutor(r2)
            com.android.volley.toolbox.AsyncHttpStack r0 = r1.mAsyncStack
            r0.setNonBlockingExecutor(r2)
            return
    }
}
