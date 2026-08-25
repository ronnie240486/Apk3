package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkCryptoConfig implements com.google.android.exoplayer2.decoder.CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = false;
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final java.util.UUID uuid;

    static {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = r0
            return
    }

    public FrameworkCryptoConfig(java.util.UUID r1, byte[] r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.uuid = r1
            r0.sessionId = r2
            r0.forceAllowInsecureDecoderComponents = r3
            return
    }
}
