package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultMediaCodecAdapterFactory implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final java.lang.String TAG = "DMCodecAdapterFactory";
    private int asynchronousMode;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;

    public DefaultMediaCodecAdapterFactory() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.asynchronousMode = r0
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r4) throws java.io.IOException {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L3b
            int r1 = r3.asynchronousMode
            r2 = 1
            if (r1 == r2) goto L11
            if (r1 != 0) goto L3b
            r1 = 31
            if (r0 < r1) goto L3b
        L11:
            com.google.android.exoplayer2.Format r0 = r4.format
            java.lang.String r0 = r0.sampleMimeType
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            java.lang.String r1 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.getTrackTypeString(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DMCodecAdapterFactory"
            com.google.android.exoplayer2.util.Log.i(r2, r1)
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory r1 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory
            boolean r2 = r3.enableSynchronizeCodecInteractionsWithQueueing
            r1.<init>(r0, r2)
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r4 = r1.createAdapter(r4)
            return r4
        L3b:
            com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$Factory r0 = new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$Factory
            r0.<init>()
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r4 = r0.createAdapter(r4)
            return r4
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean r1) {
            r0 = this;
            r0.enableSynchronizeCodecInteractionsWithQueueing = r1
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
            r1 = this;
            r0 = 2
            r1.asynchronousMode = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
            r1 = this;
            r0 = 1
            r1.asynchronousMode = r0
            return r1
    }
}
