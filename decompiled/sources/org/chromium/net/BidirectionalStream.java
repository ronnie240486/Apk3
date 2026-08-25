package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BidirectionalStream {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract org.chromium.net.BidirectionalStream.Builder addHeader(java.lang.String r1, java.lang.String r2);

        @android.annotation.SuppressLint({"WrongConstant"})
        public abstract org.chromium.net.BidirectionalStream build();

        public abstract org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean r1);

        public abstract org.chromium.net.BidirectionalStream.Builder setHttpMethod(java.lang.String r1);

        public abstract org.chromium.net.BidirectionalStream.Builder setPriority(int r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCanceled(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2) {
                r0 = this;
                return
        }

        public abstract void onFailed(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2, org.chromium.net.CronetException r3);

        public abstract void onReadCompleted(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2, java.nio.ByteBuffer r3, boolean r4);

        public abstract void onResponseHeadersReceived(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2);

        public void onResponseTrailersReceived(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2, org.chromium.net.UrlResponseInfo.HeaderBlock r3) {
                r0 = this;
                return
        }

        public abstract void onStreamReady(org.chromium.net.BidirectionalStream r1);

        public abstract void onSucceeded(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2);

        public abstract void onWriteCompleted(org.chromium.net.BidirectionalStream r1, org.chromium.net.UrlResponseInfo r2, java.nio.ByteBuffer r3, boolean r4);
    }

    public BidirectionalStream() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(java.nio.ByteBuffer r1);

    public abstract void start();

    public abstract void write(java.nio.ByteBuffer r1, boolean r2);
}
