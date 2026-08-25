package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.Format trackFormat;

    @androidx.annotation.Nullable
    public final java.lang.Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int r11) {
            r10 = this;
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    public MediaLoadData(int r1, int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r3, int r4, @androidx.annotation.Nullable java.lang.Object r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.dataType = r1
            r0.trackType = r2
            r0.trackFormat = r3
            r0.trackSelectionReason = r4
            r0.trackSelectionData = r5
            r0.mediaStartTimeMs = r6
            r0.mediaEndTimeMs = r8
            return
    }
}
