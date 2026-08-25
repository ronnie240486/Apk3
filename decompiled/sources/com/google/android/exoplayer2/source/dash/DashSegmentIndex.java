package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long r1, long r3);

    long getDurationUs(long r1, long r3);

    long getFirstAvailableSegmentNum(long r1, long r3);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long r1, long r3);

    long getSegmentCount(long r1);

    long getSegmentNum(long r1, long r3);

    com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(long r1);

    long getTimeUs(long r1);

    boolean isExplicit();
}
