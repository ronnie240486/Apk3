package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSessionManager {
    public static final com.google.android.exoplayer2.drm.DrmSessionManager DRM_UNSUPPORTED = null;

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.drm.DrmSessionManager DUMMY = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference $default$preacquireSession(com.google.android.exoplayer2.drm.DrmSessionManager r0, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1, com.google.android.exoplayer2.Format r2) {
                com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference r0 = com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY
                return r0
        }

        public static void $default$prepare(com.google.android.exoplayer2.drm.DrmSessionManager r0) {
                return
        }

        public static void $default$release(com.google.android.exoplayer2.drm.DrmSessionManager r0) {
                return
        }

        @java.lang.Deprecated
        public static com.google.android.exoplayer2.drm.DrmSessionManager getDummyDrmSessionManager() {
                com.google.android.exoplayer2.drm.DrmSessionManager r0 = com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED
                return r0
        }
    }


    /* JADX INFO: loaded from: classes.dex */
    public interface DrmSessionReference {
        public static final com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference EMPTY = null;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                    com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference r0 = com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY
                    return
            }

            public static /* synthetic */ void lambda$static$0() {
                    return
            }
        }

        static {
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$25
                com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY = r0
                return
        }

        void release();
    }

    static {
            com.google.android.exoplayer2.drm.DrmSessionManager$1 r0 = new com.google.android.exoplayer2.drm.DrmSessionManager$1
            r0.<init>()
            com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED = r0
            com.google.android.exoplayer2.drm.DrmSessionManager.DUMMY = r0
            return
    }

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.drm.DrmSession acquireSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1, com.google.android.exoplayer2.Format r2);

    int getCryptoType(com.google.android.exoplayer2.Format r1);

    com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference preacquireSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1, com.google.android.exoplayer2.Format r2);

    void prepare();

    void release();

    void setPlayer(android.os.Looper r1, com.google.android.exoplayer2.analytics.PlayerId r2);
}
