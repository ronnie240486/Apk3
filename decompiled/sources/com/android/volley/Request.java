package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public abstract class Request<T> implements java.lang.Comparable<com.android.volley.Request<T>> {
    private static final java.lang.String DEFAULT_PARAMS_ENCODING = "UTF-8";

    @androidx.annotation.Nullable
    private com.android.volley.Cache.Entry mCacheEntry;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private com.android.volley.Response.ErrorListener mErrorListener;
    private final com.android.volley.VolleyLog.MarkerLog mEventLog;
    private final java.lang.Object mLock;
    private final int mMethod;

    @androidx.annotation.GuardedBy("mLock")
    private com.android.volley.Request.NetworkRequestCompleteListener mRequestCompleteListener;
    private com.android.volley.RequestQueue mRequestQueue;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mResponseDelivered;
    private com.android.volley.RetryPolicy mRetryPolicy;
    private java.lang.Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private java.lang.Object mTag;
    private final java.lang.String mUrl;


    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface NetworkRequestCompleteListener {
        void onNoUsableResponseReceived(com.android.volley.Request<?> r1);

        void onResponseReceived(com.android.volley.Request<?> r1, com.android.volley.Response<?> r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum Priority extends java.lang.Enum<com.android.volley.Request.Priority> {
        private static final /* synthetic */ com.android.volley.Request.Priority[] $VALUES = null;
        public static final com.android.volley.Request.Priority HIGH = null;
        public static final com.android.volley.Request.Priority IMMEDIATE = null;
        public static final com.android.volley.Request.Priority LOW = null;
        public static final com.android.volley.Request.Priority NORMAL = null;

        static {
                com.android.volley.Request$Priority r0 = new com.android.volley.Request$Priority
                java.lang.String r1 = "LOW"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.volley.Request.Priority.LOW = r0
                com.android.volley.Request$Priority r1 = new com.android.volley.Request$Priority
                java.lang.String r3 = "NORMAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.android.volley.Request.Priority.NORMAL = r1
                com.android.volley.Request$Priority r3 = new com.android.volley.Request$Priority
                java.lang.String r5 = "HIGH"
                r6 = 2
                r3.<init>(r5, r6)
                com.android.volley.Request.Priority.HIGH = r3
                com.android.volley.Request$Priority r5 = new com.android.volley.Request$Priority
                java.lang.String r7 = "IMMEDIATE"
                r8 = 3
                r5.<init>(r7, r8)
                com.android.volley.Request.Priority.IMMEDIATE = r5
                r7 = 4
                com.android.volley.Request$Priority[] r7 = new com.android.volley.Request.Priority[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.android.volley.Request.Priority.$VALUES = r7
                return
        }

        private Priority(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.volley.Request.Priority valueOf(java.lang.String r1) {
                java.lang.Class<com.android.volley.Request$Priority> r0 = com.android.volley.Request.Priority.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.volley.Request$Priority r1 = (com.android.volley.Request.Priority) r1
                return r1
        }

        public static com.android.volley.Request.Priority[] values() {
                com.android.volley.Request$Priority[] r0 = com.android.volley.Request.Priority.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.volley.Request$Priority[] r0 = (com.android.volley.Request.Priority[]) r0
                return r0
        }
    }

    public Request(int r3, java.lang.String r4, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r5) {
            r2 = this;
            r2.<init>()
            boolean r0 = com.android.volley.VolleyLog.MarkerLog.ENABLED
            r1 = 0
            if (r0 == 0) goto Le
            com.android.volley.VolleyLog$MarkerLog r0 = new com.android.volley.VolleyLog$MarkerLog
            r0.<init>()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2.mEventLog = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 1
            r2.mShouldCache = r0
            r0 = 0
            r2.mCanceled = r0
            r2.mResponseDelivered = r0
            r2.mShouldRetryServerErrors = r0
            r2.mShouldRetryConnectionErrors = r0
            r2.mCacheEntry = r1
            r2.mMethod = r3
            r2.mUrl = r4
            r2.mErrorListener = r5
            com.android.volley.DefaultRetryPolicy r3 = new com.android.volley.DefaultRetryPolicy
            r3.<init>()
            r2.setRetryPolicy(r3)
            int r3 = findDefaultTrafficStatsTag(r4)
            r2.mDefaultTrafficStatsTag = r3
            return
    }

    @java.lang.Deprecated
    public Request(java.lang.String r2, com.android.volley.Response.ErrorListener r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0, r2, r3)
            return
    }

    public static /* synthetic */ com.android.volley.VolleyLog.MarkerLog access$000(com.android.volley.Request r0) {
            com.android.volley.VolleyLog$MarkerLog r0 = r0.mEventLog
            return r0
    }

    private byte[] encodeParameters(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r6 = r6.entrySet()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.UnsupportedEncodingException -> L70
        Ld:
            boolean r1 = r6.hasNext()     // Catch: java.io.UnsupportedEncodingException -> L70
            if (r1 == 0) goto L67
            java.lang.Object r1 = r6.next()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.Object r2 = r1.getKey()     // Catch: java.io.UnsupportedEncodingException -> L70
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.getValue()     // Catch: java.io.UnsupportedEncodingException -> L70
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.getKey()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L70
            r2 = 61
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.Object r1 = r1.getValue()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            r1 = 38
            r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            goto Ld
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r0 = "Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null."
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.UnsupportedEncodingException -> L70
            r3 = 0
            java.lang.Object r4 = r1.getKey()     // Catch: java.io.UnsupportedEncodingException -> L70
            r2[r3] = r4     // Catch: java.io.UnsupportedEncodingException -> L70
            r3 = 1
            java.lang.Object r1 = r1.getValue()     // Catch: java.io.UnsupportedEncodingException -> L70
            r2[r3] = r1     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L70
            r6.<init>(r0)     // Catch: java.io.UnsupportedEncodingException -> L70
            throw r6     // Catch: java.io.UnsupportedEncodingException -> L70
        L67:
            java.lang.String r6 = r0.toString()     // Catch: java.io.UnsupportedEncodingException -> L70
            byte[] r6 = r6.getBytes(r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            return r6
        L70:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Encoding not supported: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7)
            r0.<init>(r7, r6)
            throw r0
    }

    private static int findDefaultTrafficStatsTag(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L17
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.getHost()
            if (r1 == 0) goto L17
            int r1 = r1.hashCode()
            return r1
        L17:
            r1 = 0
            return r1
    }

    public void addMarker(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.android.volley.VolleyLog.MarkerLog.ENABLED
            if (r0 == 0) goto L11
            com.android.volley.VolleyLog$MarkerLog r0 = r3.mEventLog
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r0.add(r4, r1)
        L11:
            return
    }

    @androidx.annotation.CallSuper
    public void cancel() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 1
            r2.mCanceled = r1     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.mErrorListener = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public int compareTo(com.android.volley.Request<T> r3) {
            r2 = this;
            com.android.volley.Request$Priority r0 = r2.getPriority()
            com.android.volley.Request$Priority r1 = r3.getPriority()
            if (r0 != r1) goto L18
            java.lang.Integer r0 = r2.mSequence
            int r0 = r0.intValue()
            java.lang.Integer r3 = r3.mSequence
            int r3 = r3.intValue()
            int r0 = r0 - r3
            goto L22
        L18:
            int r3 = r1.ordinal()
            int r0 = r0.ordinal()
            int r0 = r3 - r0
        L22:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.android.volley.Request r1 = (com.android.volley.Request) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public void deliverError(com.android.volley.VolleyError r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Response$ErrorListener r1 = r2.mErrorListener     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.onErrorResponse(r3)
        Lb:
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public abstract void deliverResponse(T r1);

    public final void finish(java.lang.String r5) {
            r4 = this;
            com.android.volley.RequestQueue r0 = r4.mRequestQueue
            if (r0 == 0) goto L7
            r0.finish(r4)
        L7:
            boolean r0 = com.android.volley.VolleyLog.MarkerLog.ENABLED
            if (r0 == 0) goto L3d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L2f
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.android.volley.Request$1 r3 = new com.android.volley.Request$1
            r3.<init>(r4, r5, r0)
            r2.post(r3)
            return
        L2f:
            com.android.volley.VolleyLog$MarkerLog r2 = r4.mEventLog
            r2.add(r5, r0)
            com.android.volley.VolleyLog$MarkerLog r5 = r4.mEventLog
            java.lang.String r0 = r4.toString()
            r5.finish(r0)
        L3d:
            return
    }

    public byte[] getBody() throws com.android.volley.AuthFailureError {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getBodyContentType() {
            r1 = this;
            java.lang.String r0 = "application/x-www-form-urlencoded; charset=UTF-8"
            return r0
    }

    @androidx.annotation.Nullable
    public com.android.volley.Cache.Entry getCacheEntry() {
            r1 = this;
            com.android.volley.Cache$Entry r0 = r1.mCacheEntry
            return r0
    }

    public java.lang.String getCacheKey() {
            r3 = this;
            java.lang.String r0 = r3.getUrl()
            int r1 = r3.getMethod()
            if (r1 == 0) goto L26
            r2 = -1
            if (r1 != r2) goto Le
            goto L26
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r2.append(r1)
            r1 = 45
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L26:
            return r0
    }

    @androidx.annotation.Nullable
    public com.android.volley.Response.ErrorListener getErrorListener() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Response$ErrorListener r1 = r2.mErrorListener     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    public int getMethod() {
            r1 = this;
            int r0 = r1.mMethod
            return r0
    }

    @java.lang.Deprecated
    public byte[] getPostBody() throws com.android.volley.AuthFailureError {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getPostBodyContentType() {
            r1 = this;
            java.lang.String r0 = r1.getBodyContentType()
            return r0
    }

    public com.android.volley.Request.Priority getPriority() {
            r1 = this;
            com.android.volley.Request$Priority r0 = com.android.volley.Request.Priority.NORMAL
            return r0
    }

    public com.android.volley.RetryPolicy getRetryPolicy() {
            r1 = this;
            com.android.volley.RetryPolicy r0 = r1.mRetryPolicy
            return r0
    }

    public final int getSequence() {
            r2 = this;
            java.lang.Integer r0 = r2.mSequence
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getSequence called before setSequence"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.Object getTag() {
            r1 = this;
            java.lang.Object r0 = r1.mTag
            return r0
    }

    public final int getTimeoutMs() {
            r1 = this;
            com.android.volley.RetryPolicy r0 = r1.getRetryPolicy()
            int r0 = r0.getCurrentTimeout()
            return r0
    }

    public int getTrafficStatsTag() {
            r1 = this;
            int r0 = r1.mDefaultTrafficStatsTag
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.mUrl
            return r0
    }

    public boolean hasHadResponseDelivered() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mResponseDelivered     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public boolean isCanceled() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mCanceled     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void markDelivered() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 1
            r2.mResponseDelivered = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public final void notifyListenerResponseNotUsable() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Request$NetworkRequestCompleteListener r1 = r2.mRequestCompleteListener     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.onNoUsableResponseReceived(r2)
        Lb:
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public final void notifyListenerResponseReceived(com.android.volley.Response<?> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Request$NetworkRequestCompleteListener r1 = r2.mRequestCompleteListener     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.onResponseReceived(r2, r3)
        Lb:
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public abstract com.android.volley.Response<T> parseNetworkResponse(com.android.volley.NetworkResponse r1);

    public final void sendEvent(int r2) {
            r1 = this;
            com.android.volley.RequestQueue r0 = r1.mRequestQueue
            if (r0 == 0) goto L7
            r0.sendRequestEvent(r1, r2)
        L7:
            return
    }

    public com.android.volley.Request<?> setCacheEntry(com.android.volley.Cache.Entry r1) {
            r0 = this;
            r0.mCacheEntry = r1
            return r0
    }

    public final void setNetworkRequestCompleteListener(com.android.volley.Request.NetworkRequestCompleteListener r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mRequestCompleteListener = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public com.android.volley.Request<?> setRequestQueue(com.android.volley.RequestQueue r1) {
            r0 = this;
            r0.mRequestQueue = r1
            return r0
    }

    public com.android.volley.Request<?> setRetryPolicy(com.android.volley.RetryPolicy r1) {
            r0 = this;
            r0.mRetryPolicy = r1
            return r0
    }

    public final com.android.volley.Request<?> setSequence(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mSequence = r1
            return r0
    }

    public final com.android.volley.Request<?> setShouldCache(boolean r1) {
            r0 = this;
            r0.mShouldCache = r1
            return r0
    }

    public final com.android.volley.Request<?> setShouldRetryConnectionErrors(boolean r1) {
            r0 = this;
            r0.mShouldRetryConnectionErrors = r1
            return r0
    }

    public final com.android.volley.Request<?> setShouldRetryServerErrors(boolean r1) {
            r0 = this;
            r0.mShouldRetryServerErrors = r1
            return r0
    }

    public com.android.volley.Request<?> setTag(java.lang.Object r1) {
            r0 = this;
            r0.mTag = r1
            return r0
    }

    public final boolean shouldCache() {
            r1 = this;
            boolean r0 = r1.mShouldCache
            return r0
    }

    public final boolean shouldRetryConnectionErrors() {
            r1 = this;
            boolean r0 = r1.mShouldRetryConnectionErrors
            return r0
    }

    public final boolean shouldRetryServerErrors() {
            r1 = this;
            boolean r0 = r1.mShouldRetryServerErrors
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.getTrafficStatsTag()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r3.isCanceled()
            if (r2 == 0) goto L23
            java.lang.String r2 = "[X] "
            goto L25
        L23:
            java.lang.String r2 = "[ ] "
        L25:
            r1.append(r2)
            java.lang.String r2 = r3.getUrl()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            com.android.volley.Request$Priority r0 = r3.getPriority()
            r1.append(r0)
            r1.append(r2)
            java.lang.Integer r0 = r3.mSequence
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
