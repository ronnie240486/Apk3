package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalMediaDrmCallback implements com.google.android.exoplayer2.drm.MediaDrmCallback {
    private final byte[] keyResponse;

    public LocalMediaDrmCallback(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.keyResponse = r1
            return
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest r2) {
            r0 = this;
            byte[] r1 = r0.keyResponse
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
