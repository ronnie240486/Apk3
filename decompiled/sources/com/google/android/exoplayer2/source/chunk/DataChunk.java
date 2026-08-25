package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DataChunk extends com.google.android.exoplayer2.source.chunk.Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(com.google.android.exoplayer2.upstream.DataSource r12, com.google.android.exoplayer2.upstream.DataSpec r13, int r14, com.google.android.exoplayer2.Format r15, int r16, @androidx.annotation.Nullable java.lang.Object r17, @androidx.annotation.Nullable byte[] r18) {
            r11 = this;
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r18 != 0) goto L1c
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1 = r11
            goto L1f
        L1c:
            r1 = r11
            r0 = r18
        L1f:
            r1.data = r0
            return
    }

    private void maybeExpandData(int r3) {
            r2 = this;
            byte[] r0 = r2.data
            int r1 = r0.length
            int r3 = r3 + 16384
            if (r1 >= r3) goto L10
            int r3 = r0.length
            int r3 = r3 + 16384
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.data = r3
        L10:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
            r1 = this;
            r0 = 1
            r1.loadCanceled = r0
            return
    }

    public abstract void consume(byte[] r1, int r2) throws java.io.IOException;

    public byte[] getDataHolder() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
            r5 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r5.dataSource     // Catch: java.lang.Throwable -> L30
            com.google.android.exoplayer2.upstream.DataSpec r1 = r5.dataSpec     // Catch: java.lang.Throwable -> L30
            r0.open(r1)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r1 = 0
        L9:
            r2 = -1
            if (r0 == r2) goto L21
            boolean r0 = r5.loadCanceled     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L21
            r5.maybeExpandData(r1)     // Catch: java.lang.Throwable -> L30
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r5.dataSource     // Catch: java.lang.Throwable -> L30
            byte[] r3 = r5.data     // Catch: java.lang.Throwable -> L30
            r4 = 16384(0x4000, float:2.2959E-41)
            int r0 = r0.read(r3, r1, r4)     // Catch: java.lang.Throwable -> L30
            if (r0 == r2) goto L9
            int r1 = r1 + r0
            goto L9
        L21:
            boolean r0 = r5.loadCanceled     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L2a
            byte[] r0 = r5.data     // Catch: java.lang.Throwable -> L30
            r5.consume(r0, r1)     // Catch: java.lang.Throwable -> L30
        L2a:
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r5.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r0)
            return
        L30:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r5.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r1)
            throw r0
    }
}
