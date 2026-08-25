package com.google.android.exoplayer2.ext.cronet;

/* JADX INFO: loaded from: classes.dex */
public class CronetDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource implements com.google.android.exoplayer2.upstream.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private long bytesRemaining;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final int connectTimeoutMs;

    @androidx.annotation.Nullable
    private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
    private final org.chromium.net.CronetEngine cronetEngine;
    private volatile long currentConnectTimeoutMs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec currentDataSpec;

    @androidx.annotation.Nullable
    private org.chromium.net.UrlRequest currentUrlRequest;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;

    @androidx.annotation.Nullable
    private java.io.IOException exception;
    private final java.util.concurrent.Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final com.google.android.exoplayer2.util.ConditionVariable operation;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;

    @androidx.annotation.Nullable
    private org.chromium.net.UrlResponseInfo responseInfo;
    public final org.chromium.net.UrlRequest.Callback urlRequestCallback;

    @androidx.annotation.Nullable
    private final java.lang.String userAgent;


    public static final class Factory implements com.google.android.exoplayer2.upstream.HttpDataSource.Factory {
        private int connectTimeoutMs;

        @androidx.annotation.Nullable
        private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;

        @androidx.annotation.Nullable
        private final org.chromium.net.CronetEngine cronetEngine;
        private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;
        private final java.util.concurrent.Executor executor;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.HttpDataSource.Factory fallbackFactory;
        private boolean handleSetCookieRequests;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory internalFallbackFactory;
        private boolean keepPostFor302Redirects;
        private int readTimeoutMs;
        private int requestPriority;
        private boolean resetTimeoutOnRedirects;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.TransferListener transferListener;

        @androidx.annotation.Nullable
        private java.lang.String userAgent;

        @java.lang.Deprecated
        public Factory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                org.chromium.net.CronetEngine r1 = r1.getCronetEngine()
                r0.cronetEngine = r1
                r0.executor = r2
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
                r1.<init>()
                r0.defaultRequestProperties = r1
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r1 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
                r1.<init>()
                r0.internalFallbackFactory = r1
                r1 = 8000(0x1f40, float:1.121E-41)
                r0.connectTimeoutMs = r1
                r0.readTimeoutMs = r1
                return
        }

        public Factory(org.chromium.net.CronetEngine r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                org.chromium.net.CronetEngine r1 = (org.chromium.net.CronetEngine) r1
                r0.cronetEngine = r1
                r0.executor = r2
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
                r1.<init>()
                r0.defaultRequestProperties = r1
                r1 = 0
                r0.internalFallbackFactory = r1
                r1 = 3
                r0.requestPriority = r1
                r1 = 8000(0x1f40, float:1.121E-41)
                r0.connectTimeoutMs = r1
                r0.readTimeoutMs = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.HttpDataSource createDataSource() {
                r13 = this;
                org.chromium.net.CronetEngine r0 = r13.cronetEngine
                if (r0 != 0) goto L1a
                com.google.android.exoplayer2.upstream.HttpDataSource$Factory r0 = r13.fallbackFactory
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.upstream.HttpDataSource r0 = r0.createDataSource()
                goto L19
            Ld:
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r13.internalFallbackFactory
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = (com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory) r0
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource r0 = r0.createDataSource()
            L19:
                return r0
            L1a:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r0 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource
                org.chromium.net.CronetEngine r2 = r13.cronetEngine
                java.util.concurrent.Executor r3 = r13.executor
                int r4 = r13.requestPriority
                int r5 = r13.connectTimeoutMs
                int r6 = r13.readTimeoutMs
                boolean r7 = r13.resetTimeoutOnRedirects
                boolean r8 = r13.handleSetCookieRequests
                java.lang.String r9 = r13.userAgent
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r10 = r13.defaultRequestProperties
                com.google.common.base.Predicate<java.lang.String> r11 = r13.contentTypePredicate
                boolean r12 = r13.keepPostFor302Redirects
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                com.google.android.exoplayer2.upstream.TransferListener r1 = r13.transferListener
                if (r1 == 0) goto L3d
                r0.addTransferListener(r1)
            L3d:
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setConnectionTimeoutMs(int r2) {
                r1 = this;
                r1.connectTimeoutMs = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setConnectTimeoutMs(r2)
            L9:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setContentTypePredicate(@androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r2) {
                r1 = this;
                r1.contentTypePredicate = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setContentTypePredicate(r2)
            L9:
                return r1
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.defaultRequestProperties
                r0.clearAndSet(r2)
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto Lc
                r0.setDefaultRequestProperties(r2)
            Lc:
                return r1
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map r1) {
                r0 = this;
                com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory r1 = r0.setDefaultRequestProperties(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setFallbackFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.HttpDataSource.Factory r1) {
                r0 = this;
                r0.fallbackFactory = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setHandleSetCookieRequests(boolean r1) {
                r0 = this;
                r0.handleSetCookieRequests = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setKeepPostFor302Redirects(boolean r2) {
                r1 = this;
                r1.keepPostFor302Redirects = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setKeepPostFor302Redirects(r2)
            L9:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setReadTimeoutMs(int r2) {
                r1 = this;
                r1.readTimeoutMs = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setReadTimeoutMs(r2)
            L9:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setRequestPriority(int r1) {
                r0 = this;
                r0.requestPriority = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setResetTimeoutOnRedirects(boolean r1) {
                r0 = this;
                r0.resetTimeoutOnRedirects = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setTransferListener(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r2) {
                r1 = this;
                r1.transferListener = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setTransferListener(r2)
            L9:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ext.cronet.CronetDataSource.Factory setUserAgent(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                r1.userAgent = r2
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r1.internalFallbackFactory
                if (r0 == 0) goto L9
                r0.setUserAgent(r2)
            L9:
                return r1
        }
    }

    public static final class OpenException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public final int cronetConnectionStatus;

        public OpenException(com.google.android.exoplayer2.upstream.DataSpec r2, int r3, int r4) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r3, r0)
                r1.cronetConnectionStatus = r4
                return
        }

        @java.lang.Deprecated
        public OpenException(java.io.IOException r3, com.google.android.exoplayer2.upstream.DataSpec r4, int r5) {
                r2 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1 = 1
                r2.<init>(r3, r4, r0, r1)
                r2.cronetConnectionStatus = r5
                return
        }

        public OpenException(java.io.IOException r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4, int r5) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r3, r4, r0)
                r1.cronetConnectionStatus = r5
                return
        }

        @java.lang.Deprecated
        public OpenException(java.lang.String r3, com.google.android.exoplayer2.upstream.DataSpec r4, int r5) {
                r2 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1 = 1
                r2.<init>(r3, r4, r0, r1)
                r2.cronetConnectionStatus = r5
                return
        }

        public OpenException(java.lang.String r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4, int r5) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r3, r4, r0)
                r1.cronetConnectionStatus = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class UrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
        public final /* synthetic */ com.google.android.exoplayer2.ext.cronet.CronetDataSource this$0;

        private UrlRequestCallback(com.google.android.exoplayer2.ext.cronet.CronetDataSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ UrlRequestCallback(com.google.android.exoplayer2.ext.cronet.CronetDataSource r1, com.google.android.exoplayer2.ext.cronet.CronetDataSource.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onFailed(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2, org.chromium.net.CronetException r3) {
                r0 = this;
                monitor-enter(r0)
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r2 = r0.this$0     // Catch: java.lang.Throwable -> L34
                org.chromium.net.UrlRequest r2 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r2)     // Catch: java.lang.Throwable -> L34
                if (r1 == r2) goto Lb
                monitor-exit(r0)
                return
            Lb:
                boolean r1 = r3 instanceof org.chromium.net.NetworkException     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L24
                r1 = r3
                org.chromium.net.NetworkException r1 = (org.chromium.net.NetworkException) r1     // Catch: java.lang.Throwable -> L34
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L34
                r2 = 1
                if (r1 != r2) goto L24
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L34
                java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch: java.lang.Throwable -> L34
                r2.<init>()     // Catch: java.lang.Throwable -> L34
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$302(r1, r2)     // Catch: java.lang.Throwable -> L34
                goto L29
            L24:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L34
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$302(r1, r3)     // Catch: java.lang.Throwable -> L34
            L29:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L34
                com.google.android.exoplayer2.util.ConditionVariable r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$400(r1)     // Catch: java.lang.Throwable -> L34
                r1.open()     // Catch: java.lang.Throwable -> L34
                monitor-exit(r0)
                return
            L34:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onReadCompleted(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2, java.nio.ByteBuffer r3) {
                r0 = this;
                monitor-enter(r0)
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r2 = r0.this$0     // Catch: java.lang.Throwable -> L16
                org.chromium.net.UrlRequest r2 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r2)     // Catch: java.lang.Throwable -> L16
                if (r1 == r2) goto Lb
                monitor-exit(r0)
                return
            Lb:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L16
                com.google.android.exoplayer2.util.ConditionVariable r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$400(r1)     // Catch: java.lang.Throwable -> L16
                r1.open()     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)
                return
            L16:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onRedirectReceived(org.chromium.net.UrlRequest r10, org.chromium.net.UrlResponseInfo r11, java.lang.String r12) {
                r9 = this;
                monitor-enter(r9)
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r0 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest r0 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r0)     // Catch: java.lang.Throwable -> Lef
                if (r10 == r0) goto Lb
                monitor-exit(r9)
                return
            Lb:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r0 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest r0 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r0)     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest r0 = (org.chromium.net.UrlRequest) r0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.DataSpec r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$200(r1)     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Throwable -> Lef
                r7 = r1
                com.google.android.exoplayer2.upstream.DataSpec r7 = (com.google.android.exoplayer2.upstream.DataSpec) r7     // Catch: java.lang.Throwable -> Lef
                int r3 = r11.getHttpStatusCode()     // Catch: java.lang.Throwable -> Lef
                int r1 = r7.httpMethod     // Catch: java.lang.Throwable -> Lef
                r2 = 2
                if (r1 != r2) goto L56
                r1 = 307(0x133, float:4.3E-43)
                if (r3 == r1) goto L35
                r1 = 308(0x134, float:4.32E-43)
                if (r3 != r1) goto L56
            L35:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r10 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r12 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = r11.getHttpStatusText()     // Catch: java.lang.Throwable -> Lef
                r5 = 0
                java.util.Map r6 = r11.getAllHeaders()     // Catch: java.lang.Throwable -> Lef
                byte[] r8 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> Lef
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$302(r10, r12)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r10 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.util.ConditionVariable r10 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$400(r10)     // Catch: java.lang.Throwable -> Lef
                r10.open()     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r9)
                return
            L56:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                boolean r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$500(r1)     // Catch: java.lang.Throwable -> Lef
                if (r1 == 0) goto L63
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$600(r1)     // Catch: java.lang.Throwable -> Lef
            L63:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                boolean r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$700(r1)     // Catch: java.lang.Throwable -> Lef
                r4 = 1
                if (r1 == 0) goto L76
                int r1 = r7.httpMethod     // Catch: java.lang.Throwable -> Lef
                if (r1 != r2) goto L76
                r1 = 302(0x12e, float:4.23E-43)
                if (r3 != r1) goto L76
                r1 = 1
                goto L77
            L76:
                r1 = 0
            L77:
                if (r1 != 0) goto L86
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r3 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                boolean r3 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$800(r3)     // Catch: java.lang.Throwable -> Lef
                if (r3 != 0) goto L86
                r10.followRedirect()     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r9)
                return
            L86:
                java.util.Map r11 = r11.getAllHeaders()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r3 = "Set-Cookie"
                java.lang.Object r11 = r11.get(r3)     // Catch: java.lang.Throwable -> Lef
                java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> Lef
                java.lang.String r11 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$900(r11)     // Catch: java.lang.Throwable -> Lef
                if (r1 != 0) goto La3
                boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lef
                if (r3 == 0) goto La3
                r10.followRedirect()     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r9)
                return
            La3:
                r0.cancel()     // Catch: java.lang.Throwable -> Lef
                if (r1 != 0) goto Lc2
                int r10 = r7.httpMethod     // Catch: java.lang.Throwable -> Lef
                if (r10 != r2) goto Lc2
                com.google.android.exoplayer2.upstream.DataSpec$Builder r10 = r7.buildUpon()     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.DataSpec$Builder r10 = r10.setUri(r12)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.DataSpec$Builder r10 = r10.setHttpMethod(r4)     // Catch: java.lang.Throwable -> Lef
                r12 = 0
                com.google.android.exoplayer2.upstream.DataSpec$Builder r10 = r10.setHttpBody(r12)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.DataSpec r10 = r10.build()     // Catch: java.lang.Throwable -> Lef
                goto Lca
            Lc2:
                android.net.Uri r10 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.upstream.DataSpec r10 = r7.withUri(r10)     // Catch: java.lang.Throwable -> Lef
            Lca:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r12 = r9.this$0     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest$Builder r10 = r12.buildRequestBuilder(r10)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$1000(r10, r11)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r11 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest r10 = r10.build()     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$102(r11, r10)     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r10 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                org.chromium.net.UrlRequest r10 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r10)     // Catch: java.lang.Throwable -> Lef
                r10.start()     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r9)
                return
            Le7:
                r10 = move-exception
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r11 = r9.this$0     // Catch: java.lang.Throwable -> Lef
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$302(r11, r10)     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r9)
                return
            Lef:
                r10 = move-exception
                monitor-exit(r9)
                throw r10
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onResponseStarted(org.chromium.net.UrlRequest r2, org.chromium.net.UrlResponseInfo r3) {
                r1 = this;
                monitor-enter(r1)
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r0 = r1.this$0     // Catch: java.lang.Throwable -> L1b
                org.chromium.net.UrlRequest r0 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r0)     // Catch: java.lang.Throwable -> L1b
                if (r2 == r0) goto Lb
                monitor-exit(r1)
                return
            Lb:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r2 = r1.this$0     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$1102(r2, r3)     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r2 = r1.this$0     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.util.ConditionVariable r2 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$400(r2)     // Catch: java.lang.Throwable -> L1b
                r2.open()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r1)
                return
            L1b:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onSucceeded(org.chromium.net.UrlRequest r1, org.chromium.net.UrlResponseInfo r2) {
                r0 = this;
                monitor-enter(r0)
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r2 = r0.this$0     // Catch: java.lang.Throwable -> L1b
                org.chromium.net.UrlRequest r2 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$100(r2)     // Catch: java.lang.Throwable -> L1b
                if (r1 == r2) goto Lb
                monitor-exit(r0)
                return
            Lb:
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$1202(r1)     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.ext.cronet.CronetDataSource r1 = r0.this$0     // Catch: java.lang.Throwable -> L1b
                com.google.android.exoplayer2.util.ConditionVariable r1 = com.google.android.exoplayer2.ext.cronet.CronetDataSource.access$400(r1)     // Catch: java.lang.Throwable -> L1b
                r1.open()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r0)
                return
            L1b:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    static {
            java.lang.String r0 = "goog.exo.cronet"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    public CronetDataSource(org.chromium.net.CronetEngine r2, java.util.concurrent.Executor r3, int r4, int r5, int r6, boolean r7, boolean r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r10, @androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r11, boolean r12) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            org.chromium.net.CronetEngine r2 = (org.chromium.net.CronetEngine) r2
            r1.cronetEngine = r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r1.executor = r2
            r1.requestPriority = r4
            r1.connectTimeoutMs = r5
            r1.readTimeoutMs = r6
            r1.resetTimeoutOnRedirects = r7
            r1.handleSetCookieRequests = r8
            r1.userAgent = r9
            r1.defaultRequestProperties = r10
            r1.contentTypePredicate = r11
            r1.keepPostFor302Redirects = r12
            com.google.android.exoplayer2.util.Clock r2 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r1.clock = r2
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$UrlRequestCallback r2 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$UrlRequestCallback
            r3 = 0
            r2.<init>(r1, r3)
            r1.urlRequestCallback = r2
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
            r2.<init>()
            r1.requestProperties = r2
            com.google.android.exoplayer2.util.ConditionVariable r2 = new com.google.android.exoplayer2.util.ConditionVariable
            r2.<init>()
            r1.operation = r2
            return
    }

    public static /* synthetic */ org.chromium.net.UrlRequest access$100(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            org.chromium.net.UrlRequest r0 = r0.currentUrlRequest
            return r0
    }

    public static /* synthetic */ void access$1000(org.chromium.net.UrlRequest.Builder r0, java.lang.String r1) {
            attachCookies(r0, r1)
            return
    }

    public static /* synthetic */ org.chromium.net.UrlRequest access$102(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0, org.chromium.net.UrlRequest r1) {
            r0.currentUrlRequest = r1
            return r1
    }

    public static /* synthetic */ org.chromium.net.UrlResponseInfo access$1102(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0, org.chromium.net.UrlResponseInfo r1) {
            r0.responseInfo = r1
            return r1
    }

    public static /* synthetic */ void access$1202(com.google.android.exoplayer2.ext.cronet.CronetDataSource r1) {
            r0 = 1
            r1.finished = r0
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.DataSpec access$200(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.currentDataSpec
            return r0
    }

    public static /* synthetic */ java.io.IOException access$302(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0, java.io.IOException r1) {
            r0.exception = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.util.ConditionVariable access$400(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            com.google.android.exoplayer2.util.ConditionVariable r0 = r0.operation
            return r0
    }

    public static /* synthetic */ boolean access$500(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            boolean r0 = r0.resetTimeoutOnRedirects
            return r0
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            r0.resetConnectTimeout()
            return
    }

    public static /* synthetic */ boolean access$700(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            boolean r0 = r0.keepPostFor302Redirects
            return r0
    }

    public static /* synthetic */ boolean access$800(com.google.android.exoplayer2.ext.cronet.CronetDataSource r0) {
            boolean r0 = r0.handleSetCookieRequests
            return r0
    }

    public static /* synthetic */ java.lang.String access$900(java.util.List r0) {
            java.lang.String r0 = parseCookies(r0)
            return r0
    }

    private static void attachCookies(org.chromium.net.UrlRequest.Builder r1, @androidx.annotation.Nullable java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "Cookie"
            r1.addHeader(r0, r2)
            return
    }

    private boolean blockUntilConnectTimeout() throws java.lang.InterruptedException {
            r6 = this;
            com.google.android.exoplayer2.util.Clock r0 = r6.clock
            long r0 = r0.elapsedRealtime()
            r2 = 0
        L7:
            if (r2 != 0) goto L22
            long r3 = r6.currentConnectTimeoutMs
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            com.google.android.exoplayer2.util.ConditionVariable r2 = r6.operation
            long r3 = r6.currentConnectTimeoutMs
            long r3 = r3 - r0
            r0 = 5
            long r3 = r3 + r0
            boolean r2 = r2.block(r3)
            com.google.android.exoplayer2.util.Clock r0 = r6.clock
            long r0 = r0.elapsedRealtime()
            goto L7
        L22:
            return r2
    }

    private static int copyByteBuffer(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4) {
            int r0 = r3.remaining()
            int r1 = r4.remaining()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.limit()
            int r2 = r3.position()
            int r2 = r2 + r0
            r3.limit(r2)
            r4.put(r3)
            r3.limit(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static java.lang.String getFirstHeader(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0, java.lang.String r1) {
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L16
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L16
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private java.nio.ByteBuffer getOrCreateReadBuffer() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.readBuffer
            if (r0 != 0) goto L11
            r0 = 32768(0x8000, float:4.5918E-41)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r2.readBuffer = r0
            r1 = 0
            r0.limit(r1)
        L11:
            java.nio.ByteBuffer r0 = r2.readBuffer
            return r0
    }

    private static int getStatus(org.chromium.net.UrlRequest r3) throws java.lang.InterruptedException {
            com.google.android.exoplayer2.util.ConditionVariable r0 = new com.google.android.exoplayer2.util.ConditionVariable
            r0.<init>()
            r1 = 1
            int[] r1 = new int[r1]
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$1 r2 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$1
            r2.<init>(r1, r0)
            r3.getStatus(r2)
            r0.block()
            r3 = 0
            r3 = r1[r3]
            return r3
    }

    private static boolean isCompressed(org.chromium.net.UrlResponseInfo r3) {
            java.util.List r3 = r3.getAllHeadersAsList()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "Content-Encoding"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L8
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "identity"
            boolean r3 = r3.equalsIgnoreCase(r0)
            r3 = r3 ^ 1
            return r3
        L31:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static java.lang.String parseCookies(@androidx.annotation.Nullable java.util.List<java.lang.String> r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = ";"
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    private void readInternal(java.nio.ByteBuffer r6, com.google.android.exoplayer2.upstream.DataSpec r7) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r5 = this;
            org.chromium.net.UrlRequest r0 = r5.currentUrlRequest
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            org.chromium.net.UrlRequest r0 = (org.chromium.net.UrlRequest) r0
            r0.read(r6)
            r0 = 2
            r1 = 0
            com.google.android.exoplayer2.util.ConditionVariable r2 = r5.operation     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            int r3 = r5.readTimeoutMs     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            long r3 = (long) r3     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            boolean r2 = r2.block(r3)     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            if (r2 == 0) goto L19
            goto L45
        L19:
            java.net.SocketTimeoutException r2 = new java.net.SocketTimeoutException     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            r2.<init>()     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
            throw r2     // Catch: java.net.SocketTimeoutException -> L1f java.lang.InterruptedException -> L30
        L1f:
            r2 = move-exception
            java.nio.ByteBuffer r3 = r5.readBuffer
            if (r6 != r3) goto L26
            r5.readBuffer = r1
        L26:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r6 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1 = 2002(0x7d2, float:2.805E-42)
            r6.<init>(r2, r7, r1, r0)
            r5.exception = r6
            goto L45
        L30:
            java.nio.ByteBuffer r2 = r5.readBuffer
            if (r6 != r2) goto L37
            r5.readBuffer = r1
        L37:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException
            r6.<init>()
            r5.exception = r6
        L45:
            java.io.IOException r6 = r5.exception
            if (r6 == 0) goto L55
            boolean r1 = r6 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r1 == 0) goto L50
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r6 = (com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) r6
            throw r6
        L50:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r6 = com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.createForIOException(r6, r7, r0)
            throw r6
        L55:
            return
    }

    private byte[] readResponseBody() throws java.io.IOException {
            r5 = this;
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            java.nio.ByteBuffer r1 = r5.getOrCreateReadBuffer()
        L6:
            boolean r2 = r5.finished
            if (r2 != 0) goto L39
            com.google.android.exoplayer2.util.ConditionVariable r2 = r5.operation
            r2.close()
            r1.clear()
            com.google.android.exoplayer2.upstream.DataSpec r2 = r5.currentDataSpec
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            r5.readInternal(r1, r2)
            r1.flip()
            int r2 = r1.remaining()
            if (r2 <= 0) goto L6
            int r2 = r0.length
            int r3 = r0.length
            int r4 = r1.remaining()
            int r4 = r4 + r3
            byte[] r0 = java.util.Arrays.copyOf(r0, r4)
            int r3 = r1.remaining()
            r1.get(r0, r2, r3)
            goto L6
        L39:
            return r0
    }

    private void resetConnectTimeout() {
            r4 = this;
            com.google.android.exoplayer2.util.Clock r0 = r4.clock
            long r0 = r0.elapsedRealtime()
            int r2 = r4.connectTimeoutMs
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.currentConnectTimeoutMs = r0
            return
    }

    private void skipFully(long r7, com.google.android.exoplayer2.upstream.DataSpec r9) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            java.nio.ByteBuffer r2 = r6.getOrCreateReadBuffer()
        Lb:
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r3 = 14
            com.google.android.exoplayer2.util.ConditionVariable r4 = r6.operation     // Catch: java.io.IOException -> L57
            r4.close()     // Catch: java.io.IOException -> L57
            r2.clear()     // Catch: java.io.IOException -> L57
            r6.readInternal(r2, r9)     // Catch: java.io.IOException -> L57
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L57
            boolean r4 = r4.isInterrupted()     // Catch: java.io.IOException -> L57
            if (r4 != 0) goto L51
            boolean r4 = r6.finished     // Catch: java.io.IOException -> L57
            if (r4 != 0) goto L49
            r2.flip()     // Catch: java.io.IOException -> L57
            boolean r4 = r2.hasRemaining()     // Catch: java.io.IOException -> L57
            com.google.android.exoplayer2.util.Assertions.checkState(r4)     // Catch: java.io.IOException -> L57
            int r4 = r2.remaining()     // Catch: java.io.IOException -> L57
            long r4 = (long) r4     // Catch: java.io.IOException -> L57
            long r4 = java.lang.Math.min(r4, r7)     // Catch: java.io.IOException -> L57
            int r5 = (int) r4     // Catch: java.io.IOException -> L57
            int r4 = r2.position()     // Catch: java.io.IOException -> L57
            int r4 = r4 + r5
            r2.position(r4)     // Catch: java.io.IOException -> L57
            long r3 = (long) r5     // Catch: java.io.IOException -> L57
            long r7 = r7 - r3
            goto Lb
        L49:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r7 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException     // Catch: java.io.IOException -> L57
            r8 = 2008(0x7d8, float:2.814E-42)
            r7.<init>(r9, r8, r3)     // Catch: java.io.IOException -> L57
            throw r7     // Catch: java.io.IOException -> L57
        L51:
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L57
            r7.<init>()     // Catch: java.io.IOException -> L57
            throw r7     // Catch: java.io.IOException -> L57
        L57:
            r7 = move-exception
            boolean r8 = r7 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r8 != 0) goto L6b
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r8 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException
            boolean r0 = r7 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L65
            r0 = 2002(0x7d2, float:2.805E-42)
            goto L67
        L65:
            r0 = 2001(0x7d1, float:2.804E-42)
        L67:
            r8.<init>(r7, r9, r0, r3)
            throw r8
        L6b:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r7 = (com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) r7
            throw r7
        L6e:
            return
    }

    public final org.chromium.net.UrlRequest.Builder buildRequestBuilder(com.google.android.exoplayer2.upstream.DataSpec r6) throws java.io.IOException {
            r5 = this;
            org.chromium.net.CronetEngine r0 = r5.cronetEngine
            android.net.Uri r1 = r6.uri
            java.lang.String r1 = r1.toString()
            org.chromium.net.UrlRequest$Callback r2 = r5.urlRequestCallback
            java.util.concurrent.Executor r3 = r5.executor
            org.chromium.net.UrlRequest$Builder r0 = r0.newUrlRequestBuilder(r1, r2, r3)
            int r1 = r5.requestPriority
            org.chromium.net.UrlRequest$Builder r0 = r0.setPriority(r1)
            org.chromium.net.UrlRequest$Builder r0 = r0.allowDirectExecutor()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r2 = r5.defaultRequestProperties
            if (r2 == 0) goto L2a
            java.util.Map r2 = r2.getSnapshot()
            r1.putAll(r2)
        L2a:
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r2 = r5.requestProperties
            java.util.Map r2 = r2.getSnapshot()
            r1.putAll(r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r6.httpRequestHeaders
            r1.putAll(r2)
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.addHeader(r4, r3)
            goto L40
        L5c:
            byte[] r2 = r6.httpBody
            if (r2 == 0) goto L74
            java.lang.String r2 = "Content-Type"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L69
            goto L74
        L69:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r0 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException
            r1 = 1004(0x3ec, float:1.407E-42)
            r2 = 0
            java.lang.String r3 = "HTTP request with non-empty body must set Content-Type"
            r0.<init>(r3, r6, r1, r2)
            throw r0
        L74:
            long r1 = r6.position
            long r3 = r6.length
            java.lang.String r1 = com.google.android.exoplayer2.upstream.HttpUtil.buildRangeRequestHeader(r1, r3)
            if (r1 == 0) goto L83
            java.lang.String r2 = "Range"
            r0.addHeader(r2, r1)
        L83:
            java.lang.String r1 = r5.userAgent
            if (r1 == 0) goto L8c
            java.lang.String r2 = "User-Agent"
            r0.addHeader(r2, r1)
        L8c:
            java.lang.String r1 = r6.getHttpMethodString()
            r0.setHttpMethod(r1)
            byte[] r6 = r6.httpBody
            if (r6 == 0) goto La1
            com.google.android.exoplayer2.ext.cronet.ByteArrayUploadDataProvider r1 = new com.google.android.exoplayer2.ext.cronet.ByteArrayUploadDataProvider
            r1.<init>(r6)
            java.util.concurrent.Executor r6 = r5.executor
            r0.setUploadDataProvider(r1, r6)
        La1:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
            r1 = this;
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.clear()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(java.lang.String r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            org.chromium.net.UrlRequest r0 = r3.currentUrlRequest     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto Lb
            r0.cancel()     // Catch: java.lang.Throwable -> L26
            r3.currentUrlRequest = r1     // Catch: java.lang.Throwable -> L26
        Lb:
            java.nio.ByteBuffer r0 = r3.readBuffer     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L13
            r0.limit(r2)     // Catch: java.lang.Throwable -> L26
        L13:
            r3.currentDataSpec = r1     // Catch: java.lang.Throwable -> L26
            r3.responseInfo = r1     // Catch: java.lang.Throwable -> L26
            r3.exception = r1     // Catch: java.lang.Throwable -> L26
            r3.finished = r2     // Catch: java.lang.Throwable -> L26
            boolean r0 = r3.opened     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r3.opened = r2     // Catch: java.lang.Throwable -> L26
            r3.transferEnded()     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r3)
            return
        L26:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
            r1 = this;
            org.chromium.net.UrlResponseInfo r0 = r1.responseInfo
            if (r0 == 0) goto L12
            int r0 = r0.getHttpStatusCode()
            if (r0 > 0) goto Lb
            goto L12
        Lb:
            org.chromium.net.UrlResponseInfo r0 = r1.responseInfo
            int r0 = r0.getHttpStatusCode()
            goto L13
        L12:
            r0 = -1
        L13:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            org.chromium.net.UrlResponseInfo r0 = r1.responseInfo
            if (r0 != 0) goto L9
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto Ld
        L9:
            java.util.Map r0 = r0.getAllHeaders()
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            org.chromium.net.UrlResponseInfo r0 = r1.responseInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto Le
        L6:
            java.lang.String r0 = r0.getUrl()
            android.net.Uri r0 = android.net.Uri.parse(r0)
        Le:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r17) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r16 = this;
            r1 = r16
            r7 = r17
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r17)
            boolean r0 = r1.opened
            r2 = 1
            r0 = r0 ^ r2
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.operation
            r0.close()
            r16.resetConnectTimeout()
            r1.currentDataSpec = r7
            org.chromium.net.UrlRequest$Builder r0 = r16.buildRequestBuilder(r17)     // Catch: java.io.IOException -> L133
            org.chromium.net.UrlRequest r0 = r0.build()     // Catch: java.io.IOException -> L133
            r1.currentUrlRequest = r0     // Catch: java.io.IOException -> L133
            r0.start()
            r16.transferInitializing(r17)
            boolean r3 = r16.blockUntilConnectTimeout()     // Catch: java.lang.InterruptedException -> L11e
            java.io.IOException r4 = r1.exception     // Catch: java.lang.InterruptedException -> L11e
            if (r4 == 0) goto L54
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.InterruptedException -> L11e
            if (r2 == 0) goto L48
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)     // Catch: java.lang.InterruptedException -> L11e
            java.lang.String r3 = "err_cleartext_not_permitted"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.InterruptedException -> L11e
            if (r2 == 0) goto L48
            com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException     // Catch: java.lang.InterruptedException -> L11e
            r0.<init>(r4, r7)     // Catch: java.lang.InterruptedException -> L11e
            throw r0     // Catch: java.lang.InterruptedException -> L11e
        L48:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r2 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException     // Catch: java.lang.InterruptedException -> L11e
            r3 = 2001(0x7d1, float:2.804E-42)
            int r0 = getStatus(r0)     // Catch: java.lang.InterruptedException -> L11e
            r2.<init>(r4, r7, r3, r0)     // Catch: java.lang.InterruptedException -> L11e
            throw r2     // Catch: java.lang.InterruptedException -> L11e
        L54:
            if (r3 == 0) goto L10d
            org.chromium.net.UrlResponseInfo r0 = r1.responseInfo
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            org.chromium.net.UrlResponseInfo r0 = (org.chromium.net.UrlResponseInfo) r0
            int r3 = r0.getHttpStatusCode()
            java.util.Map r6 = r0.getAllHeaders()
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r8 = 0
            r10 = -1
            if (r3 < r5) goto Lcc
            r12 = 299(0x12b, float:4.19E-43)
            if (r3 <= r12) goto L75
            goto Lcc
        L75:
            com.google.common.base.Predicate<java.lang.String> r12 = r1.contentTypePredicate
            if (r12 == 0) goto L8e
            java.lang.String r13 = "Content-Type"
            java.lang.String r13 = getFirstHeader(r6, r13)
            if (r13 == 0) goto L8e
            boolean r12 = r12.apply(r13)
            if (r12 == 0) goto L88
            goto L8e
        L88:
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r13, r7)
            throw r0
        L8e:
            if (r3 != r5) goto L97
            long r12 = r7.position
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 == 0) goto L97
            r8 = r12
        L97:
            boolean r0 = isCompressed(r0)
            if (r0 != 0) goto Lbd
            long r12 = r7.length
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto La6
            r1.bytesRemaining = r12
            goto Lc1
        La6:
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = getFirstHeader(r6, r0)
            java.lang.String r3 = getFirstHeader(r6, r4)
            long r3 = com.google.android.exoplayer2.upstream.HttpUtil.getContentLength(r0, r3)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto Lba
            long r10 = r3 - r8
        Lba:
            r1.bytesRemaining = r10
            goto Lc1
        Lbd:
            long r3 = r7.length
            r1.bytesRemaining = r3
        Lc1:
            r1.opened = r2
            r16.transferStarted(r17)
            r1.skipFully(r8, r7)
            long r2 = r1.bytesRemaining
            return r2
        Lcc:
            r5 = 416(0x1a0, float:5.83E-43)
            if (r3 != r5) goto Leb
            java.lang.String r4 = getFirstHeader(r6, r4)
            long r12 = com.google.android.exoplayer2.upstream.HttpUtil.getDocumentSize(r4)
            long r14 = r7.position
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto Leb
            r1.opened = r2
            r16.transferStarted(r17)
            long r2 = r7.length
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto Lea
            r8 = r2
        Lea:
            return r8
        Leb:
            byte[] r2 = r16.readResponseBody()     // Catch: java.io.IOException -> Lf1
        Lef:
            r8 = r2
            goto Lf4
        Lf1:
            byte[] r2 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            goto Lef
        Lf4:
            if (r3 != r5) goto Lfe
            com.google.android.exoplayer2.upstream.DataSourceException r2 = new com.google.android.exoplayer2.upstream.DataSourceException
            r4 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r4)
            goto Lff
        Lfe:
            r2 = 0
        Lff:
            r5 = r2
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r9 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            java.lang.String r4 = r0.getHttpStatusText()
            r2 = r9
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8)
            throw r9
        L10d:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r2 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException     // Catch: java.lang.InterruptedException -> L11e
            java.net.SocketTimeoutException r3 = new java.net.SocketTimeoutException     // Catch: java.lang.InterruptedException -> L11e
            r3.<init>()     // Catch: java.lang.InterruptedException -> L11e
            r4 = 2002(0x7d2, float:2.805E-42)
            int r0 = getStatus(r0)     // Catch: java.lang.InterruptedException -> L11e
            r2.<init>(r3, r7, r4, r0)     // Catch: java.lang.InterruptedException -> L11e
            throw r2     // Catch: java.lang.InterruptedException -> L11e
        L11e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r0 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            r2.<init>()
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = -1
            r0.<init>(r2, r7, r3, r4)
            throw r0
        L133:
            r0 = move-exception
            boolean r2 = r0 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r2 == 0) goto L13b
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = (com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) r0
            throw r0
        L13b:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException r2 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource$OpenException
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 0
            r2.<init>(r0, r7, r3, r4)
            throw r2
    }

    public int read(java.nio.ByteBuffer r9) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r8 = this;
            boolean r0 = r8.opened
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            boolean r0 = r9.isDirect()
            if (r0 == 0) goto L6f
            boolean r0 = r9.hasRemaining()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            long r2 = r8.bytesRemaining
            r0 = -1
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            return r0
        L1d:
            int r2 = r9.remaining()
            java.nio.ByteBuffer r3 = r8.readBuffer
            r6 = -1
            if (r3 == 0) goto L3b
            int r3 = copyByteBuffer(r3, r9)
            if (r3 == 0) goto L3b
            long r0 = r8.bytesRemaining
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 == 0) goto L37
            long r4 = (long) r3
            long r0 = r0 - r4
            r8.bytesRemaining = r0
        L37:
            r8.bytesTransferred(r3)
            return r3
        L3b:
            com.google.android.exoplayer2.util.ConditionVariable r3 = r8.operation
            r3.close()
            com.google.android.exoplayer2.upstream.DataSpec r3 = r8.currentDataSpec
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            com.google.android.exoplayer2.upstream.DataSpec r3 = (com.google.android.exoplayer2.upstream.DataSpec) r3
            r8.readInternal(r9, r3)
            boolean r3 = r8.finished
            if (r3 == 0) goto L52
            r8.bytesRemaining = r4
            return r0
        L52:
            int r0 = r9.remaining()
            if (r2 <= r0) goto L59
            r1 = 1
        L59:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            int r9 = r9.remaining()
            int r2 = r2 - r9
            long r0 = r8.bytesRemaining
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 == 0) goto L6b
            long r3 = (long) r2
            long r0 = r0 - r3
            r8.bytesRemaining = r0
        L6b:
            r8.bytesTransferred(r2)
            return r2
        L6f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Passed buffer is not a direct ByteBuffer"
            r9.<init>(r0)
            throw r9
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r9, int r10, int r11) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r8 = this;
            boolean r0 = r8.opened
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r0 = 0
            if (r11 != 0) goto L9
            return r0
        L9:
            long r1 = r8.bytesRemaining
            r3 = -1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            return r3
        L13:
            java.nio.ByteBuffer r1 = r8.getOrCreateReadBuffer()
            boolean r2 = r1.hasRemaining()
            if (r2 != 0) goto L41
            com.google.android.exoplayer2.util.ConditionVariable r2 = r8.operation
            r2.close()
            r1.clear()
            com.google.android.exoplayer2.upstream.DataSpec r2 = r8.currentDataSpec
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            r8.readInternal(r1, r2)
            boolean r2 = r8.finished
            if (r2 == 0) goto L37
            r8.bytesRemaining = r4
            return r3
        L37:
            r1.flip()
            boolean r2 = r1.hasRemaining()
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
        L41:
            r2 = 3
            long[] r2 = new long[r2]
            long r3 = r8.bytesRemaining
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L4d
            goto L52
        L4d:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L52:
            r2[r0] = r3
            r0 = 1
            int r3 = r1.remaining()
            long r3 = (long) r3
            r2[r0] = r3
            r0 = 2
            long r3 = (long) r11
            r2[r0] = r3
            long r2 = com.google.common.primitives.Longs.min(r2)
            int r11 = (int) r2
            r1.get(r9, r10, r11)
            long r9 = r8.bytesRemaining
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L72
            long r0 = (long) r11
            long r9 = r9 - r0
            r8.bytesRemaining = r9
        L72:
            r8.bytesTransferred(r11)
            return r11
    }

    @java.lang.Deprecated
    public void setContentTypePredicate(@androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r1) {
            r0 = this;
            r0.contentTypePredicate = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.set(r2, r3)
            return
    }
}
