package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaDrmCallback {
    byte[] executeKeyRequest(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest r2) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException;

    byte[] executeProvisionRequest(java.util.UUID r1, com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest r2) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException;
}
