package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkTask<Params, Progress, Result> extends android.os.AsyncTask<Params, Progress, Result> {
    private org.apache.http.client.ClientProtocolException clientProtocolException;
    private com.flextv.livestore.net.NetworkTask.OnClientProtocolExceptionListener clientProtocolExceptionListener;
    private com.flextv.livestore.net.NetworkTask.OnCompleteListener<Result> completeListener;
    private java.lang.Exception exception;
    private com.flextv.livestore.net.NetworkTask.OnExceptionListener exceptionListener;
    private com.flextv.livestore.net.NetworkTask.OnExceptionListener genericExceptionListener;
    private java.io.IOException ioException;
    private com.flextv.livestore.net.NetworkTask.OnIOExceptionListener ioExceptionListener;
    private boolean isAborted;
    private boolean isComplete;
    private org.json.JSONException jsonException;
    private com.flextv.livestore.net.NetworkTask.OnJSONExceptionListener jsonExceptionListener;
    private com.flextv.livestore.net.NetworkTask.OnNetworkUnavailableListener networkUnavailableListener;
    private com.flextv.livestore.net.NetworkTask.OnProgressListener progressListener;

    /* JADX INFO: loaded from: classes.dex */
    public interface OnClientProtocolExceptionListener {
        void onClientProtocolException(org.apache.http.client.ClientProtocolException r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnCompleteListener<Result> {
        void onComplete(Result r1);
    }

    public interface OnExceptionListener {
        void onException(java.lang.Exception r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnIOExceptionListener {
        void onIOException(java.io.IOException r1);
    }

    public interface OnJSONExceptionListener {
        void onJSONException(org.json.JSONException r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnNetworkUnavailableListener {
        void onNetworkException(android.accounts.NetworkErrorException r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnProgressListener {
        void onProgressListener(java.lang.String r1);
    }

    public NetworkTask() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isComplete = r0
            r1.isAborted = r0
            return
    }

    public void abort() {
            r1 = this;
            r0 = 1
            r1.isAborted = r0
            r1.cancel(r0)
            return
    }

    @Override // android.os.AsyncTask
    public final Result doInBackground(Params... r2) {
            r1 = this;
            boolean r2 = r1.isCancelled()
            r0 = 0
            if (r2 == 0) goto L8
            return r0
        L8:
            java.lang.Object r2 = r1.doNetworkAction()     // Catch: java.lang.Exception -> Ld java.io.IOException -> L11 org.json.JSONException -> L15 org.apache.http.client.ClientProtocolException -> L19
            return r2
        Ld:
            r2 = move-exception
            r1.exception = r2
            return r0
        L11:
            r2 = move-exception
            r1.ioException = r2
            return r0
        L15:
            r2 = move-exception
            r1.jsonException = r2
            return r0
        L19:
            r2 = move-exception
            r1.clientProtocolException = r2
            return r0
    }

    public abstract Result doNetworkAction() throws java.io.IOException, org.json.JSONException;

    public void execute() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r2
            r3.execute(r0)
            return
    }

    public boolean isAborted() {
            r1 = this;
            boolean r0 = r1.isAborted
            return r0
    }

    public boolean isComplete() {
            r1 = this;
            boolean r0 = r1.isComplete
            return r0
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Result r2) {
            r1 = this;
            super.onPostExecute(r2)
            r0 = 1
            r1.isComplete = r0
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto L70
            boolean r0 = r1.isAborted()
            if (r0 == 0) goto L13
            goto L70
        L13:
            org.apache.http.client.ClientProtocolException r0 = r1.clientProtocolException
            if (r0 == 0) goto L28
            com.flextv.livestore.net.NetworkTask$OnClientProtocolExceptionListener r2 = r1.clientProtocolExceptionListener
            if (r2 == 0) goto L1e
            r2.onClientProtocolException(r0)
        L1e:
            com.flextv.livestore.net.NetworkTask$OnExceptionListener r2 = r1.genericExceptionListener
            if (r2 == 0) goto L70
            org.apache.http.client.ClientProtocolException r0 = r1.clientProtocolException
            r2.onException(r0)
            goto L70
        L28:
            org.json.JSONException r0 = r1.jsonException
            if (r0 == 0) goto L3f
            com.flextv.livestore.net.NetworkTask$OnIOExceptionListener r2 = r1.ioExceptionListener
            if (r2 == 0) goto L35
            java.io.IOException r0 = r1.ioException
            r2.onIOException(r0)
        L35:
            com.flextv.livestore.net.NetworkTask$OnExceptionListener r2 = r1.genericExceptionListener
            if (r2 == 0) goto L70
            java.io.IOException r0 = r1.ioException
            r2.onException(r0)
            goto L70
        L3f:
            java.io.IOException r0 = r1.ioException
            if (r0 == 0) goto L54
            com.flextv.livestore.net.NetworkTask$OnIOExceptionListener r2 = r1.ioExceptionListener
            if (r2 == 0) goto L4a
            r2.onIOException(r0)
        L4a:
            com.flextv.livestore.net.NetworkTask$OnExceptionListener r2 = r1.genericExceptionListener
            if (r2 == 0) goto L70
            java.io.IOException r0 = r1.ioException
            r2.onException(r0)
            goto L70
        L54:
            java.lang.Exception r0 = r1.exception
            if (r0 == 0) goto L69
            com.flextv.livestore.net.NetworkTask$OnExceptionListener r2 = r1.exceptionListener
            if (r2 == 0) goto L5f
            r2.onException(r0)
        L5f:
            com.flextv.livestore.net.NetworkTask$OnExceptionListener r2 = r1.genericExceptionListener
            if (r2 == 0) goto L70
            java.lang.Exception r0 = r1.exception
            r2.onException(r0)
            goto L70
        L69:
            com.flextv.livestore.net.NetworkTask$OnCompleteListener<Result> r0 = r1.completeListener
            if (r0 == 0) goto L70
            r0.onComplete(r2)
        L70:
            return
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
            r3 = this;
            super.onPreExecute()
            r0 = 0
            r3.isComplete = r0
            r3.isAborted = r0
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            boolean r0 = com.flextv.livestore.net.NetworkUtil.hasInternetAccess(r0)
            if (r0 != 0) goto L23
            com.flextv.livestore.net.NetworkTask$OnNetworkUnavailableListener r0 = r3.networkUnavailableListener
            if (r0 == 0) goto L20
            android.accounts.NetworkErrorException r1 = new android.accounts.NetworkErrorException
            java.lang.String r2 = "Not aviable connection"
            r1.<init>(r2)
            r0.onNetworkException(r1)
        L20:
            r3.abort()
        L23:
            return
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Progress... r3) {
            r2 = this;
            super.onProgressUpdate(r3)
            com.flextv.livestore.net.NetworkTask$OnProgressListener r0 = r2.progressListener
            if (r0 == 0) goto Lf
            r1 = 0
            r3 = r3[r1]
            java.lang.String r3 = (java.lang.String) r3
            r0.onProgressListener(r3)
        Lf:
            return
    }

    public void setOnClientProtocolExceptionListener(com.flextv.livestore.net.NetworkTask.OnClientProtocolExceptionListener r1) {
            r0 = this;
            r0.clientProtocolExceptionListener = r1
            return
    }

    public void setOnCompleteListener(com.flextv.livestore.net.NetworkTask.OnCompleteListener<Result> r1) {
            r0 = this;
            r0.completeListener = r1
            return
    }

    public void setOnExceptionListener(com.flextv.livestore.net.NetworkTask.OnExceptionListener r1) {
            r0 = this;
            r0.exceptionListener = r1
            return
    }

    public void setOnGenericExceptionListener(com.flextv.livestore.net.NetworkTask.OnExceptionListener r1) {
            r0 = this;
            r0.genericExceptionListener = r1
            return
    }

    public void setOnIOExceptionListener(com.flextv.livestore.net.NetworkTask.OnIOExceptionListener r1) {
            r0 = this;
            r0.ioExceptionListener = r1
            return
    }

    public void setOnJSONExceptionListener(com.flextv.livestore.net.NetworkTask.OnJSONExceptionListener r1) {
            r0 = this;
            r0.jsonExceptionListener = r1
            return
    }

    public void setOnNetworkUnavailableListener(com.flextv.livestore.net.NetworkTask.OnNetworkUnavailableListener r1) {
            r0 = this;
            r0.networkUnavailableListener = r1
            return
    }

    public void setProgressListener(com.flextv.livestore.net.NetworkTask.OnProgressListener r1) {
            r0 = this;
            r0.progressListener = r1
            return
    }
}
