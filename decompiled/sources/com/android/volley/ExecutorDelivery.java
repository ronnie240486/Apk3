package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorDelivery implements com.android.volley.ResponseDelivery {
    private final java.util.concurrent.Executor mResponsePoster;


    /* JADX INFO: loaded from: classes2.dex */
    public static class ResponseDeliveryRunnable implements java.lang.Runnable {
        private final com.android.volley.Request mRequest;
        private final com.android.volley.Response mResponse;
        private final java.lang.Runnable mRunnable;

        public ResponseDeliveryRunnable(com.android.volley.Request r1, com.android.volley.Response r2, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>()
                r0.mRequest = r1
                r0.mResponse = r2
                r0.mRunnable = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.android.volley.Request r0 = r2.mRequest
                boolean r0 = r0.isCanceled()
                if (r0 == 0) goto L10
                com.android.volley.Request r0 = r2.mRequest
                java.lang.String r1 = "canceled-at-delivery"
                r0.finish(r1)
                return
            L10:
                com.android.volley.Response r0 = r2.mResponse
                boolean r0 = r0.isSuccess()
                if (r0 == 0) goto L22
                com.android.volley.Request r0 = r2.mRequest
                com.android.volley.Response r1 = r2.mResponse
                T r1 = r1.result
                r0.deliverResponse(r1)
                goto L2b
            L22:
                com.android.volley.Request r0 = r2.mRequest
                com.android.volley.Response r1 = r2.mResponse
                com.android.volley.VolleyError r1 = r1.error
                r0.deliverError(r1)
            L2b:
                com.android.volley.Response r0 = r2.mResponse
                boolean r0 = r0.intermediate
                if (r0 == 0) goto L39
                com.android.volley.Request r0 = r2.mRequest
                java.lang.String r1 = "intermediate-response"
                r0.addMarker(r1)
                goto L40
            L39:
                com.android.volley.Request r0 = r2.mRequest
                java.lang.String r1 = "done"
                r0.finish(r1)
            L40:
                java.lang.Runnable r0 = r2.mRunnable
                if (r0 == 0) goto L47
                r0.run()
            L47:
                return
        }
    }

    public ExecutorDelivery(android.os.Handler r2) {
            r1 = this;
            r1.<init>()
            com.android.volley.ExecutorDelivery$1 r0 = new com.android.volley.ExecutorDelivery$1
            r0.<init>(r2)
            r1.mResponsePoster = r0
            return
    }

    public ExecutorDelivery(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.mResponsePoster = r1
            return
    }

    @Override // com.android.volley.ResponseDelivery
    public void postError(com.android.volley.Request<?> r4, com.android.volley.VolleyError r5) {
            r3 = this;
            java.lang.String r0 = "post-error"
            r4.addMarker(r0)
            com.android.volley.Response r5 = com.android.volley.Response.error(r5)
            java.util.concurrent.Executor r0 = r3.mResponsePoster
            com.android.volley.ExecutorDelivery$ResponseDeliveryRunnable r1 = new com.android.volley.ExecutorDelivery$ResponseDeliveryRunnable
            r2 = 0
            r1.<init>(r4, r5, r2)
            r0.execute(r1)
            return
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(com.android.volley.Request<?> r2, com.android.volley.Response<?> r3) {
            r1 = this;
            r0 = 0
            r1.postResponse(r2, r3, r0)
            return
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(com.android.volley.Request<?> r3, com.android.volley.Response<?> r4, java.lang.Runnable r5) {
            r2 = this;
            r3.markDelivered()
            java.lang.String r0 = "post-response"
            r3.addMarker(r0)
            java.util.concurrent.Executor r0 = r2.mResponsePoster
            com.android.volley.ExecutorDelivery$ResponseDeliveryRunnable r1 = new com.android.volley.ExecutorDelivery$ResponseDeliveryRunnable
            r1.<init>(r3, r4, r5)
            r0.execute(r1)
            return
    }
}
