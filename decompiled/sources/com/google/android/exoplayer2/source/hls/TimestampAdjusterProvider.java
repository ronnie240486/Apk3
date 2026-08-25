package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
public final class TimestampAdjusterProvider {
    private final android.util.SparseArray<com.google.android.exoplayer2.util.TimestampAdjuster> timestampAdjusters;

    public TimestampAdjusterProvider() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.timestampAdjusters = r0
            return
    }

    public com.google.android.exoplayer2.util.TimestampAdjuster getAdjuster(int r4) {
            r3 = this;
            android.util.SparseArray<com.google.android.exoplayer2.util.TimestampAdjuster> r0 = r3.timestampAdjusters
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = (com.google.android.exoplayer2.util.TimestampAdjuster) r0
            if (r0 != 0) goto L19
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r0.<init>(r1)
            android.util.SparseArray<com.google.android.exoplayer2.util.TimestampAdjuster> r1 = r3.timestampAdjusters
            r1.put(r4, r0)
        L19:
            return r0
    }

    public void reset() {
            r1 = this;
            android.util.SparseArray<com.google.android.exoplayer2.util.TimestampAdjuster> r0 = r1.timestampAdjusters
            r0.clear()
            return
    }
}
