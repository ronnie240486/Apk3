package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(18)
public final class OfflineLicenseHelper {
    private static final com.google.android.exoplayer2.Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = null;
    private final android.os.ConditionVariable drmListenerConditionVariable;
    private final com.google.android.exoplayer2.drm.DefaultDrmSessionManager drmSessionManager;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;


    public static /* synthetic */ void $r8$lambda$GI1qtYid0ijH2oDm9pV_gzBStgY(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0, int r1, byte[] r2, com.google.common.util.concurrent.SettableFuture r3, com.google.android.exoplayer2.Format r4) {
            r0.lambda$acquireFirstSessionOnHandlerThread$2(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$Vn8jFPITYTK2gV4GrUT_kfq12Mw(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0, com.google.common.util.concurrent.SettableFuture r1) {
            r0.lambda$releaseManagerOnHandlerThread$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZnFp2cUGcwBwPVBI2TnIm24hHz0(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0, com.google.common.util.concurrent.SettableFuture r1, com.google.android.exoplayer2.drm.DrmSession r2) {
            r0.lambda$getLicenseDurationRemainingSec$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$_hPRVFtGW9A7R527QGC5QQRIxEU(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0, com.google.android.exoplayer2.drm.DrmSession r1, com.google.common.util.concurrent.SettableFuture r2) {
            r0.lambda$acquireFirstSessionOnHandlerThread$3(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$o7YaSaM7X-2dWltFphZGw8NzvZ8, reason: not valid java name */
    public static /* synthetic */ void m221$r8$lambda$o7YaSaM7X2dWltFphZGw8NzvZ8(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0, com.google.common.util.concurrent.SettableFuture r1, com.google.android.exoplayer2.drm.DrmSession r2) {
            r0.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(r1, r2)
            return
    }

    static {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            r2 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r2]
            r1.<init>(r2)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setDrmInitData(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.drm.OfflineLicenseHelper.FORMAT_WITH_EMPTY_DRM_INIT_DATA = r0
            return
    }

    public OfflineLicenseHelper(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r3, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
            r2 = this;
            r2.<init>()
            r2.drmSessionManager = r3
            r2.eventDispatcher = r4
            android.os.HandlerThread r3 = new android.os.HandlerThread
            java.lang.String r0 = "ExoPlayer:OfflineLicenseHelper"
            r3.<init>(r0)
            r2.handlerThread = r3
            r3.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r3.getLooper()
            r0.<init>(r1)
            r2.handler = r0
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            r2.drmListenerConditionVariable = r0
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$1 r0 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$1
            r0.<init>(r2)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = r3.getLooper()
            r1.<init>(r3)
            r4.addEventListener(r1, r0)
            return
    }

    @java.lang.Deprecated
    public OfflineLicenseHelper(java.util.UUID r2, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider r3, com.google.android.exoplayer2.drm.MediaDrmCallback r4, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r6) {
            r1 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder
            r0.<init>()
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r2 = r0.setUuidAndExoMediaDrmProvider(r2, r3)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r2 = r2.setKeyRequestParameters(r5)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r2 = r2.build(r4)
            r1.<init>(r2, r6)
            return
    }

    public static /* synthetic */ android.os.ConditionVariable access$000(com.google.android.exoplayer2.drm.OfflineLicenseHelper r0) {
            android.os.ConditionVariable r0 = r0.drmListenerConditionVariable
            return r0
    }

    private com.google.android.exoplayer2.drm.DrmSession acquireFirstSessionOnHandlerThread(int r10, @androidx.annotation.Nullable byte[] r11, com.google.android.exoplayer2.Format r12) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r9 = this;
            com.google.android.exoplayer2.drm.DrmInitData r0 = r12.drmInitData
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
            android.os.ConditionVariable r1 = r9.drmListenerConditionVariable
            r1.close()
            android.os.Handler r7 = r9.handler
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda2 r8 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r0
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.post(r8)
            java.lang.Object r10 = r0.get()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4c
            com.google.android.exoplayer2.drm.DrmSession r10 = (com.google.android.exoplayer2.drm.DrmSession) r10     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4c
            android.os.ConditionVariable r11 = r9.drmListenerConditionVariable
            r11.block()
            com.google.common.util.concurrent.SettableFuture r11 = com.google.common.util.concurrent.SettableFuture.create()
            android.os.Handler r12 = r9.handler
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0
            r0.<init>(r9, r10, r11)
            r12.post(r0)
            java.lang.Object r11 = r11.get()     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L43
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r11 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r11     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L43
            if (r11 != 0) goto L40
            return r10
        L40:
            throw r11     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L43
        L41:
            r10 = move-exception
            goto L44
        L43:
            r10 = move-exception
        L44:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r10)
            throw r11
        L4a:
            r10 = move-exception
            goto L4d
        L4c:
            r10 = move-exception
        L4d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r10)
            throw r11
    }

    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int r3, @androidx.annotation.Nullable byte[] r4, com.google.android.exoplayer2.Format r5) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r2 = this;
            com.google.android.exoplayer2.drm.DrmSession r3 = r2.acquireFirstSessionOnHandlerThread(r3, r4, r5)
            com.google.common.util.concurrent.SettableFuture r4 = com.google.common.util.concurrent.SettableFuture.create()
            android.os.Handler r5 = r2.handler
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r4, r3, r1)
            r5.post(r0)
            java.lang.Object r3 = r4.get()     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.ExecutionException -> L27
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.ExecutionException -> L27
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.ExecutionException -> L27
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.ExecutionException -> L27
            r2.releaseManagerOnHandlerThread()
            return r3
        L23:
            r3 = move-exception
            goto L2e
        L25:
            r3 = move-exception
            goto L28
        L27:
            r3 = move-exception
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L2e:
            r2.releaseManagerOnHandlerThread()
            throw r3
    }

