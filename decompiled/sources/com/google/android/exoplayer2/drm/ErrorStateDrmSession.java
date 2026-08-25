package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorStateDrmSession implements com.google.android.exoplayer2.drm.DrmSession {
    private final com.google.android.exoplayer2.drm.DrmSession.DrmSessionException error;

    public ErrorStateDrmSession(com.google.android.exoplayer2.drm.DrmSession.DrmSessionException r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r1 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r1
            r0.error = r1
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.decoder.CryptoConfig getCryptoConfig() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.drm.DrmSession.DrmSessionException getError() {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r1.error
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public byte[] getOfflineLicenseKeySetId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
            r1 = this;
            java.util.UUID r0 = com.google.android.exoplayer2.C.UUID_NIL
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
