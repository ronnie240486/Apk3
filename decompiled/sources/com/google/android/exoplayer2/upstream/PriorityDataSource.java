package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class PriorityDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private final int priority;
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final com.google.android.exoplayer2.upstream.DataSource upstream;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private final int priority;
        private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r1, com.google.android.exoplayer2.util.PriorityTaskManager r2, int r3) {
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

    public PriorityDataSource(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.util.PriorityTaskManager r2, int r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.upstream.DataSource r1 = (com.google.android.exoplayer2.upstream.DataSource) r1
            r0.upstream = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.PriorityTaskManager r1 = (com.google.android.exoplayer2.util.PriorityTaskManager) r1
            r0.priorityTaskManager = r1
            r0.priority = r3
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            r0.close()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            java.util.Map r0 = r0.getResponseHeaders()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstream
            android.net.Uri r0 = r0.getUri()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r2.priorityTaskManager
            int r1 = r2.priority
            r0.proceedOrThrow(r1)
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.upstream
            long r0 = r0.open(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r2.priorityTaskManager
            int r1 = r2.priority
            r0.proceedOrThrow(r1)
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.upstream
            int r3 = r0.read(r3, r4, r5)
            return r3
    }
}
