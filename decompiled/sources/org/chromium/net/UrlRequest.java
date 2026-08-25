package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UrlRequest {

    public static abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract org.chromium.net.UrlRequest.Builder addHeader(java.lang.String r1, java.lang.String r2);

        public abstract org.chromium.net.UrlRequest.Builder allowDirectExecutor();

        public abstract org.chromium.net.UrlRequest build();

        public abstract org.chromium.net.UrlRequest.Builder disableCache();

        public abstract org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String r1);

        public abstract org.chromium.net.UrlRequest.Builder setPriority(int r1);

        public abstract org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider r1, java.util.concurrent.Executor r2);
    }

    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCanceled(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2) {
                r0 = this;
                return
        }

        public abstract void onFailed(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2, org.chromium.net.CronetException r3);

        public abstract void onReadCompleted(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2, java.nio.ByteBuffer r3) throws java.lang.Exception;

        public abstract void onRedirectReceived(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2, java.lang.String r3) throws java.lang.Exception;

        public abstract void onResponseStarted(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2) throws java.lang.Exception;

        public abstract void onSucceeded(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2);
    }

    public static class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;

        private Status() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class StatusListener {
        public StatusListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onStatus(int r1);
    }

    public UrlRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(org.chromium.net.UrlRequest.StatusListener r1);

    public abstract boolean isDone();

    public abstract void read(java.nio.ByteBuffer r1);

    public abstract void start();
}
