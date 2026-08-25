package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class IllegalSeekPositionException extends java.lang.IllegalStateException {
    public final long positionMs;
    public final com.google.android.exoplayer2.Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(com.google.android.exoplayer2.Timeline r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.timeline = r1
            r0.windowIndex = r2
            r0.positionMs = r3
            return
    }
}
