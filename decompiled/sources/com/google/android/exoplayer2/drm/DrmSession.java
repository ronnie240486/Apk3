package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {
    public static final int STATE_ERROR = 1;
    public static final int STATE_OPENED = 3;
    public static final int STATE_OPENED_WITH_KEYS = 4;
    public static final int STATE_OPENING = 2;
    public static final int STATE_RELEASED = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmSession$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$playClearSamplesWithoutKeys(com.google.android.exoplayer2.drm.DrmSession r0) {
                r0 = 0
                return r0
        }

        public static void replaceSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r1, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
                if (r1 != r2) goto L3
                return
            L3:
                r0 = 0
                if (r2 == 0) goto L9
                r2.acquire(r0)
            L9:
                if (r1 == 0) goto Le
                r1.release(r0)
            Le:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class DrmSessionException extends java.io.IOException {
        public final int errorCode;

        public DrmSessionException(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.errorCode = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    void acquire(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1);

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.decoder.CryptoConfig getCryptoConfig();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.drm.DrmSession.DrmSessionException getError();

    @androidx.annotation.Nullable
    byte[] getOfflineLicenseKeySetId();

    java.util.UUID getSchemeUuid();

    int getState();

    boolean playClearSamplesWithoutKeys();

    @androidx.annotation.Nullable
    java.util.Map<java.lang.String, java.lang.String> queryKeyStatus();

    void release(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1);

    boolean requiresSecureDecoder(java.lang.String r1);
}
