package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
final class SingleSegmentIndex implements com.google.android.exoplayer2.source.dash.DashSegmentIndex {
    private final com.google.android.exoplayer2.source.dash.manifest.RangedUri uri;

    public SingleSegmentIndex(com.google.android.exoplayer2.source.dash.manifest.RangedUri r1) {
            r0 = this;
            r0.<init>()
            r0.uri = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long r1, long r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getDurationUs(long r1, long r3) {
            r0 = this;
            return r3
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long r1, long r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long r1, long r3) {
            r0 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentCount(long r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentNum(long r1, long r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(long r1) {
            r0 = this;
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r0.uri
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getTimeUs(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public boolean isExplicit() {
            r1 = this;
            r0 = 1
            return r0
    }
}
