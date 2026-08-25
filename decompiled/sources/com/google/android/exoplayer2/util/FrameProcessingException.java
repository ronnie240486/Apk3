package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameProcessingException extends java.lang.Exception {
    public final long presentationTimeUs;

    public FrameProcessingException(java.lang.String r3) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r3, r0)
            return
    }

    public FrameProcessingException(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.presentationTimeUs = r2
            return
    }

    public FrameProcessingException(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r3, r4, r0)
            return
    }

    public FrameProcessingException(java.lang.String r1, java.lang.Throwable r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.presentationTimeUs = r3
            return
    }

    public FrameProcessingException(java.lang.Throwable r3) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r3, r0)
            return
    }

    public FrameProcessingException(java.lang.Throwable r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.presentationTimeUs = r2
            return
    }

    public static com.google.android.exoplayer2.util.FrameProcessingException from(java.lang.Exception r2) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.util.FrameProcessingException r2 = from(r2, r0)
            return r2
    }

    public static com.google.android.exoplayer2.util.FrameProcessingException from(java.lang.Exception r1, long r2) {
            boolean r0 = r1 instanceof com.google.android.exoplayer2.util.FrameProcessingException
            if (r0 == 0) goto L7
            com.google.android.exoplayer2.util.FrameProcessingException r1 = (com.google.android.exoplayer2.util.FrameProcessingException) r1
            return r1
        L7:
            com.google.android.exoplayer2.util.FrameProcessingException r0 = new com.google.android.exoplayer2.util.FrameProcessingException
            r0.<init>(r1, r2)
            return r0
    }
}
