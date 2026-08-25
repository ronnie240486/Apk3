package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class PriorityDataSourceFactory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
    private final int priority;
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r1, com.google.android.exoplayer2.util.PriorityTaskManager r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.upstreamFactory = r1
            r0.priorityTaskManager = r2
            r0.priority = r3
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
            r1 = this;
            com.google.android.exoplayer2.upstream.PriorityDataSource r0 = r1.createDataSource()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public com.google.android.exoplayer2.upstream.PriorityDataSource createDataSource() {
            r4 = this;
            com.google.android.exoplayer2.upstream.PriorityDataSource r0 = new com.google.android.exoplayer2.upstream.PriorityDataSource
            com.google.android.exoplayer2.upstream.DataSource$Factory r1 = r4.upstreamFactory
            com.google.android.exoplayer2.upstream.DataSource r1 = r1.createDataSource()
            com.google.android.exoplayer2.util.PriorityTaskManager r2 = r4.priorityTaskManager
            int r3 = r4.priority
            r0.<init>(r1, r2, r3)
            return r0
    }
}
