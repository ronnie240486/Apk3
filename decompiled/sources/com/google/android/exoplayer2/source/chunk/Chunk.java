package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class Chunk implements com.google.android.exoplayer2.upstream.Loader.Loadable {
    public final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
    public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    public final long endTimeUs;
    public final long loadTaskId;
    public final long startTimeUs;
    public final com.google.android.exoplayer2.Format trackFormat;

    @androidx.annotation.Nullable
    public final java.lang.Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public Chunk(com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4, com.google.android.exoplayer2.Format r5, int r6, @androidx.annotation.Nullable java.lang.Object r7, long r8, long r10) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = new com.google.android.exoplayer2.upstream.StatsDataSource
            r0.<init>(r2)
            r1.dataSource = r0
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            r1.dataSpec = r2
            r1.type = r4
            r1.trackFormat = r5
            r1.trackSelectionReason = r6
            r1.trackSelectionData = r7
            r1.startTimeUs = r8
            r1.endTimeUs = r10
            long r2 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
            r1.loadTaskId = r2
            return
    }

    public final long bytesLoaded() {
            r2 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r2.dataSource
            long r0 = r0.getBytesRead()
            return r0
    }

    public final long getDurationUs() {
            r4 = this;
            long r0 = r4.endTimeUs
            long r2 = r4.startTimeUs
            long r0 = r0 - r2
            return r0
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r1.dataSource
            java.util.Map r0 = r0.getLastResponseHeaders()
            return r0
    }

    public final android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r1.dataSource
            android.net.Uri r0 = r0.getLastOpenedUri()
            return r0
    }
}
