package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoMediaDrm {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static void $default$setPlayerIdForSession(com.google.android.exoplayer2.drm.ExoMediaDrm r0, byte[] r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class AppManagedProvider implements com.google.android.exoplayer2.drm.ExoMediaDrm.Provider {
        private final com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm;

        public AppManagedProvider(com.google.android.exoplayer2.drm.ExoMediaDrm r1) {
                r0 = this;
                r0.<init>()
                r0.exoMediaDrm = r1
                return
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        public com.google.android.exoplayer2.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID r1) {
                r0 = this;
                com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r0.exoMediaDrm
                r1.acquire()
                com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r0.exoMediaDrm
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class KeyRequest {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_UNKNOWN = Integer.MIN_VALUE;
        public static final int REQUEST_TYPE_UPDATE = 4;
        private final byte[] data;
        private final java.lang.String licenseServerUrl;
        private final int requestType;

        /* JADX INFO: loaded from: classes3.dex */
        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] r2, java.lang.String r3) {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.<init>(r2, r3, r0)
                return
        }

        public KeyRequest(byte[] r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                r0.licenseServerUrl = r2
                r0.requestType = r3
                return
        }

        public byte[] getData() {
                r1 = this;
                byte[] r0 = r1.data
                return r0
        }

        public java.lang.String getLicenseServerUrl() {
                r1 = this;
                java.lang.String r0 = r1.licenseServerUrl
                return r0
        }

        public int getRequestType() {
                r1 = this;
                int r0 = r1.requestType
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class KeyStatus {
        private final byte[] keyId;
        private final int statusCode;

        public KeyStatus(int r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.statusCode = r1
                r0.keyId = r2
                return
        }

        public byte[] getKeyId() {
                r1 = this;
                byte[] r0 = r1.keyId
                return r0
        }

        public int getStatusCode() {
                r1 = this;
                int r0 = r1.statusCode
                return r0
        }
    }

    public interface OnEventListener {
        void onEvent(com.google.android.exoplayer2.drm.ExoMediaDrm r1, @androidx.annotation.Nullable byte[] r2, int r3, int r4, @androidx.annotation.Nullable byte[] r5);
    }

    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(com.google.android.exoplayer2.drm.ExoMediaDrm r1, byte[] r2, long r3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(com.google.android.exoplayer2.drm.ExoMediaDrm r1, byte[] r2, java.util.List<com.google.android.exoplayer2.drm.ExoMediaDrm.KeyStatus> r3, boolean r4);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Provider {
        com.google.android.exoplayer2.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ProvisionRequest {
        private final byte[] data;
        private final java.lang.String defaultUrl;

        public ProvisionRequest(byte[] r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                r0.defaultUrl = r2
                return
        }

        public byte[] getData() {
                r1 = this;
                byte[] r0 = r1.data
                return r0
        }

        public java.lang.String getDefaultUrl() {
                r1 = this;
                java.lang.String r0 = r1.defaultUrl
                return r0
        }
    }

    void acquire();

    void closeSession(byte[] r1);

    com.google.android.exoplayer2.decoder.CryptoConfig createCryptoConfig(byte[] r1) throws android.media.MediaCryptoException;

    int getCryptoType();

    com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] r1, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r2, int r3, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r4) throws android.media.NotProvisionedException;

    @androidx.annotation.Nullable
    android.os.PersistableBundle getMetrics();

    byte[] getPropertyByteArray(java.lang.String r1);

    java.lang.String getPropertyString(java.lang.String r1);

    com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest();

    byte[] openSession() throws android.media.MediaDrmException;

    @androidx.annotation.Nullable
    byte[] provideKeyResponse(byte[] r1, byte[] r2) throws android.media.NotProvisionedException, android.media.DeniedByServerException;

    void provideProvisionResponse(byte[] r1) throws android.media.DeniedByServerException;

    java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] r1);

    void release();

    boolean requiresSecureDecoder(byte[] r1, java.lang.String r2);

    void restoreKeys(byte[] r1, byte[] r2);

    void setOnEventListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener r1);

    void setOnExpirationUpdateListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener r1);

    void setOnKeyStatusChangeListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r1);

    void setPlayerIdForSession(byte[] r1, com.google.android.exoplayer2.analytics.PlayerId r2);

    void setPropertyByteArray(java.lang.String r1, byte[] r2);

    void setPropertyString(java.lang.String r1, java.lang.String r2);
}