    private /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$2(int r4, byte[] r5, com.google.common.util.concurrent.SettableFuture r6, com.google.android.exoplayer2.Format r7) {
            r3 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L34
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L34
            android.os.Looper r1 = (android.os.Looper) r1     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.analytics.PlayerId r2 = com.google.android.exoplayer2.analytics.PlayerId.UNSET     // Catch: java.lang.Throwable -> L34
            r0.setPlayer(r1, r2)     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L34
            r0.prepare()     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L2d
            r0.setMode(r4, r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r4 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L2d
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r5 = r3.eventDispatcher     // Catch: java.lang.Throwable -> L2d
            com.google.android.exoplayer2.drm.DrmSession r4 = r4.acquireSession(r5, r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L2d
            com.google.android.exoplayer2.drm.DrmSession r4 = (com.google.android.exoplayer2.drm.DrmSession) r4     // Catch: java.lang.Throwable -> L2d
            r6.set(r4)     // Catch: java.lang.Throwable -> L2d
            goto L38
        L2d:
            r4 = move-exception
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r5 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L34
            r5.release()     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L34:
            r4 = move-exception
            r6.setException(r4)
        L38:
            return
    }

    private /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(com.google.android.exoplayer2.drm.DrmSession r4, com.google.common.util.concurrent.SettableFuture r5) {
            r3 = this;
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r4.getError()     // Catch: java.lang.Throwable -> L19
            int r1 = r4.getState()     // Catch: java.lang.Throwable -> L19
            r2 = 1
            if (r1 != r2) goto L15
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r3.eventDispatcher     // Catch: java.lang.Throwable -> L19
            r4.release(r1)     // Catch: java.lang.Throwable -> L19
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1 = r3.drmSessionManager     // Catch: java.lang.Throwable -> L19
            r1.release()     // Catch: java.lang.Throwable -> L19
        L15:
            r5.set(r0)     // Catch: java.lang.Throwable -> L19
            goto L27
        L19:
            r0 = move-exception
            r5.setException(r0)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r5 = r3.eventDispatcher
            r4.release(r5)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r4 = r3.drmSessionManager
            r4.release()
        L27:
            return
    }

    private /* synthetic */ void lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(com.google.common.util.concurrent.SettableFuture r2, com.google.android.exoplayer2.drm.DrmSession r3) {
            r1 = this;
            byte[] r0 = r3.getOfflineLicenseKeySetId()     // Catch: java.lang.Throwable -> Ld
            r2.set(r0)     // Catch: java.lang.Throwable -> Ld
        L7:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.eventDispatcher
            r3.release(r2)
            goto L12
        Ld:
            r0 = move-exception
            r2.setException(r0)     // Catch: java.lang.Throwable -> L13
            goto L7
        L12:
            return
        L13:
            r2 = move-exception
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r1.eventDispatcher
            r3.release(r0)
            throw r2
    }

    private /* synthetic */ void lambda$getLicenseDurationRemainingSec$0(com.google.common.util.concurrent.SettableFuture r2, com.google.android.exoplayer2.drm.DrmSession r3) {
            r1 = this;
            android.util.Pair r0 = com.google.android.exoplayer2.drm.WidevineUtil.getLicenseDurationRemainingSec(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Le
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> Le
            r2.set(r0)     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r0 = move-exception
            r2.setException(r0)     // Catch: java.lang.Throwable -> L18
        L12:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.eventDispatcher
            r3.release(r2)
            return
        L18:
            r2 = move-exception
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r1.eventDispatcher
            r3.release(r0)
            throw r2
    }

    private /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(com.google.common.util.concurrent.SettableFuture r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r1.drmSessionManager     // Catch: java.lang.Throwable -> La
            r0.release()     // Catch: java.lang.Throwable -> La
            r0 = 0
            r2.set(r0)     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r0 = move-exception
            r2.setException(r0)
        Le:
            return
    }

    public static com.google.android.exoplayer2.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3) {
            r0 = 0
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r1 = newWidevineInstance(r1, r0, r2, r3)
            return r1
    }

    public static com.google.android.exoplayer2.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String r1, boolean r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
            r0 = 0
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r1 = newWidevineInstance(r1, r2, r3, r0, r4)
            return r1
    }

    public static com.google.android.exoplayer2.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String r2, boolean r3, com.google.android.exoplayer2.upstream.DataSource.Factory r4, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r6) {
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r0 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r1 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder
            r1.<init>()
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r5 = r1.setKeyRequestParameters(r5)
            com.google.android.exoplayer2.drm.HttpMediaDrmCallback r1 = new com.google.android.exoplayer2.drm.HttpMediaDrmCallback
            r1.<init>(r2, r3, r4)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r2 = r5.build(r1)
            r0.<init>(r2, r6)
            return r0
    }

