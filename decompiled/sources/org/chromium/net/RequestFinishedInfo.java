package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestFinishedInfo {
    public static final int CANCELED = 2;
    public static final int FAILED = 1;
    public static final int SUCCEEDED = 0;

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Listener {
        private final java.util.concurrent.Executor mExecutor;

        public Listener(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.mExecutor = r2
                return
            L8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Executor must not be null"
                r2.<init>(r0)
                throw r2
        }

        public java.util.concurrent.Executor getExecutor() {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                return r0
        }

        public abstract void onRequestFinished(org.chromium.net.RequestFinishedInfo r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Metrics {
        public Metrics() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public abstract java.util.Date getConnectEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getConnectStart();

        @androidx.annotation.Nullable
        public abstract java.util.Date getDnsEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getDnsStart();

        @androidx.annotation.Nullable
        public abstract java.util.Date getPushEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getPushStart();

        @androidx.annotation.Nullable
        public abstract java.lang.Long getReceivedByteCount();

        @androidx.annotation.Nullable
        public abstract java.util.Date getRequestEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getRequestStart();

        @androidx.annotation.Nullable
        public abstract java.util.Date getResponseStart();

        @androidx.annotation.Nullable
        public abstract java.util.Date getSendingEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getSendingStart();

        @androidx.annotation.Nullable
        public abstract java.lang.Long getSentByteCount();

        public abstract boolean getSocketReused();

        @androidx.annotation.Nullable
        public abstract java.util.Date getSslEnd();

        @androidx.annotation.Nullable
        public abstract java.util.Date getSslStart();

        @androidx.annotation.Nullable
        public abstract java.lang.Long getTotalTimeMs();

        @androidx.annotation.Nullable
        public abstract java.lang.Long getTtfbMs();
    }

    public RequestFinishedInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.Collection<java.lang.Object> getAnnotations();

    @androidx.annotation.Nullable
    public abstract org.chromium.net.CronetException getException();

    public abstract int getFinishedReason();

    public abstract org.chromium.net.RequestFinishedInfo.Metrics getMetrics();

    @androidx.annotation.Nullable
    public abstract org.chromium.net.UrlResponseInfo getResponseInfo();

    public abstract java.lang.String getUrl();
}
