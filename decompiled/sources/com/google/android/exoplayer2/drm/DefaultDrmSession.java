package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(18)
class DefaultDrmSession implements com.google.android.exoplayer2.drm.DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final java.lang.String TAG = "DefaultDrmSession";
    private final com.google.android.exoplayer2.drm.MediaDrmCallback callback;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.CryptoConfig cryptoConfig;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest currentKeyRequest;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession.DrmSessionException lastException;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.drm.ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final android.os.Looper playbackLooper;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    private final com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager provisioningManager;
    private int referenceCount;
    private final com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener referenceCountListener;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DefaultDrmSession.RequestHandler requestHandler;

    @androidx.annotation.Nullable
    private android.os.HandlerThread requestHandlerThread;
    private final com.google.android.exoplayer2.drm.DefaultDrmSession.ResponseHandler responseHandler;

    @androidx.annotation.Nullable
    public final java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> schemeDatas;

    @androidx.annotation.Nullable
    private byte[] sessionId;
    private int state;
    private final java.util.UUID uuid;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(java.lang.Exception r1, boolean r2);

        void provisionRequired(com.google.android.exoplayer2.drm.DefaultDrmSession r1);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(com.google.android.exoplayer2.drm.DefaultDrmSession r1, int r2);

        void onReferenceCountIncremented(com.google.android.exoplayer2.drm.DefaultDrmSession r1, int r2);
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public class RequestHandler extends android.os.Handler {

        @androidx.annotation.GuardedBy("this")
        private boolean isReleased;
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSession this$0;

        public RequestHandler(com.google.android.exoplayer2.drm.DefaultDrmSession r1, android.os.Looper r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        private boolean maybeRetryRequest(android.os.Message r22, com.google.android.exoplayer2.drm.MediaDrmCallbackException r23) {
                r21 = this;
                r1 = r21
                r0 = r22
                r2 = r23
                java.lang.Object r3 = r0.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$RequestTask r3 = (com.google.android.exoplayer2.drm.DefaultDrmSession.RequestTask) r3
                boolean r4 = r3.allowRetry
                r5 = 0
                if (r4 != 0) goto L10
                return r5
            L10:
                int r4 = r3.errorCount
                r6 = 1
                int r4 = r4 + r6
                r3.errorCount = r4
                com.google.android.exoplayer2.drm.DefaultDrmSession r7 = r1.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$400(r7)
                r8 = 3
                int r7 = r7.getMinimumLoadableRetryCount(r8)
                if (r4 <= r7) goto L24
                return r5
            L24:
                com.google.android.exoplayer2.source.LoadEventInfo r4 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r10 = r3.taskId
                com.google.android.exoplayer2.upstream.DataSpec r12 = r2.dataSpec
                android.net.Uri r13 = r2.uriAfterRedirects
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14 = r2.responseHeaders
                long r15 = android.os.SystemClock.elapsedRealtime()
                long r17 = android.os.SystemClock.elapsedRealtime()
                long r6 = r3.startTimeMs
                long r17 = r17 - r6
                long r6 = r2.bytesLoaded
                r9 = r4
                r19 = r6
                r9.<init>(r10, r12, r13, r14, r15, r17, r19)
                com.google.android.exoplayer2.source.MediaLoadData r6 = new com.google.android.exoplayer2.source.MediaLoadData
                r6.<init>(r8)
                java.lang.Throwable r7 = r23.getCause()
                boolean r7 = r7 instanceof java.io.IOException
                if (r7 == 0) goto L56
                java.lang.Throwable r2 = r23.getCause()
                java.io.IOException r2 = (java.io.IOException) r2
                goto L60
            L56:
                com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException r7 = new com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
                java.lang.Throwable r2 = r23.getCause()
                r7.<init>(r2)
                r2 = r7
            L60:
                com.google.android.exoplayer2.drm.DefaultDrmSession r7 = r1.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$400(r7)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r8 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
                int r3 = r3.errorCount
                r8.<init>(r4, r6, r2, r3)
                long r2 = r7.getRetryDelayMsFor(r8)
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 != 0) goto L7b
                return r5
            L7b:
                monitor-enter(r21)
                boolean r4 = r1.isReleased     // Catch: java.lang.Throwable -> L8c
                if (r4 != 0) goto L8a
                android.os.Message r0 = android.os.Message.obtain(r22)     // Catch: java.lang.Throwable -> L8c
                r1.sendMessageDelayed(r0, r2)     // Catch: java.lang.Throwable -> L8c
                monitor-exit(r21)     // Catch: java.lang.Throwable -> L8c
                r0 = 1
                return r0
            L8a:
                monitor-exit(r21)     // Catch: java.lang.Throwable -> L8c
                return r5
            L8c:
                r0 = move-exception
                monitor-exit(r21)     // Catch: java.lang.Throwable -> L8c
                throw r0
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r6) {
                r5 = this;
                java.lang.Object r0 = r6.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$RequestTask r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.RequestTask) r0
                int r1 = r6.what     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                if (r1 == 0) goto L26
                r2 = 1
                if (r1 != r2) goto L20
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = r5.this$0     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.MediaDrmCallback r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$300(r1)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = r5.this$0     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                java.util.UUID r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$200(r2)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                java.lang.Object r3 = r0.request     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r3 = (com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest) r3     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                byte[] r1 = r1.executeKeyRequest(r2, r3)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                goto L4c
            L20:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                r1.<init>()     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                throw r1     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
            L26:
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = r5.this$0     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.MediaDrmCallback r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$300(r1)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = r5.this$0     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                java.util.UUID r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$200(r2)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                java.lang.Object r3 = r0.request     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest r3 = (com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest) r3     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                byte[] r1 = r1.executeProvisionRequest(r2, r3)     // Catch: java.lang.Exception -> L3b com.google.android.exoplayer2.drm.MediaDrmCallbackException -> L44
                goto L4c
            L3b:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                com.google.android.exoplayer2.util.Log.w(r2, r3, r1)
                goto L4c
            L44:
                r1 = move-exception
                boolean r2 = r5.maybeRetryRequest(r6, r1)
                if (r2 == 0) goto L4c
                return
            L4c:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = r5.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$400(r2)
                long r3 = r0.taskId
                r2.onLoadTaskConcluded(r3)
                monitor-enter(r5)
                boolean r2 = r5.isReleased     // Catch: java.lang.Throwable -> L73
                if (r2 != 0) goto L71
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = r5.this$0     // Catch: java.lang.Throwable -> L73
                com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.access$500(r2)     // Catch: java.lang.Throwable -> L73
                int r6 = r6.what     // Catch: java.lang.Throwable -> L73
                java.lang.Object r0 = r0.request     // Catch: java.lang.Throwable -> L73
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: java.lang.Throwable -> L73
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch: java.lang.Throwable -> L73
                r6.sendToTarget()     // Catch: java.lang.Throwable -> L73
            L71:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
                return
            L73:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
                throw r6
        }

        public final void post(int r9, java.lang.Object r10, boolean r11) {
                r8 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSession$RequestTask r7 = new com.google.android.exoplayer2.drm.DefaultDrmSession$RequestTask
                long r1 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
                long r4 = android.os.SystemClock.elapsedRealtime()
                r0 = r7
                r3 = r11
                r6 = r10
                r0.<init>(r1, r3, r4, r6)
                android.os.Message r9 = r8.obtainMessage(r9, r7)
                r9.sendToTarget()
                return
        }

        public synchronized void release() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> La
                r0 = 1
                r1.isReleased = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return
            La:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }
    }

    public static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final java.lang.Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long r1, boolean r3, long r4, java.lang.Object r6) {
                r0 = this;
                r0.<init>()
                r0.taskId = r1
                r0.allowRetry = r3
                r0.startTimeMs = r4
                r0.request = r6
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @android.annotation.SuppressLint({"HandlerLeak"})
    public class ResponseHandler extends android.os.Handler {
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSession this$0;

        public ResponseHandler(com.google.android.exoplayer2.drm.DefaultDrmSession r1, android.os.Looper r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                java.lang.Object r0 = r4.obj
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r1 = r0.first
                java.lang.Object r0 = r0.second
                int r4 = r4.what
                if (r4 == 0) goto L16
                r2 = 1
                if (r4 == r2) goto L10
                goto L1b
            L10:
                com.google.android.exoplayer2.drm.DefaultDrmSession r4 = r3.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSession.access$100(r4, r1, r0)
                goto L1b
            L16:
                com.google.android.exoplayer2.drm.DefaultDrmSession r4 = r3.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSession.access$000(r4, r1, r0)
            L1b:
                return
        }
    }

    public static final class UnexpectedDrmSessionException extends java.io.IOException {
        public UnexpectedDrmSessionException(@androidx.annotation.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$0hCnRa6YHjaCNNZgu2TzChKNNEQ(java.lang.Exception r0, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            lambda$onError$1(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$DxYpyadwFcAWqoX__uGLq-0ZR2E, reason: not valid java name */
    public static /* synthetic */ void m214$r8$lambda$DxYpyadwFcAWqoX__uGLq0ZR2E(int r0, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            lambda$openInternal$0(r0, r1)
            return
    }

    public DefaultDrmSession(java.util.UUID r2, com.google.android.exoplayer2.drm.ExoMediaDrm r3, com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager r4, com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener r5, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r6, int r7, boolean r8, boolean r9, @androidx.annotation.Nullable byte[] r10, java.util.HashMap<java.lang.String, java.lang.String> r11, com.google.android.exoplayer2.drm.MediaDrmCallback r12, android.os.Looper r13, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r14, com.google.android.exoplayer2.analytics.PlayerId r15) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r7 == r0) goto L9
            r0 = 3
            if (r7 != r0) goto Lc
        L9:
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
        Lc:
            r1.uuid = r2
            r1.provisioningManager = r4
            r1.referenceCountListener = r5
            r1.mediaDrm = r3
            r1.mode = r7
            r1.playClearSamplesWithoutKeys = r8
            r1.isPlaceholderSession = r9
            if (r10 == 0) goto L22
            r1.offlineLicenseKeySetId = r10
            r2 = 0
            r1.schemeDatas = r2
            goto L2e
        L22:
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.schemeDatas = r2
        L2e:
            r1.keyRequestParameters = r11
            r1.callback = r12
            com.google.android.exoplayer2.util.CopyOnWriteMultiset r2 = new com.google.android.exoplayer2.util.CopyOnWriteMultiset
            r2.<init>()
            r1.eventDispatchers = r2
            r1.loadErrorHandlingPolicy = r14
            r1.playerId = r15
            r2 = 2
            r1.state = r2
            r1.playbackLooper = r13
            com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler r2 = new com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler
            r2.<init>(r1, r13)
            r1.responseHandler = r2
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.drm.DefaultDrmSession r0, java.lang.Object r1, java.lang.Object r2) {
            r0.onProvisionResponse(r1, r2)
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.drm.DefaultDrmSession r0, java.lang.Object r1, java.lang.Object r2) {
            r0.onKeyResponse(r1, r2)
            return
    }

    public static /* synthetic */ java.util.UUID access$200(com.google.android.exoplayer2.drm.DefaultDrmSession r0) {
            java.util.UUID r0 = r0.uuid
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.MediaDrmCallback access$300(com.google.android.exoplayer2.drm.DefaultDrmSession r0) {
            com.google.android.exoplayer2.drm.MediaDrmCallback r0 = r0.callback
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy access$400(com.google.android.exoplayer2.drm.DefaultDrmSession r0) {
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = r0.loadErrorHandlingPolicy
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSession.ResponseHandler access$500(com.google.android.exoplayer2.drm.DefaultDrmSession r0) {
            com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler r0 = r0.responseHandler
            return r0
    }

    private void dispatchEvent(com.google.android.exoplayer2.util.Consumer<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher> r3) {
            r2 = this;
            com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher> r0 = r2.eventDispatchers
            java.util.Set r0 = r0.elementSet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) r1
            r3.accept(r1)
            goto La
        L1a:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    private void doLicense(boolean r9) {
            r8 = this;
            boolean r0 = r8.isPlaceholderSession
            if (r0 == 0) goto L5
            return
        L5:
            byte[] r0 = r8.sessionId
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            byte[] r0 = (byte[]) r0
            int r1 = r8.mode
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L3a
            if (r1 == r3) goto L2c
            r0 = 3
            if (r1 == r0) goto L1c
            goto L8b
        L1c:
            byte[] r1 = r8.offlineLicenseKeySetId
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            byte[] r1 = r8.sessionId
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            byte[] r1 = r8.offlineLicenseKeySetId
            r8.postKeyRequest(r1, r0, r9)
            goto L8b
        L2c:
            byte[] r1 = r8.offlineLicenseKeySetId
            if (r1 == 0) goto L36
            boolean r1 = r8.restoreKeys()
            if (r1 == 0) goto L8b
        L36:
            r8.postKeyRequest(r0, r3, r9)
            goto L8b
        L3a:
            byte[] r1 = r8.offlineLicenseKeySetId
            if (r1 != 0) goto L42
            r8.postKeyRequest(r0, r2, r9)
            goto L8b
        L42:
            int r1 = r8.state
            r2 = 4
            if (r1 == r2) goto L4d
            boolean r1 = r8.restoreKeys()
            if (r1 == 0) goto L8b
        L4d:
            long r4 = r8.getLicenseDurationRemainingSec()
            int r1 = r8.mode
            if (r1 != 0) goto L75
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Offline license has expired or will expire soon. Remaining seconds: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DefaultDrmSession"
            com.google.android.exoplayer2.util.Log.d(r2, r1)
            r8.postKeyRequest(r0, r3, r9)
            goto L8b
        L75:
            r0 = 0
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 > 0) goto L84
            com.google.android.exoplayer2.drm.KeysExpiredException r9 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r9.<init>()
            r8.onError(r9, r3)
            goto L8b
        L84:
            r8.state = r2
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r9 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$24
            r8.dispatchEvent(r9)
        L8b:
            return
    }

    private long getLicenseDurationRemainingSec() {
            r5 = this;
            java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            java.util.UUID r1 = r5.uuid
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L10:
            android.util.Pair r0 = com.google.android.exoplayer2.drm.WidevineUtil.getLicenseDurationRemainingSec(r5)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r0 = java.lang.Math.min(r1, r3)
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
            r2 = this;
            int r0 = r2.state
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private static /* synthetic */ void lambda$onError$1(java.lang.Exception r0, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            r1.drmSessionManagerError(r0)
            return
    }

    private static /* synthetic */ void lambda$openInternal$0(int r0, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            r1.drmSessionAcquired(r0)
            return
    }

    private void onError(java.lang.Exception r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = new com.google.android.exoplayer2.drm.DrmSession$DrmSessionException
            int r3 = com.google.android.exoplayer2.drm.DrmUtil.getErrorCodeForMediaDrmException(r2, r3)
            r0.<init>(r2, r3)
            r1.lastException = r0
            java.lang.String r3 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            com.google.android.exoplayer2.util.Log.e(r3, r0, r2)
            com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda1
            r3.<init>(r2)
            r1.dispatchEvent(r3)
            int r2 = r1.state
            r3 = 4
            if (r2 == r3) goto L22
            r2 = 1
            r1.state = r2
        L22:
            return
    }

    private void onKeyResponse(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r0 = r1.currentKeyRequest
            if (r2 != r0) goto L5b
            boolean r2 = r1.isOpen()
            if (r2 != 0) goto Lb
            goto L5b
        Lb:
            r2 = 0
            r1.currentKeyRequest = r2
            boolean r2 = r3 instanceof java.lang.Exception
            if (r2 == 0) goto L19
            java.lang.Exception r3 = (java.lang.Exception) r3
            r2 = 0
            r1.onKeysError(r3, r2)
            return
        L19:
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> L56
            int r2 = r1.mode     // Catch: java.lang.Exception -> L56
            r0 = 3
            if (r2 != r0) goto L33
            com.google.android.exoplayer2.drm.ExoMediaDrm r2 = r1.mediaDrm     // Catch: java.lang.Exception -> L56
            byte[] r0 = r1.offlineLicenseKeySetId     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.lang.Exception -> L56
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L56
            r2.provideKeyResponse(r0, r3)     // Catch: java.lang.Exception -> L56
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r2 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$22     // Catch: java.lang.Exception -> L56
            r1.dispatchEvent(r2)     // Catch: java.lang.Exception -> L56
            goto L5b
        L33:
            com.google.android.exoplayer2.drm.ExoMediaDrm r2 = r1.mediaDrm     // Catch: java.lang.Exception -> L56
            byte[] r0 = r1.sessionId     // Catch: java.lang.Exception -> L56
            byte[] r2 = r2.provideKeyResponse(r0, r3)     // Catch: java.lang.Exception -> L56
            int r3 = r1.mode     // Catch: java.lang.Exception -> L56
            r0 = 2
            if (r3 == r0) goto L46
            if (r3 != 0) goto L4d
            byte[] r3 = r1.offlineLicenseKeySetId     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L4d
        L46:
            if (r2 == 0) goto L4d
            int r3 = r2.length     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L4d
            r1.offlineLicenseKeySetId = r2     // Catch: java.lang.Exception -> L56
        L4d:
            r2 = 4
            r1.state = r2     // Catch: java.lang.Exception -> L56
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r2 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$23     // Catch: java.lang.Exception -> L56
            r1.dispatchEvent(r2)     // Catch: java.lang.Exception -> L56
            goto L5b
        L56:
            r2 = move-exception
            r3 = 1
            r1.onKeysError(r2, r3)
        L5b:
            return
    }

    private void onKeysError(java.lang.Exception r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof android.media.NotProvisionedException
            if (r0 == 0) goto La
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r2 = r1.provisioningManager
            r2.provisionRequired(r1)
            goto L12
        La:
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 2
        Lf:
            r1.onError(r2, r3)
        L12:
            return
    }

    private void onKeysRequired() {
            r2 = this;
            int r0 = r2.mode
            if (r0 != 0) goto L12
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L12
            byte[] r0 = r2.sessionId
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            r0 = 0
            r2.doLicense(r0)
        L12:
            return
    }

    private void onProvisionResponse(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest r0 = r1.currentProvisionRequest
            if (r2 != r0) goto L34
            int r2 = r1.state
            r0 = 2
            if (r2 == r0) goto L10
            boolean r2 = r1.isOpen()
            if (r2 != 0) goto L10
            goto L34
        L10:
            r2 = 0
            r1.currentProvisionRequest = r2
            boolean r2 = r3 instanceof java.lang.Exception
            if (r2 == 0) goto L20
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r2 = r1.provisioningManager
            java.lang.Exception r3 = (java.lang.Exception) r3
            r0 = 0
            r2.onProvisionError(r3, r0)
            return
        L20:
            com.google.android.exoplayer2.drm.ExoMediaDrm r2 = r1.mediaDrm     // Catch: java.lang.Exception -> L2d
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> L2d
            r2.provideProvisionResponse(r3)     // Catch: java.lang.Exception -> L2d
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r2 = r1.provisioningManager
            r2.onProvisionCompleted()
            return
        L2d:
            r2 = move-exception
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r3 = r1.provisioningManager
            r0 = 1
            r3.onProvisionError(r2, r0)
        L34:
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean openInternal() {
            r4 = this;
            boolean r0 = r4.isOpen()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r4.mediaDrm     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            byte[] r0 = r0.openSession()     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r4.sessionId = r0     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.drm.ExoMediaDrm r2 = r4.mediaDrm     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.analytics.PlayerId r3 = r4.playerId     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r2.setPlayerIdForSession(r0, r3)     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r4.mediaDrm     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            byte[] r2 = r4.sessionId     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.decoder.CryptoConfig r0 = r0.createCryptoConfig(r2)     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r4.cryptoConfig = r0     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r0 = 3
            r4.state = r0     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r0.<init>()     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            r4.dispatchEvent(r0)     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            byte[] r0 = r4.sessionId     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Exception -> L32 android.media.NotProvisionedException -> L37
            return r1
        L32:
            r0 = move-exception
            r4.onError(r0, r1)
            goto L3c
        L37:
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r0 = r4.provisioningManager
            r0.provisionRequired(r4)
        L3c:
            r0 = 0
            return r0
    }

    private void postKeyRequest(byte[] r5, int r6, boolean r7) {
            r4 = this;
            r0 = 1
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r4.mediaDrm     // Catch: java.lang.Exception -> L1f
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData$SchemeData> r2 = r4.schemeDatas     // Catch: java.lang.Exception -> L1f
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r4.keyRequestParameters     // Catch: java.lang.Exception -> L1f
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r5 = r1.getKeyRequest(r5, r2, r6, r3)     // Catch: java.lang.Exception -> L1f
            r4.currentKeyRequest = r5     // Catch: java.lang.Exception -> L1f
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r5 = r4.requestHandler     // Catch: java.lang.Exception -> L1f
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)     // Catch: java.lang.Exception -> L1f
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r5 = (com.google.android.exoplayer2.drm.DefaultDrmSession.RequestHandler) r5     // Catch: java.lang.Exception -> L1f
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r6 = r4.currentKeyRequest     // Catch: java.lang.Exception -> L1f
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.Exception -> L1f
            r5.post(r0, r6, r7)     // Catch: java.lang.Exception -> L1f
            goto L23
        L1f:
            r5 = move-exception
            r4.onKeysError(r5, r0)
        L23:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
            r4 = this;
            r0 = 1
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r4.mediaDrm     // Catch: java.lang.Exception -> Lb
            byte[] r2 = r4.sessionId     // Catch: java.lang.Exception -> Lb
            byte[] r3 = r4.offlineLicenseKeySetId     // Catch: java.lang.Exception -> Lb
            r1.restoreKeys(r2, r3)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r1 = move-exception
            r4.onError(r1, r0)
            r0 = 0
            return r0
    }

    private void verifyPlaybackThread() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = r3.playbackLooper
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L3d
            java.lang.String r0 = "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "\nExpected thread: "
            r0.append(r1)
            android.os.Looper r1 = r3.playbackLooper
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            java.lang.String r2 = "DefaultDrmSession"
            com.google.android.exoplayer2.util.Log.w(r2, r0, r1)
        L3d:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
            r3 = this;
            r3.verifyPlaybackThread()
            int r0 = r3.referenceCount
            r1 = 0
            if (r0 >= 0) goto L1e
            java.lang.String r0 = "Session reference count less than zero: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r2 = r3.referenceCount
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "DefaultDrmSession"
            com.google.android.exoplayer2.util.Log.e(r2, r0)
            r3.referenceCount = r1
        L1e:
            if (r4 == 0) goto L25
            com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher> r0 = r3.eventDispatchers
            r0.add(r4)
        L25:
            int r0 = r3.referenceCount
            r2 = 1
            int r0 = r0 + r2
            r3.referenceCount = r0
            if (r0 != r2) goto L59
            int r4 = r3.state
            r0 = 2
            if (r4 != r0) goto L33
            r1 = 1
        L33:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            android.os.HandlerThread r4 = new android.os.HandlerThread
            java.lang.String r0 = "ExoPlayer:DrmRequestHandler"
            r4.<init>(r0)
            r3.requestHandlerThread = r4
            r4.start()
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r4 = new com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler
            android.os.HandlerThread r0 = r3.requestHandlerThread
            android.os.Looper r0 = r0.getLooper()
            r4.<init>(r3, r0)
            r3.requestHandler = r4
            boolean r4 = r3.openInternal()
            if (r4 == 0) goto L6e
            r3.doLicense(r2)
            goto L6e
        L59:
            if (r4 == 0) goto L6e
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L6e
            com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher> r0 = r3.eventDispatchers
            int r0 = r0.count(r4)
            if (r0 != r2) goto L6e
            int r0 = r3.state
            r4.drmSessionAcquired(r0)
        L6e:
            com.google.android.exoplayer2.drm.DefaultDrmSession$ReferenceCountListener r4 = r3.referenceCountListener
            int r0 = r3.referenceCount
            r4.onReferenceCountIncremented(r3, r0)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.decoder.CryptoConfig getCryptoConfig() {
            r1 = this;
            r1.verifyPlaybackThread()
            com.google.android.exoplayer2.decoder.CryptoConfig r0 = r1.cryptoConfig
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.drm.DrmSession.DrmSessionException getError() {
            r2 = this;
            r2.verifyPlaybackThread()
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Lb
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r2.lastException
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public byte[] getOfflineLicenseKeySetId() {
            r1 = this;
            r1.verifyPlaybackThread()
            byte[] r0 = r1.offlineLicenseKeySetId
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
            r1 = this;
            r1.verifyPlaybackThread()
            java.util.UUID r0 = r1.uuid
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
            r1 = this;
            r1.verifyPlaybackThread()
            int r0 = r1.state
            return r0
    }

    public boolean hasSessionId(byte[] r2) {
            r1 = this;
            r1.verifyPlaybackThread()
            byte[] r0 = r1.sessionId
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    public void onMediaDrmEvent(int r2) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L4
            goto L7
        L4:
            r1.onKeysRequired()
        L7:
            return
    }

    public void onProvisionCompleted() {
            r1 = this;
            boolean r0 = r1.openInternal()
            if (r0 == 0) goto La
            r0 = 1
            r1.doLicense(r0)
        La:
            return
    }

    public void onProvisionError(java.lang.Exception r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 3
        L5:
            r0.onError(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
            r1 = this;
            r1.verifyPlaybackThread()
            boolean r0 = r1.playClearSamplesWithoutKeys
            return r0
    }

    public void provision() {
            r4 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r4.mediaDrm
            com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest r0 = r0.getProvisionRequest()
            r4.currentProvisionRequest = r0
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r0 = r4.requestHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.RequestHandler) r0
            com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest r1 = r4.currentProvisionRequest
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            r2 = 0
            r3 = 1
            r0.post(r2, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
            r2 = this;
            r2.verifyPlaybackThread()
            byte[] r0 = r2.sessionId
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r2.mediaDrm
            java.util.Map r0 = r1.queryKeyStatus(r0)
        Lf:
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
            r3 = this;
            r3.verifyPlaybackThread()
            int r0 = r3.referenceCount
            if (r0 > 0) goto L10
            java.lang.String r4 = "DefaultDrmSession"
            java.lang.String r0 = "release() called on a session that's already fully released."
            com.google.android.exoplayer2.util.Log.e(r4, r0)
            return
        L10:
            int r0 = r0 + (-1)
            r3.referenceCount = r0
            if (r0 != 0) goto L52
            r0 = 0
            r3.state = r0
            com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler r0 = r3.responseHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.drm.DefaultDrmSession$ResponseHandler r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.ResponseHandler) r0
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r0 = r3.requestHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.drm.DefaultDrmSession$RequestHandler r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.RequestHandler) r0
            r0.release()
            r3.requestHandler = r1
            android.os.HandlerThread r0 = r3.requestHandlerThread
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            android.os.HandlerThread r0 = (android.os.HandlerThread) r0
            r0.quit()
            r3.requestHandlerThread = r1
            r3.cryptoConfig = r1
            r3.lastException = r1
            r3.currentKeyRequest = r1
            r3.currentProvisionRequest = r1
            byte[] r0 = r3.sessionId
            if (r0 == 0) goto L52
            com.google.android.exoplayer2.drm.ExoMediaDrm r2 = r3.mediaDrm
            r2.closeSession(r0)
            r3.sessionId = r1
        L52:
            if (r4 == 0) goto L64
            com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher> r0 = r3.eventDispatchers
            r0.remove(r4)
            com.google.android.exoplayer2.util.CopyOnWriteMultiset<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher> r0 = r3.eventDispatchers
            int r0 = r0.count(r4)
            if (r0 != 0) goto L64
            r4.drmSessionReleased()
        L64:
            com.google.android.exoplayer2.drm.DefaultDrmSession$ReferenceCountListener r4 = r3.referenceCountListener
            int r0 = r3.referenceCount
            r4.onReferenceCountDecremented(r3, r0)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String r3) {
            r2 = this;
            r2.verifyPlaybackThread()
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r2.mediaDrm
            byte[] r1 = r2.sessionId
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r1)
            byte[] r1 = (byte[]) r1
            boolean r3 = r0.requiresSecureDecoder(r1, r3)
            return r3
    }
}