    private void releaseManagerOnHandlerThread() {
            r4 = this;
            com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
            android.os.Handler r1 = r4.handler
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1
            r3 = 0
            r2.<init>(r4, r0, r3)
            r1.post(r2)
            r0.get()     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            return
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    public synchronized byte[] downloadLicense(com.google.android.exoplayer2.Format r3) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.exoplayer2.drm.DrmInitData r0 = r3.drmInitData     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)     // Catch: java.lang.Throwable -> L13
            r0 = 2
            r1 = 0
            byte[] r3 = r2.acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(r0, r1, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized android.util.Pair<java.lang.Long, java.lang.Long> getLicenseDurationRemainingSec(byte[] r5) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r4 = this;
            monitor-enter(r4)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L4e
            r0 = 1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.drm.OfflineLicenseHelper.FORMAT_WITH_EMPTY_DRM_INIT_DATA     // Catch: com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L34 java.lang.Throwable -> L4e
            com.google.android.exoplayer2.drm.DrmSession r5 = r4.acquireFirstSessionOnHandlerThread(r0, r5, r1)     // Catch: com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L34 java.lang.Throwable -> L4e
            com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()     // Catch: java.lang.Throwable -> L4e
            android.os.Handler r1 = r4.handler     // Catch: java.lang.Throwable -> L4e
            com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L4e
            r3 = 2
            r2.<init>(r4, r0, r5, r3)     // Catch: java.lang.Throwable -> L4e
            r1.post(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r0.get()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L27 java.util.concurrent.ExecutionException -> L29
            android.util.Pair r5 = (android.util.Pair) r5     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L27 java.util.concurrent.ExecutionException -> L29
            r4.releaseManagerOnHandlerThread()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            return r5
        L25:
            r5 = move-exception
            goto L30
        L27:
            r5 = move-exception
            goto L2a
        L29:
            r5 = move-exception
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L30:
            r4.releaseManagerOnHandlerThread()     // Catch: java.lang.Throwable -> L4e
            throw r5     // Catch: java.lang.Throwable -> L4e
        L34:
            r5 = move-exception
            java.lang.Throwable r0 = r5.getCause()     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0 instanceof com.google.android.exoplayer2.drm.KeysExpiredException     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4d
            r0 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L4e
            android.util.Pair r5 = android.util.Pair.create(r5, r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            return r5
        L4d:
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public void release() {
            r1 = this;
            android.os.HandlerThread r0 = r1.handlerThread
            r0.quit()
            return
    }

    public synchronized void releaseLicense(byte[] r3) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> Lc
            r0 = 3
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.drm.OfflineLicenseHelper.FORMAT_WITH_EMPTY_DRM_INIT_DATA     // Catch: java.lang.Throwable -> Lc
            r2.acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(r0, r3, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized byte[] renewLicense(byte[] r3) throws com.google.android.exoplayer2.drm.DrmSession.DrmSessionException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> Ld
            r0 = 2
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.drm.OfflineLicenseHelper.FORMAT_WITH_EMPTY_DRM_INIT_DATA     // Catch: java.lang.Throwable -> Ld
            byte[] r3 = r2.acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(r0, r3, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
