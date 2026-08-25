package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(18)
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final java.lang.String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final java.lang.String TAG = "DefaultDrmSessionMgr";
    private final com.google.android.exoplayer2.drm.MediaDrmCallback callback;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm;
    private final com.google.android.exoplayer2.drm.ExoMediaDrm.Provider exoMediaDrmProvider;
    private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> keepaliveSessions;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @androidx.annotation.Nullable
    public volatile com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DefaultDrmSession noMultiSessionDrmSession;

    @androidx.annotation.Nullable
    private byte[] offlineLicenseKeySetId;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private android.os.Handler playbackHandler;
    private android.os.Looper playbackLooper;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ProvisioningManagerImpl provisioningManagerImpl;
    private final com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final java.util.UUID uuid;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private com.google.android.exoplayer2.drm.ExoMediaDrm.Provider exoMediaDrmProvider;
        private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean multiSession;
        private boolean playClearSamplesWithoutKeys;
        private long sessionKeepaliveMs;
        private int[] useDrmSessionsForClearContentTrackTypes;
        private java.util.UUID uuid;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.keyRequestParameters = r0
                java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
                r2.uuid = r0
                com.google.android.exoplayer2.drm.ExoMediaDrm$Provider r0 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.DEFAULT_PROVIDER
                r2.exoMediaDrmProvider = r0
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r0 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r0.<init>()
                r2.loadErrorHandlingPolicy = r0
                r0 = 0
                int[] r0 = new int[r0]
                r2.useDrmSessionsForClearContentTrackTypes = r0
                r0 = 300000(0x493e0, double:1.482197E-318)
                r2.sessionKeepaliveMs = r0
                return
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager build(com.google.android.exoplayer2.drm.MediaDrmCallback r14) {
                r13 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r12 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager
                java.util.UUID r1 = r13.uuid
                com.google.android.exoplayer2.drm.ExoMediaDrm$Provider r2 = r13.exoMediaDrmProvider
                java.util.HashMap<java.lang.String, java.lang.String> r4 = r13.keyRequestParameters
                boolean r5 = r13.multiSession
                int[] r6 = r13.useDrmSessionsForClearContentTrackTypes
                boolean r7 = r13.playClearSamplesWithoutKeys
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8 = r13.loadErrorHandlingPolicy
                long r9 = r13.sessionKeepaliveMs
                r11 = 0
                r0 = r12
                r3 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
                return r12
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setKeyRequestParameters(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.keyRequestParameters
                r0.clear()
                if (r2 == 0) goto Lc
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.keyRequestParameters
                r0.putAll(r2)
            Lc:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) r1
                r0.loadErrorHandlingPolicy = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setMultiSession(boolean r1) {
                r0 = this;
                r0.multiSession = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setPlayClearSamplesWithoutKeys(boolean r1) {
                r0 = this;
                r0.playClearSamplesWithoutKeys = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setSessionKeepaliveMs(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L12
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                goto L12
            L10:
                r0 = 0
                goto L13
            L12:
                r0 = 1
            L13:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r3.sessionKeepaliveMs = r4
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setUseDrmSessionsForClearContent(int... r7) {
                r6 = this;
                int r0 = r7.length
                r1 = 0
                r2 = 0
            L3:
                if (r2 >= r0) goto L15
                r3 = r7[r2]
                r4 = 2
                r5 = 1
                if (r3 == r4) goto Lf
                if (r3 != r5) goto Le
                goto Lf
            Le:
                r5 = 0
            Lf:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r5)
                int r2 = r2 + 1
                goto L3
            L15:
                java.lang.Object r7 = r7.clone()
                int[] r7 = (int[]) r7
                r6.useDrmSessionsForClearContentTrackTypes = r7
                return r6
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setUuidAndExoMediaDrmProvider(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider r2) {
                r0 = this;
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.util.UUID r1 = (java.util.UUID) r1
                r0.uuid = r1
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.drm.ExoMediaDrm$Provider r1 = (com.google.android.exoplayer2.drm.ExoMediaDrm.Provider) r1
                r0.exoMediaDrmProvider = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class MediaDrmEventListener implements com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener {
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSessionManager this$0;

        private MediaDrmEventListener(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MediaDrmEventListener(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(com.google.android.exoplayer2.drm.ExoMediaDrm r1, @androidx.annotation.Nullable byte[] r2, int r3, int r4, @androidx.annotation.Nullable byte[] r5) {
                r0 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1 = r0.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmHandler r1 = r1.mediaDrmHandler
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmHandler r1 = (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler) r1
                android.os.Message r1 = r1.obtainMessage(r3, r2)
                r1.sendToTarget()
                return
        }
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public class MediaDrmHandler extends android.os.Handler {
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSessionManager this$0;

        public MediaDrmHandler(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1, android.os.Looper r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                java.lang.Object r0 = r5.obj
                byte[] r0 = (byte[]) r0
                if (r0 != 0) goto L7
                return
            L7:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1 = r4.this$0
                java.util.List r1 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$400(r1)
                java.util.Iterator r1 = r1.iterator()
            L11:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L28
                java.lang.Object r2 = r1.next()
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r2
                boolean r3 = r2.hasSessionId(r0)
                if (r3 == 0) goto L11
                int r5 = r5.what
                r2.onMediaDrmEvent(r5)
            L28:
                return
        }
    }

    public static final class MissingSchemeDataException extends java.lang.Exception {
        private MissingSchemeDataException(java.util.UUID r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Media does not support uuid: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public /* synthetic */ MissingSchemeDataException(java.util.UUID r1, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class PreacquiredSessionReference implements com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference {

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.drm.DrmSession session;
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSessionManager this$0;

        /* JADX INFO: renamed from: $r8$lambda$nYc-XCZkgUmlTVMJKF9VQKrj-NU, reason: not valid java name */
        public static /* synthetic */ void m215$r8$lambda$nYcXCZkgUmlTVMJKF9VQKrjNU(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference r0) {
                r0.lambda$release$1()
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$rqyTSlYT3rRwS_rvp-1F3CN49xI, reason: not valid java name */
        public static /* synthetic */ void m216$r8$lambda$rqyTSlYT3rRwS_rvp1F3CN49xI(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference r0, com.google.android.exoplayer2.Format r1) {
                r0.lambda$acquire$0(r1)
                return
        }

        public PreacquiredSessionReference(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.eventDispatcher = r2
                return
        }

        private /* synthetic */ void lambda$acquire$0(com.google.android.exoplayer2.Format r4) {
                r3 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.this$0
                int r0 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$800(r0)
                if (r0 == 0) goto L2a
                boolean r0 = r3.isReleased
                if (r0 == 0) goto Ld
                goto L2a
            Ld:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.this$0
                android.os.Looper r1 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1400(r0)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                android.os.Looper r1 = (android.os.Looper) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r3.eventDispatcher
                com.google.android.exoplayer2.drm.DrmSession r4 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1500(r0, r1, r2, r4)
                r3.session = r4
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r4 = r3.this$0
                java.util.Set r4 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1300(r4)
                r4.add(r3)
            L2a:
                return
        }

        private /* synthetic */ void lambda$release$1() {
                r2 = this;
                boolean r0 = r2.isReleased
                if (r0 == 0) goto L5
                return
            L5:
                com.google.android.exoplayer2.drm.DrmSession r0 = r2.session
                if (r0 == 0) goto Le
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r2.eventDispatcher
                r0.release(r1)
            Le:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r2.this$0
                java.util.Set r0 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1300(r0)
                r0.remove(r2)
                r0 = 1
                r2.isReleased = r0
                return
        }

        public void acquire(com.google.android.exoplayer2.Format r4) {
                r3 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$700(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                android.os.Handler r0 = (android.os.Handler) r0
                com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.post(r1)
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
                r3 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r3.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$700(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                android.os.Handler r0 = (android.os.Handler) r0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r2)
                com.google.android.exoplayer2.util.Util.postOrRun(r0, r1)
                return
        }
    }

    public class ProvisioningManagerImpl implements com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.drm.DefaultDrmSession provisioningSession;
        private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> sessionsAwaitingProvisioning;

        public ProvisioningManagerImpl(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1) {
                r0 = this;
                r0.<init>()
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.sessionsAwaitingProvisioning = r1
                return
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
                r2 = this;
                r0 = 0
                r2.provisioningSession = r0
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r2.sessionsAwaitingProvisioning
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r1 = r2.sessionsAwaitingProvisioning
                r1.clear()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r1
                r1.onProvisionCompleted()
                goto L12
            L22:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(java.lang.Exception r3, boolean r4) {
                r2 = this;
                r0 = 0
                r2.provisioningSession = r0
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r2.sessionsAwaitingProvisioning
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r1 = r2.sessionsAwaitingProvisioning
                r1.clear()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r1
                r1.onProvisionError(r3, r4)
                goto L12
            L22:
                return
        }

        public void onSessionFullyReleased(com.google.android.exoplayer2.drm.DefaultDrmSession r2) {
                r1 = this;
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r1.sessionsAwaitingProvisioning
                r0.remove(r2)
                com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r1.provisioningSession
                if (r0 != r2) goto L25
                r2 = 0
                r1.provisioningSession = r2
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r2 = r1.sessionsAwaitingProvisioning
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L25
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r2 = r1.sessionsAwaitingProvisioning
                java.util.Iterator r2 = r2.iterator()
                java.lang.Object r2 = r2.next()
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r2
                r1.provisioningSession = r2
                r2.provision()
            L25:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(com.google.android.exoplayer2.drm.DefaultDrmSession r2) {
                r1 = this;
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r1.sessionsAwaitingProvisioning
                r0.add(r2)
                com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r1.provisioningSession
                if (r0 == 0) goto La
                return
            La:
                r1.provisioningSession = r2
                r2.provision()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ReferenceCountListenerImpl implements com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener {
        public final /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSessionManager this$0;

        public static /* synthetic */ void $r8$lambda$lohQXhovvcCpLXYZ8GSk9gsNCn8(com.google.android.exoplayer2.drm.DefaultDrmSession r0) {
                lambda$onReferenceCountDecremented$0(r0)
                return
        }

        private ReferenceCountListenerImpl(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ReferenceCountListenerImpl(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void lambda$onReferenceCountDecremented$0(com.google.android.exoplayer2.drm.DefaultDrmSession r1) {
                r0 = 0
                r1.release(r0)
                return
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(com.google.android.exoplayer2.drm.DefaultDrmSession r6, int r7) {
                r5 = this;
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2 = 1
                if (r7 != r2) goto L44
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r2 = r5.this$0
                int r2 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$800(r2)
                if (r2 <= 0) goto L44
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r2 = r5.this$0
                long r2 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$500(r2)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L44
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                java.util.Set r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$600(r7)
                r7.add(r6)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                android.os.Handler r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$700(r7)
                java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
                android.os.Handler r7 = (android.os.Handler) r7
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r6, r1)
                long r1 = android.os.SystemClock.uptimeMillis()
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r3 = r5.this$0
                long r3 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$500(r3)
                long r3 = r3 + r1
                r7.postAtTime(r0, r6, r3)
                goto L94
            L44:
                if (r7 != 0) goto L94
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                java.util.List r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$400(r7)
                r7.remove(r6)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSession r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$900(r7)
                if (r7 != r6) goto L5c
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$902(r7)
            L5c:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSession r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1000(r7)
                if (r7 != r6) goto L69
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1002(r7)
            L69:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ProvisioningManagerImpl r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1100(r7)
                r7.onSessionFullyReleased(r6)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                long r2 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$500(r7)
                int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r7 == 0) goto L94
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                android.os.Handler r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$700(r7)
                java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
                android.os.Handler r7 = (android.os.Handler) r7
                r7.removeCallbacksAndMessages(r6)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r7 = r5.this$0
                java.util.Set r7 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$600(r7)
                r7.remove(r6)
            L94:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r6 = r5.this$0
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$1200(r6)
                return
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(com.google.android.exoplayer2.drm.DefaultDrmSession r5, int r6) {
                r4 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r6 = r4.this$0
                long r0 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$500(r6)
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L27
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r6 = r4.this$0
                java.util.Set r6 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$600(r6)
                r6.remove(r5)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r6 = r4.this$0
                android.os.Handler r6 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.access$700(r6)
                java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
                android.os.Handler r6 = (android.os.Handler) r6
                r6.removeCallbacksAndMessages(r5)
            L27:
                return
        }
    }

    private DefaultDrmSessionManager(java.util.UUID r3, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider r4, com.google.android.exoplayer2.drm.MediaDrmCallback r5, java.util.HashMap<java.lang.String, java.lang.String> r6, boolean r7, int[] r8, boolean r9, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r10, long r11) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.util.UUID r0 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            boolean r0 = r0.equals(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "Use C.CLEARKEY_UUID instead"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r2.uuid = r3
            r2.exoMediaDrmProvider = r4
            r2.callback = r5
            r2.keyRequestParameters = r6
            r2.multiSession = r7
            r2.useDrmSessionsForClearContentTrackTypes = r8
            r2.playClearSamplesWithoutKeys = r9
            r2.loadErrorHandlingPolicy = r10
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ProvisioningManagerImpl r3 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ProvisioningManagerImpl
            r3.<init>(r2)
            r2.provisioningManagerImpl = r3
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl r3 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl
            r4 = 0
            r3.<init>(r2, r4)
            r2.referenceCountListener = r3
            r3 = 0
            r2.mode = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.sessions = r3
            java.util.Set r3 = com.google.common.collect.Sets.newIdentityHashSet()
            r2.preacquiredSessionReferences = r3
            java.util.Set r3 = com.google.common.collect.Sets.newIdentityHashSet()
            r2.keepaliveSessions = r3
            r2.sessionKeepaliveMs = r11
            return
    }

    public /* synthetic */ DefaultDrmSessionManager(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider r2, com.google.android.exoplayer2.drm.MediaDrmCallback r3, java.util.HashMap r4, boolean r5, int[] r6, boolean r7, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8, long r9, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.AnonymousClass1 r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID r8, com.google.android.exoplayer2.drm.ExoMediaDrm r9, com.google.android.exoplayer2.drm.MediaDrmCallback r10, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r11) {
            r7 = this;
            if (r11 != 0) goto L7
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
        L7:
            r4 = r11
            r5 = 0
            r6 = 3
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID r8, com.google.android.exoplayer2.drm.ExoMediaDrm r9, com.google.android.exoplayer2.drm.MediaDrmCallback r10, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r11, boolean r12) {
            r7 = this;
            if (r11 != 0) goto L7
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
        L7:
            r4 = r11
            r6 = 3
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID r12, com.google.android.exoplayer2.drm.ExoMediaDrm r13, com.google.android.exoplayer2.drm.MediaDrmCallback r14, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r15, boolean r16, int r17) {
            r11 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm$AppManagedProvider r2 = new com.google.android.exoplayer2.drm.ExoMediaDrm$AppManagedProvider
            r0 = r13
            r2.<init>(r13)
            if (r15 != 0) goto Lf
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4 = r0
            goto L10
        Lf:
            r4 = r15
        L10:
            r0 = 0
            int[] r6 = new int[r0]
            r7 = 0
            com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r8 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
            r0 = r17
            r8.<init>(r0)
            r9 = 300000(0x493e0, double:1.482197E-318)
            r0 = r11
            r1 = r12
            r3 = r14
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSession access$1000(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r0.noMultiSessionDrmSession
            return r0
    }

    public static /* synthetic */ void access$1002(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1) {
            r0 = 0
            r1.noMultiSessionDrmSession = r0
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ProvisioningManagerImpl access$1100(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ProvisioningManagerImpl r0 = r0.provisioningManagerImpl
            return r0
    }

    public static /* synthetic */ void access$1200(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            r0.maybeReleaseMediaDrm()
            return
    }

    public static /* synthetic */ java.util.Set access$1300(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference> r0 = r0.preacquiredSessionReferences
            return r0
    }

    public static /* synthetic */ android.os.Looper access$1400(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            android.os.Looper r0 = r0.playbackLooper
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DrmSession access$1500(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1, android.os.Looper r2, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3, com.google.android.exoplayer2.Format r4) {
            r0 = 0
            com.google.android.exoplayer2.drm.DrmSession r1 = r1.acquireSession(r2, r3, r4, r0)
            return r1
    }

    public static /* synthetic */ java.util.List access$400(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r0.sessions
            return r0
    }

    public static /* synthetic */ long access$500(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r2) {
            long r0 = r2.sessionKeepaliveMs
            return r0
    }

    public static /* synthetic */ java.util.Set access$600(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r0.keepaliveSessions
            return r0
    }

    public static /* synthetic */ android.os.Handler access$700(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            android.os.Handler r0 = r0.playbackHandler
            return r0
    }

    public static /* synthetic */ int access$800(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            int r0 = r0.prepareCallsCount
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DefaultDrmSession access$900(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0) {
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r0.placeholderDrmSession
            return r0
    }

    public static /* synthetic */ void access$902(com.google.android.exoplayer2.drm.DefaultDrmSessionManager r1) {
            r0 = 0
            r1.placeholderDrmSession = r0
            return
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession acquireSession(android.os.Looper r5, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r6, com.google.android.exoplayer2.Format r7, boolean r8) {
            r4 = this;
            r4.maybeCreateMediaDrmHandler(r5)
            com.google.android.exoplayer2.drm.DrmInitData r5 = r7.drmInitData
            if (r5 != 0) goto L12
            java.lang.String r5 = r7.sampleMimeType
            int r5 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r5)
            com.google.android.exoplayer2.drm.DrmSession r5 = r4.maybeAcquirePlaceholderSession(r5, r8)
            return r5
        L12:
            byte[] r7 = r4.offlineLicenseKeySetId
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L4a
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.drm.DrmInitData r5 = (com.google.android.exoplayer2.drm.DrmInitData) r5
            java.util.UUID r7 = r4.uuid
            java.util.List r5 = getSchemeDatas(r5, r7, r0)
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L4b
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException r5 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException
            java.util.UUID r7 = r4.uuid
            r5.<init>(r7, r1)
            java.lang.String r7 = "DefaultDrmSessionMgr"
            java.lang.String r8 = "DRM error"
            com.google.android.exoplayer2.util.Log.e(r7, r8, r5)
            if (r6 == 0) goto L3d
            r6.drmSessionManagerError(r5)
        L3d:
            com.google.android.exoplayer2.drm.ErrorStateDrmSession r6 = new com.google.android.exoplayer2.drm.ErrorStateDrmSession
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r7 = new com.google.android.exoplayer2.drm.DrmSession$DrmSessionException
            r8 = 6003(0x1773, float:8.412E-42)
            r7.<init>(r5, r8)
            r6.<init>(r7)
            return r6
        L4a:
            r5 = r1
        L4b:
            boolean r7 = r4.multiSession
            if (r7 != 0) goto L52
            com.google.android.exoplayer2.drm.DefaultDrmSession r1 = r4.noMultiSessionDrmSession
            goto L6d
        L52:
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r7 = r4.sessions
            java.util.Iterator r7 = r7.iterator()
        L58:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r7.next()
            com.google.android.exoplayer2.drm.DefaultDrmSession r2 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r2
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData$SchemeData> r3 = r2.schemeDatas
            boolean r3 = com.google.android.exoplayer2.util.Util.areEqual(r3, r5)
            if (r3 == 0) goto L58
            r1 = r2
        L6d:
            if (r1 != 0) goto L7f
            com.google.android.exoplayer2.drm.DefaultDrmSession r1 = r4.createAndAcquireSessionWithRetry(r5, r0, r6, r8)
            boolean r5 = r4.multiSession
            if (r5 != 0) goto L79
            r4.noMultiSessionDrmSession = r1
        L79:
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r5 = r4.sessions
            r5.add(r1)
            goto L82
        L7f:
            r1.acquire(r6)
        L82:
            return r1
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(com.google.android.exoplayer2.drm.DrmSession r3) {
            int r0 = r3.getState()
            r1 = 1
            if (r0 != r1) goto L20
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 19
            if (r0 < r2) goto L21
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r3 = r3.getError()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r3 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r3
            java.lang.Throwable r3 = r3.getCause()
            boolean r3 = r3 instanceof android.media.ResourceBusyException
            if (r3 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    private boolean canAcquireSession(com.google.android.exoplayer2.drm.DrmInitData r5) {
            r4 = this;
            byte[] r0 = r4.offlineLicenseKeySetId
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.util.UUID r0 = r4.uuid
            java.util.List r0 = getSchemeDatas(r5, r0, r1)
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L39
            int r0 = r5.schemeDataCount
            if (r0 != r1) goto L38
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = r5.get(r2)
            java.util.UUID r3 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            boolean r0 = r0.matches(r3)
            if (r0 == 0) goto L38
            java.lang.String r0 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.UUID r3 = r4.uuid
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "DefaultDrmSessionMgr"
            com.google.android.exoplayer2.util.Log.w(r3, r0)
            goto L39
        L38:
            return r2
        L39:
            java.lang.String r5 = r5.schemeType
            if (r5 == 0) goto L6a
            java.lang.String r0 = "cenc"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L46
            goto L6a
        L46:
            java.lang.String r0 = "cbcs"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L57
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 25
            if (r5 < r0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            return r1
        L57:
            java.lang.String r0 = "cbc1"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L69
            java.lang.String r0 = "cens"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L68
            goto L69
        L68:
            return r1
        L69:
            return r2
        L6a:
            return r1
    }

    private com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSession(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r18, boolean r19, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r20) {
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r0.exoMediaDrm
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            boolean r1 = r0.playClearSamplesWithoutKeys
            r9 = r1 | r19
            com.google.android.exoplayer2.drm.DefaultDrmSession r1 = new com.google.android.exoplayer2.drm.DefaultDrmSession
            java.util.UUID r3 = r0.uuid
            com.google.android.exoplayer2.drm.ExoMediaDrm r4 = r0.exoMediaDrm
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ProvisioningManagerImpl r5 = r0.provisioningManagerImpl
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl r6 = r0.referenceCountListener
            int r8 = r0.mode
            byte[] r11 = r0.offlineLicenseKeySetId
            java.util.HashMap<java.lang.String, java.lang.String> r12 = r0.keyRequestParameters
            com.google.android.exoplayer2.drm.MediaDrmCallback r13 = r0.callback
            android.os.Looper r2 = r0.playbackLooper
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            r14 = r2
            android.os.Looper r14 = (android.os.Looper) r14
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r15 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.analytics.PlayerId r2 = r0.playerId
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            r16 = r2
            com.google.android.exoplayer2.analytics.PlayerId r16 = (com.google.android.exoplayer2.analytics.PlayerId) r16
            r2 = r1
            r7 = r18
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = r20
            r1.acquire(r2)
            long r2 = r0.sessionKeepaliveMs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4e
            r2 = 0
            r1.acquire(r2)
        L4e:
            return r1
    }

    private com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSessionWithRetry(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r3, boolean r4, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r5, boolean r6) {
            r2 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r2.createAndAcquireSession(r3, r4, r5)
            boolean r1 = acquisitionFailedIndicatingResourceShortage(r0)
            if (r1 == 0) goto L1c
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r1 = r2.keepaliveSessions
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1c
            r2.releaseAllKeepaliveSessions()
            r2.undoAcquisition(r0, r5)
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r2.createAndAcquireSession(r3, r4, r5)
        L1c:
            boolean r1 = acquisitionFailedIndicatingResourceShortage(r0)
            if (r1 == 0) goto L41
            if (r6 == 0) goto L41
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference> r6 = r2.preacquiredSessionReferences
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L41
            r2.releaseAllPreacquiredSessions()
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r6 = r2.keepaliveSessions
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L3a
            r2.releaseAllKeepaliveSessions()
        L3a:
            r2.undoAcquisition(r0, r5)
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = r2.createAndAcquireSession(r3, r4, r5)
        L41:
            return r0
    }

    private static java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> getSchemeDatas(com.google.android.exoplayer2.drm.DrmInitData r5, java.util.UUID r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.schemeDataCount
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r5.schemeDataCount
            if (r2 >= r3) goto L39
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r3 = r5.get(r2)
            boolean r4 = r3.matches(r6)
            if (r4 != 0) goto L2a
            java.util.UUID r4 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L28
            java.util.UUID r4 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            boolean r4 = r3.matches(r4)
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = 0
            goto L2b
        L2a:
            r4 = 1
        L2b:
            if (r4 == 0) goto L36
            byte[] r4 = r3.data
            if (r4 != 0) goto L33
            if (r7 == 0) goto L36
        L33:
            r0.add(r3)
        L36:
            int r2 = r2 + 1
            goto L9
        L39:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(android.os.Looper r2) {
            r1 = this;
            monitor-enter(r1)
            android.os.Looper r0 = r1.playbackLooper     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto Lf
            r1.playbackLooper = r2     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r1.playbackHandler = r0     // Catch: java.lang.Throwable -> L1e
            goto L1c
        Lf:
            if (r0 != r2) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r2 = r1.playbackHandler     // Catch: java.lang.Throwable -> L1e
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession maybeAcquirePlaceholderSession(int r5, boolean r6) {
            r4 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r4.exoMediaDrm
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = (com.google.android.exoplayer2.drm.ExoMediaDrm) r0
            int r1 = r0.getCryptoType()
            r2 = 1
            r3 = 2
            if (r1 != r3) goto L16
            boolean r1 = com.google.android.exoplayer2.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r3 = 0
            if (r1 != 0) goto L44
            int[] r1 = r4.useDrmSessionsForClearContentTrackTypes
            int r5 = com.google.android.exoplayer2.util.Util.linearSearch(r1, r5)
            r1 = -1
            if (r5 == r1) goto L44
            int r5 = r0.getCryptoType()
            if (r5 != r2) goto L2a
            goto L44
        L2a:
            com.google.android.exoplayer2.drm.DefaultDrmSession r5 = r4.placeholderDrmSession
            if (r5 != 0) goto L3e
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of()
            com.google.android.exoplayer2.drm.DefaultDrmSession r5 = r4.createAndAcquireSessionWithRetry(r5, r2, r3, r6)
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r6 = r4.sessions
            r6.add(r5)
            r4.placeholderDrmSession = r5
            goto L41
        L3e:
            r5.acquire(r3)
        L41:
            com.google.android.exoplayer2.drm.DefaultDrmSession r5 = r4.placeholderDrmSession
            return r5
        L44:
            return r3
    }

    private void maybeCreateMediaDrmHandler(android.os.Looper r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmHandler r0 = r1.mediaDrmHandler
            if (r0 != 0) goto Lb
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmHandler r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmHandler
            r0.<init>(r1, r2)
            r1.mediaDrmHandler = r0
        Lb:
            return
    }

    private void maybeReleaseMediaDrm() {
            r1 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r1.exoMediaDrm
            if (r0 == 0) goto L26
            int r0 = r1.prepareCallsCount
            if (r0 != 0) goto L26
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r1.sessions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference> r0 = r1.preacquiredSessionReferences
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r1.exoMediaDrm
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = (com.google.android.exoplayer2.drm.ExoMediaDrm) r0
            r0.release()
            r0 = 0
            r1.exoMediaDrm = r0
        L26:
            return
    }

    private void releaseAllKeepaliveSessions() {
            r3 = this;
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r3.keepaliveSessions
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.drm.DrmSession r1 = (com.google.android.exoplayer2.drm.DrmSession) r1
            r2 = 0
            r1.release(r2)
            goto La
        L1b:
            return
    }

    private void releaseAllPreacquiredSessions() {
            r2 = this;
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference> r0 = r2.preacquiredSessionReferences
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference r1 = (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference) r1
            r1.release()
            goto La
        L1a:
            return
    }

    private void undoAcquisition(com.google.android.exoplayer2.drm.DrmSession r5, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r6) {
            r4 = this;
            r5.release(r6)
            long r0 = r4.sessionKeepaliveMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L12
            r6 = 0
            r5.release(r6)
        L12:
            return
    }

    private void verifyPlaybackThread(boolean r3) {
            r2 = this;
            java.lang.String r0 = "DefaultDrmSessionMgr"
            if (r3 == 0) goto L13
            android.os.Looper r3 = r2.playbackLooper
            if (r3 != 0) goto L13
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            java.lang.String r1 = "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."
            com.google.android.exoplayer2.util.Log.w(r0, r1, r3)
            goto L54
        L13:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            android.os.Looper r1 = r2.playbackLooper
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.os.Looper r1 = (android.os.Looper) r1
            java.lang.Thread r1 = r1.getThread()
            if (r3 == r1) goto L54
            java.lang.String r3 = "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = "\nExpected thread: "
            r3.append(r1)
            android.os.Looper r1 = r2.playbackLooper
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            com.google.android.exoplayer2.util.Log.w(r0, r3, r1)
        L54:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.drm.DrmSession acquireSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4, com.google.android.exoplayer2.Format r5) {
            r3 = this;
            r0 = 0
            r3.verifyPlaybackThread(r0)
            int r1 = r3.prepareCallsCount
            r2 = 1
            if (r1 <= 0) goto La
            r0 = 1
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            android.os.Looper r0 = r3.playbackLooper
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            android.os.Looper r0 = r3.playbackLooper
            com.google.android.exoplayer2.drm.DrmSession r4 = r3.acquireSession(r0, r4, r5, r2)
            return r4
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public int getCryptoType(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            r0 = 0
            r3.verifyPlaybackThread(r0)
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r3.exoMediaDrm
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = (com.google.android.exoplayer2.drm.ExoMediaDrm) r1
            int r1 = r1.getCryptoType()
            com.google.android.exoplayer2.drm.DrmInitData r2 = r4.drmInitData
            if (r2 != 0) goto L25
            java.lang.String r4 = r4.sampleMimeType
            int r4 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r4)
            int[] r2 = r3.useDrmSessionsForClearContentTrackTypes
            int r4 = com.google.android.exoplayer2.util.Util.linearSearch(r2, r4)
            r2 = -1
            if (r4 == r2) goto L24
            r0 = r1
        L24:
            return r0
        L25:
            boolean r4 = r3.canAcquireSession(r2)
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            r1 = 1
        L2d:
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference preacquireSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r2, com.google.android.exoplayer2.Format r3) {
            r1 = this;
            int r0 = r1.prepareCallsCount
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            android.os.Looper r0 = r1.playbackLooper
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference
            r0.<init>(r1, r2)
            r0.acquire(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
            r6 = this;
            r0 = 1
            r6.verifyPlaybackThread(r0)
            int r0 = r6.prepareCallsCount
            int r1 = r0 + 1
            r6.prepareCallsCount = r1
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r6.exoMediaDrm
            r1 = 0
            if (r0 != 0) goto L25
            com.google.android.exoplayer2.drm.ExoMediaDrm$Provider r0 = r6.exoMediaDrmProvider
            java.util.UUID r2 = r6.uuid
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r0.acquireExoMediaDrm(r2)
            r6.exoMediaDrm = r0
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmEventListener r2 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MediaDrmEventListener
            r2.<init>(r6, r1)
            r0.setOnEventListener(r2)
            goto L47
        L25:
            long r2 = r6.sessionKeepaliveMs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L47
            r0 = 0
        L31:
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r2 = r6.sessions
            int r2 = r2.size()
            if (r0 >= r2) goto L47
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r2 = r6.sessions
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.drm.DefaultDrmSession r2 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r2
            r2.acquire(r1)
            int r0 = r0 + 1
            goto L31
        L47:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
            r5 = this;
            r0 = 1
            r5.verifyPlaybackThread(r0)
            int r1 = r5.prepareCallsCount
            int r1 = r1 - r0
            r5.prepareCallsCount = r1
            if (r1 == 0) goto Lc
            return
        Lc:
            long r0 = r5.sessionKeepaliveMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r1 = r5.sessions
            r0.<init>(r1)
            r1 = 0
        L1f:
            int r2 = r0.size()
            if (r1 >= r2) goto L32
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.drm.DefaultDrmSession r2 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r2
            r3 = 0
            r2.release(r3)
            int r1 = r1 + 1
            goto L1f
        L32:
            r5.releaseAllPreacquiredSessions()
            r5.maybeReleaseMediaDrm()
            return
    }

    public void setMode(int r2, @androidx.annotation.Nullable byte[] r3) {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> r0 = r1.sessions
            boolean r0 = r0.isEmpty()
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r0 = 1
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 != r0) goto L12
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
        L12:
            r1.mode = r2
            r1.offlineLicenseKeySetId = r3
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public void setPlayer(android.os.Looper r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
            r0 = this;
            r0.initPlaybackLooper(r1)
            r0.playerId = r2
            return
    }
}
