package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(18)
public final class DummyExoMediaDrm implements com.google.android.exoplayer2.drm.ExoMediaDrm {
    public DummyExoMediaDrm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.exoplayer2.drm.DummyExoMediaDrm getInstance() {
            com.google.android.exoplayer2.drm.DummyExoMediaDrm r0 = new com.google.android.exoplayer2.drm.DummyExoMediaDrm
            r0.<init>()
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void acquire() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.decoder.CryptoConfig createCryptoConfig(byte[] r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public int getCryptoType() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] r1, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r2, int r3, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r4) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.Nullable
    public android.os.PersistableBundle getMetrics() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String r1) {
            r0 = this;
            byte[] r1 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
            r1 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
            r2 = this;
            android.media.MediaDrmException r0 = new android.media.MediaDrmException
            java.lang.String r1 = "Attempting to open a session using a dummy ExoMediaDrm."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.Nullable
    public byte[] provideKeyResponse(byte[] r1, byte[] r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] r1, java.lang.String r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] r1, byte[] r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final /* synthetic */ void setPlayerIdForSession(byte[] r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
            r0 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm.CC.$default$setPlayerIdForSession(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String r1, byte[] r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }
}
