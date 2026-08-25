package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
final class UnexpectedSampleTimestampException extends java.io.IOException {
    public final long lastAcceptedSampleTimeUs;
    public final com.google.android.exoplayer2.source.chunk.MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(com.google.android.exoplayer2.source.chunk.MediaChunk r4, long r5, long r7) {
            r3 = this;
            java.lang.String r0 = "Unexpected sample timestamp: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = com.google.android.exoplayer2.util.Util.usToMs(r7)
            r0.append(r1)
            java.lang.String r1 = " in chunk ["
            r0.append(r1)
            long r1 = r4.startTimeUs
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r4.endTimeUs
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.mediaChunk = r4
            r3.lastAcceptedSampleTimeUs = r5
            r3.rejectedSampleTimeUs = r7
            return
    }
}
