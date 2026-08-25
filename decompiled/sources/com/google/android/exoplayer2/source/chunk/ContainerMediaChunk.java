package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
public class ContainerMediaChunk extends com.google.android.exoplayer2.source.chunk.BaseMediaChunk {
    private final int chunkCount;
    private final com.google.android.exoplayer2.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(com.google.android.exoplayer2.upstream.DataSource r4, com.google.android.exoplayer2.upstream.DataSpec r5, com.google.android.exoplayer2.Format r6, int r7, @androidx.annotation.Nullable java.lang.Object r8, long r9, long r11, long r13, long r15, long r17, int r19, long r20, com.google.android.exoplayer2.source.chunk.ChunkExtractor r22) {
            r3 = this;
            r0 = r3
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15, r17)
            r1 = r19
            r0.chunkCount = r1
            r1 = r20
            r0.sampleOffsetUs = r1
            r1 = r22
            r0.chunkExtractor = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
            r1 = this;
            r0 = 1
            r1.loadCanceled = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public long getNextChunkIndex() {
            r4 = this;
            long r0 = r4.chunkIndex
            int r2 = r4.chunkCount
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
            r1 = this;
            boolean r0 = r1.loadCompleted
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
            r11 = this;
            long r0 = r11.nextLoadPosition
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L33
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r6 = r11.getOutput()
            long r0 = r11.sampleOffsetUs
            r6.setSampleOffsetUs(r0)
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r5 = r11.chunkExtractor
            long r0 = r11.clippedStartTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L20
            r7 = r2
            goto L24
        L20:
            long r7 = r11.sampleOffsetUs
            long r0 = r0 - r7
            r7 = r0
        L24:
            long r0 = r11.clippedEndTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r9 = r2
            goto L30
        L2c:
            long r2 = r11.sampleOffsetUs
            long r0 = r0 - r2
            r9 = r0
        L30:
            r5.init(r6, r7, r9)
        L33:
            com.google.android.exoplayer2.upstream.DataSpec r0 = r11.dataSpec     // Catch: java.lang.Throwable -> L7a
            long r1 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.subrange(r1)     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r7 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.upstream.StatsDataSource r2 = r11.dataSource     // Catch: java.lang.Throwable -> L7a
            long r3 = r0.position     // Catch: java.lang.Throwable -> L7a
            long r5 = r2.open(r0)     // Catch: java.lang.Throwable -> L7a
            r1 = r7
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L7a
        L49:
            boolean r0 = r11.loadCanceled     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L56
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r0 = r11.chunkExtractor     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.read(r7)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L56
            goto L49
        L56:
            long r0 = r7.getPosition()     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.upstream.DataSpec r2 = r11.dataSpec     // Catch: java.lang.Throwable -> L7a
            long r2 = r2.position     // Catch: java.lang.Throwable -> L7a
            long r0 = r0 - r2
            r11.nextLoadPosition = r0     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r0)
            boolean r0 = r11.loadCanceled
            r0 = r0 ^ 1
            r11.loadCompleted = r0
            return
        L6d:
            r0 = move-exception
            long r1 = r7.getPosition()     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.upstream.DataSpec r3 = r11.dataSpec     // Catch: java.lang.Throwable -> L7a
            long r3 = r3.position     // Catch: java.lang.Throwable -> L7a
            long r1 = r1 - r3
            r11.nextLoadPosition = r1     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r1)
            throw r0
    }
}
